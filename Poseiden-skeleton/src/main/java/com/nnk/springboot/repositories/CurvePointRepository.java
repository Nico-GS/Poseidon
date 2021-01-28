package com.nnk.springboot.repositories;

import com.nnk.springboot.domain.CurvePoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CurvePointRepository extends JpaRepository<CurvePoint, Integer> {

    @Transactional
    @Modifying
    @Query("update CurvePoint u set u.term=:term, u.value=:value where u.id=:id")
    void updateCurvePoint(@Param("id")int id,@Param("term") double term,@Param("value") double value);
}
