import java.util.Scanner;

public class SwitCase {

public void setCase(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your number");
    int number=scanner.nextInt();
    switch (number){
        case 1:
            System.out.println("число 1");
            break;
        case 2:
            System.out.println("число 2");
            break;
        case 3:
            System.out.println("число 3");
            break;

            default:
                System.out.println("Введите 1,2 или 3");
                break;
    }

}
}


//String s=scanner.next();
//final String case2
// для сравнения строк переменная final или условие прямо в case