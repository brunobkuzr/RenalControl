package br.com.furb.hello.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.furb.hello.model.PostHelloWorld;
import br.com.furb.hello.repository.PostRepositoryHello;

@Service
public class PostServiceHelloWorld {

	@Autowired
	private PostRepositoryHello repository;

	public List<PostHelloWorld> findAll() {
		return repository.findAll();
	}

	public PostHelloWorld findOne(Long id) {
		return repository.findById(id).get();
	}

	public PostHelloWorld save(PostHelloWorld postHelloWorld) {
		return repository.saveAndFlush(postHelloWorld);
	}

	public void delete(PostHelloWorld id) {
		repository.delete(id);
	}
}