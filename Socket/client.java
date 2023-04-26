//client
import java.util.Scanner;
import java.io.*;
import java.net.*;
public class client{
	public static void main(String[]args) throws IOException{
		Socket s=new Socket("localhost",4999);
		System.out.println("Client start,Enter msg");
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		PrintWriter pr=new PrintWriter(s.getOutputStream());
		pr.println(word);
		pr.flush();

		InputStreamReader in=new InputStreamReader(s.getInputStream());
		BufferedReader br=new BufferedReader(in);
		String str=br.readLine();
		System.out.println("server sent to client:"+str);
 
	}
}
