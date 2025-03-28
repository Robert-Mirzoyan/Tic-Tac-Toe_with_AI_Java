class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        // write your code here
        int[] twoDimArray1 = twoDimArray[0].clone();
        int[] twoDimArray2 = twoDimArray[twoDimArray.length-1].clone();

        System.out.println(twoDimArray1[0] + " " + twoDimArray1[twoDimArray1.length - 1]);
        System.out.println(twoDimArray2[0] + " " + twoDimArray2[twoDimArray2.length - 1]);
//        for (int i = 0; i < twoDimArray.length; i++) {
//            for (int j = 0; j < twoDimArray[0].length; j++) {
//                if((i == 0 && j == 0)){
//                    System.out.print(twoDimArray[i][j] + " ");
//                } else if((i == 0 && j == twoDimArray[0].length - 1)){
//                    System.out.println(twoDimArray[i][j]);
//                }
//                if((i == twoDimArray.length - 1 && j == 0)){
//                    System.out.print(twoDimArray[i][j] + " ");
//                } else if((i == twoDimArray.length - 1 && j == twoDimArray[0].length - 1)){
//                    System.out.println(twoDimArray[i][j]);
//                }
//            }
//        }

    }
//    public static void main(String[] args){
//        int[][] array = new int[][]{
//                {1, 2, 3},
//                {0, 0, 0},
//                {5, 0, 7}
//        };
//        printCorners(array);
//        array = new int[][]{
//                {5, 2, 5},
//                {0, 0, 0},
//                {5, 0, 5}
//        };
//        printCorners(array);
//    }
}