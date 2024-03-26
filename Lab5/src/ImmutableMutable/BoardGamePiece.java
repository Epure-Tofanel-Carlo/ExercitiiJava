package ImmutableMutable;

public class BoardGamePiece
{
    private String color;
    private int number;

    private String material;

    public BoardGamePiece()
    {
    }
    public BoardGamePiece(String color, int number, String material)
    {
        this.color = color;
        this.number = number;
        this.material = material;
    }

    public BoardGamePiece(BoardGamePiece piece)
    {
        this.color = piece.getColor();
        this.number = piece.getNumber();
        this.material = piece.getMaterial();
    }

    public String getColor()
    {
        return color;
    }

    public int getNumber()
    {
        return number;
    }

    public String getMaterial()
    {
        return material;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }
}
