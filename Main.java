import java.util.Scanner;

public class Main {

 public static void main(String[] args)
 {
      MainGame mg = new MainGame();
      InputCheck inC = new InputCheck();

      Scanner sc = new Scanner(System.in);

      System.out.println("【何となくトレジャーハンター始めてみた】");
      System.out.println("");
      System.out.println("1) ゲームスタート 2) 終了");
      System.out.println("※数字を入力後にreturnで決定");
      System.out.println("");

          int a = inC.isNum();


           if(a == 1){
             mg.startGame(mg);

           }else{
                System.out.println("プログラム終了");
                System.out.println("終了します。");

                System.exit(0);
           }

 }

}