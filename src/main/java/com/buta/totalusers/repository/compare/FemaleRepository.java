package com.buta.totalusers.repository.compare;

import com.buta.totalusers.data.alltables.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FemaleRepository extends JpaRepository<User,Integer> {
    @Query(value = "select count(u.gender_id) from users u where u.gender_id =2",nativeQuery = true)
    Integer findFemaleUsers();
}
