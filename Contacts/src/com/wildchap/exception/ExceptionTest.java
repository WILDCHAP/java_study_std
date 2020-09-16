package com.wildchap.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * java.lang.Throwable
 * 		|------java.lang.Error:一般不编写代码处理
 * 		|------java.lang.Exception:用代码处理
 *			|------编译时异常
 *				|-------IOExcepthon
 *					|------FileNotFoundException
 *				|------ClassNotFoundException
 *			|------运行时异常
 *				|-------RuntimeException
 *				|-------NullPointerException
 *				|-----------------------
 *
 *
 * try catch finally
 * 
 * throws + 异常类型
 * 
 * @author wang	993704315@qq.com
 *
 *
 */
public class ExceptionTest {
	public static void main(String[] args) {
		//ExceptionTest e = new ExceptionTest();
		try {
			test3();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public void test1() {
		String str = "123";
		str = "abc";
		try {
			int num = Integer.parseInt(str);
			System.out.println("hellow");
		}catch(NumberFormatException e) {
			System.out.println("出现数值转换异常");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("出现异常");
		}finally {
			System.out.println("一定会执行的代码");
		}
	}
	public static void test2() throws FileNotFoundException, IOException{
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int data = fis.read();
		while(data != -1) {
			System.out.println((char)data);
			data = fis.read();
		}
		fis.close();
	}
	public static void test3() throws IOException{
		test2();
	}
}
