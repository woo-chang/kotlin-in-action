package Chapter02.color;

public class ColorMain {

    public static void main(String[] args) {
        System.out.println(getMood(ColorSet.RED));
    }

    public static String getMood(ColorSet color) {
        String result = "";
        switch (color) {
            case RED:
            case ORANGE:
            case YELLOW:
                result = "warm";
                break;
            case GREEN:
                result = "neutral";
                break;
            case BLUE:
            case INDIGO:
            case VIOLET:
                result = "cold";
                break;
        }
        return result;
    }

}
