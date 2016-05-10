package softwaretest;
import org.junit.Before;  
import org.junit.Test;  
// 静态导入  
import static org.junit.Assert.*;  
public class TestTriangle {
	private Triangle tri;
	// 执行任意一个方法之前都会执行setUp方法  
    @Before  
    public void setUp(){  
        tri = new Triangle();  
    }
    
    @Test  
    public void testisequ(){        
        assertEquals("判断等边三角形出现问题", 1, tri.isequ(2, 2, 2));  
    }
    @Test  
    public void testisiso(){        
        assertEquals("判断等边三角形出现问题", 1, tri.isiso(2, 2, 3));  
    }
    @Test  
    public void testissca(){        
        assertEquals("判断等边三角形出现问题", 0, tri.issca(1, 2, 3));  
    }
}
