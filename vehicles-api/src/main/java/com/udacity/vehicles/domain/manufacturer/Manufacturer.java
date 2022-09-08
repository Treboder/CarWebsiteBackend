package com.udacity.vehicles.domain.manufacturer;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Declares class to hold car manufacturer information.
 */
@Entity
public class Manufacturer {

    @Id
    private Integer code;
    private String name;

    public Manufacturer() { }

    public Manufacturer(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manufacturer)) return false;
        Manufacturer that = (Manufacturer) o;
        boolean isEqual = Objects.equals(code, that.code) && Objects.equals(name, that.name);
        return isEqual;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }
}
