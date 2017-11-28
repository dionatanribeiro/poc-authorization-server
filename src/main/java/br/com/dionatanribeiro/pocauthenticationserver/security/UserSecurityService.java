package br.com.dionatanribeiro.pocauthenticationserver.security;

import br.com.dionatanribeiro.pocauthenticationserver.model.Role;
import br.com.dionatanribeiro.pocauthenticationserver.model.Usuario;
import br.com.dionatanribeiro.pocauthenticationserver.model.UsuarioRole;
import br.com.dionatanribeiro.pocauthenticationserver.repository.UsuarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UserSecurityService implements UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(UserSecurityService.class);

    @Autowired
    private UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = repository.findByUsername(username);

        if (null == usuario) {
            logger.warn("Username {} não encontrado", username);
            throw new UsernameNotFoundException("Username " + username + " não encontrado");
        }

        return usuario;
    }

}
