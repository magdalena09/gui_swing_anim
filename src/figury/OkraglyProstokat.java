package figury;

import java.awt.*;
import java.awt.geom.*;
import java.util.Random;

public class OkraglyProstokat extends Figura{
    Random random = new Random();
    public OkraglyProstokat(Graphics2D buf, int del, int w, int h) {
        super(buf, del, w, h);
        shape = new RoundRectangle2D.Double(0, 0, random.nextInt(30), random.nextInt(30), 5, 5);
        aft = new AffineTransform();
        area = new Area(shape);
    }
}