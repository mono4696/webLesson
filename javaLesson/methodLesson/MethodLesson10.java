import java.util.*;
public class MethodLesson10{
	//第一引数にint型配列を受け取り、その要素を第二引数倍にするメソッド
	public static void timesArray(int[] arr, int times){
		//引数で入ってきたアドレスにある配列を直接書き換える
		for(int i=0; i<arr.length; i++){
			arr[i]=arr[i]*times;
		}
	}
	public static void main(String[] args){
		//｛1,2,3｝を要素とする配列をメモリ空間に作成し、その時のアドレスをarr1は保持
		int[] arr1=new int[]{1,2,3};
		//timesArrayにそのアドレスを渡す(arr1の内容を2倍にする)
		timesArray(arr1,2);
		//arr1にある配列の内容が書き換わったことを確認
		System.out.println(Arrays.toString(arr1));
		//更にarr1の内容を3倍にする
		timesArray(arr1,3);
		//arr1の値が3倍されたことを確認
		System.out.println(Arrays.toString(arr1));
	}
}
//アドレス値をやり取りしているので、操作している配列がメモリ空間に一つしかないことを意識する（newしたのは一回）

