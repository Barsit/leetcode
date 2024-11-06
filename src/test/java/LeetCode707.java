/**
 * @description:
 * @projectName:leetcode
 * @see:PACKAGE_NAME
 * @author:db
 * @createTime:2024/11/6 14:37
 * @version:1.0
 */

public class LeetCode707 {

    int size;
    ListNode head;
    public LeetCode707() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if(index >= size || index < 0)  return -1;
        ListNode p = head;
        int count = 0;
        while(count <= index ){
            p = p.next;
            count++;
        }
        return p.val;
    }

    public void addAtHead(int val) {
        ListNode p = new ListNode(val);
        p.next = head.next;
        head.next = p;
        size++;
        return;
    }

    public void addAtTail(int val) {
        ListNode p = head.next;
        while(p.next != null){
            p= p.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = null;
        p.next  = newNode;
        size++;
        return;

    }

    public void addAtIndex(int index, int val) {
        if(index > size  || index < 0)  return;
        ListNode p = head;
        int count = 0;
        while(count < index ){
            p = p.next;
            count++;
        }
        ListNode newNode = new ListNode(val);
        newNode.next =  p.next;
        p.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index > size - 1 || index < 0)  return;
        ListNode p = head;
        int count = 0;
        while(count < index ){
            p = p.next;
            count++;
        }
        p.next = p.next.next;
        size--;
    }

    public static void main(String[] args) {
        LeetCode707 leetCode707 = new LeetCode707();
//        leetCode707.addAtHead(7);
//        leetCode707.addAtHead(2);
//        leetCode707.addAtHead(1);
//        leetCode707.addAtIndex(3,0);
//        leetCode707.deleteAtIndex(2);
//        leetCode707.addAtHead(6);
//        leetCode707.addAtTail(4);
//        System.out.println(leetCode707.get(4));
//        leetCode707.addAtHead(4);
//        leetCode707.addAtIndex(5,0);
//        leetCode707.addAtHead(6);

//        leetCode707.addAtHead(7);
//        leetCode707.addAtHead(2);
//        leetCode707.addAtHead(1);
//        leetCode707.addAtIndex(3,0);
//        leetCode707.deleteAtIndex(2);
//        leetCode707.addAtHead(6);
//        leetCode707.addAtTail(4);
//        System.out.println( leetCode707.get(4));
//        leetCode707.addAtHead(4);
//        leetCode707.addAtIndex(5,0);
//        leetCode707.addAtHead(6);

        leetCode707.addAtTail(1);
        leetCode707.get(0);

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */