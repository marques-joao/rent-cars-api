package br.gov.sp.fatec.service.impl;

import br.gov.sp.fatec.domain.mapper.CarroMapper;
import br.gov.sp.fatec.domain.request.CarroRequest;
import br.gov.sp.fatec.domain.request.CarroUpdateRequest;
import br.gov.sp.fatec.domain.response.CarroResponse;
import br.gov.sp.fatec.repository.CarroRepository;
import br.gov.sp.fatec.service.CarroService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarroServiceImpl implements CarroService {

    private final CarroRepository carroRepository;
    private final CarroMapper carroMapper;

    @Override
    public CarroResponse save(CarroRequest carroRequest) {
        return null;
    }

    @Override
    public CarroResponse findById(Long id) {
        return null;
    }

    @Override
    public List<CarroResponse> findAll() {
        return List.of();
    }

    @Override
    public void updateById(Long id, CarroUpdateRequest carroUpdateRequest) {}

    @Override
    public void deleteById(Long id) {}

}