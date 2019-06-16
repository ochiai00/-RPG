import java.util.Random;
import java.util.Scanner;

public class Action {

	Random rnd = new Random();
	Scanner sc = new Scanner(System.in);
	InputCheck inC = new InputCheck();

	TreasureChest tc = new TreasureChest();
	Message msg = new Message();
	Battle battle = new Battle();

	public void dAction(Player p) {

		int pact = 0;

		//ダンジョンでの行動選択
		System.out.println("【行動を選択してください】");
		System.out.println("1) 進む");
		System.out.println("2) 休息する");
		System.out.println("3) ステータスを見る");
		System.out.println("4) 諦める");
		System.out.println("");

		//数字の入力を受け付ける
		pact = inC.isNum2();
		System.out.println("");
		System.out.println("◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎");

		switch (pact) {

		case 1:

			//乱数で行動を決めるメソッドを呼び出す
			events(p);

			break;

		case 2:

			p.rest();

			break;

		case 3:

			//ステータスの確認
			p.info();

			break;

		case 4:

			//リタイア処理
			System.out.println("宝探しを諦めた....");

			System.exit(0);

			break;

		}

	}

	public void events(Player p) {

		int eventsNo = rnd.nextInt(7);
		//int eventsNo = rnd.nextInt(1);
		//System.out.println("乱数は" + eventsNo);

		switch (eventsNo) {

		case 0:
		case 1:

			/*
			System.out.println("モンスターが出る予定。");
			System.out.println("今はモンスターが息を潜めているから安全だよ！(訳:未実装)");
			*/

			battle.battleStandby(p);

			break;

		case 2:
		case 3:
		case 4:
		case 5:

			msg.moveMSG(p);

			break;

		case 6:
		case 7:

			tc.boxContents(p, inC);

			break;

		default:
			System.out.println("期待してない数値" + eventsNo + "が出てるぞ！確認したまえ。");
			break;

		}

	}

}