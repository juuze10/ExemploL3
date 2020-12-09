import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class Client {
    private MathServer mathServer;
    public Client(){
        try{
            mathServer = (MathServer) Naming.lookup("rmi://127.0.0.1/MathServer1");
            }catch (NotBoundException e){
            e.printStackTrace();
            }catch (MalformedURLException e){
            e.printStackTrace();
        }   catch (RemoteException e){
            e.printStackTrace();
        }

    }

    public double sum( double a, double b) throws RemoteException{
        return mathServer.sum(a , b);
    }

    public double subtract(double a, double b) throws RemoteException{
        return mathServer.subtract(a ,b);
    }

    public double divide( double a, double b) throws  RemoteException{
        return mathServer.divide(a , b);
    }

    public double multiply(double a, double b) throws RemoteException{
        return mathServer.multiply(a , b);
    }
}
