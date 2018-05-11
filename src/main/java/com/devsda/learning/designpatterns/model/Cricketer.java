package com.devsda.learning.designpatterns.model;

import com.devsda.learning.designpatterns.constants.Country;
import com.devsda.learning.designpatterns.constants.CricketerType;

public class Cricketer {

    private String name;
    private Country country;
    private CricketerType cricketerType;

    public Cricketer(String name, Country country, CricketerType cricketerType) {
        this.name = name;
        this.country = country;
        this.cricketerType = cricketerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public CricketerType getCricketerType() {
        return cricketerType;
    }

    public void setCricketerType(CricketerType cricketerType) {
        this.cricketerType = cricketerType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cricketer cricketer = (Cricketer) o;

        if (name != null ? !name.equals(cricketer.name) : cricketer.name != null) return false;
        if (country != cricketer.country) return false;
        return cricketerType == cricketer.cricketerType;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (cricketerType != null ? cricketerType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "name='" + name + '\'' +
                ", country=" + country +
                ", cricketerType=" + cricketerType +
                '}';
    }
}
