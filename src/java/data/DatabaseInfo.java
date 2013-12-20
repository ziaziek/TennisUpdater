/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Przemo
 */
public class DatabaseInfo {
    SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
    
    public long getNumberOfRows(){
        long w = -1;
        try{
          w= (Long)sf.openSession().createQuery("select count(*) from Players").uniqueResult(); 
        } catch(JDBCException ex){
            System.err.println(ex.getMessage());
        }
        sf.close();
        return w;
    }
}
