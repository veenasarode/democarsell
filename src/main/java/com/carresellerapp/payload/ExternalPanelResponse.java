package com.carresellerapp.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ExternalPanelResponse {

    private String bonnet;
    private String roof;
    private String dickyDoor;
    private String leftDoorFront;
    private String leftDoorRear;
    private String rightFender;
    private String leftQuarterPanel;
    private String rightQuarterPanel;
}
