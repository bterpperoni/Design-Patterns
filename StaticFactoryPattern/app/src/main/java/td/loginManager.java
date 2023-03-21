package td;

public class loginManager {

    public static login factoryLogin(String type){

        login selected;

        switch(type){

            case "password":
                selected = new loginPassword();
                break;
            case "domain":
                selected = new loginDomain();
                break;
            default:
                selected = new loginPassword();
                break;

        }
        return selected;
    }


    
}
