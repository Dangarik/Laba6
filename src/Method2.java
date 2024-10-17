import java.util.Random;
import java.util.Arrays;
public class Method2 {
    public static void main(String[] args) {
        System.out.println("масив до сортуваня");

        int arr[]=new int [10];
        Random random =new Random();
        for (int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(100);

        }
        System.out.println(Arrays.toString(arr));

        insertion_sort(  arr);
        System.out.println("Масив після сортування");
        System.out.println(Arrays.toString(arr));


    }
    static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i;
            while(j>0 && arr[j-1]>current){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=current;
        }
    }
}

