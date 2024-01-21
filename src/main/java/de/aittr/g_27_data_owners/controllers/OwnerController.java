package de.aittr.g_27_data_owners.controllers;

import de.aittr.g_27_data_owners.domain.Owner;
import de.aittr.g_27_data_owners.services.OwnerService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owners")
public class OwnerController {

  private OwnerService service;

  public OwnerController(OwnerService service) {
    this.service = service;
  }
  @GetMapping
  public List<Owner> getAll() {
    return service.getAll();
  }
}
