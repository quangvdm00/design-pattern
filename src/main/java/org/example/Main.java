package org.example;

import org.example.domain.Car;
import org.example.domain.enums.Property;

import java.util.List;
import java.util.Map;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        out.println("Constructing parts and car");

        Map<String, Object> wheelProperties = Map.of(
                Property.TYPE.toString(), "Bánh xe",
                Property.MODEL.toString(), "Yokohama",
                Property.PRICE.toString(), 200L
        );

        Map<String, Object> doorProperties = Map.of(
                Property.TYPE.toString(), "Cửa",
                Property.MODEL.toString(), "Lambo",
                Property.PRICE.toString(), 1000L
        );

        Map<String, Object> carProperties = Map.of(
                Property.MODEL.toString(), "Model A",
                Property.PRICE.toString(), 10000L,
                Property.PARTS.toString(), List.of(wheelProperties, doorProperties)
        );

        Car car = new Car(carProperties);
        car.getParts().forEach(c -> out.println(car.getModel()));
        out.println("Here is our car:");
        out.println("-> model: " + car.getModel().orElseThrow());
        out.println("-> price: " + car.getPrice().orElseThrow());
        out.println("-> parts: ");

        car.getParts().forEach(p ->
                out.printf(
                        "\nType: " + p.getType().orElse(null) +
                        "\nModel: " + p.getModel().orElse(null) +
                        "\nPrice: " + p.getPrice().orElse(null))
        );
    }
}