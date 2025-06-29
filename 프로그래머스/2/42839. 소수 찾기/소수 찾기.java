import java.util.*;

class Solution {
    Set<Integer> set = new HashSet<>();
    int count = 0;
    int N;
    boolean[] visited;
    int[] arr;
    int[] a;
    public int solution(String numbers) {
        N = numbers.length();
        arr = new int[N];
        visited = new boolean[N];
        a = new int[N];
        String[] s = numbers.split("");
        
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        for(int i = 1; i <= N; i++){
            bt(0, i);
        }
        for(int a : set){
            if(isDecimal(a))count++;
        }
        return count;
    }
    
    public void bt(int depth, int n){
        if(depth == n){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(a[i]);
            }
            int result = Integer.parseInt(sb.toString());
            set.add(result);
            return;
        }
        
        for(int i = 0; i < N; i++){
            if(visited[i]) continue;
            
            visited[i] = true;
            a[depth] = arr[i];
            bt(depth + 1, n);
            visited[i] = false;
        }
    }
    
    public boolean isDecimal(int num){
        if (num < 2) return false;
        
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}