package main.java.com.example.task2;

class BirthdayMail implements MailInfo {
    private Client client;
    private String mailCode;

    public BirthdayMail(Client client) {
        this.client = client;
        this.mailCode = "Birthday Greetings";
    }

    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public String getMailCode() {
        return mailCode;
    }
}