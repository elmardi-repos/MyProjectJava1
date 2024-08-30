import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Tests {

    private long begin;
    private long end;
    @Before
    public void setUp() throws Exception {
        this.begin = System.nanoTime();
    }
    @After
    public void tearDown() throws Exception {
        this.end = System.nanoTime();
        System.out.println( (end-begin)/1000000 +" ms" );
    }
    @Test
    public void toLowerCase1(){
        System. out . println( "ok1" );
    }
    @Test
    public void toLowerCase2() {
        System. out.println( "ok2" );
    }
}
