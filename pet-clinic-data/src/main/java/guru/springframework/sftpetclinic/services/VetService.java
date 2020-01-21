package guru.springframework.sftpetclinic.services;

import guru.springframework.sftpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Set<Vet> findAll();
    Vet save(Vet vet);
}
