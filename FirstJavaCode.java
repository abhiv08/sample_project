import java.util.Scanner;
class FirstJavaCode
{

         public static void main(String...args)
         {

          System.out.println("Hello to Java Programming World");  
          FirstJavaCode fjc = new FirstJavaCode();
                 fjc.show();
                 fjc.otherMethod();
                 fjc.evenOdd();
          }
         
         public void show(){
  System.out.println("Second Code Hello!!");
}
         
         public static void evenOdd()
         {
            Scanner reader = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = reader.nextInt();

            if(num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");
        }
              
          
         
         void otherMethod()
         {
          System.out.println("Hello its otherMethod from thinkbot");  
                    
                  
         }
       
}
