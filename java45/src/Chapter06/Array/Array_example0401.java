package Chapter06.Array;

import java.util.Random;
import java.util.Scanner;

public class Array_example0401 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        System.out.print("구매하실 로또의 개수를 입력하세요 : ");
        int num = scanner.nextInt();

        System.out.println("=============================");

        int[][] arr = new int[num][6];


        // 난수 형성 및 중복 제거
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (j == 0) {
                    arr[i][j] = r.nextInt(45) + 1;
                } else {
                    do {
                        arr[i][j] = r.nextInt(45) + 1;

                    }

                    while (arr[i][j - 1] == arr[i][j]);
                }

            }
        }


        //sort
        // 5 1 3 6 4 2
        for (int a = 0; a < num; a++) { 
            for (int b = 0; b < arr[a].length-1; b++) {
            	for(int c=0; c<arr[a].length-1-b; b++) {
            		if(arr[a][b] > arr[a][b+1]) {
            			int temp = 0;
            			temp = arr[a][b];
            			arr[a][b] = arr[a][b+1];
            			arr[a][b+1] = temp;
            		}
            	}
            }
        }


        //print
        for (int a = 0; a < arr.length; a++) {

            System.out.printf("*[%d]번째 : " ,(a+1));

            for (int b = 0; b < arr[a].length; b++) {
                System.out.print(arr[a][b] + " ");
            }

            System.out.println();
        }


    }
}

