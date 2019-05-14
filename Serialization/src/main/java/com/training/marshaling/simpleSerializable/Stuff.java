package com.training.marshaling.simpleSerializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public abstract class Stuff implements Serializable {

    private Long id;

//    public Stuff(Long id) {
//        this.id = id;
//    }

}
