package PROBLEMS;

/**
 * TwoDarray
 */
public class TwoDarray {

    public static int getNvalue(int n )
    {
        int ans = Integer.MIN_VALUE;

        for (int i = 2; i < n; i++) {
            if (i*i>=n) {
                ans = i;
                break;
            }
        }

        return ans;
    }

    public static void printArray(char[][] array)
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static String StringSet(char[][] array,int i, int j, int l)
    {
        String str = "";

        while (l!=0) {
            str += array[i][j++];
            l--;
        }

        return str;
    }

    public static String StringSetColumn(char[][] array, int rowStart, int col, int length) {
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < length; k++) {
            sb.append(array[rowStart + k][col]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int l = str.length();

        int n = getNvalue(str.length());

        String s2 = "LRX";

        char[][] strArr = new char[n][n];

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                if ((i*n)+j <str.length()) {
                    strArr[i][j] = (str.charAt((i*n)+j));
                }
            }
        }

        printArray(strArr);

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length - s2.length()+1; j++) {
                
                if (StringSet(strArr,i,j,s2.length()).equals(s2)) {
                    System.out.println(StringSet(strArr,i,j,s2.length())+" - "+s2 );
                    System.out.println("<"+i+","+j+"> , <"+i+","+(j+(s2.length()-1))+">");
                }

            }
        }

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length - s2.length() + 1; j++) {

                if (StringSetColumn(strArr, j, i, s2.length()).equals(s2)) {
                    System.out.println(StringSetColumn(strArr, j, i, s2.length()) + " - " + s2);
                    System.out.println("<" + j + "," + i + "> , <" + (j + s2.length() - 1) + "," + i + ">");
                }
            }
        }
        
    }
}