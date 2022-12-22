package com.spectro.spectro.repository;

import com.spectro.spectro.entity.BasketEntity;
import com.spectro.spectro.entity.UserEntity;
import com.spectro.spectro.enums.ProductType;
import com.spectro.spectro.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BasketRepo extends CrudRepository<BasketEntity,Long> {
    Optional<BasketEntity> findById(Long id);
    BasketEntity findByModelAndProductIdAndTypeAndUser(String model, Long productId, ProductType type, UserEntity user);
    List<BasketEntity> findAllByUser(UserEntity user);

}
