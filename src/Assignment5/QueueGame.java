static boolean check(int a[], int n) { 
  // count number of push operations 
        int ones = 0; 
        // traverse in the array 
        for (int i = 0; i < n; i++) { 
            // push operation 
            if (a[i] ==1) { 
                ones++; 
            } // pop operation 
            else { 
                ones--; 
            } 
            // if at any moment pop() operations 
            // exceeds the number of push operations 
            if (ones < 0) { 
                return false; 
            } 
        } 
        return true; 
    } 