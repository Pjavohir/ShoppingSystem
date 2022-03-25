package uz.master.warehouse.services.products;

import org.springframework.stereotype.Service;
import uz.master.warehouse.dto.wareHouseProducts.WareHouseProductsCreateDto;
import uz.master.warehouse.dto.wareHouseProducts.WareHouseProductsDto;
import uz.master.warehouse.dto.wareHouseProducts.WareHouseProductsUpdateDto;
import uz.master.warehouse.entity.WareHouseProducts;
import uz.master.warehouse.mapper.products.WareHouseProductsMapper;
import uz.master.warehouse.repository.products.WareHouseProductsRepository;
import uz.master.warehouse.services.AbstractService;
import uz.master.warehouse.services.GenericCrudService;
import uz.master.warehouse.validator.products.WareHouseProductsValidator;

import java.util.List;

@Service
public class WareHouseProductsService    extends AbstractService<WareHouseProductsRepository, WareHouseProductsMapper, WareHouseProductsValidator>
        implements GenericCrudService<WareHouseProducts, WareHouseProductsDto, WareHouseProductsCreateDto, WareHouseProductsUpdateDto, Long> {

    public WareHouseProductsService(WareHouseProductsRepository repository, WareHouseProductsMapper mapper, WareHouseProductsValidator validator) {
        super(repository, mapper, validator);
    }

    @Override
    public Long create(WareHouseProductsCreateDto createDto) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public Void update(WareHouseProductsUpdateDto updateDto) {
        return null;
    }

    @Override
    public List<WareHouseProductsDto> getAll() {
        return null;
    }

    @Override
    public WareHouseProductsDto get(Long id) {
        return null;
    }
}