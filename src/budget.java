import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

//예산
public class budget {
    public static void main(String[] args) {
        int[] d = {5,4,3,1};
        int budget = 4;

       /* for (int i = 0; i < d.length; i++){
            for (int k = 0; k < d.length; k++){
                if (d[i] < d[k]){
                    int temp = d[i];
                    d[i] = d[k];
                    d[k] = temp;
                }
            }
        }
        */

        Arrays.sort(d); // 아예 바껴버림
/*
        int maximum = 0;
        int answer = 0;
        for (int i = 0; i < d.length; i++){
            maximum += d[i];
            if (maximum <= budget){
                answer++;
            }
        }

        System.out.println(answer);
*/
        int num = 0;
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) break;
            num++;

        }
        System.out.println(num);


    }
}
