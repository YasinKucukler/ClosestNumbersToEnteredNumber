import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[]{15,12,788,1,-1,-778,2,0};
		int num = input.nextInt();
		Arrays.sort(arr);
		int lower = arr[0], higher = arr[arr.length-1];
		
		for (int i = 0, k = arr.length -1; i< arr.length; i++, k--){
			if (arr[i] < num && arr[i] > lower)
			{
				lower = arr[i];
			}
			if(arr[k] > num && arr[k] < higher)
			{
				higher = arr[k];
			}
		}
		System.out.println("Girilen sayı : " + num);
		System.out.println("Girilen sayıdan küçük en yakın sayı : " + lower);
		System.out.println("Girilen sayıdan büyük en yakın sayı : " + higher);
	}
}