public class RotateBy90 {
    public static void print(int arr[][]) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
        int m = arr.length;
        int n = arr[0].length;
        print(arr);
        System.out.println("Transposing : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
        System.out.println("ROTATE ARRAY :");
        // rotate - > reverse each row
        for (int i = 0; i < m; i++) {
            int a = 0;
            int b = n - 1;
            // swap arr[i][a] and arr[i][b]
            while (a < b) {
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }
        print(arr);
    }
}
