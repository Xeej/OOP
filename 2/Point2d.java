/**
* двумерныйклассточки.
*/
public class Point2d 
{
    /** координата X **/
    private double xCoord;
    /**  координатаY **/
    private double yCoord;
    /** Конструкторинициализации **/
    public Point2d ( double x,  double y)
    {xCoord = x;yCoord = y;}
    /** Конструкторпоумолчанию. **/
    public Point2d() 
    {
        //Вызовитеконструкторсдвумяпараметрамииопределитеисточник.
        this(0, 0);}
        /** ВозвращениекоординатыX **/
        public double getX () 
        {return xCoord;}
        /** ВозвращениекоординатыY **/
    public double getY ()
    {return yCoord;}
    /** УстановказначениякоординатыX. **/
    public void setX( double val) 
    {xCoord= val;}
    /**  УстановказначениякоординатыY. **/
    public void  setY ( double val) 
    {yCoord= val;}

    public static void main(String[] args) 
	{
        Point2d myPoint = new Point2d ();
        Point2d myOtherPoint = new Point2d (5,3);//создаетточку(5,3
	}
}