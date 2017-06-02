package com.pattern.compound.impl.quacker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.pattern.compound.intf.QuackObserver;
import com.pattern.compound.intf.Quackable;

/**
 * <p>��Ͻڵ�-ѼȺ
 * <p>�����Ҫ��Ҷ�ڵ�һ��ʵ����ͬ�Ľӿڡ������Ҷ�ڵ����<code style='color:red'>Quackable</code>
 * @author chuzhen
 *
 */
public class Flock implements Quackable {

	private List<Quackable> quackers = new ArrayList<Quackable>();
	
	public void add(Quackable quacker) {
		this.quackers.add(quacker);
	}
	
	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()) {
			Quackable quackable = iterator.next();
			quackable.quack();
		}
		
	}

	@Override
	public void registerObserver(QuackObserver observer) {
		Iterator<Quackable> iterator = this.quackers.iterator();
		while(iterator.hasNext()) {
			Quackable observable = iterator.next();
			observable.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {
		//TODO
		
//		Iterator<Quackable> iterator = this.quackers.iterator();
//		while(iterator.hasNext()) {
//			Quackable observable = iterator.next();
//			observable.notifyObservers();
//		}
	}

}
