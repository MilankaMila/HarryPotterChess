package ch.chnuschtle.harryPotterChess.board;

import ch.chnuschtle.harryPotterChess.pieces.Piece;
import lombok.Getter;

@Getter
public class Tile {

    private boolean occupied = false;
    private Piece occupyingPiece = null;
    private int xCoordinate;
    private int yCoordinate;
    //TODO  map-coordinates

    public Tile (int xCoordinate, int yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    public void leave() {
        this.occupied = false;
        this.occupyingPiece = null;
    }

    public void conquer(Piece conqueror) {
        if (occupied){
            this.occupyingPiece.killed();
        }
        occupyingPiece = conqueror;
        conqueror.setXCoordinate(this.xCoordinate);
        conqueror.setYCoordinate(this.yCoordinate);
        conqueror.setCurrentTile(this);
        //TODO conqueror set map-coordinates
    }

    public void setOccupyingPiece(Piece occupyingPiece) {
        this.occupyingPiece = occupyingPiece;
        this.occupied = true;
    }
}
