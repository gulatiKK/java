import java.util.Arrays;

public class secondlargest{
    public static void main(String[] args) {
        int arr[] = {18, 79, 69, 54, 75};
        Arrays.sort(arr);

        System.out.println(arr[arr.length-2]);
    }
}