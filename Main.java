import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("What team are you on? Team 1 or team 2");
    int team = scan.nextInt();
    System.out.println("How many games are you playing today?");
    int games = scan.nextInt();
    while (0 <= games) {
      if (games == 4)
      System.out.println("You are done");
      else{ 
        System.out.println("Keep going");

      }
      games--;
    }
    

    System.out.println("Team 1");
  }
}