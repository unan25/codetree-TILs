import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(String.valueOf(br.readLine().length()));
        int b = Integer.parseInt(String.valueOf(br.readLine().length()));
        int c = Integer.parseInt(String.valueOf(br.readLine().length()));

        int min = Math.min(a, b);
        min = Math.min(min, c);

        int max = Math.max(a, b);
        max = Math.max(max, c);

        System.out.println(max - min);
    }
}