import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        String str = br.readLine();
        int count = 0;
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            if (str.equals(String.valueOf(arr[i].charAt(0)))) {
                count++;
                sum += arr[i].length();
            }
        }

        sb.append(count).append(" ").append(String.format("%.2f", sum / count));

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}