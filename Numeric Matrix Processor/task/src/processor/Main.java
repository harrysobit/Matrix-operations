package processor;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    //static final int N = 4;
    public static int choice() {
        System.out.println("Your choice : ");
        return scanner.nextInt();
    }

    public static int[][] matrices() {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] A = new int[n][m];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        return A;
    }

    public static void addMatrices() {
        System.out.println("Enter size of first matrix:  ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[][] A = new double[n][m];
        System.out.println("Enter first matrix ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Enter size of second matrix: : ");
        int n1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        if (!(n == n1 && m == m1)) {
            System.out.println("The operation cannot be performed.");
        } else {
            double[][] k = new double[n][m];
            double[][] ans = new double[n][m];
            System.out.println("Enter second matrix: ");
            for (int i = 0; i < k.length; i++) {
                for (int j = 0; j < k[i].length; j++) {
                    k[i][j] = scanner.nextDouble();
                }
            }
            System.out.println("The result is: ");
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    ans[i][j] = k[i][j] + A[i][j];
                }
            }
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }


    public static void multiplyConstant() {
        System.out.println("Enter size of first matrix:  ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[][] A = new double[n][m];
        System.out.println("Enter first matrix ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Enter constant: ");
        double k = scanner.nextDouble();
        double[][] ans = new double[n][m];
        System.out.println("The result is: \n");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                ans[i][j] = k * A[i][j];
            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void multiplyMatrices() {
        System.out.println("Enter size of first matrix:  ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[][] A = new double[n][m];
        System.out.println("Enter first matrix ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter size of second matrix: : ");
        int n1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        if (m != n1) {
            System.out.println("The operation cannot be performed.");
        } else {
            double[][] k = new double[n1][m1];
            double[][] ans = new double[n][m1];
            System.out.println("Enter second matrix: ");
            for (int i = 0; i < k.length; i++) {
                for (int j = 0; j < k[i].length; j++) {
                    k[i][j] = scanner.nextDouble();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m1; j++) {

                    for (int l = 0; l < m; l++) {
                        ans[i][j] += A[i][l] * k[l][j];
                    }
                }
            }
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }

    public static void mainTranspose() {
        System.out.println("Enter size of matrix:  ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[][] A = new double[n][m];
        System.out.println("Enter your matrix ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = scanner.nextDouble();
            }

        }
        double[][] B = new double[m][n];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = A[j][i];
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sideTranspose() {
        System.out.println("Enter size of matrix:  ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[][] A = new double[n][m];
        System.out.println("Enter  matrix ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = scanner.nextDouble();
            }
        }


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < (n - 1) - i; j++) {
                double tmp = A[i][j];
                A[i][j] = A[(n - 1) - j][(n - 1) - i];
                A[(n - 1) - j][(n - 1) - i] = tmp;


            }

        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void verticalTranspose() {
        System.out.println("Enter size of matrix:  ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[][] A = new double[n][m];
        System.out.println("Enter your matrix ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = scanner.nextDouble();
            }

        }
        double[][] B = new double[n][m];
        int k = A.length;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {

                k--;
                B[i][j] = A[i][k];
            }
            k = A[i].length;

        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void horizontalTranspose() {
        System.out.println("Enter size of matrix:  ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        double[][] A = new double[n][m];
        System.out.println("Enter your matrix ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = scanner.nextDouble();
            }

        }
        double[][] B = new double[n][m];
        int k = A.length;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {

                k--;
                B[j][i] = A[k][i];
            }
            k = A[i].length;

        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrices() {
        System.out.println("1. Main diagonal\n" +
                "2. Side diagonal\n" +
                "3. Vertical line\n" +
                "4. Horizontal line");
        System.out.println("Your choice:");
        switch (scanner.nextInt()) {
            case 1:
                mainTranspose();
                break;
            case 2:
                sideTranspose();
                break;
            case 3:
                verticalTranspose();
                break;
            case 4:
                horizontalTranspose();
                break;
            default:
                return;
        }

    }

    public static void determinantMatrix() {
        System.out.println("Enter size of matrix: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println("Enter matrix: ");
        double[][] matrix = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        System.out.println(determinent(matrix, n));


    }

   /* public static double[][] cofactor(double matrix1[][])  {
        double[][] mat = new double[][](matrix1.length, matrix1.length);
        for (int i=0;i<matrix1.length;i++) {
            for (int j=0; j<matrix1[i].length;j++) {
                mat.setValueAt(i, j, changeSign(i) * changeSign(j) *
                        determinant(createSubMatrix(matrix, i, j)));
            }
        }

        return mat;
    }*/


    public static double determinent(double b[][], int m) {
        double c[][] = new double[m][m];

        int i, j, k;
        double sum = 0;
        if (m == 1) {
            sum = b[0][0];
        } else if (m == 2) {
            sum = ((b[0][0] * b[1][1]) - (b[0][1] * b[1][0]));
        } else {
            for (int p = 0; p < m; p++) {
                int h = 0;
                k = 0;
                for (i = 1; i < m; i++) {
                    for (j = 0; j < m; j++) {
                        if (j == p)
                            continue;
                        c[h][k] = b[i][j];
                        k++;
                        if (k == m - 1) {
                            h++;
                            k = 0;
                        }
                    }
                }
                sum = sum + b[0][p] * Math.pow((-1), p) * determinent(c, m - 1);
            }
        }
        return sum;
    }

    static void getCofactor(double[][] A, double[][] temp, int p, int q, int n) {
        int i = 0, j = 0;

        // Looping for each element of the matrix
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                // Copying into temporary matrix only those element
                // which are not in given row and column
                if (row != p && col != q) {
                    temp[i][j++] = A[row][col];

                    // Row is filled, so increase row index and
                    // reset col index
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    static double determinant(double A[][], int n) {
        double D = 0; // Initialize result

        // Base case : if matrix contains single element
        if (n == 1)
            return A[0][0];

        double[][] temp = new double[A.length][A.length]; // To store cofactors

        int sign = 1; // To store sign multiplier

        // Iterate for each element of first row
        for (int f = 0; f < n; f++) {
            // Getting Cofactor of A[0][f]
            getCofactor(A, temp, 0, f, n);
            D += sign * A[0][f] * determinant(temp, n - 1);

            // terms are to be added with alternate sign
            sign = -sign;
        }

        return D;
    }

    static void adjoint(double A[][], double[][] adj) {
        if (A.length == 1) {
            adj[0][0] = 1;
            return;
        }

        // temp is used to store cofactors of A[][]
        int sign = 1;
        double[][] temp = new double[A.length][A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                // Get cofactor of A[i][j]
                getCofactor(A, temp, i, j, A.length);

                // sign of adj[j][i] positive if sum of row
                // and column indexes is even.
                sign = ((i + j) % 2 == 0) ? 1 : -1;

                // Interchanging rows and columns to get the
                // transpose of the cofactor matrix
                adj[j][i] = (sign) * (determinant(temp, A.length - 1));
            }
        }
    }

    static void inverse(double A[][] ) {
        // Find determinant of A[][]
        double det = determinant(A, A.length);
        double[][] inverse = new double[A.length][A.length];
        if (det == 0.0) {
            System.out.print("Sorry inverse no exist.");
            return;
        }


        // Find adjoint
        double[][] adj = new double[A.length][A.length];
        adjoint(A, adj);

        // Find Inverse using formula "inverse(A) = adj(A)/det(A)"
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                inverse[i][j] = adj[i][j] /  det;
                System.out.print(inverse[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void inversePrint() {
        System.out.println("Enter size of matrix: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println("Enter matrix: ");
        double[][] matrix = new double[n][m];
        DecimalFormat df = new DecimalFormat("#.#####");
        df.setRoundingMode(RoundingMode.CEILING);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Double.parseDouble(df.format(scanner.nextDouble()));
            }
        }
        inverse(matrix);

    }





    public static void main(String[] args) {




        boolean tru = true;
        while (tru){
            int options = choice();
        switch (options){
            case (1):
                addMatrices();
                break;
            case (2):
                multiplyConstant();
                break;
            case 3:
                multiplyMatrices();
                break;
            case 4:
                transposeMatrices();
                break;
            case 5:
                determinantMatrix();
                break;
            case 6:
               // inverse();
                inversePrint();
                break;
            case 0:
                tru = false;
                break;

        }
        }

    }

}

