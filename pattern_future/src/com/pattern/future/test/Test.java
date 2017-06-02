package com.pattern.future.test;

import com.pattern.future.client.Client;
import com.pattern.future.intf.Data;

public class Test {

	public static void main(String[] args) {
		Client client = new Client();
		
		//������������أ���Ϊ�õ�����FutureData��������RealData
		Data data = client.request("name");
		System.out.println("�������");
		
		try {
			//������һ��sleep���������ҵ���߼��Ĵ���
			//�ڴ�����Щҵ���߼��Ĺ����У�RealData���������Ӷ���������˵ȴ�ʱ��
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//ʹ����ʵ������
		System.out.println("���� = " + data.getResult());
	}
}
