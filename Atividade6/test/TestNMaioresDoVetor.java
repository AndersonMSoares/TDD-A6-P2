import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestNMaioresDoVetor {
    
    public TestNMaioresDoVetor() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void TestVetor(){
        double a[] = {10.1 , 5.60 , 7.55 , 8.2 , 1.1 , 6.76};
        Vetort v = new Vetort();
        int n;
        n = 3;
        double maior[] = new double[n];
        maior = v.maiorvetor(a, n);
        
        assertEquals(10.1, maior[0]);
        assertEquals(8.2, maior[1]);
        assertEquals(7,55, maior[2]);
    }
}