package ImmutableMutable;

public class Boardgame
{
    private Difficulty difficulty;
    private int numberOfPieces;
    private BoardGamePiece[] pieces;

    public enum Difficulty {
        VERY_EASY(1),
        EASY(2),
        MEDIUM(3),
        HARD(4),
        VERY_HARD(5);

        private final int level;

        Difficulty(int level) {
            this.level = level;
        }

        public int getLevel() {
            return this.level;
        }
    }


    public Boardgame()
    {
        this.difficulty = Difficulty.MEDIUM;
    }

    public Boardgame(int numberOfPieces)
    {
        this.numberOfPieces = numberOfPieces;
        this.pieces = new BoardGamePiece[numberOfPieces];
        this.difficulty = Difficulty.MEDIUM;


        for (int i = 0 ; i < numberOfPieces; i++)
        {
            pieces[i] = new BoardGamePiece();
        }
    }

    public Boardgame(int numberOfPieces, BoardGamePiece[] pieces, Difficulty difficulty)
    {
        this.numberOfPieces = numberOfPieces;
        this.pieces = pieces;
        this.difficulty = difficulty;
    }

    public Difficulty getDifficulty()
    {
        return difficulty;
    }

    public int getNumberOfPieces()
    {
        return numberOfPieces;
    }

    public BoardGamePiece[] getPieces()
    {
        return pieces;
    }

    public void setDifficulty(Difficulty difficulty)
    {
        this.difficulty = difficulty;
    }

    public void setNumberOfPieces(int numberOfPieces)
    {
        this.numberOfPieces = numberOfPieces;
    }

    public void setPieces(BoardGamePiece[] pieces)
    {
        this.pieces = pieces;
    }
}
