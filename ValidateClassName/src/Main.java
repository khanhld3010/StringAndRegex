public class Main {
    static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        String[] validClassName = {"C0223G", "A0323K"};
        String[] inValidClassname = {"M0318G", "P0323A"};
        for (String name : validClassName) {
            boolean isValid = validateClassName.isValidClassName(name);
            System.out.println("Class Name " + name + " is " + isValid);
        }
        for (String name : inValidClassname) {
            boolean isValid = validateClassName.isValidClassName(name);
            System.out.println("Class Name " + name + " is " + isValid);
        }
    }
}
