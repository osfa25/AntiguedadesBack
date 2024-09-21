package com.example.antiguedades.aplication;

import java.util.List;
import java.util.Optional;

import com.example.antiguedades.domain.RankingAntiguedad;

public interface IRankingAntiguedad {
     Optional<RankingAntiguedad> findById(Long id);
    List<RankingAntiguedad> getAll();
    RankingAntiguedad save(RankingAntiguedad rankingAntiguedad);
    RankingAntiguedad update(Long id, RankingAntiguedad rankingAntiguedad);
    void deleteById(Long id);
}
