package patter.singleton;

/**
 * 巧克力锅炉
 * @author chuzhen
 *
 */
public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;//煮沸的
	
	private volatile static ChocolateBoiler instance;
	
	public static ChocolateBoiler getInstance() {
		if(instance == null) {
			synchronized(ChocolateBoiler.class) {
				if(instance == null) {
					instance = new ChocolateBoiler();
				}
			}
		}
		
		return instance;
	}
	
	/**
	 * 初始化时锅炉为空
	 */
	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}
	
	/**
	 * 在锅炉内填入原料时，锅炉必须是空的。一旦填入原料，就把empty和boiled的状态设置好
	 */
	public void fill() {
		if(isEmpty()) {
			this.empty = false;
			this.boiled = false;
			
			//在锅炉内填满巧克力和牛奶的混合物
		}
	}
	
	/**
	 * 锅炉排出时，必须是满的，而且是煮沸过的。排除完毕后，把empty标志设回true
	 */
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			//排出煮沸的巧克力和牛奶
			
			this.empty = true;
		}
	}
	
	/**
	 * 煮混合物时，锅炉必须是满的，并且是没有煮过的。一旦煮沸后，把boiled标志设回true
	 */
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			//将锅炉内物煮沸
			
			this.boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return this.empty;
	}
	
	public boolean isBoiled() {
		return this.boiled;
	}
}
