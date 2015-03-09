public class LTest{

	public static void main(String[] args){
		LList nums = new LList();
		nums.push(51);
		nums.push(74);
		nums.push(4);
		System.out.println(nums);
		System.out.println(nums.returntail());
		System.out.println(nums.returnhead());
		nums.pop();
		System.out.println(nums.returntail());
		System.out.println(nums.returnhead());
		nums.enqueue(5);
		System.out.println(nums);
		nums.dequeue();
		System.out.println(nums);
		System.out.println(nums.returnhead());
		nums.sortedInsert(50);
		System.out.println(nums);
		//nums.reverse();
		System.out.println(nums);
		nums.sortedInsert(50);
		nums.sortedInsert(50);
		nums.sortedInsert(50);
		nums.sortedInsert(58);
		nums.removeDuplicates();
		LList second=nums.clone();
		System.out.println(second);
		second.sortedInsert(23);
		System.out.println(second);
		System.out.println(nums);
		nums.enqueue(5);
		System.out.println(nums);
		nums.dequeue();
		System.out.println(nums);
	}

}