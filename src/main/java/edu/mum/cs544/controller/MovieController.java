/**
 * 
 */
package edu.mum.cs544.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.mum.cs544.model.Artist;
import edu.mum.cs544.model.Movie;
import edu.mum.cs544.service.MovieService;

/**
 * @author haftomtesfay
 *
 */
@Controller 
public class MovieController<T> {
 private MovieService<T>  movieserive = new MovieService<T>();
 
 	@RequestMapping(value = "/")
	public String MovieHome(){
		
		return "home";
	}
 	
 	
@RequestMapping( value = "/name" method = RequestMethod.GET)
public String getNameOfMovie(Model model){
	
	model.addAttribute("name", new Movie());
	model.addAttribute("name");
	return "home";
}
@RequestMapping(value= "/genre" method = RequestMethod.GET)
public String getGenreOfMovie(Model model){
	
	return "home";
}
@RequestMapping(value = "/rating")
public String getRatingOfMovie(Model model){
	
	model.addAttribute("rating", new Movie());
	return "home";
}

@RequestMapping(value = "/year")
public String getYearOfMovie(Model model){
	model.addAttribute("year", new Movie());
	return "home";
}
}
@RequestMapping(value = "Artist/name")
public String getNameOfArtist(Model model){
	model.addAttribute("name", new Artist());
	return "home";
}

@RequestMapping("/character")
public String getCharacterOnMovie(Model model){
	model.addAttribute("character", new Movie());
	return "home";
}

@RequestMapping(value = "/director")
public String getDirectorOfMovie(Model model){
	model.addAttribute("directore", new Movie());
	return "home";
}

}
