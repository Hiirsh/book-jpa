package telran.book.dao;

import org.springframework.data.repository.CrudRepository;

import telran.book.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, String> {

}
