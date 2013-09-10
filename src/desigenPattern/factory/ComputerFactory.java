package desigenPattern.factory;
/**
 * @author E-mail: hwy1782@gmail.com
 * @date  : 2013-2-21 上午10:36:53
 *
 * 静态工厂方法优点：
 * 1.和构造器相比，他有名称。
 * 2.不必每次调用的时候都新建一个对象。
 * 3.可以返回原类型的任何子类型对象。
 * 4.在创建参数化类型的实例的时候，代码更简洁：比如：Map<String,Integer> maps = Maps.newHashMap();
 *
 */
public class ComputerFactory {

    private static ComputerFactory factory;

    private ComputerFactory() {}

    public static ComputerFactory getInstance(){  //双向检查锁
        if(factory == null){
            factory = new ComputerFactory();
            return factory;
        }
        return factory;
    }

    public Computer produceComputer(){
        return new Computer.Build("联想", "7795").price(4550).produceDate("2012-12").screenSize(14.5).build();
    }

    public Computer2 produceComputer2(){
        return new Computer2.ComputerBuild("联想", "7795").build();
    }

}
