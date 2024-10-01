public class LinkedListStack<Unicorn> {
    private Node<Unicorn> top; 
    private int size; 

    public LinkedListStack() {
        this.top = null; 
    }

    public void push(Unicorn data) {
        Node<Unicorn> newNode = new Node<Unicorn>(data); 
        newNode.next = this.top; // setting newNode's ref to the current top Node
        this.top = newNode; // setting newNode as the new top Node (now the var `top` points to newNode)
        this.size++;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true; 
        }
        return false; 
    }
    /*
     * 3 steps: 
     *  1. check if stack is empty     
     *  2. retrieve the first element from the list
     *  3. make the var `top` point to the the current top's .next
     */
    public Unicorn pop() throws IllegalArgumentException {
       if (this.isEmpty()){
        throw new IllegalArgumentException("Stack is empty. Cannot pop."); 
       }
       Unicorn retrieved = this.top.data; // points to the Node object on top
       this.top = this.top.next; // the top of the stack is now the next item on the stack
       this.size--; 
       return retrieved; 
    }

    public Unicorn peek() throws IllegalArgumentException {
        if (this.isEmpty()) {
            throw new IllegalArgumentException("Stack is empty. No peeking!");
        }
        return this.top.data; 
    }

    public int getSize() {
        return this.size; 
    }
}