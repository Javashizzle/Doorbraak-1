import greenfoot.*;

public class DoorbraakWorld extends World {
    public DoorbraakWorld() {
        super(10, 9, 64);
        populate();
    }

    private void populate() {
        for (int x = 0; x < 10; ++x) {
            for (int y = 0; y < 3; ++y) {
                addObject(new Water(), x, y);
            }

            for (int y = 3; y < 6; ++y) {
                addObject(new Sandstone(), x, y);
            }

            for (int y = 6; y < 9; ++y) {
                addObject(new Sand(), x, y);
            }
        }
    }
}
