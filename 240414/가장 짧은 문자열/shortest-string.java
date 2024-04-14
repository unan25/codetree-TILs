import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(String.valueOf(br.readLine().length()));
        int b = Integer.parseInt(String.valueOf(br.readLine().length()));
        int c = Integer.parseInt(String.valueOf(br.readLine().length()));

        int temp = Math.min(a, b);
        temp = Math.min(temp, c);

        System.out.println(temp);
    }
}