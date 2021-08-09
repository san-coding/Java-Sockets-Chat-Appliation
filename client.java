import java.io.*;
import java.net.*;

class client{
    public static void main(String[] args){
        try{
            Socket s = new Socket("localhost",6969); // server IP , port
            System.out.println("Connection established with server");
            
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String msgin="", msgout="";
            

            while(!msgin.equals("Bye") && !msgout.equals("Bye")){
                System.out.print("Client : ");
                msgout=br.readLine();
                dout.writeUTF(msgout);

                System.out.println("Waiting for server's message");


                msgin=din.readUTF();
                System.out.println("Server : "+msgin); // printing message from server
                dout.flush();

            }
            System.out.println("Chat has been closed");

            s.close();

        }
        catch(Exception e){
            System.out.println("Chat has been closed");
        }
    }
}