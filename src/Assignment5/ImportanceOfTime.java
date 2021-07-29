 public static void func(LinkedList q, int n, int[] arr) throws Exception {
        int ans = 0;
        for (int j = 0; j < n; j++) {
            if (q.getFirst() == arr[j]) {
                ans++;
                q.removeFirst();
            } else {
                while (q.getFirst() != arr[j]) {
                    int var = q.getFirst();
                    q.addLast(var);
                    q.removeFirst();
                    ans++;
                }
                ans++;
                q.removeFirst();
            }

        }
        System.out.println(ans);

    }