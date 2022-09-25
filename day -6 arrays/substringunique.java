class Solution {
    public int uniqueLetterString(String s) {
        //to keep the contribution of each char till positon
        int[] contri = new int[26];
        //to keep track of the total no substring till previous appearance of that char
        int[] lastPosition = new int[26];
        int res=0;
        
        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i) - 'A';
            //Point 1
            int total = i+1;
            //if we already have seen this char than its prev
            //contributio(all substrings containing that char) must not be counted
            //again, and its last contributio is stored in lastPosition
            int existing = lastPosition[ch];
            contri[ch] = total-existing;
            //Point 1
            lastPosition[ch] = i+1;
            //add all the chars contribution till this length
            int totalTillLen = 0;
            for(int j=0;j<26;j++)   
                totalTillLen+=contri[j];
            //add it to final result
            res+=totalTillLen;
        }
        return res;
    }
}
