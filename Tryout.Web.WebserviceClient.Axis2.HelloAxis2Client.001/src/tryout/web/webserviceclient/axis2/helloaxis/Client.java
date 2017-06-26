package tryout.web.webserviceclient.axis2.helloaxis;

import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

import tryout.web.webservice.axis2.helloaxis.HelloService;
import tryout.web.webservice.axis2.helloaxis.HelloServiceProxy;
import tryout.web.webservice.axis2.helloaxis.HelloServiceSoapBindingStub;

public class Client {

	public static void main(String[] args) {
		//FGL: Die Klassen aus dem Tutorial, existieren aber entsprechend hier nicht 
		// Create the stub object
       // HelloServiceStub stub = new HelloServiceStub();

        // Create the request
        //HelloServiceStub.SayHello request = new HelloServiceStub.SayHello();

        // Set the parameters
        //request.setName("Gobinath");

        // Invoke the service
       // HelloServiceStub.SayHelloResponse response = stub.sayHello(request);
       // String res = response.get_return(); // Hello Gobinath
       // System.out.println("Response : " + res); 
		
		
		//1) FGL: Fehler bei diesem Ansatz: "No Endpoint"
//		// Create the stub object
//        HelloServiceSoapBindingStub stub;
//		try {
//			stub = new HelloServiceSoapBindingStub();
//			String sReturn = stub.sayHello("FRITZ");
//			System.out.println("Response : " + sReturn);
//		} catch (AxisFault e1) {			
//			e1.printStackTrace();
//		} catch (RemoteException e) {
//			e.printStackTrace();
//		}      
		
		
		//Merke: Wenn sich der WebService ändert einfach die Proxy - Klassen neu erzeugen lassen.
	 
		 //2) 
		HelloServiceProxy proxy = new HelloServiceProxy();
		proxy.setEndpoint("http://localhost:8080/Tryout.Web.Webservice.Axis2.HelloAxis2.001/services/HelloService");
		
		HelloService service = proxy.getHelloService();
		try {
			String sReturn = service.sayHello("FRITZ");
			System.out.println("Response : " + sReturn);
			
			sReturn = service.getNow();
			System.out.println("getNow() liefert zurück: " + sReturn);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
