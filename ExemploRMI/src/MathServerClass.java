import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//Implementação da funcionalidade
//Extendemos o UnicastRemoteObject pois este define a ligação com o serviço de registo e restante plataforma RMI

public class MathServerClass extends UnicastRemoteObject implements MathServer {

    //construtor da classe tem que declarar o lançamento de exceções
    public MathServerClass() throws RemoteException{};
    @Override
    public double sum(double a, double b) throws RemoteException {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) throws RemoteException {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) throws RemoteException {
        return a * b;
    }

    @Override
    public double divide(double a, double b) throws RemoteException {
        return a / b;
    }
}
