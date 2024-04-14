import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String str2 = br.readLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str2.equals(str.substring(i, i + 1))) {
                count++;
            }
        }
        System.out.println(count);
    }
}