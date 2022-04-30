package com.camerapp.repository;


import com.camerapp.model.Camera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICameraRepository extends JpaRepository<Camera,Integer> {

    List<Camera>findAll();
    List<Camera> findByBrandAndPrice(String brand, double price);
    List<Camera>findByLensType(String lensType);
    List<Camera>findByCameraType(String cameraType);
    List<Camera>findByPrice(double price);
    Camera findById(int cameraId);

}
