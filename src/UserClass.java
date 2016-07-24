
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lee
 */
public class UserClass implements Serializable{
    
   String user,pass,action;
   
   public UserClass(String s1, String s2,String s3)
   {
       user = s1;
       pass = s2;
       action = s3;
   }
}
