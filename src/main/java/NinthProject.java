public class NinthProject {
        public static void main(String[] args) {
            int[] numbers = {5, 3, 64, 22, 5, 87, 65, 46, 76, 5, 4, 9, 32};
            int firstLargest = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (firstLargest < numbers[i]) {
                    firstLargest = numbers[i];
                }
            }

            System.out.println(firstLargest);

            int secondLargest = 3;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i]>secondLargest && numbers[i]<firstLargest) {
                    secondLargest = numbers[i];

                }
            }
            System.out.println(secondLargest);
        }
    }

