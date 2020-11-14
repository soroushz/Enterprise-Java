// there are three ways to do the injection to our repository.
package ca.sheridancollege.soroushz.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.soroushz.Beans.Course;
import ca.sheridancollege.soroushz.Repositories.CourseList;

@Controller
public class CourseController {

	//this is the third way through the field, its not recommanded.
	//@Autowired
	private CourseList cl;
	
	
	
// we can use this to inject to ou repository 
//	wiht the help of the construcotr 
//	public CourseController(CourseList cl) {
//		super();
//		this.cl = cl;
//	}

	@GetMapping("/")
	public String index(Model model) {
		System.out.println("clearing the list");
		cl.emptyList();
		
		return "index";
	}

// we can also inject to our repository using setter.	
	@Autowired 
	public void setCl(CourseList cl) {
		this.cl = cl;
	}

	@PostMapping("/Fpost")
	public String formPr(@RequestParam Long id, 
					     @RequestParam String prefix,
					     @RequestParam int code,
					     @RequestParam String name) {
		
		
//		Course c = new Course(id, prefix, code, name);
//		
//		cl.getCourseList().add(c);
//		
//		System.out.println("***");
//	we wnat to use builder pattern instead of the constuctor call	
		
		
	
//		
		for(Course a : cl.getCourseList()) {
			System.out.println(a);
		}
		
		return "index";
		
	}
	
	
}
