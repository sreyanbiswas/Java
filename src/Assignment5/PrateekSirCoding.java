public static void prateekSirCoding() {

        Scanner scn = new Scanner(System.in);

        int q = scn.nextInt();
        Stack stack = new Stack<>();
        while (q-- > 0) {

            int type = scn.nextInt();

            if (type == 1) {

                if (!stack.isEmpty()) {
                    System.out.println(stack.pop());
                }else {
                    System.out.println("No Code");
                }

            } else {

                stack.push(scn.nextInt());
            }
        }

    }