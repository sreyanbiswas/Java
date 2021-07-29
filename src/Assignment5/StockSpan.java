public static int[] StockSpanUsingStacks(int[] prices, StacksUsingArrays stack) throws Exception {
		 int[] span = new int[prices.length];

        
        stack.push(0);

        
        span[0] = 1;

        
        for (int i = 1; i < prices.length; i++) {

           
            while (stack.size() != 0 && prices[i] > prices[stack.top()]) {
                stack.pop();
            }

            if (stack.size() == 0) {

             
                span[i] = i + 1;
            } else {

              
                span[i] = i - stack.top();
            }

              
            stack.push(i);
        }
        return span;
	}