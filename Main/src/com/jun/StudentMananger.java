package com.jun;


import sun.security.krb5.internal.crypto.Aes128;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMananger {

    public static void main(String[] args) {

        ArrayList<Student> array = new ArrayList<>();

        while (true) {
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择:");

            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();

            switch (line) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
                    updateStudent(array);
                    break;
                case "4":
                    findAllStudent(array);
                    break;
                case "5":
                    System.exit(0);
            }

        }
    }

    public static void addStudent(ArrayList<Student> array) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("输入学生学号:");
        String id = scanner.nextLine();
        System.out.println("输入学生姓名:");
        String name = scanner.nextLine();
        System.out.println("输入学生年龄:");
        String age = scanner.nextLine();
        System.out.println("输入学生地址:");
        String address = scanner.nextLine();

        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setAddress(address);

        array.add(stu);

        System.out.println("添加学生成功!!!");

    }

    public static void findAllStudent(ArrayList<Student> array) {

        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");

        for (int i = 0; i < array.size(); ++i) {
            Student student = array.get(i);
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());
        }

    }

    public static void deleteStudent(ArrayList<Student> array) {

        System.out.println("请输入要删除的学生学号");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int index = -1;

        for(int i = 0; i < array.size(); ++i){
            Student stu = array.get(i);
            if(stu.getId().equals(s)){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("学生不存在");
        }else {
            array.remove(index);
            System.out.println("删除成功");
        }

    }

    public static void updateStudent(ArrayList<Student> array) {

        Scanner sc = new Scanner(System.in);

        System.out.println("学生新学号");
        String id = sc.nextLine();
        System.out.println("学生新姓名");
        String name = sc.nextLine();
        System.out.println("学生新年龄");
        String age = sc.nextLine();
        System.out.println("学生新地址");
        String address = sc.nextLine();

        Student s = new Student();

        s.setId(id);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        for(int i = 0; i < array.size(); ++i){
            Student stu = array.get(i);
            if(stu.getId().equals(id)){
                array.set(i,s);
                break;
            }
        }

        System.out.println("添加成功!!!");

    }

}
