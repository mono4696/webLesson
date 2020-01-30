//Javaの学習を始めて18日くらいの人のための問題集
//メソッドと配列の練習
import java.util.*;
class Q1{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("配列の要素数を入力してください>");
		//入力された要素数分の配列を用意する
		int len=s.nextInt();
		int[] orgArr=new int[len];
		//配列に使う乱数(-10~10)を用意、配列に乱数を入れる
		for(int i=0;i<orgArr.length;i++){
			orgArr[i]=rand.nextInt(21)-10;
		}
		//配列を表示
		System.out.println("配列を生成しました。");
		printArr(orgArr);
		//作業用配列の生成
		int[] tempArr=cloneArr(orgArr);
		while(true){
			System.out.print("1...元の配列を表示,2...配列を昇順ソート,3...配列を降順ソート,4...終了>");
			int select=s.nextInt();
			switch(select){
			case 1:
				printArr(orgArr);
				break;
			case 2:
				sortArr(tempArr);
				printArr(tempArr);
				break;
			case 3:
				sortArr(tempArr,true);
				printArr(tempArr);
				break;
			case 4:
				System.out.println("アプリケーションを終了します");
				s.close();//スキャナークローズ
				System.exit(0);//アプリ強制終了(０は正常終了を意味する)
			}	
		}		
	}
	public static int[] cloneArr(int[] arr){
		//元の配列の複製(クローン)を作成
		int[] retArr=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			retArr[i]=arr[i];
		}
		return retArr;
	}
	public static void sortArr(int[] arr){
		//配列を昇順に並び替える(二値の入れ替え)
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	//変数名Asc,Descはケツがc(覚えておく)
	public static void sortArr(int[] arr,boolean isDesc){
		//第二引数でtrueを渡されると降順ソートする
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				//条件内容は同じようなこと
				//isDescがtrue:降、isDescがfalse:昇(falseなら通らない！)
				if(!isDesc && arr[i] > arr[j] || isDesc && arr[i] < arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void printArr(int[] arr){
		//配列を出力するメソッド
		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			//配列の最後の要素であるかどうかでコンマを付けるか否か(大事！)
			System.out.print(arr[i]+(i==arr.length-1 ? "":","));
		}
		System.out.println("}");
	}
}
