/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dataprocessing.DataDownloader;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Przemysław
 */
@WebService(serviceName = "DownloadService")
public class DownloadService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "downloadData")
    public String downloadData(@WebParam(name = "password") String password) {
        if(password.equals("Tereferekumkum")){
            DataDownloader dl = new DataDownloader();
            if(dl.download()){
                return "OK";
            } else {
                return null;
            }
        } else {
            return null;
        }
        
    }
}
