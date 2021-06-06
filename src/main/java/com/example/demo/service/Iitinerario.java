package com.example.demo.service;



import com.example.demo.model.Itinerario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Iitinerario extends JpaRepository<Itinerario, Integer>{
    
    /**spring es tan inteligente que llamando la funcion
     * junto con el campo, ejecuta el sql personalizado.
     * eje
     * findByOrigen(String origen); nombre de la funcion, mas este campo u otro
     * de la clase Itinerario, se podra leer todos los datos considerando
     * el campo.
     * En este caso, va a traer todos los itinerarios que contengan
     * dicho campo.
     */

    @Query(value = "SELECT * FROM itinerario a WHERE a.id=?1", nativeQuery = true)
    Itinerario findItinerarioById(int id);



}
