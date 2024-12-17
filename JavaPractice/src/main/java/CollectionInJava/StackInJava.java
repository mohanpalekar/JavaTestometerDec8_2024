package CollectionInJava;

import java.util.Stack;

public class StackInJava {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		//LIFO --> last in first out

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(null);
		stack.push(2);
		stack.push(4);
		stack.push(5);

		System.out.println(stack);

		int num = stack.pop();

		System.out.println(num);
		System.out.println(stack);

		int num2 = stack.pop();

		System.out.println(num2);
		System.out.println(stack);


	}

}
