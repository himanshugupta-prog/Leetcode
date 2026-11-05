class Solution {
    public String reversePrefix(String s, int k) {
      if(k==1)return s;
      StringBuilder sb = new StringBuilder(s);
      for(int i=0;i<k/2;i++){
        char temp = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(k-1-i));
        sb.setCharAt(k-1-i,temp);
      }  
      return sb.toString();
    }
}