import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        if (n > str.length()) {
            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }
        } else {
            for (int i = str.length() -1; i >= str.length() - n; i--) {
                sb.append(str.charAt(i));
            }
        }
        
        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}