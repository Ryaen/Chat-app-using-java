import java.io.*;
import java.util.*;
import java.net.*;

class Client
{
  void go()
  {  try{
	while(true){ 
	Socket s = new Socket("localhost",4242); 
	BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
	 String incomingsentence = reader.readLine();
	 //PrintWriter writer = new PrintWriter(s.getOutputStream());
         System.out.println("Message Recieved=> " + incomingsentence);
	// String outgoingsentence = getsentence();
	// writer.println(outgoingsentence);
	 //writer.close();
	 //System.out.println("Message delivered");
	 reader.close();
        }
	}
    catch(IOException ex) {
	ex .printStackTrace();
	}
   }
  private String getsentence()
  {
     Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
        return s;
  }

  public static void main (String[] args)
   {  Client client= new Client();
      client.go();
   }
}
