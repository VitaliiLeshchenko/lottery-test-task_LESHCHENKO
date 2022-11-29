package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        ColorEnum[] values = ColorEnum.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex].name();
    }
}