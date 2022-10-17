package email.repository.impl;

import email.model.Email;
import email.repository.IEmailRepository;

import java.util.ArrayList;
import java.util.List;

public class EmailRepository implements IEmailRepository {
    public static List<Email> emailList = new ArrayList<>();
    static {
        emailList.add(new Email(1,"Vietnamese","25","","abc"));
        emailList.add(new Email(2,"Japanese","100","","abc"));
        emailList.add(new Email(3,"English","50","","abc"));
        emailList.add(new Email(4,"Vietnamese","100","","abc"));
    }

    @Override
    public List<String> showLanguages() {
        List<String> languageList = new ArrayList<>();
        languageList.add("English");
        languageList.add("Vietnamese");
        languageList.add("Japanese");
        languageList.add("Chinese");
        return languageList;
    }

    @Override
    public List<String> showSize() {
        List<String> sizeList = new ArrayList<>();
        sizeList.add("5");
        sizeList.add("10");
        sizeList.add("15");
        sizeList.add("25");
        sizeList.add("50");
        sizeList.add("100");
        return sizeList;
    }

    public List<Email> getEmailList(){
        return emailList;
    }

    public Email getEmail(int id) {
        for (Email email : emailList) {
            if (email.getId() == id) {
                return email;
            }
        }
        return null;
    }

    public void edit(Email email) {
        for (Email item : emailList) {
            if (item.getId() == email.getId()) {
                item.setLanguage(email.getLanguage());
                item.setPageSize(email.getPageSize());
                item.setSignature(email.getSignature());
                item.setSpamsFilter(email.getSpamsFilter());
            }
        }
    }


}
