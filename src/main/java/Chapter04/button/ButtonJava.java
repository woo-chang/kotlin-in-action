package Chapter04.button;

public class ButtonJava implements ClickableJava, FocusableJava {

    @Override
    public void click() {
        System.out.println("I was clicked");
    }

    @Override
    public void showOff() {
        ClickableJava.super.showOff();
        FocusableJava.super.showOff();
    }
}
