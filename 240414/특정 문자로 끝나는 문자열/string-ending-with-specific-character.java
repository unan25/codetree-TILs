import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] arr = new String[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = br.readLine();
        }

        String str = br.readLine();
        boolean isContain = false;

        for (int i = 0; i < 10; i++) {
            if (str.equals(String.valueOf(arr[i].charAt(arr[i].length() - 1)))) {
                sb.append(arr[i]).append("\n");
                isContain = true;
            }
        }

        if (!isContain) sb.append("None");

        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}