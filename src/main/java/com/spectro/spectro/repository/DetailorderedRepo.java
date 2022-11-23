package com.spectro.spectro.repository;

import com.spectro.spectro.entity.DetailorderedEntity;
import org.springframework.data.repository.CrudRepository;

public interface DetailorderedRepo extends CrudRepository<DetailorderedEntity, Long> {
    DetailorderedEntity findByDetail(String detail);
    DetailorderedEntity findByAmount(String amount);
}