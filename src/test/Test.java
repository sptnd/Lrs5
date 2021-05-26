package test;

import dao.TestDIDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TestDIService;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/26 22:47
 */
public class Test {
    public static void main(String[] agrs){
        //初始化Spring容器ApplicationContext,加载配置文件
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取test实例
        TestDIService ts = (TestDIService)appCon.getBean("testDIService");//test为配置文件中的id
        ts.sayHello();
    }
}
