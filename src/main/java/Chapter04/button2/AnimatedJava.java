package Chapter04.button2;

public abstract class AnimatedJava {

    abstract public void animate();

    //비추상 함수
    public void stopAnimating() {}

    //비추상 함수 + 오버라이드 불가능
    public final void animateTwice() {}

}
