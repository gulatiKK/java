import java.util.stream.IntStream;

public class averageofarray {
    public static void main(String[] args){
        int[] arr = {91, 87, 67, 69, 420, 76, 98};
        int length = arr.length;
        int sum = IntStream.of(arr).sum();
        int average;

        average = sum / length;

        System.out.println(average);
    }
}
