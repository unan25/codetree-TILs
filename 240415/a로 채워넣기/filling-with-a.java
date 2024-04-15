import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        char[] arr = str.toCharArray();

        arr[1] = 'a';
        arr[arr.length - 2] = 'a';

        for (char c : arr) {
            sb.append(c);
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}