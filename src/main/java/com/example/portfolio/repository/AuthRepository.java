
package com.example.portfolio.repository;

import com.example.portfolio.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<User, Long>{
    //Metodo que trae lista de emails desde BD 
    List<User> findByEmailAndIsEnabledTrue(String email);
}
