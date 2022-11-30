package telran.book.dao;

import org.springframework.data.repository.CrudRepository;

import telran.book.model.Author;

public interface AuthorRepository extends CrudRepository<Author, String>{
  
}
