/*
object of this class will print a greeting
multiple lines
 */
public class Greeter {
    private String tobeGreeted;
    public Greeter(String greeted){
        this.tobeGreeted = greeted;
    }
    public String greet(){
        return tobeGreeted;
    }
}
