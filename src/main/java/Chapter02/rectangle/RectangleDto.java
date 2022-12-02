package Chapter02.rectangle;

public class RectangleDto {

    private final int height;
    private final int weight;

    public RectangleDto(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public boolean isSquare() {
        return height == weight;
    }

}
