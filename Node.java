public class Node<Unicorn> {
    // every Node needs a piece of data and a reference to the next Node in the list
    Unicorn data; 
    Node<Unicorn> next; 

    public Node(Unicorn lilBob) {
        this.data = lilBob; 
        this.next = null; 
    }
}