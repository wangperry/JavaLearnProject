package beanTool.hibernateValidate4Bean;

import org.springframework.context.ApplicationContext;


public class Test1 {

	public static void main(String args[]) {
        ApplicationContext context = Util.getContext();

		Model2Service service = context.getBean(Model2Service.class);
		Model2 model = new Model2();
		model.setName("hello");
		model.setEmail("testHibernateValidate@sohu.com");
		model.setAddress("湖南长沙");
		model.setPhoneNumber("15012345678");

		String result = Util.validateModel(model);// 返回的验证结果，验证结果就是一个字符串，如果有错误的话则该字符串的长度大于0
		System.out.println(result);
		if (result.length() == 0)// 验证不通过的时候就不添加
			service.add(model);

	}

}
