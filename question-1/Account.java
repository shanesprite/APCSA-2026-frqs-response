public class Account {
    private String username;

    public account(String requestedUsername){
        boolean gotUsername = false;
        if (isAvailable(requestedUsername) == true){
            username = requestedUsername;
        } else {
            while (gotUsername = false){
                for (int i = 1; i < Integer.MAX_value; i ++){
                    if (isAvailable(requestedUsername + "" + i + "")) == true {
                        gotUsername = true;
                        username = requestedUsername + "" + i + "";
                    }
                }b
            }
        }
    }

    public static boolean isAvailable(String str){
        //implementation not shown.
    }

    public String getShortenedName(){
        for (int c = 0; i < username.length(); i++){
            if(username(i).equals("-")){
                username = username(0, i) + username (i + 1);
                c --;
            }
        }

        return username;
    }

}
