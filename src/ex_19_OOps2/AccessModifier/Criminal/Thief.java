package ex_19_OOps2.AccessModifier.Criminal;

public class Thief {
    class VWOLogin {
        public String username;
        public String password;

        public VWOLogin(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

    class GoodVWOLogin{
        private String username;
        private String password;

        public GoodVWOLogin(String usr, String pwd) {
            this.username = username;
            this.password = password;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password,boolean isAdmin) {
            if(isAdmin) {
                this.password = password;
            }else {
                System.out.println("Not allowed Set the password, Not a admin!");
            }
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
}
