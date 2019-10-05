class MyHashMap {
    Node head;
    /** Initialize your data structure here. */
    public MyHashMap() {
        head = null;
    }

    /** value will always be non-negative. */
    public boolean contains(int key){
        Node temp = head;
        while(temp != null)
        {
            if(temp.key == key)
                return true;
            temp=temp.next;
        }
        return false;
    }
    public void put(int key, int value) {
        if(contains(key))
        {
            Node temp = head;
            if(head.key == key)
            {
                head.value = value;
            }
            else
            {
                while(temp != null)
                {
                    if(temp.key == key)
                        temp.value = value;
                    temp=temp.next;
                }
            }
        }
        else
        {
            Node temp = new Node(key,value);
            if(head == null)
            {
                head = temp;
            }
            else
            {
                Node temp2 = head;
                while(temp2.next != null)
                {
                    temp2 = temp2.next;
                }
                temp2.next = temp;
            }
        }
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int count = 0;
        Node temp = head;
        while(temp != null && temp.key != key)
        {
            count++;
            temp = temp.next;
        }
        if(temp == null)
            return -1;
        return temp.value;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if(head == null)
            return;
        if(head.key == key)
            head = head.next;
        else
        {
            Node temp = head;
            while(temp.next != null && temp.next.key != key)
            {
                temp=temp.next;
            }
            if(temp.next == null)
                return;
            else
                temp.next = temp.next.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
class Node{
    int key;
    int value;
    Node next;
    public Node(int a,int b)
    {
        key = a;
        value = b;
    }
}