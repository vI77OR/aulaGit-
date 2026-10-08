package aulaAlgoritimo;
import java.util.Scanner;
public class usoSwitch {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.print("DIgite a nota do aluno: ");
        char nota = sc.next().toUpperCase().charAt(0);

          switch (nota) {
            case 'A':
                System.out.println("Exerlente ");
                break;
            case 'B' :
                System.out.println("otimo");
                break;
            case 'C':
                System.out.println("bom"); 
                break;
            case 'D':
                System.out.println("ruim");
                break;
            case 'E':
                System.out.println("pessimo");
                break; 
            default:
                System.out.println("Nota invalida");
                break;

          }
        sc.close();
    

        
    
    
    
    
    
    }
    
    }


