
import java.math.RoundingMode;
import java.util.Scanner;

public class Point3d 
{
    /** координата X **/
    private double xCoord;
    /**  координатаY **/
    private double yCoord;
    /**  координатаZ **/
    private double zCoord;
    /** Конструкторинициализации **/
    public Point3d ( double x,  double y, double z)
    {xCoord = x;yCoord = y;zCoord = z;}
    /** Конструкторпоумолчанию. **/
    public Point3d() 
    {
        //Вызовитеконструкторсдвумяпараметрамииопределитеисточник.
        this(0.0, 0.0, 0.0);
    }
        /** ВозвращениекоординатыX **/
    public double getX () 
    {return xCoord;}
        /** ВозвращениекоординатыY **/
    public double getY ()
    {return yCoord;}
    /** ВозвращениекоординатыZ **/
    public double getZ ()
    {return zCoord;}
    /** УстановказначениякоординатыX. **/
    public void setX( double val) 
    {xCoord= val;}
    /**  УстановказначениякоординатыY. **/
    public void  setY ( double val) 
    {yCoord= val;}
    /**  УстановказначениякоординатыZ. **/
    public void  setZ ( double val) 
    {zCoord= val;}

    public boolean isEqually (Point3d point2)
    {
        if (this.getX()==point2.getX()&&this.getY()==this.getY()&&this.getZ()==point2.getZ())
        return true;

        return false;
    }

    public double distanceTo(Point3d point2)
    {
        double rez= Math.round(Math.sqrt(Math.pow((this.getX()-point2.getX()),2)+Math.pow((this.getY()-point2.getY()),2)+Math.pow((this.getZ()-point2.getZ()),2))*100);
        return rez/100;
    }
}