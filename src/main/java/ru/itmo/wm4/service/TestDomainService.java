package ru.itmo.wm4.service;

import org.springframework.stereotype.Service;
import ru.itmo.wm4.domain.TestDomain;
import ru.itmo.wm4.repository.TestDomainRepository;

@Service
public class TestDomainService {

    public TestDomainService(TestDomainRepository testDomainRepository) {
        this.testDomainRepository = testDomainRepository;
    }

    private final TestDomainRepository testDomainRepository;

    public void save(TestDomain domain) {
        testDomainRepository.save(domain);
    }

}
