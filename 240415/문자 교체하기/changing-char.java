import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        String str2 = st.nextToken();
        char[] arr = str2.toCharArray();
        
        arr[0] = str.charAt(0);
        arr[1] = str.charAt(1);

        for (char c : arr) {
            sb.append(c);
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}