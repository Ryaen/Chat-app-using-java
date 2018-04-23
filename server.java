import java.io.*;
import java.util.*;
import java.net.*;

class Server {
  // String[] pool = {"Hi","I am Shubham Giri","How are you?","I am Good","Why are you?"};
    void go(){
	try{
		ServerSocket serversock = new ServerSocket(4242);
		while(true){
		 Socket sock = serversock.accept();
		 BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		  PrintWriter writer = new PrintWriter(sock.getOutputStream());
		  String outgoingsentence = getsentence();
		  writer.println(outgoingsentence);
		  writer.close();
		  System.out.println("message delivered");
		//String incomingsentence = reader.readline();
                 // System.out.println("Message Received-> " + incomingsentence);
		 //reader.close();
		}

	  }
	catch(IOException ex){ 
		ex .printStackTrace();
		}
	}

   private String getsentence() {
	//int random = (int)(Math.random()*pool.length);
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	return s;
	}

  public static void main(String[] args)
    {
	Server server = new Server();
	server.go();
    }
}
