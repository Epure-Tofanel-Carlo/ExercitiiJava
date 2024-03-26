package ImmutableMutable;

public final class BoardgameImmutable {
    private final Difficulty difficulty;
    private final int numberOfPieces;
    private final BoardGamePieceImmutable[] pieces;

    public enum Difficulty {
        VERY_EASY(1), EASY(2), MEDIUM(3), HARD(4), VERY_HARD(5);

        private final int level;

        Difficulty(int level) {
            this.level = level;
        }

        public int getLevel() {
            return this.level;
        }
    }

    public BoardgameImmutable(int numberOfPieces, Difficulty difficulty) {
        this.numberOfPieces = numberOfPieces;
        this.difficulty = difficulty;
        this.pieces = new BoardGamePieceImmutable[numberOfPieces];
        for (int i = 0; i < numberOfPieces; i++)
        {
            this.pieces[i] = new BoardGamePieceImmutable();
        }
    }

    public BoardgameImmutable(int numberOfPieces, BoardGamePieceImmutable[] pieces, Difficulty difficulty)
    {
        this.numberOfPieces = numberOfPieces;
        this.difficulty = difficulty;
        this.pieces = new BoardGamePieceImmutable[pieces.length];
        for (int i = 0; i < pieces.length; i++)
        {
            this.pieces[i] = new BoardGamePieceImmutable(pieces[i]);
        }
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public BoardGamePieceImmutable[] getPieces() {
        return pieces.clone();
    }
}
