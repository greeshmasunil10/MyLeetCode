package Problems;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {

    public  AddTwoNumbers(){
        System.out.println("Question: 2. Add Two Numbers");
        ListNode l1 = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9)))))));
        ListNode l2 = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9))));
        System.out.println("adding"+ l1+" and "+ l2);
        addTwoNumbers(l1,l2);
    }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int digit_sum;
            ListNode l3 = null;
            ListNode current = null;
            ListNode temp;
            int carry = 0;
            while(l1 != null || l2 != null || carry > 0){
                System.out.println("\ncarry:"+carry);
                if(l1!=null)
                    System.out.println("l1:"+l1.val);
                if(l2!=null)
                    System.out.println("l2:"+l2.val);
                 if(l1 == null && l2 == null){
                    digit_sum = carry;
                    carry = 0;
                } else if(l1==null)
                     digit_sum = l2.val;
                 else if(l2==null)
                     digit_sum = l1.val;
                else
                    digit_sum = l1.val + l2.val;//3529 + 112, 12
                if(carry>0){// no carry
                    digit_sum+=carry;
                    carry=0;
                }
                System.out.println("digitsum:"+digit_sum);
                if(digit_sum >9){//yes, 11
                    temp = new ListNode(digit_sum%10);// l3 = 2
                    carry = digit_sum/10;// carry = 1
                    System.out.println("new carry:"+carry);
                    System.out.println("new digitsum:"+digit_sum%10);
                } else{
                     temp = new ListNode(digit_sum);
                }
                if(l3 ==null){
                    l3 = temp;
                    current = l3;
                } else{
                    current.next = temp;
                    current = current.next;
                }
                if(l1!= null)
                    l1 = l1.next;
                else l1 = null;
                if(l2!= null)
                    l2 = l2.next;
                else l2 = null;
            }
            ListNode l4 = l3;
            System.out.println("Answer:");
            while(l4!=null){
                System.out.println("val:"+l4.val);
                l4 = l4.next;
            }
            return l3;
        }
    }

