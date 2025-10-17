package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList{
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *    This is a candidate city to add
     */
    public void add(City city){
        if (cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *   Return the sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This returns true if the list has the specific city object based on hashcode
     * @param city
     *   This is the city object being checked
     * @return
     *   Returns true if the list has the city and false if not
     */
    public boolean hasCity(City city){
        for (City i : cities) {
            if(i.hashCode() == city.hashCode()){
                return true;
            }
        }
        return false;
    }

    /**
     * Remove the city from the list if the list has the city
     * @param city
     *   City that is being removed
     */
    public void delete(City city){
        if (!cities.remove(city)) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * This returns the size of the list
     * @return
     *   Return the size of the list
     */
    public int countCities(){
        return cities.size();
    }
}
