package Chapter04.button2;

import Chapter04.button.ClickableJava;

public class RichButtonJava implements ClickableJava {

    //오버라이드 불가능
    public final void disable() {}

    //오버라이드 가능
    public void animate() {}

    @Override
    public void click() {}
}
