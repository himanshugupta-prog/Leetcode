class Solution {
    public boolean checkString(String s) {
        if(s.indexOf("a")<0)return true;
        if(s.indexOf("ba")>=0)return false;
        return true;
    }
}