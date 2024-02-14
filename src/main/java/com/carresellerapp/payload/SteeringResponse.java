package com.carresellerapp.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SteeringResponse {

    private String steering;
    private String suspension;
    private String brake;
}
