import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Simulation simulation = new Simulation();

    }

    private static int getNumbers(){
        System.out.println("Please input a number!");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        return num;
    }

    private static int mayor(int a, int b){
        if(a>b){
            return a;
        }else return b;
    }
}
