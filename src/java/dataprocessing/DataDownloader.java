/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dataprocessing;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tomcat.jni.Directory;
import tennisdataprocessing.Loader;

/**
 *
 * @author Przemysław
 */
public class DataDownloader {
    
    private static final String dataDirectory = "C:\\Users\\ResultsGrabber\\Serwer";
    
    public boolean download(){
        Loader l = new Loader(dataDirectory);
        l.setDataOut("C:/Users/ResultsGrabber/Serwer/dataOut.txt");
        l.setPlayersListFile("C:/Users/ResultsGrabber/Serwer/PlayersList.txt");
        l.setPlayersResultsPrefix("C:/Users/ResultsGrabber/Serwer/Player_");
        l.loadData();
        return new File(dataDirectory).listFiles().length == getPlayersListCount(l.getPlayersListFile(), "\n");
    }

    private int getPlayersListCount(String fileName, String separator) {
        int p = -1;
        try {
            p=Files.readAllLines(Paths.get(fileName), Charset.defaultCharset()).size();
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            Logger.getLogger(DataDownloader.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            return p;
        }
    }
    
    
}
