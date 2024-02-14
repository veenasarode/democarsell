package com.carresellerapp.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class CarDocumentResponse {

    private String rc_Availability;
    private String mismatch_In_Rc;
    private String rto_Noc_Issued;
    private String insurance_type;
    private String under_Hypothecation;
    private String road_Tax_payment;
    private String partipeshi_Request;
    private String duplicateKey;
    private String chasisNumberEmbossing;
}
