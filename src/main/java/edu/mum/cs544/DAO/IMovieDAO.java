package edu.mum.cs544.DAO;

import java.util.List;

import edu.mum.cs544.model.Movie;

public interface IMovieDAO<T> {

	public void create(T entity);
	public void update(Movie movie);
	public Movie findById(long movieId);
	public void delete(Movie movie);
	public List<Movie> findAll();
	public void deleteAll();
}
