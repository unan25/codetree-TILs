import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a; i++) {
            String str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.contains("3") || str.contains("6") || str.contains("9") || i % 3 == 0) {
                    sb.append(0).append(" ");
                    break;
                } else {
                    sb.append(i).append(" ");
                    break;
                }
            }
        }

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}