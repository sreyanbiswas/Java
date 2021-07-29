 private static int maxScore(int[] arr, int si, int ei) {

        if (si > ei)
            return 0;
        int fh = 0, sh = 0;
        for (int i = si; i < ei; i++) {
            int sum1 = sum(arr, si, i);
            int sum2 = sum(arr, i + 1, ei);
            if (sum1 == sum2) {
                fh = maxScore(arr, si, i);
                sh = maxScore(arr, i + 1, ei);
                return Math.max(fh, sh) + 1;
            }

        }
        return 0;

    }

    private static int sum(int[] arr, int si, int ei) {

        int sum = 0;
        for (int i = si; i <= ei; i++)
            sum += arr[i];
        return sum;
    }