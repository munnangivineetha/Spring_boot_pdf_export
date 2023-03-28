package in.vini.repository;

import org.springframework.data.repository.CrudRepository;

import in.vini.entity.PlayerEntity;

public interface PlayerRepository extends CrudRepository<PlayerEntity, Integer> {

}
