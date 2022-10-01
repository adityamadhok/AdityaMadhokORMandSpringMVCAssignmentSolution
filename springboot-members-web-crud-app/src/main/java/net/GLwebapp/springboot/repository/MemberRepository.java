package net.GLwebapp.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.GLwebapp.springboot.Members;
@Repository
public interface MemberRepository extends JpaRepository<Members,Long >{

}
