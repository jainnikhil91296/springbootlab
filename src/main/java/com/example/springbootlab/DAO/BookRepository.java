package com.example.springbootlab.DAO;

        import com.example.springbootlab.Entity.Book;
        import org.springframework.data.mongodb.repository.MongoRepository;

        import java.util.List;

public interface BookRepository extends MongoRepository<Book,Integer> {


}