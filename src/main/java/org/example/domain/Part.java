package org.example.domain;

import org.example.AbstractDocument;

import java.util.Map;

public class Part extends AbstractDocument implements HasModel, HasPrice, HasType {
    protected Part(Map<String, Object> properties) {
        super(properties);
    }
}
