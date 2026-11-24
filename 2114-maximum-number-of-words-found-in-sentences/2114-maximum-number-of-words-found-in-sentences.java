class Solution {
    public int mostWordsFound(String[] sentences) {
        int curr_count = 0;
        int max_count = 0;
        for(int i=0;i<sentences.length;i++){
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    curr_count++;
                    max_count = Math.max(max_count,curr_count);
                }
            }
            curr_count = 0;
        }
        return max_count+1;
    }
}