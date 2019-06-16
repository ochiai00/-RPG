import java.util.Random;
import java.util.Scanner;

public class TreasureChest {

     Random rnd = new Random();
     Scanner sc = new Scanner(System.in);

     public void boxContents(Player p, InputCheck inC){

          System.out.println("鍵の掛かっていない宝箱を見つけた。");
          System.out.println("開けますか？");
          System.out.println("1) はい  、2) いいえ");

          int a = inC.isNum();

          switch(a){

          case 1:

               int tJudgment = rnd.nextInt(5);

               if(tJudgment == 4){

                    p.setHp(p.getHp() - 3);

                    System.out.println("宝箱を開けた。");
                    System.out.println("しかし罠だった！！");
                    System.out.println(p.getName() + "は3のダメージを受けた。");
                    System.out.println("");

               }else if(tJudgment == 1 || tJudgment == 3){

                    System.out.println("中には宝物が入っていた！");
                    int getTreasurePoint = rnd.nextInt(4) + 1;
                    p.setTp(p.getTp() + getTreasurePoint);

               }else{
                    System.out.println("中は空っぽだった...。");
               }

          break;


          case 2:

               System.out.println("宝箱を開けずにその場を離れた。");

          break;
     }

     }












}