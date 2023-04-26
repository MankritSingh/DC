import java.rmi.Naming;
public class HelloClient{
	public static void main(String []args)throws Exception{
		Hello obj=(Hello)Naming.lookup("rmi://localhost/hello");
		String message=obj.sayHello("Alice");
		System.out.println(message);
	}
}
