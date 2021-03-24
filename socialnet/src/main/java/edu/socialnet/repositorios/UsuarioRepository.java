package edu.socialnet.repositorios;

import edu.socialnet.modelos.Usuario;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UsuarioRepository extends Neo4jRepository<Usuario, Long> {

    Usuario findUsuarioByNombreUsuario(String nombreUsuario);

    Usuario findUsuarioById(Long id);
}
