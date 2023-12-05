public class EighthProject {
        public static void main(String[] args) {
            int[] numbers = {4, 5, 76, 35, 765, 85, 4, 3, 6, 37, 2, 34, 221};
            int max = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (max < numbers[i]) {
                    max = numbers[i];
                }
            }
            System.out.println(max);

            int min = 4;
            for (int i = 0; i < numbers.length; i++) {
                if (min > numbers[i]) {
                    min = numbers[i];
                }
            }
            System.out.println(min);
        }
    }

