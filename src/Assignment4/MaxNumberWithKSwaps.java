public static String BiggestNum(char[] arr, int k) {

        long max = Integer.valueOf(new String(arr));
        if (k == 0)
            return max + "";

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    //Swap Original Elements
                    swap(arr, i, j);

                    //Store the ans from recursive call
                    long rec = Integer.valueOf(BiggestNum(arr, k - 1));

                    //Update the max number
                    max = Math.max(max, rec);

                    //Undo the Swap
                    swap(arr, i, j);
                }
            }
        }

        return max + "";

    }

    public static void swap(char[] arr, int ith, int jth) {

        char temp = arr[ith];
        arr[ith] = arr[jth];
        arr[jth] = temp;
    }