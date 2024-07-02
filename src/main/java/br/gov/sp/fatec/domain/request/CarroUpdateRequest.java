package br.gov.sp.fatec.domain.request;

import br.gov.sp.fatec.domain.enums.CarroStatus;

public record CarroUpdateRequest(String marca, String modelo, int ano, CarroStatus status) {}