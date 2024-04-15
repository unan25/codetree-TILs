import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        char[] arr = str.toCharArray();
        char c1 = arr[0];
        char c2 = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c2) arr[i] = c1;
        }

        for (char c : arr) {
            sb.append(c);
        }
        
        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}