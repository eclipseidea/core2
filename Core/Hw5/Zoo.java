package Hw5;
import java.util.Scanner;
public class Zoo {
	public static void main(String[] args) {
		String[] animals = { null, null, null, "dog", null, null, null, null,
				"tiger", null };
		System.out.println("enter 1 to check if animal exist in zoo");
		System.out.println("enter 2 to add animal into zoo");
		System.out.println("enter 3 for delete animal from zoo");
		System.out.println("enter 4 for show all animals");
		System.out.println("enter 5 for exit");
		while (true) {
			int choise = 0;
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				choise = scanner.nextInt();
			}
			if (choise == 1 && (choise > 0 || choise <= 5)) {
				System.out.println("input your animall");
				String check_animalls = scanner.next();
				boolean check = false;
				for (int i = 0; i < animals.length; i++) {
					if (check_animalls.equalsIgnoreCase(animals[i])) {
						check = true;
						System.out.println("animal is listed");
					}
				}
				if (!check) {
					System.out.println("Animal does not exist in the array");
				}
			} else if (choise == 2 && (choise > 0 || choise <= 5)) {
				System.out.println("input your animall");
				String add_animalls = scanner.next();
				boolean check_add = false;
				for (int i = 0; i < animals.length; i++) {
					if (add_animalls.equalsIgnoreCase(animals[i])) {
						check_add = true;
						System.out.println("animal is listed or no place");
					}
				}
				if (!check_add) {
					for (int i = 0; i < animals.length; i++) {
						if (animals[i] == null) {
							animals[i] = add_animalls;
							break;
						}
					}
					System.out.println("animal added");
				}
			} else if (choise == 3 && (choise > 0 || choise <= 5)) {
				System.out.println("input your animall for delete");
				String checkingAnimalls = scanner.next();
				boolean checkexit = false;
				for (int i = 0; i < animals.length; i++) {
					if (checkingAnimalls.equalsIgnoreCase(animals[i])) {
						checkexit = true;
						animals[i] = null;
						break;
					}
				}
				System.out.println("animall deleted of array");
				if (!checkexit) {
					System.err
							.println("Animal does not exist in the array ,you can not delete it");
				}

			} else if (choise == 4 && (choise > 0 || choise <= 5)) {
				for (int i = 0; i < animals.length; i++) {
					if (null != animals[i]) {
						System.out.print(animals[i] + "   ");
					}
				}
			} else if (choise == 5 && (choise > 0 || choise <= 5)) {
				System.err.println("finish");
				scanner.close();
				System.exit(0);
			} else {
				System.err.println("Enter a number from 1 to 5");
			}
		}
	}
}
