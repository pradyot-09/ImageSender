/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server ;
import java.io.*;
import java.net.*  ;
import java.util.* ;

/**
 *
 * @author BUSER
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        ServerSocket s = new ServerSocket(4444);
        Scanner sc = new Scanner(System.in) ;
        Socket s1=s.accept() ;
        DataInputStream di=new DataInputStream(s1.getInputStream()) ;
        DataOutputStream ds =new DataOutputStream(s1.getOutputStream()) ;
        FileOutputStream fos = new FileOutputStream ("D:\\bg.jpg"); 
        
        int i;
            while ( (i = di.read()) > -1) {
                fos.write(i);
            }
        /*while(true){
             String en=di.readUTF();
             System.out.println(en) ;
             if(en=="quit")
                 break ;
             String m=sc.nextLine() ;
             m="Server: "+m ;
             ds.writeUTF(m);
    
        }    
        String en=di.readUTF();
        System.out.println(en) ;*/
        fos.flush() ;
        fos.close() ;
        di.close() ;
        s1.close() ;
    } 
        
    
}
