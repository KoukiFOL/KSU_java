import java.util.Scanner;

public class PlusOrMinous{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Integer value = scanner.nextInt();
        if(value > 0){
            System.out.printf("与えられた数値は正の値です。:%d%n", value );
        }
        else if(value == 0){
            System.out.printf("与えられた数値は0です: %d%n", value);
        }
        else{
            System.out.printf("与えられた数値は負の値です%d%n", value);
        }
    }
}