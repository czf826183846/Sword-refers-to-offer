//第一种方法，当l1或l2不为空时，比较l1和l2的值，有节点已为空，则将其设为Integer.MAX_VALUE
ListNode mid = new ListNode(0);
		ListNode res = mid;
		while(l1!=null||l2!=null) {
			int x = (l1!=null)?l1.val:Integer.MAX_VALUE;
			int y = (l2!=null)?l2.val:Integer.MAX_VALUE;
			if(x>=y) {
				mid.next = new ListNode(y);
				l2 = l2.next;
				mid = mid.next;
			}else {
				mid.next = new ListNode(x);
				l1 = l1.next;
				mid = mid.next;
			}
		}
		return res.next;
    
//第二种方法：当l1和l2都不为空时，将值较小的加上，然后直接将不为空的那个加在后面。
ListNode res = new ListNode(0);
        ListNode mid = res;
        while((list1 != null) && (list2 != null)){
            if(list1.val <= list2.val){
                ListNode node = new ListNode(list1.val);
                mid.next = node;
                mid = mid.next;
                list1 = list1.next;
            }
            else{
                ListNode node = new ListNode(list2.val);
                mid.next = node;
                mid = mid.next;
                list2 = list2.next;
            }
        }
        if(list1 == null) mid.next = list2;
        else mid.next = list1;
        return res.next;
