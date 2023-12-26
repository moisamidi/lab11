package main.java.com.example.task2;

class EmailSender implements MailSender {
    @Override
    public void sendMail(MailInfo mailInfo) {
        Client client = mailInfo.getClient();
        String mailCode = mailInfo.getMailCode();

        System.out.println("Sending mail to: " + client.getName() +
                " (ID: " + client.getId() +
                ", Age: " + client.getAge() +
                ", Sex: " + client.getSex() +
                ") - Mail Code: " + mailCode);
    }
}