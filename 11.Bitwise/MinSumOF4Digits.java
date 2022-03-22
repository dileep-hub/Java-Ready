class Solution {
    public int minimumSum(int num) {
        
        String strNum = String.valueOf(num);
        // System.out.println(strNum + "fi");
        
        int[] arr = new int[4];
        // System.out.println(strNum.length());
        
        for(int i=0; i<4; i++) {
            arr[i] = strNum.charAt(i) - '0';
        }
        
        Arrays.sort(arr);
        
        return arr[0] * 10 + arr[2] + arr[1] * 10 + arr[3]; 
//         
        // return 0;
        
    }
}
