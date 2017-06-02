package com.pattern.beatmachine.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import com.pattern.beatmachine.intf.BPMObserver;
import com.pattern.beatmachine.intf.BeatModelInterface;
import com.pattern.beatmachine.intf.BeatObserver;

public class BeatModel implements BeatModelInterface, MetaEventListener {

	private Sequencer sequencer;
	private List<BeatObserver> beatObservers = new ArrayList<BeatObserver>();
	private List<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();
	
	//这里是其他的实例变量
	private int bpm = 90;
	private Sequence sequence;
	private Track track;
	
	@Override
	public void initialize() {
		setUpMidi();
		buildTrackAndStart();
	}

	private void setUpMidi() {
		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.addMetaEventListener(this);
			
			sequence = new Sequence(Sequence.PPQ, 4);
			track = sequence.createTrack();
			
			sequencer.setTempoInBPM(getBPM());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void buildTrackAndStart() {
		int[] trackList = {35, 0, 46, 0};
		
		sequence.deleteTrack(null);
		track = sequence.createTrack();
		
		makeTracks(trackList);
		
		track.add(makeEvent(192, 9, 1, 0, 4));
		
		try {
			sequencer.setSequence(sequence);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private MidiEvent makeEvent(int command, int channel, int data1, int data2, int tick) {
		MidiEvent event = null;
		
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(command, channel, data1, data2);
			
			event = new MidiEvent(a, tick);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return event;
	}

	private void makeTracks(int[] trackList) {
		for(int i = 0; i < trackList.length; i++) {
			int key = trackList[i];
			
			if(key != 0) {
				track.add(makeEvent(144, 9, key, 100, i));
				track.add(makeEvent(128, 9, key, 100, i + 1));
			}
		}
	}

	@Override
	public void on() {
		sequencer.start();
		setBPM(90);
	}

	@Override
	public void off() {
		setBPM(0);
		sequencer.stop();
	}

	/**
	 * 修改bpm时通知BPM观察者
	 * @param bpm
	 */
	@Override
	public void setBPM(int bpm) {
		this.bpm = bpm;
		this.sequencer.setTempoInBPM(getBPM());
		notifyBPMObservers();
	}

	@Override
	public int getBPM() {
		return this.bpm;
	}

	@Override
	public void registerBeatObserver(BeatObserver observer) {
		this.beatObservers.add(observer);
	}

	@Override
	public void removeBeatObserver(BeatObserver observer) {
		this.beatObservers.remove(observer);
	}

	@Override
	public void registerBPMObserver(BPMObserver observer) {
		this.bpmObservers.add(observer);
	}

	@Override
	public void removeBPMObserver(BPMObserver observer) {
		this.bpmObservers.remove(observer);
	}

	@Override
	public void notifyBeatObservers() {
		Iterator<BeatObserver> iterator = this.beatObservers.iterator();
		while(iterator.hasNext()) {
			iterator.next().updateBeat();
		}
	}

	@Override
	public void notifyBPMObservers() {
		Iterator<BPMObserver> iterator = this.bpmObservers.iterator();
		while(iterator.hasNext()) {
			iterator.next().updateBPM();
		}
	}

	@Override
	public void meta(MetaMessage meta) {
		if(meta.getType() == 47) {
			notifyBeatObservers();
			sequencer.start();
			setBPM(getBPM());
		}
	}

}
