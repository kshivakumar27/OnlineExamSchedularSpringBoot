package net.codejava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.DAO.CheckoutRepository;
import net.codejava.DAO.ExamRepository;
import net.codejava.DAO.ScheduleRepository;
import net.codejava.DAO.UpdateExam;
import net.codejava.DAO.UserRepository;
import net.codejava.DAO.listexamRepository;
import net.codejava.model.Checkout;
import net.codejava.model.Exam;
import net.codejava.model.Shedule;
import net.codejava.model.User;
import net.codejava.model.listofexam;
import net.codejava.service.Updateservice;

@RestController
public class AppController {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private CheckoutRepository CheckoutRepo;
	
	@Autowired
	private UpdateExam UpdateRepo;
	
	
	@Autowired
	private ExamRepository ExamRepo;
	

	@Autowired
	private listexamRepository liRepo;
	
	
	@Autowired
	private ScheduleRepository 	viRepo;

	
	
	
	@GetMapping("")
	public ModelAndView viewHomePage() {
		return new ModelAndView ("index") ;
	}
	
	@GetMapping("/register")
	public ModelAndView showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		
		return new ModelAndView ("signup_form");
	}
	
	@PostMapping("/process_register")
	public ModelAndView processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
 String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		userRepo.save(user);
		
		return new ModelAndView( "register_success");
	}
	
	@GetMapping("/users")
	public ModelAndView view() {
		
		
		return new ModelAndView("Homepage");
	}
	@GetMapping("/Homepage")
	public ModelAndView view4() {
		
		
		return new ModelAndView("Homepage");
	}

	@GetMapping("/user")
	public ModelAndView listUsers(Model model) {
		List<User> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);
		
		return new ModelAndView("user");	}
	
	
	
	@GetMapping("/Checkout")
	public ModelAndView view1() {
		
		
		return new ModelAndView("Checkout");
	}
	
	
	@PostMapping("/Checkout1")
	public ModelAndView checkoutform(Checkout Checkout) {
	
		CheckoutRepo.save(Checkout);
		return new ModelAndView("Success");
	}
	
	@GetMapping("/java")
	public ModelAndView view2() {
		
		
		return new ModelAndView("java");
	}
	
	@GetMapping("/c++")
	public ModelAndView view3() {
		
		
		return new ModelAndView("c++");
	}
	@GetMapping("/phps")
	public ModelAndView view5() {
		
		
		return new ModelAndView("phps");
	}
	@GetMapping("/springboot")
	public ModelAndView view6() {
		
		
		return new ModelAndView("springboot");
	}

	@GetMapping("/java1")
		public ModelAndView view7() {
			return new ModelAndView("java1");
		}
	@GetMapping("/SQL")
	public ModelAndView view8() {
		
		
		return new ModelAndView("SQL");
	}
	@GetMapping("/springboot1")
	public ModelAndView view9() {
		
		
		return new ModelAndView("springboot1");
	}
	@GetMapping("/BootStrap")
	public ModelAndView view10() {
		
		
		return new ModelAndView("BootStrap");
	}
	
	
	
	@GetMapping("/Exam")
	public ModelAndView view11() {
		
		
		return new ModelAndView("exam");
	}
	
	@PostMapping("/Exam1")
	public ModelAndView examform(Exam exam) {
	
		ExamRepo.save(exam);
		return new ModelAndView("Success1");
	}
	
	@GetMapping("/Score")
	public ModelAndView view13() {
		
		
		return new ModelAndView("Score");
	}
	
	
	@GetMapping("/listofexam")
	public ModelAndView listexam(Model model) {
		List<listofexam> listexam = liRepo.findAll();
		model.addAttribute("listexam", listexam);
		
		return new ModelAndView("listofexam");	
		}
	
	
	@PostMapping("/exam_register")
	public ModelAndView examRegister(listofexam li) {
		
		liRepo.save(li);
		
		return new ModelAndView("Success");
	}
	

	@GetMapping("/Addlistexam")
	public ModelAndView view15() {
	
		
		return new ModelAndView("Addlistexam");	
		
		}
	@GetMapping("/javadetail")
	public ModelAndView view16() {
		
		
		return new ModelAndView("javadetail");
	}
	
	 @PutMapping("/edit/{examcode}")
     public ModelAndView showEditProductPage(@PathVariable(name = "examcode") long examcode) {
         ModelAndView mav = new ModelAndView("edit_product");
         listofexam lie = ((Updateservice) UpdateRepo).get(examcode);
         mav.addObject("listofexam", lie);
          
         return mav;
     }
     
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
     public ModelAndView saveProduct(@ModelAttribute("product") listofexam lie) {
		 UpdateRepo.save(lie);
          
         return new ModelAndView("redirect:/listofexam");
     }

	 @GetMapping("/Updatedetails")
		public ModelAndView view18() {
		
			
			return new ModelAndView("Updatedetails");	
			}
	
	 
	 
	 
	 
	 
	 
	 @GetMapping("/schedule")
	 
		public ModelAndView view20() {
			return new ModelAndView("schedule");
		}
	 
	 @GetMapping("/Viewschedule")
public ModelAndView viewschedule(Shedule sc) {
		
		viRepo.save(sc);
		
		return new ModelAndView("Success");	
		
		}
 
	 
	 
	
	 
		@GetMapping("/ViewSchedule")
		public ModelAndView ViewSchedule(Model model) {
			List<Shedule> ViewSchedule = viRepo.findAll();
			model.addAttribute("ViewSchedule", ViewSchedule);
			
			return new ModelAndView("ViewSchedule");	
			}
		
	
 
}
