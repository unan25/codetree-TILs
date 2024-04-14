import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] arr = new String[st.countTokens()];

        int num = 0;

        while (st.hasMoreTokens()) {
            arr[num++] = st.nextToken();
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sb.append(arr[i]).append("\n");
            }
        }

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}