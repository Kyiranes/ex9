public class Main {
    public static void main(String[] args) {
        Email email = new Email("lyhxr@example.com");
        Phone phone = new Phone("123-456-7890");
        email.contact();
        phone.contact();
    }
}
abstract class Contact{
    public String name;
    abstract void contact();
}
class Email extends Contact{

    @Override
    public String toString() {
        return "Email{" +
                "emailAddress='" + emailAddress + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Email(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    private final String emailAddress;
    void contact() {
        System.out.println("Emailing " + emailAddress);
    }
}
class Phone extends Contact{
    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String phoneNumber;

    @Override
    void contact() {
        System.out.println("Calling " + phoneNumber);
    }
}