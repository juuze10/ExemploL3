import java.rmi.Remote;
import java.rmi.RemoteException;

//Serviço remoto interface com os metodos a executar remotamente ex. contrato de prestação de serviços remotos
public interface MathServer extends Remote {
    public double sum(double a,double b) throws RemoteException;
    public double subtract(double a, double b) throws RemoteException;
    public double multiply (double a, double b) throws RemoteException;
    public double divide(double a, double b) throws RemoteException;

}
