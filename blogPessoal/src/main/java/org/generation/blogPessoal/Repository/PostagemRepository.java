package org.generation.blogPessoal.Repository;

import java.util.List;

import org.generation.blogPessoal.Model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem,Long>{
	//findAllBy busca tudo  que contem dentro da variável titulo
	//IgnoreCase converte o texto para minisculo indepente da forma inserida
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
	
	

}
