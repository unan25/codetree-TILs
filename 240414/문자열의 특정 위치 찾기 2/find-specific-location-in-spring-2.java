import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};
        String str = br.readLine();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (str.equals(String.valueOf(arr[i].charAt(2))) || str.equals(String.valueOf(arr[i].charAt(3)))){
                count++;
                sb.append(arr[i]).append("\n");
            }
        }
        sb.append(count);

        System.out.println(sb.toString().trim());
    }
}