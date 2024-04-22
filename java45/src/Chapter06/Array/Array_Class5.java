package Chapter06.Array;
//다시 올리기
public class Array_Class5 {
    public static void main(String[] args) {
        int score[][] = {
                {77, 56, 70, 88},
                {55, 33, 89, 91},
                {87, 24, 11, 53}
        };

        for (int student[] : score) {
            for (int subject : student) {
                System.out.print(subject + ", ");
            }
            System.out.println();
        }
    }
}