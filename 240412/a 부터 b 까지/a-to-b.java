import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" ");

        while (a < b) {
            if (a % 2 == 0){
                a = a + 3;
            } else {
                a = a * 2;
            }
            if(a <= b) sb.append(a).append(" ");
        }
        
        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
        br.close();
    }
}