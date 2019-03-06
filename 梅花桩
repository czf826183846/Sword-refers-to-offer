//Redraiment是走梅花桩的高手。Redraiment总是起点不限，
//从前到后，往高的桩子走，但走的步数最多，不知道为什么？你能替Redraiment研究他最多走的步数吗？
Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] nums = new int[length];
        for(int i = 0; i < length; i++){
            nums[i] = sc.nextInt();
        }
        int max_res = 0;
        
        for(int start = 0; start < length; start++) { 
        	Stack<Integer> stack = new Stack<Integer>();
        	int min = Integer.MAX_VALUE;
        	for(int index = start; index < length; index++) {
        		if(stack.isEmpty()) {
        			stack.push(nums[index]);//用栈存储走过的路径
        			min = Math.min(min, nums[index]);//设置之前的最小值
        		}
        		else {
        			if(nums[index] <= stack.peek()) {//如果当前所遍历的节点值小于栈顶值
        				if(nums[index] <= min) continue;//如果不但小于栈顶，还小于栈中最小值，直接进行下一次循环
        				stack.pop();//如果当前所遍历的节点值小于栈顶值，将栈顶出栈
        				stack.push(nums[index]);//当前节点入栈
        				min = Math.min(min, nums[index]);//确定min是否需要更新
        			}
        			else {//如果当前所遍历的节点值大于栈顶值
        				stack.push(nums[index]);//直接入栈
        				min = Math.min(min, nums[index]);//
        			}
        		}
        		
        	}
        	System.out.println(stack);
        	max_res = Math.max(max_res, stack.size());
        }
        return max_res;
