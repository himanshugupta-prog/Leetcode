class Solution {
    public int calPoints(String[] operations) {
        List<Integer> score = new ArrayList<>();
        
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            if (op.equals("+")) {
                score.add(score.get(score.size() - 1) + score.get(score.size() - 2));
            } else if (op.equals("D")) {
                score.add(score.get(score.size() - 1) * 2);
            } else if (op.equals("C")) {
                score.remove(score.size() - 1);
            } else {
                score.add(Integer.parseInt(op));
            }
        }
        
        int sum = 0;
        for (int i = 0; i < score.size(); i++) {
            sum += score.get(i);
        }
        return sum;
    }
}