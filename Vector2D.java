/**
 * Created by Wojcik94 on 2017-04-04.
 */
public class Vector2D {
    public float x, y;

    public Vector2D() {
        x=0;
        y=0;
    }

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D sum(Vector2D wejscie){
        Vector2D vector = new Vector2D(this.x+wejscie.x, this.y+wejscie.y);
        return vector;
    }

    public Vector2D difference(Vector2D wejscie){
        Vector2D vector = new Vector2D(this.x-wejscie.x, this.y-wejscie.y);
        return vector;
    }

    public Vector2D product(float mnoznik){
        Vector2D vector = new Vector2D(this.x*mnoznik, this.y*mnoznik);
        return vector;
    }

    public float getLength(){
        return (float) Math.sqrt(x*x+y*y);
    }

    public Vector2D normalized(){
        Vector2D vector= new Vector2D(this.x/this.getLength(), this.y/this.getLength());
        return vector;
    }
}
