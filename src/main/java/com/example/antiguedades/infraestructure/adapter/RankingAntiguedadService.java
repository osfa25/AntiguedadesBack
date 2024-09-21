package com.example.antiguedades.infraestructure.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.antiguedades.domain.RankingAntiguedad;
import com.example.antiguedades.infraestructure.repository.RankingAntiguedadRepository;

@Service
public class RankingAntiguedadService {
    
    @Autowired
    private RankingAntiguedadRepository rankingAntiguedadRepository;

    public Optional<RankingAntiguedad> findById(Long id) {
        return rankingAntiguedadRepository.findById(id);
    }

    public List<RankingAntiguedad> getAll() {
        return rankingAntiguedadRepository.findAll();
    }

    public RankingAntiguedad save(RankingAntiguedad rankingAntiguedad) {
        return rankingAntiguedadRepository.save(rankingAntiguedad);
    }

    public RankingAntiguedad update(Long id, RankingAntiguedad rankingAntiguedad) {
        return rankingAntiguedadRepository.findById(id)
            .map(existingRanking -> {
                existingRanking.setNombre(rankingAntiguedad.getNombre());
                existingRanking.setAntiguedad(rankingAntiguedad.getAntiguedad());
                return rankingAntiguedadRepository.save(existingRanking);
            })
            .orElse(null);
    }

    public void deleteById(Long id) {
        rankingAntiguedadRepository.deleteById(id);
    }
}
