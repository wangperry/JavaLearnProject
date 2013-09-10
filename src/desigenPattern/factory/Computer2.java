package desigenPattern.factory;


/**
 * @author E-mail: hwy1782@gmail.com
 * @date  : 2013-2-21 上午10:35:53
 *
 * Build 构造器模式
 *
 * 与版本1比较，
 * 1. 通过Computer2.Build 来实现 Builder 接口
 * 2. 构造方法中添加保护性拷贝
 * 3. 构造方法中添加参数检验。（参数校验需要在对象域中进行，不能在build域中进行，因为build域不能保证。参见《effective java》39条）
 *
 */
public class Computer2 {

    private String name;
    private String type;
    private double screenSize;
    private String produceDate;
    private double price;

    public static class ComputerBuild implements Builder<Computer2>{

        private String name;
        private String type;
        private double screenSize;
        private String produceDate;
        private double price;

        ComputerBuild(String name,String type){
            this.name = name;
            this.type = type;
        }

        public ComputerBuild screenSize(double size) {
            this.screenSize = size;
            return this;
        }

        public ComputerBuild produceDate(String date) {
            this.produceDate = date;
            return this;
        }

        public ComputerBuild price(double price) {
            this.price = price;
            return this;
        }

        @Override
        public Computer2 build(){
            return new Computer2(this);
        }

    }

    private Computer2(ComputerBuild build) {
        this.name = new String(build.name); //保护性拷贝
        this.type = build.type;
        this.screenSize = build.screenSize;
        this.produceDate = build.produceDate;
        this.price = build.price;

        //参数校验
        if(name == null){
            throw new IllegalArgumentException("name is null");
        }

        if(type == null){
            throw new IllegalArgumentException("type is null");
        }
    }

    @Override
    public String toString() {
        return "[computer name = "+name+" type = "+type+" screenSize = "+screenSize+" price "+
                price+" produceDate "+produceDate+"]";
    }

}
