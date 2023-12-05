public class FourthProject {
    public static void main(String[] args) {
        int[][] numbers = {
                {23, 24, 13, 67, 876, 5, 7, 45, 3, 7, 5},
                {34, 6, 54, 0, 87, 64, 34, 67, 22, 1, 35, 4}
        };
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] % 2 == 0) {
                    sumEven = sumEven + numbers[i][j];
                }
                else{
                    sumOdd=sumOdd+numbers[i][j];
                }
            }

        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}


