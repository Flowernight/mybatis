package org.apache.mytest;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by xulh on 2019/7/5.
 */
public class MyTest {

    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = null;
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            PayPaymentMapper roleMapper = sqlSession.getMapper(PayPaymentMapper.class);
            PayPaymentDO role = roleMapper.selectByPrimaryKey("p16300599");
            System.out.println(role.getPaySerialNo());
            sqlSession.commit();

        } catch (Exception e) {
            sqlSession.rollback();
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
