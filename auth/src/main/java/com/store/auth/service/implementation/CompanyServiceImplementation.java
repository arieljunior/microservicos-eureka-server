package com.store.auth.service.implementation;

import com.store.auth.domain.Company;
import com.store.auth.repository.CompanyRepository;
import com.store.auth.service.CompanyService;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImplementation extends GenericServiceImplementation<Company, Long, CompanyRepository> implements CompanyService {

    public CompanyServiceImplementation(CompanyRepository repository){
        super(repository);
    }
}
