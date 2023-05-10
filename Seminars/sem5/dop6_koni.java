//Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз.

package JavaProject.Seminars.sem5;

import java.util.ArrayList;
import java.util.Arrays;

public class dop6_koni {

    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();

        int x = 0; // координата по горизонтали
        int y = 0; // координата по вертикали

        horse_move(x, y, arr, 0);
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    private static void horse_move(int x, int y, int[][] arr, int move) {
        if(move == 25) return;

        int len = arr.length;

        arr[x][y] = ++move;
        if        (x + 2 < len && y + 1 < len && arr[x + 2][y + 1] == 0) { horse_move(x + 2, y + 1, arr, move); arr[x][y] = 0;
        } else if (x + 2 < len && y - 1 >= 0  && arr[x + 2][y - 1] == 0) { horse_move(x + 2, y - 1, arr, move); arr[x][y] = 0;
        } else if (x + 1 < len && y + 2 < len && arr[x + 1][y + 2] == 0) { horse_move(x + 1, y + 2, arr, move); arr[x][y] = 0;
        } else if (x + 1 < len && y - 2 >= 0  && arr[x + 1][y - 2] == 0) { horse_move(x + 1, y - 2, arr, move); arr[x][y] = 0;
        } else if (x - 2 >= 0  && y - 1 >= 0  && arr[x - 2][y - 1] == 0) { horse_move(x - 2, y - 1, arr, move); arr[x][y] = 0;
        } else if (x - 2 >= 0  && y + 1 < len && arr[x - 2][y + 1] == 0) { horse_move(x - 2, y + 1, arr, move); arr[x][y] = 0;
        } else if (x - 1 >= 0  && y - 2 >= 0  && arr[x - 1][y - 2] == 0) { horse_move(x - 1, y - 2, arr, move); arr[x][y] = 0;
        } else if (x - 1 >= 0  && y + 2 < len && arr[x - 1][y + 2] == 0) { horse_move(x - 1, y + 2, arr, move); arr[x][y] = 0;
        }


    }
}
