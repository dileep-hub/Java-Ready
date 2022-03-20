class Solution {
    public String defangIPaddr(String address) {
        
        // method 1
        
//         String ans = "";
        
//         for(int i=0; i<address.length(); i++) {
//             if(address.charAt(i) == '.') {
//                 ans = ans + "[.]"; 
//             } else {
//                 ans = ans + address.charAt(i);
//             }
//         }
//         return ans;
        
        // Simple method
        
        return address.replace(".","[.]");
        
    }
}
