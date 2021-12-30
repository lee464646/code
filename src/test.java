import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        //System.out.println("로또번호 출력하기:"+(int)(Math.random()*10));

        Random random = new Random();

        List list = new ArrayList();
        while (list.size()<5){
            int test = random.nextInt(45)+1;
            list.add(test);
        }
        System.out.println(list.toString());
    }
}
