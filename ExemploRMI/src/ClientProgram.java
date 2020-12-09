import java.rmi.RemoteException;

public class ClientProgram {
    public static void main(String [] args){
        Client client = new Client();
        try{
            System.out.println(client.sum(40,2));
        }catch (RemoteException e){
            e.printStackTrace();
        }
    }

}
