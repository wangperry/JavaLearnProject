package beanTool.annotationValidate4Bean;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: hongweiye
 * Date: 13-10-11 下午4:00
 */
public class ValidateTools {

    public static boolean validate(Class obj, HttpServletRequest request){

        Map<String, String> errors = new HashMap<String, String>();

        Field[] fields = obj.getDeclaredFields();

        for (Field field : fields) {

            //System.out.println(field.getName());//输出所有属性名称

            if(field.isAnnotationPresent(ValidateAnnotation.class)){//只处理包含注解为ValidateAnnotation的属性名称

                ValidateAnnotation validateUtil = field.getAnnotation(ValidateAnnotation.class);
                ValidateType type = validateUtil.type();

                if(ValidateType.NotNull == type)
                    if(true == isNull(field.getName(), request))
                        errors.put(field.getName(), validateUtil.errorMsg());

                if(ValidateType.Length == type)
                    if(true == length(field.getName(), request, validateUtil.length()))
                        errors.put(field.getName(), validateUtil.errorMsg());

                if(ValidateType.Number == type)
                    if(true == isNumber(field.getName(), request))
                        errors.put(field.getName(), validateUtil.errorMsg());
            }
        }

        return errors.size() == 0;
    }

    public static boolean isNull(String field, HttpServletRequest request){

        if(null==request || null==request.getParameter(field)) return true;

        if(0==request.getParameter(field).trim().length()) return true;

        return false;
    }

    public static boolean length(String field, HttpServletRequest request, int length){

        if(null==request || null==request.getParameter(field)) return true;

        if(length>request.getParameter(field).trim().length()) return true;

        return false;
    }

    public static boolean isNumber(String field, HttpServletRequest request){

        if(null==request || null==request.getParameter(field)) return true;

        try {
            Integer.parseInt(request.getParameter(field));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return true;
        }

        return false;
    }
}