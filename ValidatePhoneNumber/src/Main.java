public class Main {
    static void main(String[] args) {
        String[] validPhone = {"(84)-(0978489648)"};
        String[] inValidPhone = {"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
        ValidateNumberPhone validateNumberPhone = new ValidateNumberPhone();
        for (String phone : validPhone) {
            boolean isValid = validateNumberPhone.validateNumberPhone(phone);
            System.out.println("Phone Number " + phone + " is valid " + isValid);
        }
        for (String phone : inValidPhone) {
            boolean isValid = validateNumberPhone.validateNumberPhone(phone);
            System.out.println("Phone Number " + phone + " is valid " + isValid);
        }
    }
}
