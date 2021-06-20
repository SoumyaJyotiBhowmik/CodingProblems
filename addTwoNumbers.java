package programs;

public class addTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	        if(l1 == null){
	            return  l2;
	        }
	        if(l2 == null){
	            return l1;
	        }
	        ListNode head = new ListNode(0);
	        ListNode l3 = head;
	         int digit = 0;
	        int carry = 0;
	        while(l1 != null && l2 != null){
	        digit = (carry + l1.val + l2.val) % 10;
	        carry = (carry + l1.val + l2.val) / 10;
	      
	            l3.next = new ListNode(digit);
	            l3 = l3.next;
	            l1 = l1.next;
	            l2 = l2.next;
	        }
	        while(l1 != null){
	            digit = (l1.val + carry) % 10;
	            carry = (l1.val + carry) / 10;
	           
	            l3.next = new ListNode(digit);
	            l3 = l3.next;
	            l1 = l1.next;
	        }
	         while(l2 != null){
	            digit = (l2.val + carry) % 10;
	            carry = (l2.val + carry) / 10;
	            l3.next = new ListNode(digit);
	            l3 = l3.next;
	            l2 = l2.next;
	        }
	        if(carry != 0){
	            l3.next = new ListNode(carry);
	           l3 = l3.next; 
	        }
	         return head.next;
	    }

}
