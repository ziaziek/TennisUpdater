/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import data.DatabaseInfo;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Przemo
 */
@WebService(serviceName = "DataUpdate")
public class DataUpdate {

    public static final String OK_RESPONSE = "OK";
    public static final String UPDATE_RESPONSE = "Update";
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "checkUpdates")
    public String checkUpdates(@WebParam(name = "lastDate") String lastDate, @WebParam(name = "noOfRecords") int noOfRecords) {
        if(noOfRecords==new DatabaseInfo().getNumberOfRows()){
          return OK_RESPONSE;  
        } else {
            return UPDATE_RESPONSE;
        }
        
    }
}
