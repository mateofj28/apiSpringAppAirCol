package com.example.demo.service;


import java.util.List;

import com.example.demo.model.DetalleSillaVuelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleSillaVuelo extends JpaRepository<DetalleSillaVuelo, Integer> {

    /**los nombres en la consulta son respecto a la bd  */

    @Query(value = "SELECT * FROM detalle_silla_vuelo a WHERE a.vuelo_id=?1", nativeQuery = true)
    List<DetalleSillaVuelo> findDetalleSillaVueloBySilla(int silla);

}