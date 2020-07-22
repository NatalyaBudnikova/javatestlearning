package sales;

import java.util.ArrayList;
import java.util.List;

public class SalesCalculations {

    public int sum(int[] months){
        int sum = 0;
        for (int month : months){
          sum = sum + month;
        }
        return sum;
    }

    public int avg(int[] months){
        return sum(months) / months.length;
    }

    public int max(int[] months){
        int max = months[0], month = 1;
        for (int i = 0; i < months.length; i++){
            if (months[i] > max){
                max = months[i];
                month = i + 1;
            }
        }
        return month;
    }

    public int min(int[] months){
        int min = months[0], month = 1;
        for (int i = 0; i < months.length; i++){
            if (months[i] < min){
                min = months[i];
                month = i + 1;
            }
        }
        return month;
    }

    public List<Integer> lessAvg(int[] months){
        List<Integer> lessAvg = new ArrayList<>();
        int avg = avg(months);
        for (int i = 0; i < months.length; i++){
            if (months[i] < avg){
                lessAvg.add(i+1);
            }
        }
        return lessAvg;
    }

    public List<Integer> moreAvg(int[] months){
        List<Integer> moreAvg = new ArrayList<>();
        int avg = avg(months);
        for (int i = 0; i < months.length; i++){
            if (months[i] > avg){
                moreAvg.add(i+1);
            }
        }
        return moreAvg;
    }
}
