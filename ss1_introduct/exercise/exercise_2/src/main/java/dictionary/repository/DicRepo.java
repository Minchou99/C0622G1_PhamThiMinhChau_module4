package dictionary.repository;

import dictionary.model.Dictionary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DicRepo implements IDicRepo {
private static List<Dictionary> dictionaryList = new ArrayList<>();
 static {
     dictionaryList.add(new Dictionary("cat","con mèo"));
     dictionaryList.add(new Dictionary("dog","con chó"));
     dictionaryList.add(new Dictionary("bird","con chim"));
     dictionaryList.add(new Dictionary("mum","mẹ"));
     dictionaryList.add(new Dictionary("sister","chị"));
     dictionaryList.add(new Dictionary("dad","bố"));
     dictionaryList.add(new Dictionary("brother","anh trai"));

 }

    @Override
    public List<Dictionary> getListDictionary() {
        return dictionaryList;
    }
}
