public class Pair {

    public int startIndex;
    public int endIndex;

    public Pair(int startIndex, int endIndex){
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public String toString(){
        return "(" + startIndex + "," + endIndex + ")";
    }
}
