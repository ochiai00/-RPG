import java.util.Random;

public class Message {

     Random rnd = new Random();

     public void moveMSG(Player p){
          int movePoint = rnd.nextInt(4);
          System.out.println("*乱数は" + movePoint + "*");

          switch(movePoint){
               case 0:
                    System.out.println("『" + p.getName() + "は更に奥へと進んだ』");
                    System.out.println("");
                    break;

               case 1:
                    System.out.println("『" + p.getName() + "は左へ進んだ』");
                    System.out.println("");
                    break;

               case 2:
                    System.out.println("『" + p.getName() + "は右へ進んだ』");
                    System.out.println("");
                    break;

               case 3:
                    System.out.println("『" + p.getName() + "は訳もわからずその場で踊った。』");
                    System.out.println("");
                    break;


          }
     }





}