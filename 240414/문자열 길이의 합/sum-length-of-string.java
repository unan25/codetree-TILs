import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            sum += str.length();
            if ('a' == str.charAt(0)) count++;
        }

        sb.append(sum).append(" ").append(count);

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}