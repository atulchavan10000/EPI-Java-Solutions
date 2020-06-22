package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

import java.util.List;
public class BuyAndSellStock {
  @EpiTest(testDataFile = "buy_and_sell_stock.tsv")
  public static double computeMaxProfit(List<Double> prices) {
    // TODO - you fill in here.
	  Double min_price = Double.MAX_VALUE;
	  double max_profit = 0;
	  
	  for(Double price : prices) {
		  if(price< min_price) {
			  min_price = price;
		  }else {
			  max_profit = Math.max(max_profit, price - min_price);
		  }
	  }
    return max_profit;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "BuyAndSellStock.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
