package one;

import java.util.HashMap;

public class Idpassword {
    HashMap idPassword = new HashMap<String,String>();

    Idpassword() {
        idPassword.put("TS111A001","qwerasdf");
        idPassword.put("TS111B002","qaqzxsw");
        idPassword.put("TS111C003","fdsaqwer");
        idPassword.put("TS112A001","zaqwsx");
        idPassword.put("TS112B002","xsdcza");
        idPassword.put("TS113C003","mlkoijn");
    }
    
	public void check(String id,String password) {
		//TODO:在这里具体写id和密码check的具体实现步骤
	}
}
