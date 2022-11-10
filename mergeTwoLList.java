public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        SinglyLinkedList result=new SinglyLinkedList();
        
       
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                result.insertNode(head1.data);
                head1=head1.next;
            }else{
                result.insertNode(head2.data);
                head2=head2.next;
            }
        }
        if(head2!=null){
            while(head2!=null){
                result.insertNode(head2.data);
                head2=head2.next;
            }
        }
        if(head1!=null){
            while(head1!=null){
                result.insertNode(head1.data);
                head1=head1.next;
            }
        }
        return result.head;

    }
