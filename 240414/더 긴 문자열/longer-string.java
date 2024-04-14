import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        String str2 = st.nextToken();

        if (str.length() > str2.length()) System.out.println(str + " " + str.length());
        if (str.length() < str2.length()) System.out.println(str2 + " " + str2.length());
        if (str.length() == str2.length()) System.out.println("same");
    }
}