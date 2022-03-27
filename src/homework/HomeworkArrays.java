package homework;

public class HomeworkArrays {
    public static void main(String[] args) {

        {
            //array's max and min
            double[] arr = {55, -76, -52, 5.5, 4.954, 235.6, 11, -11};
            double max = arr[0];
            double min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
//           else {
//                min = arr[i];
//            }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
//            } else {
//                max = arr[i];  ! ինչի՞ եմ այս ձևով սխալ արժեք ստանում
//            }

                }


            }
            System.out.println("max: " + max + ", min: " + min);

            //2d array's max and min
            int[][] twoDimArray = {{2, -5, 96}, {7, -654, 87}, {1, 65, 87}};
            int maximum = twoDimArray[0][0];
            int minimum = twoDimArray[0][0];
            for (int i = 0; i < twoDimArray.length; i++) {
                for (int j = 0; j < twoDimArray[i].length; j++) {
                    if (maximum < twoDimArray[i][j]) {
                        maximum = twoDimArray[i][j];

                    }
                    if (minimum > twoDimArray[i][j]) {
                        minimum = twoDimArray[i][j];
                    }
                }


            }
            System.out.println("maximum: " + maximum + ", minimum: " + minimum);
            //summary of an array
            //average of an array

            int[] array = {4, 421, 64, 756, 3, -5, 3, -123};
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];

            }
            int average = sum / array.length;


            System.out.println("summary: " + sum);
            System.out.println("average: " + average);


        }
        //spec value

        int myNewArr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            myNewArr[i] = i + 1;

        }
        int specValue = 5;
        String specText = "";
        for (int i = 0; i < myNewArr.length; i++) {
            if (myNewArr[i] == specValue) {
                System.out.println("We have an special value");
//                specText = "We have an special value";
//            }

            }
//        System.out.println(specText);


        }


    }
}










