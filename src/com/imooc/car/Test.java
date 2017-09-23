package com.imooc.car;

public class Test {

	public static void main(String[] args) {
		//实例化父类对象，并传入两组相同的属性值
        Car car1 = new Car("黄色", "李明");
        Car car2 = new Car("黄色", "李明");

		//调用父类use方法
        car1.use();
        
		//通过重写equals方法，比较两个对象是否相等
		boolean flag = car1.equals(car2);
        System.out.println("car1和car2的引用比较：" + flag);

		System.out.println("==================================");
        //实例化子类Taxi对象，并传入属性值
		Taxi t1 = new Taxi("蓝色", "张小泉", "长生");

		//调用ride和use方法
		t1.ride();
		t1.use();

		//输出重写toString后的taxi信息
		System.out.println(t1.toString());

		System.out.println("==================================");
		//实例化子类HomeCar对象，并传入属性值
		HomeCar hc = new HomeCar("紫色", "孙二娘", 7);

		//调用display方法及它的重载方法
		hc.display();
		hc.display(5);


	}

}
