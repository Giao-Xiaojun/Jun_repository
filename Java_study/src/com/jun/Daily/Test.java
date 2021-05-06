package com.jun;

/**
 * @author xiaojun
 * @Date 2021/3/7 15:05
 * @Version 1.0
 **/

//public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//        }
//    返回此对象所在类及对应堆空间对象实体的首地址值

public class Test {

    public static void main(String[] args) {
        Person person = new Person("xiaojun", 23);
        System.out.println(person.toString());
    }

    static class Person {
        private String name;
        private int age;
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
