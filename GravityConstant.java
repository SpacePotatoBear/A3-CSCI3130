public class GravityConstant implements GravityModel
{
    private double gravity;

    GravityConstant(double gravity)
    {
        this.gravity = gravity;
    }

    public double getGravitationalField ()
    {
        return this.gravity;
    }
}