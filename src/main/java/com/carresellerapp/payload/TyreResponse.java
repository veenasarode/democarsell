package com.carresellerapp.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class TyreResponse {

    private String lhsFrontTyre;
    private String rhsFrontTyre;
    private String lhsRearTyre;
    private String rhsRearTyre;
    private String spareTyre;
}
