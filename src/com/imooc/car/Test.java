package com.imooc.car;

public class Test {

	public static void main(String[] args) {
		//ʵ����������󣬲�����������ͬ������ֵ
        Car car1 = new Car("��ɫ", "����");
        Car car2 = new Car("��ɫ", "����");

		//���ø���use����
        car1.use();
        
		//ͨ����дequals�������Ƚ����������Ƿ����
		boolean flag = car1.equals(car2);
        System.out.println("car1��car2�����ñȽϣ�" + flag);

		System.out.println("==================================");
        //ʵ��������Taxi���󣬲���������ֵ
		Taxi t1 = new Taxi("��ɫ", "��СȪ", "����");

		//����ride��use����
		t1.ride();
		t1.use();

		//�����дtoString���taxi��Ϣ
		System.out.println(t1.toString());

		System.out.println("==================================");
		//ʵ��������HomeCar���󣬲���������ֵ
		HomeCar hc = new HomeCar("��ɫ", "�����", 7);

		//����display�������������ط���
		hc.display();
		hc.display(5);


	}

}
