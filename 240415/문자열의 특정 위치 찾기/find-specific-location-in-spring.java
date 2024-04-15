import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        String find = st.nextToken();

        boolean isContain = false;

        for (int i = 0; i < str.length(); i++) {
            if (find.equals(String.valueOf(str.charAt(i)))) {
                sb.append(i);
                isContain = true;
                break;
            }
        }

        if (!isContain) sb.append("No");

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}