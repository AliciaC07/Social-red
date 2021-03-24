package edu.socialnet.servicios;

import edu.socialnet.modelos.Usuario;
import edu.socialnet.repositorios.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario buscarUsuarioPorNombreUsuario(String nombreUsuario) {
        return usuarioRepository.findUsuarioByNombreUsuario(nombreUsuario);
    }

    public Usuario buscarUsuarioPorId(Long id) {
        return usuarioRepository.findUsuarioById(id);
    }

    public List<Usuario> getAll() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public void salvar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
