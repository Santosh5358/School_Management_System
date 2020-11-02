package MailOtp;
public class Simple {
    
    static int otp;
    
	public static void sendEmail(String to,String subject,String message){
		otp= new OTPGenerator().generateOTP();
		new MailOTP(to, otp,subject,message);
	}
        
        public static int getotp()
        {
            return otp;
        }
}