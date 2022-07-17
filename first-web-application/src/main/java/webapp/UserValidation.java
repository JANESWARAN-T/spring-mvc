package webapp;

public class UserValidation {
	
	public boolean isUservalid(String user, String password) {
		if(user.equals("janeswaran") && password.equals("1234"))
			return true;
		return false;
	}

}
