package Game.Map;

public class Coordinats {
    public int x;
    public int y;

    public Coordinats(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: "+x+" y: "+y;
    }

    public int[] toArray() {
        return new int[]{x, y};
    }
    public int distance(Coordinats coordProtivnik){
        return (int) Math.sqrt(Math.pow(x-coordProtivnik.toArray()[0],2)+Math.pow(y-coordProtivnik.toArray()[1],2));
    }

    public  int[] coordStep(Coordinats coordP) {

        int[] coordStep = {x,y};
        if(Math.abs(this.x-coordP.x) < Math.abs(this.y-coordP.y)){

            if (coordP.y > this.y) coordStep[1] += 1;
            else coordStep[1] -= 1;
        }
        else {
            if (coordP.x > this.x) coordStep[0] += 1;
            else coordStep[0] -= 1;
        }

        return coordStep;
    }

//    public Direction getDirection(Coordinats otherCoordinates) {
//        int[] my = this.toArray();
//        int[] other = otherCoordinates.toArray();
//        if (Math.abs(my[0] - other[0]) > Math.abs(my[1] - other[1])) {
//            if (my[0] > other[0]) {
//                return Direction.NORTH;
//            } else {
//                return Direction.SOUTH;
//            }
//        } else {
//            if (my[1] > other[1]) {
//                return Direction.WEST;
//            } else {
//                return Direction.EAST;
//            }
//        }
//    }
//    public boolean isEqual(Coordinats coordinates) {
//        return this.x == coordinates.x && this.y == coordinates.y;
//    }
}
