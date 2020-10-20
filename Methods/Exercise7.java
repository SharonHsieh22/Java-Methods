import java.util.Scanner;

class Exercise7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rolls = 5;
        int sides = 0;
        int total = 0;
        int dieroll = 0;
        String ans = "y";
        while(ans.equals("y")) {
            System.out.print("How many dice do you want to roll? ");
            rolls = sc.nextInt();
            System.out.print("How many sides do these dice have? ");
            sides = sc.nextInt();
            System.out.println("");
            System.out.print("You rolled: ");
            for(int i = 0; i < rolls; i++) {
                dieroll = rollDie(sides);
                System.out.print(dieroll + " ");
                total += dieroll; 
            }
            System.out.println("");
            System.out.println("Total: " + total);
            System.out.println("");
            System.out.print("Again? [y,n] ");
            ans = sc.next();
            System.out.println("");
            total = 0;
        }
        System.out.println("Goodbye!");
    }

    public static int rollDie(int s) {
        return (int) (Math.random()*s) + 1;
    }
}