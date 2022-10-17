package email.service.impl;

import email.model.Email;
import email.repository.IEmailRepository;
import email.repository.impl.EmailRepository;
import email.service.IEmailService;

import java.util.List;

public class EmailService implements IEmailService {
   IEmailRepository emailRepository = new EmailRepository();

    @Override
    public List<String> showLanguage() {
        return emailRepository.showLanguages();
    }

    @Override
    public List<String> showSize() {
        return emailRepository.showSize();
    }

    @Override
    public List<Email> getEmailList() {
        return emailRepository.getEmailList();
    }

    @Override
    public Email getEmail(int id) {
        return emailRepository.getEmail(id);
    }

    @Override
    public void edit(Email email) {
    emailRepository.edit(email);
    }
}
