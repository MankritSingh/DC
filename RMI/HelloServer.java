import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class HelloServer{
	public static void main(String []args) throws Exception{
		LocateRegistry.createRegistry(1099);
		HelloImpl obj=new HelloImpl();
		Naming.rebind("hello",obj);
		System.out.println("Hello server bound registry");
	}
}
