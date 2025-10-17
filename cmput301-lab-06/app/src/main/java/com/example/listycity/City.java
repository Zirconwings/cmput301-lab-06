package com.example.listycity;

/**
 * This is a class that defines a City
 */
public class City implements Comparable {
    private String city;
    private String province;

    /**
     * This is the constructor for the City Class
     * @param city
     *   This is the string for the name of the city
     * @param province
     *   This is the string for the name of the province
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city
     * @return
     *   Return city name
     */
    public String getCityName(){
        return this.city;
    }

    /**
     * Returns the name of the province
     * @return
     *   Return province name
     */
    public String getProvinceName(){
        return this.province;
    }

    /**
     * Checks whether two cities have the same name and returns the result
     * @param o
     *   The city being compared
     * @return
     *   The result of the comparison
     */
    @Override
    public int compareTo(Object o){
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }
}
