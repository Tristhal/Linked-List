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
		System.out.println(nums.returntail());
		nums.delete(nums.returntail());
		System.out.println(nums);
		nums.delete(nums.returntail());
		System.out.println(nums);
	}

}