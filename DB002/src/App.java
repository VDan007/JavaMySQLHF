import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Wellcome to my homework java app 2!");
        System.out.println("There were 10 tasks in this homework");
        System.out.println("To get the answers please press the number of the task You are interested in");
        System.out.println("To quit please press q");
        String input = scanner.nextLine();
       
        int index = 0;
        while(index ==0){



            try{
                int number = Integer.parseInt(input);
                if( number <=10 && number >= 1 ){
                        System.out.println("test");
                        input = scanner.nextLine();
                }else{
                    System.out.println("enter a number between 1 and 10");
                    input = scanner.nextLine();
                }
            }catch(Exception e){
               System.out.println(e);
               System.out.println("iunput is " + input.getClass().getSimpleName());
               
               if(input == "q"){
                System.out.println("Exiting, Good bye");
                index++;
               }else{
                System.out.println("Please enter a number form 1 to 10 or q ");
                input = scanner.nextLine();
               }
               
            }

           

        }

    }

    
}
