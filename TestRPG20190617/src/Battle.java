import java.util.Random;


public class Battle {




    public void battleStandby(Player p){
        Slime s = new Slime();

        battleFiled(p, s);

    }


    public void battleFiled(Player p, Slime s){

     System.out.println("◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎");
System.out.println("");

         System.out.println(s.getName() + "が現れた！");
         System.out.println("");
         System.out.println("<<<<戦闘開始>>>>");
         System.out.println("");


        while(p.getHp() > 0 && s.getHp() > 0){

            p.battleInfo();
            pBattleAct(p, s);
            mBattleAct(p, s);
            System.out.println("◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎");
System.out.println("");
        }

            System.out.println("モンスターを倒した！");
            System.out.println("");

            p.setExp(p.getExp() + 1);
            p.levelUp();

            System.out.println("倒したモンスターは宝物を持っていた。");
            System.out.println("トレジャーポイント+2");
            p.setTp(p.getTp() + 2);

            System.out.println("");
            System.out.println("◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎");
System.out.println("");

    }


    private void pBattleAct(Player p, Slime s){

        //Scanner sc = new Scanner(System.in);

        InputCheck inC = new InputCheck();

        System.out.println("【行動を選択してください】");
        System.out.println("1) 攻撃 2) 防御");

        int a = inC.isNum();

        switch(a){
                         case 1:
                         p.attack(s);

                         break;

                         case 2:
                         p.defense();

                         break;
                    }

    }

    public void mBattleAct(Player p, Slime s){

        Random rnd = new Random();

        int a = rnd.nextInt(2);

        switch(a){
                         case 0:
                         s.poisonAtk(p);
                         //System.out.println(s.getName() + "は、ぼーっとしている");

                         break;

                         case 1:
                         s.attack(p);

                         break;

                         case 2:
                         s.defense();

                         break;
                    }


    }


}