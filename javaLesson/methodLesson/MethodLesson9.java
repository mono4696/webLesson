//BMIアプリの作成
import java.util.Scanner;
public class MethodLesson9 {
	//体重と身長を受け取り、bmiを返すメソッド
	static double calcBMI(double weightKg,double heightCm){
		//cmからmに変換
		double heightM=heightCm/100;
		//bmiの計算
		double bmi=weightKg/(heightM*heightM);
		return bmi;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("体重を入力してください(kg)>");
		double weight=scan.nextDouble();
		System.out.print("身長を入力してください(cm)>");
		double height=scan.nextDouble();
		//calcBMIを呼び出した結果をbmiに代入
		double bmi=calcBMI(weight,height);
		System.out.printf("体重:%.1fkg,身長:%.1fcmのBMIは%.1fです。",weight,height,bmi);
		scan.close();
	}

}

