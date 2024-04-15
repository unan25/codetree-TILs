import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        char now = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (now == str.charAt(i)) {
                count++;
            } else {
                sb.append(now).append(count);
                now = str.charAt(i);
                count = 1;
            }
        }
        sb.append(now).append(count);

        sb.insert(0, sb.length() + "\n");

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}