//二つのint型配列を引数で受け取り、それを結合した配列を返すメソッド作成
import java.util.Arrays;
public class MethodLesson13 {
	public static void main(String[] args) {
		int[] arr1={1,2,3};
		int[] arr2={4,5,6,7};
		//ここでarrMergeメソッド呼び出し
		int[] arr3=arrMerge(arr1,arr2);
		System.out.println(Arrays.toString(arr3));

	}
	public static int[] arrMerge(int[] arr1,int[] arr2){
		//arr1とarr2の配列を合わせたretArr配列を作成(複製)
		int[] retArr=new int[arr1.length+arr2.length];
		//retArr.length=要素数7
		for(int i=0;i<retArr.length;i++){
			//arr1.length=3よりiが小さい...1,2,3と順番に要素が入る
			if(i<arr1.length){
				retArr[i]=arr1[i];
			//この時点でi=4,
			}else{
				retArr[i]=arr2[i-arr1.length];
			}
		}
		return retArr;
	}
}
