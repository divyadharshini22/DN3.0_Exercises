public class Main {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        // Decorate with SMS
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorate with Slack
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        slackNotifier.send();
    }
}
