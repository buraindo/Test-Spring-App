package ru.itmo.wm4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itmo.wm4.domain.TestDomain;

public interface TestDomainRepository extends JpaRepository<TestDomain, Long> {
}
