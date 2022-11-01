package ss12_ajax.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ss12_ajax.exercise.model.Bloger;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Bloger, Integer> {
//    @Query(value = "select * from bloger where name_blog like %:searchNameOne% and name_writer like %:searchNameTwo%", nativeQuery = true)
//    List<Bloger> searchByNameBlog(@Param("searchNameOne") String searchNameOne, @Param("searchNameTwo") String searchNameTwo);

    @Query(value = "SELECT * FROM bloger JOIN category ON bloger.category_id = category.id WHERE category.name like %:keyword%", nativeQuery = true)
    List<Bloger> searchByNameCategory(@Param("keyword") String keyword);
}
