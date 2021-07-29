public int KthElementFromLast(LinkedList ll, int k) {
            Node slow = ll.head;
            Node kp = ll.head;
            int count = k;
            while (count > 0) {
                kp = kp.next;
                count--;
            }
            while (kp.next != null) {
                kp = kp.next;
                slow = slow.next;
            }
            // slow=slow.next;
            return slow.data;
        }