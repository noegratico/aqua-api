package com.auqaapi.aquaapi.Repository;

import com.auqaapi.aquaapi.Model.AquaUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AquaUserRepository extends JpaRepository<AquaUser, Long >{

    Optional <AquaUser> findByUsername(String username);
}
