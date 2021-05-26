package dao;

/**
 * @author: lydsgy699
 * @email: 337887790@qq.com
 * @date: 2021/5/26 22:39
 */
public class TestDIDaoImpl implements TestDIDao {
    @Override
    public void sayHello() {
        System.out.println("TestDao say: This is Spring");
    }
}
