import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String score = "";

        MyObserver observer = new MyObserver();
        observer.register(new LiveInThai());
        observer.register(new OppaFootball());

        System.out.print("Enter Score ");

        score = sc.nextLine();
        while (!score.equals("")){
            observer.setScore(score);
            score = sc.nextLine();
        }

        System.out.println("End of Observer");


    }
}
