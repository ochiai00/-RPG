import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame{

 public static void main(String[] args)
 {
      MainGame mg = new MainGame();
      InputCheck inC = new InputCheck();

      //Scanner sc = new Scanner(System.in);

      Main frame = new Main("初めてのウィンドウ表示");
		frame.setSize(850,700);
		frame.setVisible(true);






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


 		Main(String title){

 			setTitle(title);
 			setBounds(100, 200, 300, 250);
 			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 			JLabel jlabel = new JLabel();
 			JLabel jlabel2 = new JLabel();
 			JLabel jlabel3 = new JLabel();


 			JPanel p = new JPanel();

 			jlabel.setText("このゲームはコンソール上で遊ぶ形になっています。");
 			jlabel2.setText("行動は表示された選択肢から数字で決定して下さい。");
 			jlabel3.setText("例) 1)攻撃　2)防御　で攻撃したいなら1を入力しEnterキー");

 			p.add(jlabel);
 			p.add(jlabel2);
 			p.add(jlabel3);


 			Container contentPane = getContentPane();
 		    contentPane.add(p, BorderLayout.CENTER);

 		}


}