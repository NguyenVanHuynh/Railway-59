package demo.flow;

import entity.Account;
import entity.PositionName;

public class DemoSwitchCase {

	public static void main(String[] args) {
		int i = 1;
		switch (i) {
			case 0:
				System.out.println("A");
//				return;
				break;
			case 1:
				System.out.println("B");
				break;
			default:
				System.out.println("Default");
				break;
		}

	}

}
