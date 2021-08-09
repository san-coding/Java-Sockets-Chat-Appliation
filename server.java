import java.io.*;
import java.net.*;


 class server {
     public static void main(String[] args){
        try{

            ServerSocket ss = new ServerSocket(6969);
            System.out.println("Waiting for connection ");

            Socket s = ss.accept();

            System.out.println("Connection established with client");


            DataInputStream din = new  DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String msgin="", msgout="";
            

            while(!msgin.equals("Bye") && !msgout.equals("Bye")){

                System.out.println("Waiting for client's message");

                msgin=din.readUTF();
                System.out.println("Client : "+msgin);

                System.out.print("Server : ");

                msgout=br.readLine();
                dout.writeUTF(msgout);
                dout.flush();

            }
            System.out.println("Chat has been closed");

            s.close();
            ss.close();


        }catch(Exception e){
            System.out.println("Chat has been closed");
        }
     }
    
}
