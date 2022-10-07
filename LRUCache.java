class LRUCache {
    int size = 0;
    int capacity;
    HashMap<Integer,Node> map = new HashMap<>();
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
        
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    
    public int get(int key) {
         if(this.map.get(key) == null){
            return -1; 
         } 
         
         Node cacheNode = this.map.get(key);
         cacheNode.prev.next = cacheNode.next;
         cacheNode.next.prev = cacheNode.prev;
         this.insert(key,cacheNode.value);
        
        
        return cacheNode.value;
    }
    
    public void put(int key, int value) {
        if(this.map.get(key) != null){
          Node cacheNode = this.map.get(key);
          cacheNode.prev.next = cacheNode.next;
          cacheNode.next.prev = cacheNode.prev;
          
          this.insert(key,value);            
        }        
        else{
            if(this.size < this.capacity){
                this.insert(key,value);
                this.size++;
            }
            else{ 
              this.map.remove(this.tail.prev.key);  
              this.tail.prev.prev.next = this.tail;
              this.tail.prev = this.tail.prev.prev;
              this.size--; 
              this.insert(key,value);
              this.size++;
            }
        }
        
        
    }
  public void insert(int key, int value){
            Node newNode = new Node(key,value);
            Node temp = this.head.next;
            this.head.next = newNode;
            newNode.prev = this.head;
            newNode.next = temp;
            temp.prev = newNode;
            this.map.put(key,newNode);
  }  
}

class Node {
    int key, value;
    Node prev,next;
    
    public Node(int key, int value){
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    } 

}



/*
Steps
1. We need a LinkedList to get track of most recently and least recently used 
2. Most recently will be next to head and will be updated wheneever we perform get or put
3. Least recently used will be before tail and will the deleted when capacity exceeds
4. We will used Hashmap to store key and value and value will be the (Node) of the LinkedList.

*/



/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
