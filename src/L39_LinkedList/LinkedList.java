package L39_LinkedList;

public class LinkedList {

	private class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

		Node() {

		}

	}

	private Node head;

	public void display() {

		System.out.println("-------------------------");

		Node temp = head;

		while (temp != null) {

			System.out.print(temp.data + " ");
			temp = temp.next;

		}
		System.out.println();
		System.out.println("-------------------------");

	}

	public int size() {

		int count = 0;

		Node temp = head;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;

	}

	public boolean isEmpty() {

		// return size() == 0;
		return head == null;
	}

	public int getFirst() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		return head.data;

	}

	public int getLast() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		return temp.data;

	}

	public int getAt(int idx) throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		if (idx < 0 || idx >= size()) {
			throw new Exception("Invalid Index.");
		}

		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp.data;

	}

	private Node getNodeAt(int idx) throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		if (idx < 0 || idx >= size()) {
			throw new Exception("Invalid Index.");
		}

		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp;

	}

	public void addLast(int item) throws Exception {

		// created a new node with data as item
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (isEmpty()) {

			// your ll was already empty and now you are adding an element for the 1st time
			// : spcl case
			head = nn;

		} else {

			// linking
			Node last = getNodeAt(size() - 1);
			last.next = nn;

		}
	}

	public void addFirst(int item) {

		// create a new node
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// linking
		nn.next = head;
		head = nn;

	}

	public void addAt(int idx, int item) throws Exception {

		if (idx < 0 || idx > size()) {
			throw new Exception("Invalid Index.");
		}

		if (idx == 0)
			addFirst(item);

		else if (idx == size())
			addLast(item);

		else {

			// create a new node
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// linking
			Node n1 = getNodeAt(idx - 1);
			Node n2 = getNodeAt(idx);

			n1.next = nn;
			nn.next = n2;

		}

	}

	public int removeLast() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		int rv = getLast();

		if (size() == 1) {
			head = null;
		} else {
			Node sm2 = getNodeAt(size() - 2);
			sm2.next = null;
		}

		return rv;
	}

	public int removeFirst() throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		int rv = getFirst();

		if (size() == 1) {
			head = null;
		} else {
			head = head.next;
		}

		return rv;
	}

	public int removeAt(int idx) throws Exception {

		if (isEmpty()) {
			throw new Exception("LL is Empty.");
		}

		if (idx < 0 || idx >= size()) {
			throw new Exception("Invalid Index.");
		}

		if (idx == 0)
			return removeFirst();

		else if (idx == size() - 1)
			return removeLast();

		else {

			Node im1 = getNodeAt(idx - 1);
			Node i = im1.next;
			Node ip1 = i.next;

			im1.next = ip1;

			return i.data;

		}

	}

	public void reverseI() {

		Node prev = null;
		Node curr = head;

		while (curr != null) {

			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;

		}

		head = prev;

	}

	public void reverseR() {
		reverseR(null, head);
	}

	private void reverseR(Node prev, Node curr) {

		if (curr == null) {
			head = prev;
			return;
		}

		// way 1
		Node ahead = curr.next;

		curr.next = prev;
		reverseR(curr, ahead);

		// way 2
		// reverseR(curr, curr.next);
		// curr.next = prev ;

	}

	public void reverseR2() {

		Node temp = head;

		reverseR2(head);

		temp.next = null;
	}

	private void reverseR2(Node curr) {

		// last node
		if (curr.next == null) {
			head = curr;
			return;
		}

		reverseR2(curr.next);

		curr.next.next = curr;
	}

	public int mid() {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

		}

		return slow.data;

	}

	public int kthFromLast(int k) {

		Node slow = head;
		Node fast = head;

		for (int i = 1; i <= k; i++)
			fast = fast.next;

		while (fast != null) {

			slow = slow.next;
			fast = fast.next;
		}

		return slow.data;

	}
	
	public void kReverse(int k) {
		head = kReverse(head, k);
	}

	private Node kReverse(Node node, int k) {

		if (node == null) {
			return null;
		}

		// to identify the argument of smaller problem
		Node temp = node;
		for (int i = 1; i <= k && temp != null; i++) {
			temp = temp.next;
		}

		// smaller problem : s2 and s3 reverse
		Node prev = kReverse(temp, k);

		// self work : reverse s1
		// reverse pointer iteratively
		Node curr = node;

		while (curr != temp) {

			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;
		}

		return prev;

	}

	public void createDummyList() {

		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		Node n9 = new Node(9);
		Node n10 = new Node(10);
		Node n11 = new Node(11);
		Node n12 = new Node(12);
		Node n13 = new Node(13);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n9;
		n9.next = n10;
		n10.next = null;

		n13.next = n12;
		n12.next = n11;
		n11.next = n4;

		System.out.println(intersection(n1, n13));

	}

	public int intersection(Node h1, Node h2) {

		Node fp = h1;
		Node sp = h2;

		while (fp != sp) {

			if (fp == null)
				fp = h2;
			else
				fp = fp.next;

			if (sp == null)
				sp = h1;
			else
				sp = sp.next;

		}
		
		return fp.data ;

	}
	
	public void createDummyListLoop() {

		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		Node n7 = new Node(70);
		Node n8 = new Node(80);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		n8.next = n3;

		// logic ....
		System.out.println(detectLoop(n1));

	}

	public boolean detectLoop(Node h1) {

		Node slow = h1;
		Node fast = h1;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				removeLoop2(slow, h1);
				return true;
			}

		}

		return false;

	}

	public void removeLoop(Node meet, Node h) {

		// no. of nodes in loop
		int count = 1;
		Node temp = meet;
		while (temp.next != meet) {
			count++;
			temp = temp.next;
		}

		// move a pointer count no. of steps ahead
		Node fast = h;
		for (int i = 1; i <= count; i++) {
			fast = fast.next;
		}

		// make slow and fast move at same speed
		Node slow = h;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}

		fast.next = null;

		// print ll
		// Node t = h ;
		// while(t!= null) {
		// System.out.print(t.data + " ");
		// t = t.next ;
		// }
		// System.out.println();

	}

	public void removeLoop2(Node meet, Node h) {

		Node start = h;
		Node loop = meet;

		while (start.next != loop.next) {
			start = start.next;
			loop = loop.next;
		}

		loop.next = null;

		// print ll
		Node t = h;
		while (t != null) {
			System.out.print(t.data + " ");
			t = t.next;
		}
		System.out.println();

	}
	

}
