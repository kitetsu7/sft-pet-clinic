package guru.springframework.sftpetclinic.services;

import guru.springframework.sftpetclinic.model.Pet;

import java.util.Set;

public interface PerService {
    Pet findById(Long id);
    Set<Pet> findAll();
    Pet save(Pet pet);
}
