class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<paths.size();i++){
            String start = paths.get(i).get(0);
            String end = paths.get(i).get(1);
            map.put(start,1);
            map.putIfAbsent(end,0);
        }
        for (Map.Entry<String , Integer> entry : map.entrySet()){
            int freq = entry.getValue();
            String element = entry.getKey();
            if(freq==0)return element;
        }
        return "";
    }
}