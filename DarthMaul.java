import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.awt.Color;

import java.util.ArrayList;

public class DarthMaul extends Critter{

	public DarthMaul(){
		setColor(null);
	}

	public void processActors(ArrayList<Actor> actors){

		Location loc = getLocation();
		int dir = getDirection();
		Location locRight = loc.getAdjacentLocation(dir + 90);
		Location locLeft = loc.getAdjacentLocation(dir - 90);

		/*ArrayList<Actor> neighbors = getActors();
		if(neighbors.size() != 0){
			for(int i=0;i<neighbors.size();i++){
				if(neighbors[i].getLocation() == locRight || neighbors[i].getLocation() == locLeft)
					neighbors[i].removeSelfFromGrid();
			}
		}*/

	}

	public void makeMove(Location loc)
	{
		setDirection(getLocation().getDirectionToward(loc));
	    super.makeMove(loc);
    }
}