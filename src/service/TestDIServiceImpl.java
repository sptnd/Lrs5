package service;

import dao.TestDIDao;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/26 23:02
 */
public class TestDIServiceImpl implements TestDIService {
    private TestDIDao testDIDao;
    //构造方法，用于实现依赖注入接口对象testDIDao
    public TestDIServiceImpl(TestDIDao testDIDao){
        super();
        this.testDIDao = testDIDao;
    }

    @Override
    public void sayHello() {
        //调用testDIDao中的sayHello方法
        testDIDao.sayHello();
        System.out.println("TestDIService构造方法注入say:This is Spring!");
    }
}
