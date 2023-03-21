package td;

public class loginPassword implements login {
    
    @Override
    public boolean verify(String n, String cred) {
        
        boolean state=false;
        System.out.println("Password login check...");
        if(n!=""){
            
            if(cred.indexOf("@")==-1) state=true;;
            
        }

        return state;
        
        
    }
}
