import java.rmi.Naming;
import java.util.Scanner;
public class Client {

    public static void main(String[] args) {
        try {
            MyInterface Reverse = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            Scanner sc=new Scanner(System.in);
            System.out.println("Entrer une chaine : ");
            String ch1=sc.nextLine() ;
            System.out.println("Input: "+ch1);
            System.out.println("Output : "+Reverse.reverse(ch1));


            MyInterface MinChar = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println("Entrer une chaine : ");
            String ch2=sc.nextLine() ;
            System.out.println("Input: "+ch2);
            System.out.println("Output : "+MinChar.minChar(ch2));


            MyInterface CaseChanger = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println("Entrer une chaine : ");
            String ch3=sc.nextLine() ;
            System.out.println("Input: "+ch3);
            System.out.println("Output : "+CaseChanger.caseChanger(ch3));



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

