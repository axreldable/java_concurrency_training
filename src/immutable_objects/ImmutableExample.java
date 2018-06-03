package immutable_objects;

public class ImmutableExample {
    public static void main(String[] args) {
        SynchronizedRGB color = new SynchronizedRGB(0, 0, 0, "Pitch Black");

        synchronized (color) {
            int myColorInt = color.getRGB();
            String myColorName = color.getName();
        }

        ImmutableRGB immutableRGB = new ImmutableRGB(0, 0, 0, "Pitch Black");
        int myColorInt1 = color.getRGB();
        String myColorName1 = color.getName();
    }
}
