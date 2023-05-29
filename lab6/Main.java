package lab6;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
            ArrayList<decleration1> dec = new ArrayList<decleration1>();
            //     int main(){ int i; int k; int t;}
            //     k
            
            System.out.println("Ajluulah codoo oruul !");
            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();
            interpretator prog = new interpretator(line);
            if(!prog.evaluate()){
                System.out.println("Aldaatai code bna ");
                
            } else {
                
            dec=prog.declaration();
            //int main(){ int i; int k; int i;}
            if(!prog.V_decs()){
                System.out.println("Dawhardsan huwisangch oldloo ");
    
            } else {
                System.out.println("Zow");
                System.out.println("Torliine haih utga oruul ");
                String a = scan.nextLine();
                System.out.println(prog.typeOf(a));
                System.out.println(prog.typing());
    
            }          
        }
    
    }
    }
    