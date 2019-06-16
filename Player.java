import java.util.Random;

public class Player {

     Random rnd = new Random();

     //ステータス定義
     private String name = "java太郎";

     private int level = 1;

     private int hp = 20;
     private int maxHp = 20;

     private int str = 3;

     private int vit = 2;

     private int luk = 1;

     private int exp = 99;

     private int tp = 90;

     private int torch = 50;

     private boolean alive = true;

     private boolean defSwitch = false;

     private boolean poi = false;






     public void setName(String name){
            this.name = name;
     }

     public String getName(){
          return name;
     }


     public void setHp(int hp){
            this.hp = hp;
     }

     public int getHp(){
          return hp;
     }


     public void setMaxHp(int maxHp){
            this.maxHp = maxHp;
     }

     public int getMaxHp(){
          return maxHp;
     }


     public int getStr(){
          return str;
     }

     public int getVit(){
          return vit;
     }


     public void setLuk(int luk){
            this.luk = luk;
     }

     public int getLuk(){
          return luk;
     }


     public void setExp(int exp){
            this.exp = exp;
     }

     public int getExp(){
          return exp;
     }


     public void setTp(int tp){
            this.tp = tp;
     }

     public int getTp(){
          return tp;
     }


     public void setTorch(int torch){
            this.torch = torch;
     }

     public int getTorch(){
          return torch;
     }


     public void setLevel(int level){
            this.level = level;
     }

     public int getLevel(){
          return level;
     }



     public void setAlive(boolean alive){
          this.alive = alive;
     }

     public boolean getAlive(){
          return alive;
     }


     public void setDefSwitch(boolean defSwitch){
          this.defSwitch = defSwitch;
     }

     public boolean getDefSwitch(){
          return defSwitch;
     }


     public void setPoi(boolean poi){
          this.poi = poi;
     }

     public boolean getPoi(){
          return poi;
     }







     //以下メソッド群



     //【情報表示(全て)】
     public void info(){
          System.out.println("=============");
          System.out.println("《プレイヤー》");
          System.out.println("名前:" + this.name);
          System.out.println("レベル:" + this.level);
          System.out.println("HP:" + this.hp);
          System.out.println("攻撃力:" + this.str);
          System.out.println("防御力:" + this.vit);
          System.out.println("");
          System.out.println("生死:" + this.alive);
          System.out.println("防御状態:" + this.defSwitch);
          System.out.println("毒状態:" + this.poi);
          System.out.println("");
          System.out.println("松明の明るさ:" + this.torch);
          System.out.println("トレジャーポイント:" + this.tp);
          System.out.println("=============");
     }


     public void battleInfo(){

          String state1 = "";

          if(this.poi == true){
               state1 = "《どく》";
          }else if(this.poi == false){
               state1 = "";
          }

          System.out.println("");
          System.out.println("=============");
          System.out.println("《プレイヤー》");
          System.out.println("名前:" + this.name);
          System.out.println("レベル:" + this.level);
          System.out.println("HP:" + this.hp);
          System.out.println(state1);
          System.out.println("=============");
          System.out.println("");
     }



     //【レベルアップ】
     public void levelUp(){

          if((this.level <= 10 && this.exp >= 100 || this.level >= 11 && this.exp >= 200)){

               level++;
               this.exp = 0;

               System.out.println("☆ レベルアップ！ ☆");
               System.out.println(this.name + "はレベルが" + this.level + "になった！");

           }
     }

     /*

     //【通常攻撃メソッド】
     public void attack(Slime s){

          int dmg = this.str - m.getVit();

          if(m.getIsDefending() == true){
               dmg = dmg / 2;
          }else{

          }

          System.out.println("『" + this.name + "の攻撃！』");

          if(dmg <= 0){
               System.out.println(m.getName() + "にダメージを与えられなかった...");
          }else{

               int criticalPoint = 1000 / this.luk;
               int critical = rnd.nextInt(criticalPoint) + 1;

               //int criticalHit = 7;

               if(critical == this.luk){
                    dmg = dmg * 2;
                    System.out.println("クリティカル！！");
               }else{

               }

               System.out.println(m.getName() + "に" + dmg + "のダメージを与えた！");
               m.setHp(m.getHp() - dmg);
               System.out.println("");

          }
     }
     */



     //【物理防御】
     public void defense(){
          if(defSwitch == false){
          System.out.println("『" + this.name + "は身構えた！』");

               this.defSwitch = true;

          }else{

               this.defSwitch = false;

          }
     }


     public void attack(Slime s){
         s.setHp(s.getHp() - this.str);
         System.out.println(s.getName() + "に" + this.str + "のダメージ！");
     }



     //【休息】
     public void rest(){

          this.torch = this.torch - 4;

          //回復の必要がなかったら
          if(this.hp == this.maxHp){

               System.out.println("休息の必要はなかった。");
               System.out.println("時間だけを浪費した...。");

          }else{

          //過剰回復時
          int restPa = this.maxHp - this.hp;

          //適量回復時
          int restPb = this.level * this.vit;

          //実際に回復させる
          this.hp = this.hp + restPb;

          System.out.println(this.name + "はその場に座って少し休んだ。");

          //最大値を超える回復
          if(this.hp > this.maxHp){
               this.hp = this.maxHp;
               System.out.println("HPが" + restPa + "回復した。");

          //適量回復時
          }else if(this.hp < this.maxHp  || this.hp == maxHp){
               System.out.println("HPが" + restPb + "回復した。");
          }

          }
    }




}