package main.java.com.example.task2;

class GiftMail implements MailInfo {
    private Client client;
    private String mailCode;

    public GiftMail(Client client) {
        this.client = client;
        this.mailCode = "Gift Letter";
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