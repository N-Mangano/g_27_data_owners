package de.aittr.g_27_data_owners.repositories;

import de.aittr.g_27_data_owners.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Integer> {
}
