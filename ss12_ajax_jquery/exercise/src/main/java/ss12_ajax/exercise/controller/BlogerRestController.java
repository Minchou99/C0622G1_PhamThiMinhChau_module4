package ss12_ajax.exercise.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ss12_ajax.exercise.dto.BlogerDto;
import ss12_ajax.exercise.model.Bloger;
import ss12_ajax.exercise.service.IBlogService;

import java.util.List;
import java.util.Optional;
@CrossOrigin("*")
@RestController
@RequestMapping("api/bloger/v1")
public class BlogerRestController {
    @Autowired
    private IBlogService blogService;

    @GetMapping
    public ResponseEntity<List<Bloger>> getBlogerList(@PageableDefault(value = 3) Pageable pageable) {
        Page<Bloger> blogerList = blogService.findAll(pageable);
        if (blogerList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogerList.getContent(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addBloger(@RequestBody BlogerDto blogerDto) {
        Bloger bloger = new Bloger();
        BeanUtils.copyProperties(blogerDto, bloger);
        blogService.save(bloger);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bloger> updateBlogger(
            @PathVariable int id,
            @RequestBody BlogerDto blogerDto) {
        Bloger currentBlogger = blogService.findById(id);
        if (currentBlogger == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        BeanUtils.copyProperties(blogerDto, currentBlogger);
        blogService.save(currentBlogger);
        return new ResponseEntity(currentBlogger, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Bloger> deleteBlog(
            @PathVariable int id,
            @RequestBody BlogerDto blogerDto
    ) {
        Bloger currentBlog = blogService.findById(id);
        if (currentBlog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        BeanUtils.copyProperties(blogerDto, currentBlog);
        blogService.remove(id);
        return new ResponseEntity<>(currentBlog, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bloger> getBlog(@PathVariable int id) {
        Optional<Bloger> blogerOptional = blogService.findByIdOptional(id);
        if (!blogerOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogerOptional.get(), HttpStatus.OK);
    }

    @GetMapping("/search/{nameCategory}")
    public ResponseEntity<List<Bloger>> searchByNameCategory(@PathVariable String nameCategory) {
        /* Nếu không biết Collections thì dùng Interator */
        List<Bloger> blogList = blogService.searchByNameCategory(nameCategory);
        if (blogList.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @GetMapping("/search-blog")
    public ResponseEntity<List<Bloger>> getBlogByCategory(@RequestParam String nameSearch){
        List<Bloger> blogerList = blogService.findByCategory(nameSearch);
        if(blogerList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogerList, HttpStatus.OK);
    }


}
