package ch.chnuschtle.harryPotterChess.pieces;

import ch.chnuschtle.harryPotterChess.board.Tile;

public class Knight extends Piece{

    public Knight(int xCoordinate, int yCoordinate) {
        super(xCoordinate, yCoordinate);
    }

    @Override
    protected boolean checkMove(Tile tile) {
        return false;
    }
}
