package beanTool.annotationValidate4Bean;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 13-10-11 下午1:42
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateAnnotation {
    public ValidateType type();
    public String errorMsg();
    public int length() default 0;
}
