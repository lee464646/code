import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class code {
    public static void main(String[] args) {
        //System.out.println("로또번호 출력하기:"+(int)(Math.random()*10));
        //randomLotto();

        int answer = 0;
/*
        int left = 3;
        int right = 10;
        int temp = left;
        int num = 0;
        int sum = 0;
        while (temp <= right) {
            for (int i = 1; i <= temp; i++) {
                if (temp % i == 0) {
                    num++;
                }
            }
            if (num % 2 == 0)
                sum += temp;
            else
                sum -= temp;
            num=0;
            temp++;
        }
        System.out.println(sum);
*/
        int left = 3;
        int right = 10;
        int sum = 0;

        for (int i = left; i <= right; i++) {
            switch (measureCount(i) % 2){
                case 0: sum += i;
                        break;
                default: sum -= i;
            }
        }
        System.out.println(sum);
    }

    //약수 세기
    public static int measureCount(int num){
        int count = 0;
        for (int i = 1; i <= num; i++){
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    //랜덤 로또
    public static void randomLotto(){
        Random random = new Random();
        List list = new ArrayList();
        while (list.size()<5){
            int test = random.nextInt(45)+1;
            list.add(test);
        }
        System.out.println(list.toString());
    }
}
