package Chapter04.button;

public interface ClickableJava {

    void click();

    default void showOff() {
        System.out.println("I'm clickable!");
    }
}
