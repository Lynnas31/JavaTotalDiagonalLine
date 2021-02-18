public class TotalDiagonalLine {
    public static void main(String[] args) {
        int [][] Array = {{1,3,4,5},{1,2,3,4},{2,3,4,5},{5,6,7,8}};
        int total = 0;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[0].length; j++) {
                if (i==j){
                    total += Array[i][j];
                }
            }
        }
        System.out.println("Total Diagoanal Line is " + total);
    }
}
