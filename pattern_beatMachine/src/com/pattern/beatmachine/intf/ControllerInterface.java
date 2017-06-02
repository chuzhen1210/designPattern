package com.pattern.beatmachine.intf;

/**
 * <p>控制器接口
 * <p>控制器是策略，视图能够调用的控制器方法都在这里
 * <p>控制器的接口应该比模型更丰富
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
