public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(char ch : stones.toCharArray()){
            if(jewels.indexOf(ch) != -1){
                count += 1;
            }
        }
        return count;
    }
// public int numJewelsInStones(String jewels, String stones) {
		// int num = 0;
		// for (int i = 0 ; i < stones.length(); i ++) {
		// 	if(jewels.indexOf(stones.charAt(i)) != -1) {
		// 		num++;
		// 	}
		// }
		// return num;
		// }
}

//output
//Your input
//"aA"
//"aAAbbbb"
//"z"
//"ZZ"
//Output
//3
//0
//Expected
//3
//0