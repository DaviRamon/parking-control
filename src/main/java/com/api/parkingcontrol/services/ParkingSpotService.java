package com.api.parkingcontrol.services;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;
 //import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {
    // sempre que ouver transações com o banco, o controller aciona o service que aciona o repository.

    // ponto de injeção -> aqui serão injetadas as dependências. @Autowired -> virou o contrutor da classe.
    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
}
