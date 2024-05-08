package SolidPrinciples;

public class EmailNotifier implements Notifier {

    @Override
    public void sendEmailNotification(String email) {


        System.out.println("Email notification sent to: " + email);

    }

}
