public class ThirdProject {
        public static void main(String[] args) {
            int[][] numbers = {
                    {12, 32, 75, 4, 7, 5, 78, 97},
                    {3, 5, 76, 46, 7, 8, 5, 34, 665, 34}

            };
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    if (numbers[i][j] % 2 == 0) {
                        System.out.print(numbers[i][j] + " ");
                    }
                }
            }
        }
    }



