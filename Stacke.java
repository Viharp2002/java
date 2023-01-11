class Stacke {

	int index = -1;
	int size = 10;
	int[] s = new int[size];

	Stacke() {
	}

	public void push(int x) {

		if (index < size - 1) {
			index++;
			s[index] = x;
			System.out.println("el. " + x + " pushed" + " at index : " + index);

		} else {
			System.out.println("Stack-overflow");
		}
	}

	public void pop() {

		if (index > -1) {
			System.out.println("index : " + index + "\npop el. : " + s[index]);
			index--;
		} else {
			System.out.println("Stack-underflow");
		}
	}

	public void top() {
		if (index == -1) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Stack top : " + s[index]);
		}
	}

	public void els() {
		System.out.print("Stack elements : ");
		if (index > -1) {
			for (int i = 0; i <= index; i++) {
				System.out.print(s[i] + " ");
			}
		} else {
			System.out.println("Stack is empty");
		}

	}

	public static void main(String args[]) {
		// System.out.println(args.length);

		Stacke ob_stack = new Stacke();

		if (args.length != 0) {
			int main_flag = 1;
			for (int i = 0; i < args.length; i++) {

				if (args[i].equalsIgnoreCase("push")) {

					// System.out.println("push");
					int flag = 0, push_num = 0;
					if (args.length >= 2) {
						try {
							push_num = Integer.parseInt(args[++i]);
							flag = 1;
							throw new InterruptedException();
						} catch (InterruptedException e) {
							System.out.println("Please provide number after push argument...");
							main_flag = 0;
						}
						finally{
							System.out.println("vijar");
						}

						if (flag == 1) {
							ob_stack.push(push_num);
						}
					} else {
						System.out.println("Please provide number after push argument...");
						main_flag = 0;
					}

				} else if (args[i].equalsIgnoreCase("pop")) {
					// System.out.println("pop");
					ob_stack.pop();
				} else {
					System.out.println("Invalid args....");
					main_flag = 0;
				}
			}
			if (main_flag == 1) {
				ob_stack.els();
			}
		} else {
			System.out.println("Please provide args...");
		}
	}

}