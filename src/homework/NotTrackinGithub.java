package homework;

public class NotTrackinGithub {
    public static void main(String[] args) {

int[] arr = {2, 42, 3, 11, -43, 32};
int min = arr[0];
int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else {
                System.out.println("qqq " + arr[i]);
                max = arr[i];
            }

        }
    }
}
