package com.training.marshaling.jaxb;


import javax.xml.bind.annotation.XmlAttribute;

public abstract class StuffJAXB {
    private Long id;

    public StuffJAXB() {
    }

    public StuffJAXB(Long id) {
        this.id = id;
    }
}
