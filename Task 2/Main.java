import java.util.Scanner;
class Main{
	
public static void main(String [] args){

System.out.println("Please type your name");

Scanner a = new Scanner(System.in);

String name= a.nextLine();

System.out.println("Hello "+ name + " Please type your age");
 
int age= a.nextInt();

System.out.println("You are "+ age + " years old");

int retireAge= 67;
int timeForRetirement= retireAge-age;

System.out.println("You have " + timeForRetirement + " years left until retirement!");
}
}