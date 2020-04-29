package domain;
/**
 * class for calculate the second largest number 
 * @author asus
 */
public class Exercise {
public static int Calculate(int[] arr) {
    int r = 0;

    for (int i = 0; i < arr.length - 1; i++)

            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    
        for(int i=1; i<arr.length;i++){
            if(arr[i]!= arr[i-1] )
            { r = arr[i];
              break;}
            }

    return r;
    }
}