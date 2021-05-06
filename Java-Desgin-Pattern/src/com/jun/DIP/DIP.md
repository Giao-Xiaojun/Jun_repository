#依赖倒转原则
##1 定义
* 高层模块不依赖底层模块 且两者都应该依赖抽象
* 抽象不因该以来细节
* 细节应该以来抽象
* 模块间的依赖通过抽象实现 实现类之间不发生直接的依赖关系 其依赖关系是通过抽象类或接口产生的
* 接口或抽象类不依赖与现实类
* 现实类依赖接口或抽象类
##2 依赖的注入方式
* 构造函数传递依赖对象

```
public interface IDriver {
     //是司机就应该会驾驶汽车
     public void drive();
}
public class Driver implements IDriver{
     private ICar car;  
     //构造函数注入
     public Driver(ICar _car){
              this.car = _car;
     }
     //司机的主要职责就是驾驶汽车
     public void drive(){
             this.car.run();
     }
}
```
* Setter方法传递依赖对象
* 接口申明依赖对象