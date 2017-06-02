package com.pattern.beatmachine.intf;

/**
 * <p>�������ӿ�
 * <p>�������ǲ��ԣ���ͼ�ܹ����õĿ�����������������
 * <p>�������Ľӿ�Ӧ�ñ�ģ�͸��ḻ
 * @author chuzhen
 *
 */
public interface ControllerInterface {

	void start();
	void stop();
	void increaseBPM();
	void decreaseBPM();
	void setBPM(int bpm);
}
