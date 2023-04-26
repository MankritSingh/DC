import java.util.Scanner;
import java.io.*;
import java.net.*;
public class server{
	public static void main(String []args)throws IOException{
		ServerSocket ss=new ServerSocket(4999);
		Socket s=ss.accept();
		System.out.println("Server here,Client Connected");
		InputStreamReader in=new InputStreamReader(s.getInputStream());
		BufferedReader br=new BufferedReader(in);
		String str=br.readLine();
		System.out.println("Cliet:"+str);

		System.out.println("server start,Enter msg");
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		PrintWriter pr=new PrintWriter(s.getOutputStream());
		pr.println(word);
		pr.flush();

	}
}
