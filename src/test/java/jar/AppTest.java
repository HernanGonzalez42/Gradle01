package jar;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.*;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.*;
import org.jgrapht.*;
import org.jgrapht.graph.*;
/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
	@Before
	public static void setup(){}

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        assertTrue( true );
    }
   @Test
    public void testApp2()
    {JsonFactory factory = new JsonFactory();
// configure, if necessary:
factory.enable(JsonParser.Feature.ALLOW_COMMENTS)
        assertTrue( true );
    }
 @Test
 public void testApp3()
    {
        assertTrue( (2+2)==4 );
 	UndirectedGraph<String, DefaultEdge> stringGraph = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
    }
}
