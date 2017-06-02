package com.pattern.beatmachine.intf;

/**
 * ��������ģ�ͽӿڡ�
 * ͬʱҲ��һ�����۲��߽ӿ�
 * @author chuzhen
 *
 */
public interface BeatModelInterface {

	/**
	 * ��BeatModel����ʼ��֮�󣬾ͻ���ô˷���
	 */
	void initialize();
	
	/**
	 * �򿪽��Ĳ�����
	 */
	void on();
	
	/**
	 * �رս��Ĳ�����
	 */
	void off();
	
	/**
	 * �趨BPM�����ô˷����󣬽���Ƶ�����ϸı�
	 */
	void setBPM(int bpm);
	
	/**
	 * ���ص�ǰBPMֵ���������ֵΪ0����ʾ�������ǹرյ�
	 */
	int getBPM();
	
	/**
	 * ע����ı仯�۲��ߡ�ÿ�����ı仯ʱ����֪ͨ����۲���
	 * @param observer
	 */
	void registerBeatObserver(BeatObserver observer);
	
	void removeBeatObserver(BeatObserver observer);
	
	void notifyBeatObservers();
	
	/**
	 * ע��BPM�仯�۲��ߡ���BPM�仯ʱ��֪ͨ����۲���
	 * @param observer
	 */
	void registerBPMObserver(BPMObserver observer);
	
	void removeBPMObserver(BPMObserver observer);
	
	void notifyBPMObservers();
}
