import java.util.Scanner;
public class ConditionalVariableMutation {
    public static void main(String[] args){

        Scanner paros = new Scanner(System.in);
        System.out.println("Kérek egy számot:");
        int a = paros.nextInt();
        if(a%2==0){
            int a2=a+1;
            System.out.println(a2);
        }else{
             System.out.println(a);
        }

        Scanner egesz = new Scanner(System.in);
        System.out.println("Kérek egy számot 0 és 30 közöt:");
        int b = paros.nextInt();

        if(b<10){
            System.out.println("Less!");
        }
        if(b>=10 && b<=30){
            System.out.println("Sweet!");
        }else{
            System.out.println("Több!");
        }


        
    }}
