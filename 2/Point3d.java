import java.math.RoundingMode;
import java.util.Scanner;


public class Point3d extends Point2d
{

    private double zCoord;
    /** Конструкторинициализации **/
    public Point3d ( double x, double y,double z)
    {super(x,y);zCoord = z;}
    /** Конструкторпоумолчанию. **/
    public Point3d() 
    {
        //Вызовитеконструкторсдвумяпараметрамииопределитеисточник.
        this(0.0, 0.0, 0.0);
    }
    /** ВозвращениекоординатыZ **/
    public double getZ ()
    {return zCoord;}
    /**  УстановказначениякоординатыZ. **/
    public void  setZ ( double val) 
    {zCoord= val;}

    public boolean isEqually (Point3d point2)
    {
        if ((this.getX()==point2.getX())&&(this.getY()==point2.getY())&&(this.getZ()==point2.getZ()))
            return true;

        return false;
    }

    public double distanceTo(Point3d point2)
    {
        double rez= Math.round(Math.sqrt(Math.pow((this.getX()-point2.getX()),2)+Math.pow((this.getY()-point2.getY()),2)+Math.pow((this.getZ()-point2.getZ()),2))*100);
        return rez/100;
    }
}