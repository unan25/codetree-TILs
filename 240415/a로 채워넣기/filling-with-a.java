package org.example;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        sb.append(br.readLine());

        sb.replace(1, 2, "a");

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}