package br.com.cassio.poc01.repository;

import br.com.cassio.poc01.model.UserSistema;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "usuario", collectionResourceRel = "usuarios")
public interface UserRepository extends MongoRepository<UserSistema, String> {
    List<UserSistema> findByUsername(@Param("name") String name);
}
