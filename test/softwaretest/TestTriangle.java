package softwaretest;
import org.junit.Before;  
import org.junit.Test;  
// ��̬����  
import static org.junit.Assert.*;  
public class TestTriangle {
	private Triangle tri;
	// ִ������һ������֮ǰ����ִ��setUp����  
    @Before  
    public void setUp(){  
        tri = new Triangle();  
    }
    
    @Test  
    public void testisequ(){        
        assertEquals("�жϵȱ������γ�������", 1, tri.isequ(2, 2, 2));  
    }
    @Test  
    public void testisiso(){        
        assertEquals("�жϵȱ������γ�������", 1, tri.isiso(2, 2, 3));  
    }
    @Test  
    public void testissca(){        
        assertEquals("�жϵȱ������γ�������", 0, tri.issca(1, 2, 3));  
    }
}
