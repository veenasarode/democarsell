package com.carresellerapp.payload;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class StructureResponse {

    private String leftPillar;
    private String rightPillar;
    private String leftApron;
    private String rightApron;
    private String leftApronLeg;
    private String rightApronLeg;
    private String bootFloor;
    private String cowlTop;
}
