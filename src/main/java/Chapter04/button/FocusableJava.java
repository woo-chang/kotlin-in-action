package Chapter04.button;

public interface FocusableJava {

    default void setFocus(boolean b) {
        System.out.println(String.format("I " + (b ? "got" : "lost") + " focus."));
    }

    default void showOff() {
        System.out.println("I'm focusable!");
    }
}
