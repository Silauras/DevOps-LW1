package edu.khai.devopslw1.controller.service.repository;

import edu.khai.devopslw1.controller.service.repository.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
