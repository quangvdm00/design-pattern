package org.example.domain;

import org.example.Document;
import org.example.domain.enums.Property;

import java.util.stream.Stream;

public interface HasParts extends Document {
    default Stream<Part> getParts() {
        return children(Property.PARTS.toString(), Part::new);
    }
}
