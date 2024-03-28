//Bank Account with Parameterized Constructor: Develop a BankAccount class with fields such as
//accountNumber, holderName, and balance. Include a parameterized constructor to initialize
//these fields. Write a program to create instances of BankAccount using this constructor and
//display their details.

class Test{
	String name;
	int account;
	int bal;
	Test(String name,int account,int bal){
		this.name=name;
		this.account=account;
		this.bal=bal;
	}
}
class account{
	public static void main(String args[]){
		Test s1 = new Test("Bindhu",1276,654);
		System.out.println(s1.name+" "+s1.account+" "+s1.bal+" ");
	}
}

output:Bindhu  1276 654
