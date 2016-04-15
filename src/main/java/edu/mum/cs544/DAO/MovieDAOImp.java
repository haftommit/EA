package edu.mum.cs544.DAO;

import java.util.List;
 

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.cs544.model.Movie;

public class MovieDAOImp<T> implements IMovieDAO<T>{
	

	private SessionFactory sf;
	
	public MovieDAOImp(){}
	

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	@Transactional
	public void create(T entity) {
		sf.getCurrentSession().persist(entity);
	}

	@Transactional
	public void update(Movie movie) {
		sf.getCurrentSession().merge(movie);
	}

	@Transactional
	public Movie findById(long l) {
		Movie movie = (Movie) sf.getCurrentSession().get(Movie.class, l);
        return movie; 
	}

	@Transactional
	public void delete(Movie movie) {
		sf.getCurrentSession().delete(movie);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	@SuppressWarnings("unchecked")
	public List<Movie> findAll() {
		List<Movie> movies = (List<Movie>) sf.getCurrentSession().createQuery("from Movie").list();
        return movies;
	}

	public void deleteAll() {
		List<Movie> movieList = findAll();
			for (Movie movie : movieList) {
			delete(movie);
        }
	}

}
