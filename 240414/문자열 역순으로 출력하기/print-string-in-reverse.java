import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] arr = new String[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 3; i >= 0; i--) {
            sb.append(arr[i]).append("\n");
        }

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}