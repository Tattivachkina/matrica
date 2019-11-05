package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt(), i, j, l;
        int[][] a = new int[N][M];
        int[][] b = new int[M][N];
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for (i = 0; i < M; i++) {
            for (j = 0; j < N; j++) {
                b[i][N - (j + 1)] = a[j][i];
            }
        }
        System.out.println(M + " " + N);
        for (i = 0; i < M; i++) {
            for (j = 0; j < N; j++) {
                l = N - 1;
                if (j < l) {
                    System.out.print(b[i][j] + " ");
                } else {
                    System.out.println(b[i][l]);
                }
            }
        }
    }
}