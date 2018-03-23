package com.zeroexception.lombok_demo.model;

import lombok.*;

/**
 * @author Viet Quoc Tran
 * on 3/22/18.
 * www.zeroexception.com
 */


@Builder
//@NoArgsConstructor
@Data
public class Person {

//    @Getter @Setter
    private Long id;
//    @Getter @Setter
    private String name;

    public int hashCode() {
        return 10;
    }

}
