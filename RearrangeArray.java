import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int a: nums){
            if(a>0){
                pos.add(a);
            }else{
                neg.add(a);
            }
        }
        int i = 0;
        int j = 0;
        int k = 0;
        int[] out = new int[nums.length];
        while(i<pos.size() && j<neg.size()){
            out[k++] = pos.get(i++);
            out[k++] = neg.get(j++);
        }
        return out;
    }
}
