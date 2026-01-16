package chap08.section01.example04;

public class SuperAirPlane extends AirPlane{

   public int flyMode;

    public SuperAirPlane(int flyMode) {
        this.flyMode = flyMode;
    }

    @Override
    void fly() {
        super.fly();
    }
}
