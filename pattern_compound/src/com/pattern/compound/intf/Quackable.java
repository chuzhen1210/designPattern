
package com.pattern.compound.intf;

/**
 * 可以鸭叫的行为接口，只做一件事：呱呱叫
 * @author chuzhen
 *
 */
public interface Quackable extends QuackObservable {

	public void quack();
}
