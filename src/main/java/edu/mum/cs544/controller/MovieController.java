/**
 * 
 */
package edu.mum.cs544.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

@RequestMapping( value = "/name")
public String getNameOfMovie(Model model){
	String name = movieService.getNameOfMovie(model);
	model.addAttribute(name);
	return "home";
}
@RequestMapping(value= "/genre")
public String getGenreOfMovie(Model model){
	
	return "home";
}
@RequestMapping(value = "/rating")
public String getRatingOfMovie(Model model){
	String name = movieService.getNameOfMovie(model);
	model.addAttribute(rating);
	return "home";
}
}
@RequestMapping
public String getYearOfMovie(Model model){
	
}
@RequestMapping
public String getNameOfArtist(Model model){
	String name = movieService.getNameOfMovie(model);
	model.addAttribute(name);
	return "home";
}
}
@RequestMapping
public String getCharacterOnMovie(Model model){
	
}
@RequestMapping
public String getDirectorOfMovie(Model model){
	String name = movieService.getNameOfMovie(model);
	model.addAttribute(director);
	return "home";
}
}


}
