package email.repository;

import email.model.Email;

import java.util.List;

public interface IEmailRepository {

    List<String> showLanguages();

    List<String> showSize();

    List<Email> getEmailList();

    Email getEmail(int id);

    void edit(Email email);

}
