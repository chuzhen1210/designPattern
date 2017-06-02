package com.pattern.beatmachine.intf;

/**
 * 节拍数据模型接口。
 * 同时也是一个被观察者接口
 * @author chuzhen
 *
 */
public interface BeatModelInterface {

	/**
	 * 在BeatModel被初始化之后，就会调用此方法
	 */
	void initialize();
	
	/**
	 * 打开节拍产生器
	 */
	void on();
	
	/**
	 * 关闭节拍产生器
	 */
	void off();
	
	/**
	 * 设定BPM。调用此方法后，节拍频率马上改变
	 */
	void setBPM(int bpm);
	
	/**
	 * 返回当前BPM值。如果返回值为0，表示节拍器是关闭的
	 */
	int getBPM();
	
	/**
	 * 注册节拍变化观察者。每个节拍变化时都会通知此类观察者
	 * @param observer
	 */
	void registerBeatObserver(BeatObserver observer);
	
	void removeBeatObserver(BeatObserver observer);
	
	void notifyBeatObservers();
	
	/**
	 * 注册BPM变化观察者。当BPM变化时回通知此类观察者
	 * @param observer
	 */
	void registerBPMObserver(BPMObserver observer);
	
	void removeBPMObserver(BPMObserver observer);
	
	void notifyBPMObservers();
}
