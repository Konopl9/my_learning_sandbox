import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Integer, Integer> memo = new HashMap<>() {{
        put(0, 0);
    }};

    public static int coinChange(int[] coins, int amount) {
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }

        // it is imposible to need amount + 1 coins, because even if we deduct by one we would need "amount" coins
        int minCoinsNeededForThisAmount = amount + 1;
        for (int i = 0; i < coins.length; i++) {
            // here we calculate the amount we need to figure out in the subproblem
            int leftOver = amount - coins[i];
            if (leftOver < 0) {
                break;
            }
            minCoinsNeededForThisAmount = Math.min(minCoinsNeededForThisAmount, 1 + coinChange(coins, leftOver));
        }

        memo.put(amount, minCoinsNeededForThisAmount);
        if(minCoinsNeededForThisAmount > amount + 1) {
            return -1;
        }

        return minCoinsNeededForThisAmount;
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{2}, 3));
    }
}

