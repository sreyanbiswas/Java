public void appendLastN(int n) throws Exception {

        LinkedList nl=new LinkedList();

        n=n%this.size;

        if(this.size==n)
        return;

        while(this.size!=n)
        {
            int temp=removeFirst();
            nl.addLast(temp);
        }
        for(int i=0; i < n; i++)
        {
            int temp=removeLast();
            nl.addFirst(temp);
        }
        this.head=nl.head;
        this.tail=nl.tail;
        this.tail.next=null;
        this.size=nl.size;



    }

