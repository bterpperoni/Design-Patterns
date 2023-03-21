package td;

public class loginDomain implements login {
    
    @Override
    public boolean verify(String n, String cred) {
       
        boolean state=false;
        System.out.println("Domain login check..."); 
        if(n!=""){

            if(!(cred.indexOf("@")==-1)) state=true;
            
        }

        return state;


        
    }
}
