package cognizant.qea25qe028;

public class Encap {
	
	public static void main(String[] args) {
		GetEncappedData data = new GetEncappedData();
		data.setBankBalance(20000);
		data.setUserName("Ravi");
		System.out.println(data.getBankBlnc());
		System.out.println(data.getUserName());
	}
}


class GetEncappedData{ 
	 private int bankBalance;
	 private String userName;

	 void setBankBalance(int balanace) {
		 if (balanace > 2000) {
			 this.bankBalance = balanace;
		 }
	 }
	 
	 void setUserName(String name) {
		 userName = name;
	 }
	 
	 int getBankBlnc() {
		 return bankBalance;
	 }
	 
	 String getUserName() {
		 return userName;
	 }
	 
	 
}
