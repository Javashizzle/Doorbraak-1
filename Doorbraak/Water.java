import greenfoot.*;
import javax.swing.*;

public class Water extends Actor {
    public Water() {
        getImage().scale(64, 64);
    }

    @Override
    public void act() {
        if (Math.random() < 0.9) return;

        int dx = 0, dy = 0;
        switch ((int)(3.0 * Math.random())) {
            case 0: dx = 0; dy = 1; break;
            case 1: dx = 1; dy = 0; break;
            case 2: dx = -1; dy = 0; break;
        }

        Actor sandstone = getOneObjectAtOffset(dx, dy, Sandstone.class);
        if (sandstone != null) {
            getWorld().removeObject(sandstone);
            getWorld().addObject(new Water(), getX() + dx, getY() + dy);
        }

        Actor sand = getOneObjectAtOffset(0, 1, Sand.class);
        if (sand != null) {
            Greenfoot.stop();
            JOptionPane.showMessageDialog(null, "Crap.");
            return;
        }
    }
}
