package br.com.furb.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		
		//@Component 	
			//Anotação genérica para qualquer componente gerenciado pelo Spring. 
			//Esta anotação faz com que o bean registrado no Spring possa ser utilizado em qualquer bean, 
			//seja ele um serviço, um DAO, um controller, etc. 
		
		//@Repository 	
			//Anotação que serve para definir uma classe como pertencente à camada de persistência.
		
		//@Service 	
			//Anotação que serve para definir uma classe como pertencente à camada de Serviço da aplicação.
		
		//@Autowired
			//A anotação @ Autowired fornece controle sobre onde e como a ligação entre os beans deve ser realizada. 
			//Pode ser usado para em métodos setter, no construtor, em uma propriedade ou métodos com nomes arbitrários 
			// e/ ou vários argumentos.
		
		//@Thymeleaf 
			//adiciona às estruturas do HTML são iniciadas pelo prefixo th, como os comandos comentados na sequência
				//th:each: Percorre uma coleção de objetos enviada pelo controller.
				//th:if: Habilita e desabilita controles do HTML de acordo com a condição recebida.
				//th:object: Define o objeto que o controller irá receber e enviar por meio de um formulário.
				//th:field: Faz bind dos atributos do objeto do formulário com os inputs.

	}
}
