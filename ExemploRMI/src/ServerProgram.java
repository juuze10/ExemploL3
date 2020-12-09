import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

//servidor ira publicar localmente a funcionalidade. acesso feito a partir de url do tipo rmi://<localização>/<serviço>
public class ServerProgram {
    public static void main(String [] args){
        try{
            Naming.rebind("MathServer1", new MathServerClass());
            //rmi://127.0.0.1/MathServer1
        }catch (RemoteException e){
            e.printStackTrace();
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}

