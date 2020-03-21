
package it.univaq.disim.numismatic.userservice.controller.model;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class CityType {

    @NotEmpty
    @NotNull
    private String name;
    private Double lat;
    private Double lng;

}
