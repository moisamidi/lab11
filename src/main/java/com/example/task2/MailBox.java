package com.example.task2;

import java.util.List;

import com.mailjet.client.errors.MailjetException;

class MailBox {
    private List<MailInfo> infos;

    public MailBox() {
        this.infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll(MailSender mailSender) {
        for (MailInfo info : infos) {
            mailSender.sendMail(info);
        }
        infos.clear();
    }
}
