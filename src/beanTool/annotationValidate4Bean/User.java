package beanTool.annotationValidate4Bean;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 13-10-11 下午4:02
 */
public class User {

    @ValidateAnnotation(type=ValidateType.Length, errorMsg="用户名长度不能小于1", length=1)
    private String username;

    @ValidateAnnotation(type=ValidateType.Number, errorMsg="年龄必须是数字")
    private int age;

    private String[] interest;

    public User(){}

    public User(String username, int age){
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getInterest() {
        return interest;
    }

    public void setInterest(String[] interest) {
        this.interest = interest;
    }
}