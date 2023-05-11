//Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз.

package JavaProject.Seminars.sem5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class dop6_koni {

    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();

        int x = 3; // координата по горизонтали
        int y = 0; // координата по вертикали
        int move = 1; //номер шага
        int start = 1;
        
        
        String[] coordinats = new String[3];
        arr[x][y] = move;

        Map <Integer, String> journalMove = new HashMap<>();
        journalMove.put(move, String.format("%d,%d", x, y));
        System.out.println(journalMove);

        while (move < n*n) {
            int i = start;
            while(i <= 8) {  // 8 - варианты хода конём
                if(horse_move(x, y, arr, move, journalMove, i).containsKey(move+1) != false) {
                    horse_move(x, y, arr, move, journalMove, i);
                    System.out.println();
                    System.out.println(journalMove);
                    break;
                }
            }
            if(journalMove.containsKey(move+1)){
                move++;
                coordinats = journalMove.get(move).split(",");
                x = Integer.parseInt(coordinats[0]);
                y = Integer.parseInt(coordinats[1]);
            }
            else {
                arr[x][y] = 0;
                move--;
                coordinats = journalMove.get(move).split(",");
                x = Integer.parseInt(coordinats[0]);
                y = Integer.parseInt(coordinats[1]);
                start = Integer.parseInt(coordinats[2]);
            }

        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    private static Map<Integer, String> horse_move(int x, int y, int[][] arr, int move, Map<Integer, String> journalMove, int variant) {
        int len = arr.length;
        switch(variant) {
            case 1:
                if (x + 2 < len && y + 1 < len && arr[x + 2][y + 1] == 0) { x = x + 2; y = y + 1; arr[x][y] = ++move;}
                break;
                
            case 2:
                if (x + 2 < len && y - 1 >= 0  && arr[x + 2][y - 1] == 0) {x = x + 2; y = y - 1; arr[x][y] = ++move;}
                break;
                
            case 3:
                if (x + 1 < len && y + 2 < len && arr[x + 1][y + 2] == 0) { x = x + 1; y = y + 2; arr[x][y] = ++move;}
                break;

            case 4:
                if (x + 1 < len && y - 2 >= 0  && arr[x + 1][y - 2] == 0) { x = x + 1; y = y - 2; arr[x][y] = 0;}
                break;

            case 5:
                if (x - 2 >= 0  && y - 1 >= 0  && arr[x - 2][y - 1] == 0) { x = x - 2; y = y - 1; arr[x][y] = 0;}
                break;

            case 6:
                if (x - 2 >= 0  && y + 1 < len && arr[x - 2][y + 1] == 0) { x = x - 2; y = y + 1; arr[x][y] = 0;}
                break;

            case 7:
                if (x - 1 >= 0  && y - 2 >= 0  && arr[x - 1][y - 2] == 0) { x = x - 1; y = y - 2; arr[x][y] = 0;}
                break;

            case 8:
                if (x - 1 >= 0  && y + 2 < len && arr[x - 1][y + 2] == 0) { x = x - 1; y = y + 2; arr[x][y] = 0;}
                break;
            }
               
        // System.out.printf("x=%d, y=%d, move=%d ", x, y, move);
        System.out.println();
        journalMove.put(move, String.format("%d,%d,%d", x, y, variant));
        return journalMove;
        
    }




    // private static void horse_move(int x, int y, int[][] arr, int move) {
    //     if(move == 25) return;

    //     int len = arr.length;

    //     arr[x][y] = ++move;
    //     if        (x + 2 < len && y + 1 < len && arr[x + 2][y + 1] == 0) { horse_move(x + 2, y + 1, arr, move); arr[x][y] = 0;
    //     } else if (x + 2 < len && y - 1 >= 0  && arr[x + 2][y - 1] == 0) { horse_move(x + 2, y - 1, arr, move); arr[x][y] = 0;
    //     } else if (x + 1 < len && y + 2 < len && arr[x + 1][y + 2] == 0) { horse_move(x + 1, y + 2, arr, move); arr[x][y] = 0;
    //     } else if (x + 1 < len && y - 2 >= 0  && arr[x + 1][y - 2] == 0) { horse_move(x + 1, y - 2, arr, move); arr[x][y] = 0;
    //     } else if (x - 2 >= 0  && y - 1 >= 0  && arr[x - 2][y - 1] == 0) { horse_move(x - 2, y - 1, arr, move); arr[x][y] = 0;
    //     } else if (x - 2 >= 0  && y + 1 < len && arr[x - 2][y + 1] == 0) { horse_move(x - 2, y + 1, arr, move); arr[x][y] = 0;
    //     } else if (x - 1 >= 0  && y - 2 >= 0  && arr[x - 1][y - 2] == 0) { horse_move(x - 1, y - 2, arr, move); arr[x][y] = 0;
    //     } else if (x - 1 >= 0  && y + 2 < len && arr[x - 1][y + 2] == 0) { horse_move(x - 1, y + 2, arr, move); arr[x][y] = 0;
    //     }

    // }
}
