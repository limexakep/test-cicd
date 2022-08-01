package equ.phoenix.simplejpa.repository;

import equ.phoenix.simplejpa.entity.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
    ClientEntity getClientEntityByEmail(String email);
}
