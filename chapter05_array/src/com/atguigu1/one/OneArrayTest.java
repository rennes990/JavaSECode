package com.atguigu1.one;

/**
 * 一维数组的基本使用
 *
 * @author 尚硅谷-宋红康
 * @create 12:08
 */
public class OneArrayTest {
	
	public static void main(String args[]) {
		//1. 数组的声明与初始化
		double[] prices = new double[]{20.32,43.21,43.22};

		//2. 数组元素的调用
		System.out.println(prices[0]);

		//3. 数组的长度
		System.out.println(prices.length);

		//4. 如何遍历数组
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}

	}

}
