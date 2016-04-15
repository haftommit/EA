/*package edu.mum.cs544.controller;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.cs544.model.Actor;
import edu.mum.cs544.model.BirthInfo;
import edu.mum.cs544.model.Director;
import edu.mum.cs544.model.Genre;
import edu.mum.cs544.model.Movie;
import edu.mum.cs544.model.MovieRating;
import edu.mum.cs544.model.MovieReview;
import edu.mum.cs544.service.MovieService;


public class Application {

	public static void main(String[] args) throws IOException{
		
	try {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		MovieService ms = (MovieService) context.getBean("movieService");
						
		MovieReview review = new MovieReview();
		review.setCriticName("Haftom");
		SimpleDateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
		Date date = new Date();
		try{
			date = dateFormat.parse("04/02/2016");
		}catch (ParseException e) {
            e.printStackTrace();
        }
		review.setDate(date);
		
		review.setComment("Enjoyable, I liked it...");
		review.setRating(9);
		
		Movie movie1 = new Movie();
		movie1.setGenre(Genre.ROMANCE);
		movie1.setRated(MovieRating.RESTRICTED);
		movie1.setSummary("It Is Very Nice Film...");
		movie1.setTitle("Big Bang ... ");
		movie1.setYear(2004);
		Path p = FileSystems.getDefault().getPath("", "images/cover.jpg");
		byte[] fileData = Files.readAllBytes(p);
		movie1.setPoster(fileData);
	
		Director artist1 = new Director();
		artist1.setName("Leanord ");
		artist1.setBiography("Born to the USA");
		artist1.addMovie(movie1);
		p = FileSystems.getDefault().getPath("", "images/Leonard.jpg");
		fileData = Files.readAllBytes(p);
		artist1.setProfilePicture(fileData);
		artist1.setLeadDirector(true);
		
		Actor artist2 = new Actor();
		artist2.setBiography("Born in the USA");
		artist2.setName("Shelden Cooper ");
		artist2.addMovie(movie1);
		p = FileSystems.getDefault().getPath("", "images/shelden.jpg");
		fileData = Files.readAllBytes(p);
		artist2.setProfilePicture(fileData);
		artist2.setLeadCharacter(true);
		artist2.setRole("leading Role");
		
		BirthInfo actorBirthInfo = new BirthInfo();
		actorBirthInfo.setCity("California");
		actorBirthInfo.setState("CA");
		actorBirthInfo.setCountry("USA");
		date = new Date();
		try{
			date = dateFormat.parse("10/30/2015");
		}catch (ParseException e) {
            e.printStackTrace();
        }
		actorBirthInfo.setDateOfBirth(date);
					
		BirthInfo directorBirthInfo = new BirthInfo();
		directorBirthInfo.setCity("Los Angelos ");
		directorBirthInfo.setState("LA");
		directorBirthInfo.setCountry("USA");
		date = new Date();
		try{
			date = dateFormat.parse("08/22/2015");
		}catch (ParseException e) {
            e.printStackTrace();
        }
		directorBirthInfo.setDateOfBirth(date);
					
		artist1.setBirthInfo(directorBirthInfo);
		artist2.setBirthInfo(actorBirthInfo);
		
		movie1.addArtist(artist1);
		movie1.addArtist(artist2);
		movie1.addReview(review);
		
		
		ms.save(artist1);
		ms.save(artist2);
		ms.save(review);
		ms.save(movie1);
		ms.save(directorBirthInfo);
		ms.save(actorBirthInfo);
		
		
		
		List<Movie> movies = ms.findAll();
		System.out.println("Movies That Are Persisted... :");
		for (Movie m : movies) {
		    //System.out.println(m.getTitle()+ " " + m.getYear() + " " + m.getPoster() + " " + m.getRated() + " " + m.getArtists() + " " + m.getReviews() + " " + m.getSummary());
			System.out.println(m.getMovieId());
			System.out.println(m.getTitle());
		    System.out.println(m.getYear());
		    System.out.println(m.getPoster() );
		    System.out.println(m.getRated() );
		    //System.out.println(m.getArtists() );
		   // System.out.println(m.getReviews() );
		    System.out.println(m.getSummary());
		}
		
		

		
	} catch (RuntimeException e) {
        e.printStackTrace(System.err);
    }
    System.exit(0);
	}

}
*/
