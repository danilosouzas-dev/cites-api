package com.github.danilosouzasdev.citesapi.countries.repository;

import com.github.danilosouzasdev.citesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface countryRepository extends JpaRepository<Country, Long> {
}
