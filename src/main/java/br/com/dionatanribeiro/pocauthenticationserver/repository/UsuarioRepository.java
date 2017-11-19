package br.com.dionatanribeiro.pocauthenticationserver.repository;

import br.com.dionatanribeiro.pocauthenticationserver.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
