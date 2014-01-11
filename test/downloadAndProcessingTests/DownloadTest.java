/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package downloadAndProcessingTests;

import dataprocessing.DataDownloader;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Przemysław
 */
public class DownloadTest {
    
    DataDownloader l = null;
    
    public DownloadTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        l = new DataDownloader();
    }
    
    @After
    public void tearDown() {
    }
     
    @Test
    public void downloadData(){
        assertNotNull(l);
        assertTrue(l.download());
    }
}