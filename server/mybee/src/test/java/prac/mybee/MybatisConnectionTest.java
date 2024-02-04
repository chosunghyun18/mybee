package prac.mybee;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybatisConnectionTest {

    @Autowired
    private SqlSessionFactory sqlFactory;

    //SqlSessionFactory 객체가 제대로 만들어졌는지 Test
    @Test
    public void testFactory() {
        System.out.println(sqlFactory);
    }

    @Test
    public void testSession() throws Exception{
        try(SqlSession session = sqlFactory.openSession()){
            System.out.println(session);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
