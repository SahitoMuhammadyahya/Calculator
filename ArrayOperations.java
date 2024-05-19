import java.util.Scanner;

public class ArrayOperations{
    //Creating printing method
    static void printArray(int Array[][]){
        System.out.println("Resultant Array:");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++)
                System.out.print(Array[i][j] + " ");
            System.out.println();
            }
    }

    public static void main(String[] args) {
        //Creating Arrays
        int[][] Array1 = new int[2][3];
        int[][] Array2 = new int[2][3];

        //Creating Objects
        Scanner sc = new Scanner(System.in);

        System.out.println("If you wanna Add/Subtract a number with an Array Press '1'");
        System.out.println("If you want to Add/Subtract Arrays to eachother Press 'Other Number'");

        if(sc.nextInt()==1){
            //Filling the Array
            System.out.println("Taking Array Input:");
            for(int i=0; i<2; i++)
                for(int j=0; j<3; j++){
                    System.out.print("Fill Row " + (i+1) + " Column " + (j+1) + " : ");
                    Array1[i][j] = sc.nextInt();
                }    

            //Taking other Operand
            System.out.print("Input a number you wanna Add/Subtract: ");
            int num = sc.nextInt();

            //Asking What user wants to do
            System.out.print("Press 1 = Addition 'OR' Other Number = Subtraction: ");

            if(sc.nextInt()==1){
                for(int i=0; i<2; i++)
                    for(int j=0; j<3; j++)
                        Array1[i][j] += num;
                
                //Printing Resultant Array
                printArray(Array1);
            }

            else{
                for(int i=0; i<2; i++)
                for(int j=0; j<3; j++)
                    Array1[i][j] -= num;
            
            //Printing Resultant Array
            printArray(Array1);
            }
        }
        else{
            //Filling the Array1
            System.out.println("Taking Input 1-Array:");
            for(int i=0; i<2; i++)
                for(int j=0; j<3; j++){
                    System.out.print("Fill Row " + (i+1) + " Column " + (j+1) + " : ");
                    Array1[i][j] = sc.nextInt();
                } 

            //Filling the Array2
            System.out.println("Taking Input 2-Array:");
            for(int i=0; i<2; i++)
                for(int j=0; j<3; j++){
                    System.out.print("Fill Row " + (i+1) + " Column " + (j+1) + " : ");
                    Array2[i][j] = sc.nextInt();
                }
            //Asking User what Operation he wants to perform
            System.out.print("Press '1'= Add OR 'Other Number'= Subtract: ");
            
            if (sc.nextInt()==1){
                for(int i=0; i<2; i++)
                    for(int j=0; j<3; j++)
                        Array1[i][j] += Array2[i][j];
            
                //Printing Resultant Array
                printArray(Array1);         
            }
            else{
                for(int i=0; i<2; i++)
                    for(int j=0; j<3; j++)
                        Array1[i][j] -= Array2[i][j];
        
                //Printing Resultant Array
                printArray(Array1); 

            }
        }

    }
}
