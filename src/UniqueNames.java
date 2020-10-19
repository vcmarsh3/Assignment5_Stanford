import java.util.ArrayList;

public class UniqueNames extends Console Program {
	
	public void run() {
		ArrayList<String> list = new ArrayList<String>();
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals("")) break;
			if (!list.contains(name)) {
				list.add(name);
			}
		}
		
		System.out.println("Unique list contains:");
		printList(list);
	}
		private void printList(ArrayList list) {
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}


