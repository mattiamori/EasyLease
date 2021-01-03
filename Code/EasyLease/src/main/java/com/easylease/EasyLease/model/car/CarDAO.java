package com.easylease.EasyLease.model.car;

import java.sql.SQLException;
import java.util.List;

/* this interface is used for the communication
* whit the DataBase*/
public interface CarDAO {

    /**
     * This method retrieve a Car by his ID.
     *
     * @param id The Car ID to search for in the database.
     * @return The Car with the corresponding ID.
     */
    Car retriveById(String id) throws SQLException;
    /**
     * This method retrieve a Car by his model.
     *
     * @param model The Car model to search for in the database.
     * @return The Car with the corresponding model.
     */
    Car retriveByModel(String model) throws SQLException;
    /**
     * This method retrieve a list of Cars by their brand.
     *
     * @param brand The Car brand to search for in the database.
     * @return The list of Car with the corresponding brand.
     */
    List<Car> retriveByBrand(String brand) throws SQLException;
    /**
     * This method retrieve a list of Cars by their car's typology.
     *
     * @param car_type The Car typology to search for in the database.
     * @return The list of Car with the corresponding car typology.
     */
    List<Car> retriveByType(String car_type) throws SQLException;
    /**
     * This method retrieve all the Car in the DB.
     *
     * @return A List containing all the Car in the DB.
     */
    List<Car> retriveAll() throws SQLException;
    /**
     * This method update the parameters od an existing Car into the DB.
     *
     * @param car The new Car object containing new parameters to update into the DB.
     */
    void update(Car car) throws SQLException;
    /**
     * This method delete a Car from the DB.
     *
     * @param car The Car which has to be deleted from the DB.
     */
    void delete(Car car) throws SQLException;
    /**
     * This method insert in the DB a new Car.
     *
     * @param car The new Car which must be inserted into the DB.
     */
    void insert(Car car) throws SQLException;
}
