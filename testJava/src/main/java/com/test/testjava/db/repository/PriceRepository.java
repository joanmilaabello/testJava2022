package com.test.testjava.db.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.testjava.db.entity.PriceEntity;
import com.test.testjava.dto.PriceFilterDTO;

@Repository
public interface PriceRepository extends CrudRepository<PriceEntity, BigInteger> {

    @Query("SELECT p "
        + "FROM PriceEntity p "
        + "WHERE p.productId = :#{#request.productId} "
        + "AND p.brandId = :#{#request.brandId} "
        + "AND COALESCE(:#{#request.date}, CURRENT_TIMESTAMP) BETWEEN p.startDate AND p.endDate "
        + "ORDER BY p.priority DESC")
    List<PriceEntity> check(@Param("request") PriceFilterDTO request,
                            Pageable pageable);
}
