package de.aittr.g_27_data_owners.services;

import de.aittr.g_27_data_owners.domain.Owner;
import de.aittr.g_27_data_owners.repositories.OwnerRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

  private OwnerRepository repository;

  public OwnerService(OwnerRepository repository) {
    this.repository = repository;
  }
  public List<Owner> getAll() {
    return repository.findAll();
  }
}
