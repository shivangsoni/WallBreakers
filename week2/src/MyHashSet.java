
class MyHashSet {
    class Node{
        int val;
        Node next;
        public Node(int v)
        {
            val = v;
            next = null;
        }
    }
    Node head;
    /** Initialize your data structure here. */
    public MyHashSet() {
        head = null;
    }

    public void add(int key) {
        Node temp = new Node(key);
        if(head == null)
            head = temp;
        else
        {
            Node temp2 = head;
            while(temp2.next != null)
            {
                temp2=temp2.next;
            }
            temp2.next = temp;
        }
    }

    public void remove(int key) {
        if(head == null)
            return;
        else if(head.val == key)
            head=head.next;
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                if(temp.next.val == key)
                    temp.next = temp.next.next;
                else
                    temp=temp.next;
            }
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        Node temp = head;
        while(temp != null)
        {
            if(key == temp.val)
                return true;
            temp=temp.next;
        }
        return false;
    }
}


/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */