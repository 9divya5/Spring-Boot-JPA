package io.javabrains.springbootstarter.SpringJPASample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/demo")
public class MainController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/all")
	public Iterable<User> getAllUser()
	{
		return userRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/add")
	public String addNewUser(@RequestBody User user)
	{
		userRepository.save(user);
		return "Saved";
	}
	
	

}
