package main.java.com.example.task2;

public class Main {
    public static void main(String[] args) {
        // Create clients
        Client client1 = new Client("Anna", 30, "Female");
        Client client2 = new Client("Mark", 25, "Male");

        MailInfo birthdayMail1 = new BirthdayMail(client1);
        MailInfo giftMail1 = new GiftMail(client1);
        MailInfo birthdayMail2 = new BirthdayMail(client2);

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(birthdayMail1);
        mailBox.addMailInfo(giftMail1);
        mailBox.addMailInfo(birthdayMail2);

        MailSender mailSender = new EmailSender();
        mailBox.sendAll(mailSender);
    }
}