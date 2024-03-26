package ImmutableMutable;

public class BoardGamePieceImmutable {
    private final String color;
    private final int number;
    private final String material;


    public BoardGamePieceImmutable(String color, int number, String material) {
        this.color = color;
        this.number = number;
        this.material = material;
    }


    public BoardGamePieceImmutable(BoardGamePieceImmutable piece) {
        this(piece.getColor(), piece.getNumber(), piece.getMaterial());
    }


    public BoardGamePieceImmutable() {
        this.color = null;
        this.number = 0;
        this.material = null;
    }


    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public String getMaterial() {
        return material;
    }
}
