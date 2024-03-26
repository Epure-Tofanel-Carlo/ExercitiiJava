package ImmutableMutable;

public class ApplicationMutable
{
    public static void main(String[] args) {

        System.out.println("Creez un obiect mutable Boardgame si BoardgamePiece");

        BoardGamePiece mutablePiece = new BoardGamePiece("Red", 1, "Wood");
        Boardgame mutableBoardgame = new Boardgame(5, new BoardGamePiece[]{mutablePiece}, Boardgame.Difficulty.MEDIUM);

        System.out.println("Culoare initiala la prima piesa: " + mutableBoardgame.getPieces()[0].getColor());
        System.out.println("Schimb aceasta culoare in Blue");
        mutablePiece.setColor("Blue");
        System.out.println("Culoare noua la prima piesa : " + mutableBoardgame.getPieces()[0].getColor());


        System.out.println("Acum creez un obiect immutable Boardgame si BoardgamePiece");

        BoardGamePieceImmutable immutablePiece = new BoardGamePieceImmutable("Green", 2, "Plastic");
        BoardgameImmutable immutableBoardgame = new BoardgameImmutable(5, new BoardGamePieceImmutable[]{immutablePiece}, BoardgameImmutable.Difficulty.EASY);

        System.out.println("Culoarea initiala la prima piesa din BoardgameImmutable: " + immutableBoardgame.getPieces()[0].getColor());
        System.out.println("Nu am setteri sa schimbi culoare, clasa este immutable respectand toate regulile, culoarea ramane: " + immutableBoardgame.getPieces()[0].getColor());
    }

}
