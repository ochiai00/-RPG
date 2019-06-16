import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCheck {



    public int isNum() {

		Scanner sc = new Scanner(System.in);

		while(true) {

		      try {
		    	  int a = sc.nextInt();
		    	  //System.out.println("数字が入力されました。OK");

		    	  try {

				      if(a > 0 && a < 3) {
				    	  return a;

				      }else{
				    	  System.out.println("1~2で選択してください。");
				    	  return isNum();
				      }

			      }catch(InputMismatchException e){

			    	  System.out.println("指定された範囲で選択してください。");

			    	  return isNum();

			      }


		      }catch(InputMismatchException e){
		    	  System.out.println("指定された範囲で選択してください。");

		    	  return isNum();

		      }
	     }
	}


	public int isNum2() {

		Scanner sc = new Scanner(System.in);

		while(true) {

		      try {
		    	  int pact = sc.nextInt();
		    	  //System.out.println("数字が入力されました。OK");

		    	  try {

				      if(pact > 0 && pact < 5) {
				    	  return pact;

				      }else{
				    	  System.out.println("1~4で選択してください。");
				    	  return isNum2();
				      }

			      }catch(InputMismatchException e){

			    	  System.out.println("指定された範囲で選択してください。");

			    	  return isNum2();

			      }


		      }catch(InputMismatchException e){
		    	  System.out.println("指定された範囲で選択してください。");

		    	  return isNum2();

		      }
	     }
	}
}