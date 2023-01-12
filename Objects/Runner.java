package bankAccount;

public class Runner {

	public static void main(String[] args) {
		String me = "Zach";
		double money = 768.99;
		
		Account mine = new Account(me, money);
		System.out.println(mine);
		
		mine.deposit(1000);
		System.out.println(mine);
		mine.withdrawl(1000);
		System.out.println(mine);
		
		

	}

}
