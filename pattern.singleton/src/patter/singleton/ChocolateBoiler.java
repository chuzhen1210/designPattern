package patter.singleton;

/**
 * �ɿ�����¯
 * @author chuzhen
 *
 */
public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;//��е�
	
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
	 * ��ʼ��ʱ��¯Ϊ��
	 */
	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}
	
	/**
	 * �ڹ�¯������ԭ��ʱ����¯�����ǿյġ�һ������ԭ�ϣ��Ͱ�empty��boiled��״̬���ú�
	 */
	public void fill() {
		if(isEmpty()) {
			this.empty = false;
			this.boiled = false;
			
			//�ڹ�¯�������ɿ�����ţ�̵Ļ����
		}
	}
	
	/**
	 * ��¯�ų�ʱ�����������ģ���������й��ġ��ų���Ϻ󣬰�empty��־���true
	 */
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			//�ų���е��ɿ�����ţ��
			
			this.empty = true;
		}
	}
	
	/**
	 * ������ʱ����¯���������ģ�������û������ġ�һ����к󣬰�boiled��־���true
	 */
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			//����¯�������
			
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
