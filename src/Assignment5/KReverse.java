public Node kreverse(Node node,int k){
		if(node==null){
			return null;
		}
		Node temp = node;
		for(int i=1;i<=k && temp!=null;i++){
			temp = temp.next;
		}
		Node prev = kreverse(temp,k);
		Node curr = node;
		while(curr!=temp){
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}
		return prev;
	}