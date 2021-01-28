package com.nnk.springboot.repositories;

import com.nnk.springboot.domain.RuleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface RuleNameRepository extends JpaRepository<RuleName, Integer> {
    @Transactional
    @Modifying
    @Query("update RuleName r set r.sqlStr=:sqlStr, r.sqlPart=:sqlPart where r.id=:id")
    void updateRuleName(@Param("id")int id,@Param("sqlStr")String sqlStr,@Param("sqlPart")String sqlPart);
}
