package VRM;

public class Simple {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		Browserswitch Camp = new Browserswitch();
        Camp.Login();
        Thread.sleep(2000);
        Camp.OTP();
        Camp.click_Register();
        Camp.Register_Customer();
        //Camp.Simple_Cmpn();
        //Camp.Simple_Rsnd();
        //Camp.Simple_Dlt();
	}

}
