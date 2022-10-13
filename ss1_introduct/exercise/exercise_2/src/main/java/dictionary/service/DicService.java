package dictionary.service;

import dictionary.model.Dictionary;
import dictionary.repository.IDicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DicService implements IDicService {
    @Autowired
    IDicRepo dicRepo;

    @Override
    public String find(String word) {
        List<Dictionary> dictionaryList = dicRepo.getListDictionary();
        for (Dictionary dictionary : dictionaryList) {
            if (dictionary.getEng().equals(word)) {
                return dictionary.getVie();
            } else if (dictionary.getVie().equals(word)) {
                return dictionary.getEng();
            }
        }
        return "Not found ";
    }
}
