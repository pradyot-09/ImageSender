/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import java.io.*;
import java.util.* ;
import java.net.* ;

/**
 *
 * @author BUSER
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        // TODO code application logic here
        int i ;
        Scanner sc=new Scanner(System.in) ;
        Socket s=new Socket("localhost",4444) ;
        DataOutputStream ds =new DataOutputStream(s.getOutputStream()) ;
        DataInputStream di=new DataInputStream(s.getInputStream()) ;
        FileInputStream fis = new FileInputStream ("D:\\paddi\\bg.jpg"); 
        System.out.println("Client ready");
        /*while(true){
        String m=sc.nextLine();
        m="Client: "+m ;
        if(m.equals("Client: quit"))
            break;
        ds.writeUTF(m);
        String l=di.readUTF();
        System.out.println(l);    
    
        }   */
        while ((i = fis.read()) > -1)
        ds.write(i);
        
        fis.close() ;
        ds.close() ;
        s.close() ;
    }
    
}