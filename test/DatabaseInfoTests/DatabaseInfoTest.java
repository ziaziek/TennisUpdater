/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseInfoTests;

import data.DatabaseInfo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Przemo
 */
public class DatabaseInfoTest {
    DatabaseInfo info = null;
    public DatabaseInfoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        info = new DatabaseInfo();
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void numberOfRows(){
        assertNotNull(info);
        long w = info.getNumberOfRows();
        System.out.println(w);
        assertTrue(w==42);
    }
}