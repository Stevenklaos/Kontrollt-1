/*
9 8 7 6 5 4 3 2 1 0
8 8 7 6 5 4 3 2 1 0
7 7 7 6 5 4 3 2 1 0
6 6 6 6 5 4 3 2 1 0
5 5 5 5 5 4 3 2 1 0
4 4 4 4 4 4 3 2 1 0
3 3 3 3 3 3 3 2 1 0
2 2 2 2 2 2 2 2 1 0
1 1 1 1 1 1 1 1 1 0
0 0 0 0 0 0 0 0 0 0
 */
public class Maintable {
    public void Number() {
        for (int i=1; i<=10; i++) {
            for (int j = 9; j >= 0; j--) {
                int rowNumber = 10 - i;
                System.out.print(Math.min(rowNumber, j));
            }
            System.out.print('\n');
        }
    }
}
