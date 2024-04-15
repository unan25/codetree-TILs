import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        String[] arr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = String.valueOf(str.charAt(i));
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) {
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                String temp = arr[b - 1];
                arr[b - 1] = arr[a - 1];
                arr[a - 1] = temp;

                for (String s : arr) {
                    sb.append(s);
                }
                sb.append("\n");
                str = sb.toString();
            }
            if (num == 2) {
                String a = st.nextToken();
                String b = st.nextToken();
                for (int j = 0; j < str.length(); j++) {
                    if (String.valueOf(str.charAt(j)).equals(a)) {
                        arr[j] = b;
                    }
                }

                for (String s : arr) {
                    sb.append(s);
                }
                sb.append("\n");
                str = sb.toString();
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}