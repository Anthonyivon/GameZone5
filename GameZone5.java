//i will be using a scanner because JoptionPane is not working
import java.util.Random;
import java.util.Scanner;

public class GameZone5
{
public static void main (String[] args)
{
    // here are my integers for the dice
    Scanner joe=new Scanner(System.in);
    Random loe= new Random ();
int ranNum= 1 + loe.nextInt(100) ;
int MIN_NUM=1;
int MAX_NUM=100;
int userNum=0;
int userGuess=0;
//here is how im getting my input

Scanner joe=new Scanner(System.in);
//here is my while loop to keep asking the question until its right
while (ranNum!=userNum) {
    System.out.println("try to guess a number in between 1-100");
userNum=joe.nextInt();
 
    if (ranNum<userNum) {
        System.out.println("your guess was to high");

    }
    else if(ranNum>userNum){
        System.out.println("your guess was to low");
    }
    else {

    }
    userGuess++;}
//here are the output statments
System.out.println(" your guess is correct");
System.out.println("here are the number of tries it took for you to guess the number: "+ userGuess);
}

}








