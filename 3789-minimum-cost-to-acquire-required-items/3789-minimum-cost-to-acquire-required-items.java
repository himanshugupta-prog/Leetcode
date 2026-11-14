class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long individualCost = (long) cost1*need1+ (long) cost2*need2;
        long common = Math.min(need1,need2);
        long mixedCost = (long) common*costBoth + (long) cost1*Math.abs(common-need1) + (long) cost2*Math.abs(common-need2);
        long allBothCost = (long) Math.max(need1,need2)*costBoth;

        return Math.min(individualCost,Math.min(mixedCost,allBothCost));

    }
}