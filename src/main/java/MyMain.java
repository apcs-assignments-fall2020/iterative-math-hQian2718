import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double guess = Math.random() * x;
        double better_guess = 1;

        while(true){
            better_guess = (guess + x/guess)/2;
            if(Math.abs(guess - better_guess) < 0.00001){
                return better_guess;
            }else{
                guess = better_guess;
            }
        }
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int result = 1;
        for(int i = 1; i <= x; i ++){
            result *= i;
        }
        return result;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double old = 0;
        double new_ = 0;
        int n = 0;

        do{
            old = new_;
            new_ += 1/MyMain.factorial(n);
            n ++;
        }while(Math.abs(new_ - old) > 0.00001);

        return new_;

    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input = 0;
        do{
            System.out.println("Please enter a positive number!");
            input = scan.nextDouble();
        }while(input <= 0);


        // YOUR CODE HERE

        System.out.println("The square root of "+ input + " is " + babylonian(2));
        System.out.println("The value of e is roughly " + calculateE());

        scan.close();
    }
}
