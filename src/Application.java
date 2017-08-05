
import java.util.Stack;

import javax.xml.transform.Templates;

public class Application {

	public static void main(String[] args) {

		Stack<Integer> data = new Stack<>();
		data.push(100);
		data.push(56);
		data.push(19);
		data.push(82);
		data.push(5);

		System.out.println("Original Stack " + data);

		Stack<Integer> newStack = new Stack<Integer>();
		newStack.push(data.pop());

		while (!data.isEmpty()) {
			int temp = data.pop();
			while (!newStack.isEmpty() && temp < newStack.peek()) {
				data.push(newStack.pop());

			}
			
		
			newStack.push(temp);
		}
		System.out.println("Sort Stack     " + newStack);
		
	}

}