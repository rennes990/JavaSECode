package com.atguigu1.one.exer3;

import java.util.Scanner;

/**
 * ClassName: ArrayExer03
 * Package: com.atguigu1.one.exer3
 * Description:
 *
 * @Author sjystart
 * @Create 2023/12/4 20:49
 * @Version 1.0
 */
public class ArrayExer03 {
    public static void main(String[] args) {
        //TODO 1. 从键盘读入学生人数，并初始化数组(动态初始化)
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int count = scanner.nextInt();
        int[] scores = new int[count];

        //TODO 2. 根据提示，依次输入学生成绩，并将成绩保存在数组元素中，并获取成绩的最大值
        int maxScore = scores[0];
        System.out.println("请输入" + count + "个成绩：");
        for(int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
            if(maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }
        System.out.println("最高分是：" + maxScore);

        //TODO 3. 遍历数组，根据规则输出学生成绩等级
        char grade;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= maxScore - 10) {
                grade = 'A';
            }else if (scores[i] >= maxScore - 20) {
                grade = 'B';
            }else if (scores[i] >= maxScore - 30) {
                grade = 'C';
            }else {
                grade = 'D';
            }
            System.out.println("学生" + (i + 1) + "的成绩是" + scores[i] + "，其等级为" + grade);
        }

        scanner.close();
    }
}
