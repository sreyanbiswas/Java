public void appendLastN(int n) throws Exception {
		Node old = head;
		Node slow = head;
		Node fast = head;
		if(n==this.size){
			return;
		}
		n = n%this.size;
		for(int i=0;i<n && fast.next!=null;i++){
			fast = fast.next;
		}
		while(fast.next!=null && fast!=null){
			slow = slow.next;
			fast = fast.next;
		}
		head = slow.next;
		slow.next = null;
		fast.next = old;

}
