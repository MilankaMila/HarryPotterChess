package ch.chnuschtle.harryPotterChess.pieces;

import ch.chnuschtle.harryPotterChess.board.Board;
import ch.chnuschtle.harryPotterChess.board.Tile;
import com.almasb.fxgl.entity.component.Component;
import lombok.Setter;

@Setter
public abstract class Piece extends Component {

    private Board board;
    private Tile currentTile;
    private int xCoordinate;
    private int yCoordinate;
    //TODO map-coordinates

    public Piece (int xCoordinate, int yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public void move(Tile tile){
        if (checkMove(tile)){
            this.currentTile.leave();
            tile.conquer(this);
        }
    }

    protected abstract boolean checkMove(Tile tile);

    public void killed(){
        //TODO
    }
}

