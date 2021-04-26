package olivecrypto.olive.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import olivecrypto.olive.domain.EmployeeProfile;

@Repository
public interface ProfileRepository extends JpaRepository < EmployeeProfile, Integer > {
    
}