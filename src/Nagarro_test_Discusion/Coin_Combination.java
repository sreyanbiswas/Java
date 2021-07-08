package Nagarro_test_Discusion;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 5 };
		int ammount = 5;
		System.out.println(CoinCombination(arr, ammount, "", 0));

	}

	public static int  CoinCombination(int[] coin, int ammout, String ans, int last_coin_use) {
		if(ammout==0) {
			//System.out.println(ans);
			return 1;
		}
          int res=0;
		for (int i = last_coin_use; i < coin.length; i++) {
			if (ammout >= coin[i]) {
				res+=CoinCombination(coin, ammout - coin[i], ans + coin[i], i);
			}
		}
		return res;

	}

}
