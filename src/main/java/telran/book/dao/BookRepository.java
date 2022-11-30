package telran.book.dao;

import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;

import telran.book.model.Author;
import telran.book.model.Book;
import telran.book.model.Publisher;

public interface BookRepository extends CrudRepository<Book, String> {

  Stream<Book> findAllBooksByPublisher(Publisher publisher);

  Stream<Book> findAllBooksByAuthors(Author author);
  
}
