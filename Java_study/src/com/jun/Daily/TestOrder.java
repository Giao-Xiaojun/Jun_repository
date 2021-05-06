package com.jun;

/**
 * @author xiaojun
 * @Date 2021/3/7 21:46
 * @Version 1.0
 **/

//非静态代码快
//1。可以对类的属性进行初始化操做
//2，里面可以又输出语句
//3.一个类中可以又多个代码快 按顺序执行
//4.每创建一次类 代码块就要加载一次
//5，代码块的加载 要早于构造器
    
public class TestOrder {

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order);
    }

}

class Order{
    private int orderId = 1111;
    private String orderName = "AA";

    {
        orderId = 2222;
        orderName = "QQQQ";
        System.out.println("我是代码块");
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public Order() {

    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
