package com.belong.test;

import org.apache.log4j.Logger;

public class CatchTest {
	public static void main(String[] args) {
		new CatchTest().fun2();
//		Logger logger = Logger.getLogger(CatchTest.class.getName());
//		logger.debug("debug");
//		logger.info("info");
	}

	public int fun(){
		try {
			
			int a = 4/0;
			System.out.println("a");
		} catch (Exception e) {
			System.out.println("不能除零");
//			System.exit(0);
			return 1;
			
		} finally {
			System.out.println("ok--------");
		}
		return 0;
	}
	
	public void fun2(){
		try {
			int a[] = new int[3];
			a[3] = 1;
			int b = 1/0; //不走
			System.out.println("ok");
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("ae");
		}		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("e");
		} finally {
			System.out.println("belong");
		}
	}


}
