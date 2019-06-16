public class Slime {


    String name = "スライム";

    int hp = 10;

    int str = 1;

    private boolean defSwitch = false;

    public String getName(){
          return name;
     }

    public void setHp(int hp){
            this.hp = hp;
     }

     public int getHp(){
          return hp;
     }


     public void setDefSwitch(boolean defSwitch){
          this.defSwitch = defSwitch;
     }

     public boolean getDefSwitch(){
          return defSwitch;
     }

    public void attack(Player p){
        p.setHp(p.getHp() - this.str);

        System.out.println(this.name + "の攻撃！");
        System.out.println(p.getName() + "に" + this.str + "のダメージ！");

    }


    public void defense(){
          if(defSwitch == false){
          System.out.println("『" + this.name + "は身構えた！』");

               this.defSwitch = true;

          }else{

               this.defSwitch = false;

          }
     }

    public void poisonAtk(Player p){
         System.out.println(this.name + "は毒攻撃を繰り出した！");

         p.setPoi(true);

    }


}