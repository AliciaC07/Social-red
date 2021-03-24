package edu.socialnet.servicios;

import edu.socialnet.modelos.MyUserDetails;
import edu.socialnet.repositorios.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    UsuarioRepository repositorioUsuario;

    public MyUserDetailsService(UsuarioRepository repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new MyUserDetails(repositorioUsuario.findUsuarioByNombreUsuario(username));
    }
}
