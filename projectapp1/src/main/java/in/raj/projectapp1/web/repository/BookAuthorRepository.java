package in.raj.projectapp1.web.repository;

import in.raj.projectapp1.support.jpa.CustomJpaRepository;
import in.raj.projectapp1.web.entity.Author;
import in.raj.projectapp1.web.entity.Book;
import in.raj.projectapp1.web.entity.BookAuthor;

/**
 * <b>BookAuthor Repository</b><br>
 * You can use NamedQuery or Query annotation here.<br>
 * 
 * 
 * @author Wenbo Wang (jackie-1685@163.com)
 */
public interface BookAuthorRepository extends CustomJpaRepository<BookAuthor, Long> {

	public BookAuthor findByBookAndAuthor(Book book, Author author);

	public void deleteByAuthor(Author author);

	public void deleteByBook(Book book);
}
