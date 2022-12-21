

class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max  = 0;
        int count = 0;
        
        for(int i = 0; i < n; i++){
            sum  =sum + arr[i];
            if(sum == 0){
                max = i+1;
            }
            if(map.containsKey(sum)){
                int value = map.get(sum);
                count = i- value;
            }else{
                map.put(sum, i);
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}
