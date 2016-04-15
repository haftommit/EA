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
 private MovieService<T> movieserive = new MovieService<T>();
@RequestMapping
	public String MovieHome(){
		
		return "home";
	}
@RequestMapping("/name")
public String getNameOfMovie(Model model){
	String name = movieService.getNameOfMovie(model);
	model.addAttribute(name);
	return "name";
}
@RequestMapping("genre")
public String getGenreOfMovie(Model model){
	
	movieserive.getClass().getSimpleName().
	
}
@RequestMapping
public String getRatingOfMovie(){
	
}
@RequestMapping
public String getYearOfMovie(){
	
}
@RequestMapping
public String getNameOfArtist(){
	
}
@RequestMapping
public String getCharacterOnMovie(){
	
}
@RequestMapping
public String getDirectorOfMovie(){
	
}

}
