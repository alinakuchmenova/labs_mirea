public class Autor {
    private final String name;
    private String email;
    private final char gender;
    Autor(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    @Override public String toString(){
        return "Name: " + name + ", email: " + email + ", gender: " + gender;
    }
}
