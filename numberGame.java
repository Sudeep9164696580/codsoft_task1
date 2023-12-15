import java.util.Random;
import java.util.Scanner;

class game {
int computer;
public game(){
    Random rand=new Random();
    computer=rand.nextInt( 100);
    System.out.println("guess the number from 1 to 100");

}
public int computerNo(){return computer;}

public class numberGame {
    static int takeuserInput(){
     int user;
     System.out.println("Enter");
    
    Scanner sc = new Scanner(System.in);
    user = sc.nextInt();
    return user;  
}
static void isCorrectNumber(int i,int j){
    if(i==j){
        System.out.println("correct guess");
    }
    else if(i>j){
        System.out.println("your number is bigger then computer number");
    }
    else{
        System.out.println("your number is lesser then computer value");
    }
    }
    public static void main(String[] args) {
        int user=0,computer=0,itteration=0;
        game g=new game();
        do{
            user=takeuserInput();
            computer=g.computerNo();
            isCorrectNumber(user,computer);
            itteration++;
        }while(user!=computer);
        System.out.println("you guess number in "+ itteration+" itteration");
    }
}
}


