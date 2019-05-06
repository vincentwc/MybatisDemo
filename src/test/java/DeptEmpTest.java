import com.entity.DeptEmp;
import com.mapper.DeptEmpMapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DeptEmpTest {


    @Test
    public void testGetEmpTotalByDept() throws IOException {

        //1.加载mybatis核心配置文件
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();

        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        //2.解析核心配置文件并创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = factoryBuilder.build(inputStream);

        //3.创建核心对象SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //4.得到mapper代理对象
        DeptEmpMapper deptEmpMapper = sqlSession.getMapper(DeptEmpMapper.class);

        //5.调用自定义的方法，实现查询功能
        List<DeptEmp> list = deptEmpMapper.getEmpTotalByDept();

        for(DeptEmp deptEmp:list){
            System.out.println(deptEmp);
        }

        //6，关闭对象，释放资源
        sqlSession.close();

    }
}
