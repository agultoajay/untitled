package dev.gold.untitled.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeTypeRepository extends JpaRepository<IncomeType, Long>{

}
