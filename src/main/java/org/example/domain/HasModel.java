package org.example.domain;

import org.example.Document;
import org.example.domain.enums.Property;

import java.util.Optional;

public interface HasModel extends Document {
    default Optional<String> getModel() {
        return Optional.ofNullable((String) get(Property.MODEL.toString()));
    }
}
