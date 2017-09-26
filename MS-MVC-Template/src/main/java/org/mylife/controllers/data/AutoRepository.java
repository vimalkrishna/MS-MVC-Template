package org.mylife.controllers.data;

import org.mylife.domain.Auto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoRepository extends JpaRepository<Auto, Long>{
// Spring Data will dynamically generate CRUD methods
}
