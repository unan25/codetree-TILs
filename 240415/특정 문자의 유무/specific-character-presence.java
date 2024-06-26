import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        if (str.contains("ee")){
            sb.append("Yes");
        } else {
            sb.append("No");
        }

        sb.append(" ");

        if (str.contains("ab")){
            sb.append("Yes");
        } else {
            sb.append("No");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}