class Solution {
    public boolean judgeCircle(String moves) {
        int u_count =0;
        int l_count =0;
        int d_count =0;
        int r_count =0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U')u_count++;
            else if(moves.charAt(i)=='D')d_count++;
            else if(moves.charAt(i)=='L')l_count++;
            else{
                r_count++;
            }
        }
        if(u_count==d_count && l_count == r_count)return true;
        return false;
    }
}