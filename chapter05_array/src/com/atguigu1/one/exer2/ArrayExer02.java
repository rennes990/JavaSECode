package com.atguigu1.one.exer2;

import java.util.Scanner;

/**
 * ClassName: ArrayExer02
 * Package: com.atguigu1.one.exer2
 * Description:
 *
 * @Author sjystart
 * @Create 2023/12/4 20:16
 * @Version 1.0
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        //TODO 1. 定义包含7个单词的数组
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //TODO 2. 从键盘获取指定的数值，使用Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数值(1-7)：");
        int day = scanner.nextInt();

        //TODO 3. 针对获取的数据进行判断即可
        if (day < 1 || day > 7) {
            System.out.println("你输入的数据有误。");
        } else {
            System.out.println(weeks[day - 1]);
        }

        scanner.close();
    }
}
