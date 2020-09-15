package com.wildchap.interfacetest;
/**
 * 接口的使用
 * @description 
 * @wang 993704315@qq.com
 * @params
 * @method
 * @return
 */
public class USBTest {
	public static void main(String[] args) {
		Computer com = new Computer();
		Flash fla = new Flash();
		com.transferData(fla);
	}
}

class Computer{
	public void transferData(USB usb) {
		usb.start();
		System.out.println("具体传输数据细节");
		usb.stop();
	}
}

interface USB{
	//常量：如长宽，最大最小传输速度
	void start();	//省略public abstract
	void stop();
}

class Flash implements USB{
	public void start() {
		System.out.println("U盘开启工作");
	}
	public void stop() {
		System.out.println("U盘结束工作");
	}
}
