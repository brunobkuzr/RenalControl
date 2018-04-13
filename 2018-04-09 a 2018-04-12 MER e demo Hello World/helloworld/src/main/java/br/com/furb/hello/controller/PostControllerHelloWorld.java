package br.com.furb.hello.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.furb.hello.model.PostHelloWorld;
import br.com.furb.hello.service.PostServiceHelloWorld;

@Controller
public class PostControllerHelloWorld {

	@Autowired
	// A anotação @Autowired avisa ao Spring Framework para injetar uma instância de alguma implementação
	private PostServiceHelloWorld service;

	@GetMapping("/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("/post");
		mv.addObject("posts", service.findAll());

		return mv;
	}

	@GetMapping("/add")
	public ModelAndView add(PostHelloWorld postHelloWorld) {

		ModelAndView mv = new ModelAndView("/postAdd");
		mv.addObject("post", postHelloWorld);

		return mv;
	}

	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {

		return add(service.findOne(id));
	}

	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") PostHelloWorld id) {

		service.delete(id);

		return findAll();
	}

	@PostMapping("/save")
	public ModelAndView save(@Valid PostHelloWorld postHelloWorld, BindingResult result) {

		if (result.hasErrors()) {
			return add(postHelloWorld);
		}

		service.save(postHelloWorld);

		return findAll();
	}
}