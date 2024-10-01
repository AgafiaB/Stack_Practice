public class TestStacks {
    public static void main(String[] args) {
        LinkedListStack stackedyStack = new LinkedListStack(); 
        String stringyString = new String("yello"); 
        stackedyStack.push(stringyString); 
        System.out.println(stackedyStack.peek());
        System.out.println(stackedyStack.getSize());
        System.out.println(stackedyStack.pop());
        System.out.println(stackedyStack.isEmpty());
        System.out.println(stackedyStack.getSize());
    }
}