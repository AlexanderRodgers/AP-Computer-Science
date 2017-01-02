import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String firstName, lastName, email, password;
    boolean done = false;

    public User(String fn, String ln, String em, String pwd) {
        firstName = fn;
        lastName = ln;
        email = em;
        password = pwd;
    }

    public void setFirst(String fn) {
        firstName = fn;
    }

    public void setLast(String ln) {
        lastName = ln;
    }

    public void setEmail(String em) {
        email = em;
    }

    public void setPassword(String pwd) {
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(pwd);
        boolean b = m.find();
        if(b) {
            p = Pattern.compile("[A-Z]");
            Pattern f = Pattern.compile("[a-z]");
            Pattern e = Pattern.compile("[0-9]");
            m = p.matcher(pwd);
            Matcher n = f.matcher(pwd);
            Matcher o = e.matcher(pwd);
            b = m.find();
            boolean c = n.find();
            boolean d = o.find();
            if(b && c && d) {
                password = pwd;
                System.out.println(password);
            }
        } else {
            System.out.println("Format not correct.");
        }
    }

    public String toString( ){
        String info = ">>>>>>>>>>>>>>>>\n" + firstName + " " + lastName + "\'s account.\nEmail: "
            + email + "\nPassword: " + password + "\n";
        return info;
    }
}