package guru.springframework.sftpetclinic.services;


import java.util.Set;

public interface CrudService <I,ID> {
    I findById(ID id);
    Set<I> findAll();
    I save(I pet);
    void delete(I object);
    void deleteById(ID id);
}
