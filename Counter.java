import greenfoot.*;

/**
 * The original Counter class from greenfoot, but edited a little bit
 */
public class Counter extends Actor
{
    private int value;
    private int target;
    private String prefix;
    private GreenfootImage background;
    private static final Color transparent = new Color(0,0,0,0);

    /**
     * @param prefix A text that is displayed before the number
     * @param background_image The image that is displayed behind the text
     */
    public Counter(String prefix, String background_image) {
        setImage(background_image);
        background = getImage();
        value = 0;
        target = 0;
        this.prefix = prefix;
        updateImage();
    }

    /**
     * This method is required by greenfoot, it is called every game tick
     */
    public void act() {
        if (value < target) {
            value++;
            updateImage();
        } else if (value > target) {
            value--;
            updateImage();
        }
    }

    /**
     * Adds an amount to the counter
     * @param score The amount to add
     */
    public void add(int score) {
        target += score;
    }

    /**
     * Returns the current value of the counter
     * @return the current value
     */
    public int getValue() {
        return target;
    }

    /**
     * Sets the counter to the given value
     * @param newValue The new value
     */
    public void setValue(int newValue) {
        target = newValue;
        value = newValue;
        updateImage();
    }

    /**
     * Updates the counter
     */
    private void updateImage() {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage(prefix + value, 22, Color.BLACK, transparent);
        
        if (text.getWidth() > image.getWidth() - 20) {
            image.scale(text.getWidth() + 20, image.getHeight());
        }
        
        image.drawImage(text, (image.getWidth()-text.getWidth())/2, (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
