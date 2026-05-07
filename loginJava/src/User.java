public class User {
    private String nomeUser;
    private String senhaUser;

    public User() {}

    public User(String nomeUser, String senhaUser) {
        this.nomeUser = nomeUser;
        this.senhaUser = senhaUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public String getSenhaUser() {
        return senhaUser;
    }
}
