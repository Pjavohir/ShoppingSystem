package uz.master.warehouse.services.clientBar;


import org.springframework.stereotype.Service;
import uz.master.warehouse.validator.clientBar.ClientBarValidator;
import uz.master.warehouse.dto.clientBar.ClientBarCreateDto;
import uz.master.warehouse.dto.clientBar.ClientBarDto;
import uz.master.warehouse.dto.clientBar.ClientBarUpdateDto;
import uz.master.warehouse.entity.clientBar.ClientBar;
import uz.master.warehouse.mapper.clientBar.ClientBarMapper;
import uz.master.warehouse.repository.clientBar.ClientBarRepository;
import uz.master.warehouse.services.AbstractService;
import uz.master.warehouse.services.GenericCrudService;

import java.util.List;

@Service
public class ClientBarService extends AbstractService<ClientBarRepository, ClientBarMapper, ClientBarValidator> implements GenericCrudService<ClientBar, ClientBarDto, ClientBarCreateDto, ClientBarUpdateDto, Long> {

    public ClientBarService(ClientBarRepository repository, ClientBarMapper mapper, ClientBarValidator validator) {
        super(repository, mapper, validator);
    }


    @Override
    public Long create(ClientBarCreateDto createDto) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public Void update(ClientBarUpdateDto updateDto) {
        repository.save(mapper.fromUpdateDto(updateDto));
        return null;
    }

    @Override
    public List<ClientBarDto> getAll() {
        return null;/*mapper.toDto(repository.findAllByTakenFalse());*/
    }

    @Override
    public ClientBarDto get(Long id) {
        return  null ;/*mapper.toDto(repository.findByIdAndTakenFalse(id))*/
    }
}
