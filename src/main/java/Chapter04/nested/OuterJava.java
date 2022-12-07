package Chapter04.nested;

public class OuterJava {

    class Inner {
        public OuterJava getOuterReference() {
            return OuterJava.this;
        }
    }

}
