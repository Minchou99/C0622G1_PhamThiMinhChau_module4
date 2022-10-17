package email.service;

import email.model.Email;

import java.util.List;

public interface IEmailService {
    List<String> showLanguage();

    List<String> showSize();

    List<Email> getEmailList();

    Email getEmail(int id);

    void edit(Email email);
}
