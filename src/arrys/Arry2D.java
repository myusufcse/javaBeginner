package arrys;

public class Arry2D {
    public static void main(String[] args) {
        String[][] arr2d = new String[3][3];
        int [][]iarr2d = {{1,2,3},{1,2},{1,2,3,4}}; // Jacked array or ragged array:

        for(int r=0;r<arr2d.length;r++){
            for(int c=0;c<arr2d[r].length;c++){
                arr2d[r][c] = ""+r+c;
            }
        }

        for(int r=0;r<arr2d.length;r++){
            for(int c=0;c<arr2d[r].length;c++){
                System.out.print(arr2d[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("Diagonal position of 2D Array");

        for(int i=0,j=2;i<3;i++,j--){
            System.out.printf("%10s \n",arr2d[i][j]);
        }
    }
}
