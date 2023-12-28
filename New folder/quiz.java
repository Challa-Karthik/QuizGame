import java.util.Scanner;
import java.util.ArrayList;
public class quiz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         String[] paper = {
            "what are the applications of java",
            " what is the meaning of void keyword",
            " what is the full form of JVM ",
            " what the JVM can do ",
            " What are the elements JRE contains",
            " How the do while loop works"
         };
            String[][] options = {
                {"Web Applications", "Embedded Systems", "Processing of Big Data","All the Above"},
                {"it returns a value","it does not returns a value","it is a constructer","None of the Above"},
                {"java virtual machine","java visual maker","joint virtual machine","java visual machine"},
                {"it converts byte code into machine code","it converts machine code into byte code","it runs the program","None of the above"},
                {"JVM","java class libraries",  "Other components", "All The Above"},
                {"it execute the block and then check the condition","it check the condition and then execute the block","it doesn't check the condiyions","none of the above"}
        };
           
           Character[] answers = {'d','b','a','a','d','a'} ;
        int marks = 0 ;
        
        System.out.println("\n                            welcome to java Quiz                                    ");
        System.out.println("---------------------------=====================------------------------------------");
        System.out.println("** In this Quiz we have to know about the following topics **");
        System.out.println("1.JDK , JVM and JRE Overview\n2.Data types and code flow\n3.Decision Making Statements\n\n\n");
        System.out.println("            ------------>>>>>>Lets Begin<<<<<<-----------\n");
        int c = 1 ;
        String[] a = {"  A) ","  B) ","  C) ","  D) " };
        
        for(int i=0; i< paper.length ; i++  ) {

            System.out.print(i+1 +". "+ paper[i] +" ?\n");

            for(int j=0; j< options[0].length; j++) {
              System.out.println( a[j] + options[i][j] + ".");
              
            }
            System.out.print("ans : ");
            char ans = sc.next().toLowerCase().charAt(0);
            
            if(ans  == answers[i] ){
                marks++ ;
                System.out.println("   good job.You got a point\n");
            }
            
          
          
            c++;
        }
        System.out.println("\n----->>> your total score is "+marks+"/"+(c-1 +"\n"));
        System.out.println("       THANKS FOR PLAYING.HOPE YOU ARE ENJOYED !");
        System.err.println("___________________***********__________________\n");





       
       
    }
}
