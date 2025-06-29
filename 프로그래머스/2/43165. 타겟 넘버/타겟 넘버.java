import java.util.*;
class Solution {
    int count;
    public int solution(int[] numbers, int target) {
        int sum = 0;
        bt(0,target, 0, numbers);
        
        return count;
    }
    
    public void bt(int depth, int target, int sum, int[] numbers){
        if(depth == numbers.length){
            if(sum == target) count++;
            return;
        }
        
        bt(depth + 1, target, sum + numbers[depth], numbers);
        bt(depth + 1, target, sum - numbers[depth], numbers);
    }
}