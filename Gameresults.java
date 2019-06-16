import java.util.Scanner;

public class Gameresults {

     Scanner sc = new Scanner(System.in);


     public void gameclear(Player p){
          System.out.println("見事ダンジョンから生還した！");
          System.out.println("");

          System.out.println("【探索結果】");

          System.out.println("スコア:" + p.getTp() + "P");
          System.out.println("");
     }



     public void gameover(Player p, MainGame mg){

          int a;


          System.out.println(p.getName() + "は力尽き倒れた。");
          System.out.println("彼は暗く冷たいダンジョンの中でスケルトンの一体として彷徨うこととなった...。");

          System.out.println("");
          System.out.println("");
          System.out.println("再挑戦しますか？");
          System.out.println("1) はい. 2)いいえ");
          System.out.println("");

          a = sc.nextInt();

          switch(a){

               case 1:

               mg.startGame(mg);

               break;

               case 2:

               System.out.println("終了します。");
               a = sc.nextInt();
               System.exit(0);

          }
     }





}