import ajframe.AJFrame;
import ajframe.components.Component;
import ajframe.components.Test;
import math.ajvector.PVector;

public class Main {

    public static void main(String[] args) {

        AJFrame ajFrame = new AJFrame(new PVector(1200, 800));
        ajFrame.add(new Test(new PVector(ajFrame.getSize().getPX().multiply(0.5), ajFrame.getSize().getPY().subtract(100)), new PVector(50, 50)));

    }

}
