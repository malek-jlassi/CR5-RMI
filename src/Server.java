import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Locale;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}




    public String reverse(String c){
        String ch="";
        for (int i=0;i<c.length();i++){
            ch=c.charAt(i)+ch;
        }
        return ch;
    }



    public char minChar (String ch){
        char min='m';
        int a=ch.length();
        for (int i=0; i<a-1; i++){
            if (ch.charAt(i) < min)
            { min = ch.charAt(i);}
        }
        return min;
    }


    public String caseChanger (String ch){
        String ch1="";

        for(int i = 0; i < ch.length(); i++) {
            char s=ch.charAt(i);
            if(Character.isLowerCase(s)) {
                ch1=ch1+ch.toUpperCase().charAt(i);
            }

            else {
                ch1=ch1+ch.toLowerCase().charAt(i);}
        }
        return ch1;

    }







    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}