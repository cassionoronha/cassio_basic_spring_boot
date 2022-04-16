package br.com.cassio.poc01.repository;

import br.com.cassio.poc01.model.UserSistema;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "usuario", collectionResourceRel = "usuarios")
public interface UserRepository extends PagingAndSortingRepository<UserSistema, Long> {
    List<UserSistema> findByUsername(String name);
}
