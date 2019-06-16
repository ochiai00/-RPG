public class MainGame {

 public void startGame(MainGame mg)
 {

     Action action = new Action();

     Gameresults gameresults = new Gameresults();

     //Battle battle = new Battle();
     //Count count  = new Count();
     //Healthcondition hc = new Healthcondition();


     Player p = new Player();



      //-------------------------------------------
     //★ゲームスタート★
     //              ↓


System.out.println("◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎");
System.out.println("");
     System.out.println(
     "「あなたはトレジャーハンターです。」");
     System.out.println("「このダンジョンを探索し、宝物を集めましょう！」");
     System.out.println("");

     System.out.println("◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎");
     System.out.println("");

     //TPが100になるまで繰り返す
     //100になったらゲームクリア

          p.battleInfo();


          while(p.getTp() <= 100){

               action.dAction(p);
               //m.poisonAtk();
               //p.setHp(p.getHp() - 100);


     //HPを確認し、0ならゲームオーバー
     //0以上なら継続
             if(p.getHp() <= 0){

                gameresults.gameover(p, mg);


              }else if(p.getTp() >= 100){

                 System.out.println(
                 "トレジャーポイントが"
                 + p.getTp() + "になりました。");

                  break;

              }else{
                    System.out.println("◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎");
                    System.out.println();
                    System.out.println(
                    "現在のトレジャーポイント:"
                     + p.getTp());
                     System.out.println();

              }

           }

           gameresults.gameclear(p);
 }

 //↓終わりの}
 }