package br.com.furb.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.furb.hello.model.PostHelloWorld;

@Repository
public interface PostRepositoryHello extends JpaRepository<PostHelloWorld, Long> {

}