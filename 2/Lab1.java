import java.util.Scanner;


public class Lab1
{
    public static Point3d[] array=new Point3d[4];

    public static double computeArea(Point3d array[])
    {
        double a=array[1].distanceTo(array[2]);
        double b=array[2].distanceTo(array[3]);
        double c=array[3].distanceTo(array[1]);
        double p=(array[1].distanceTo(array[2])+array[2].distanceTo(array[3])+array[3].distanceTo(array[1]))/2;
        double rez=p*Math.pow((p-a),2)*Math.pow((p-b),2)*Math.pow((p-c),2);
        return rez; 
    }
	public static void main(String[] args) 
	{
		System.out.println("Введите и точки");
        for (int i=1;i<=3;i++)
        {
            Scanner scan= new Scanner(System.in);
            System.out.println(i+"-ая X Y Z");
            double x=scan.nextDouble();
            double y=scan.nextDouble();
            double z=scan.nextDouble();
            array[i]= new Point3d(x,y,z);
        }
        if ((array[1].isEqually(array[2]))||(array[1].isEqually(array[3]))||(array[2].isEqually(array[3])))
        { System.out.println("Имеются равные точки");}
        else
        {
            System.out.println(computeArea(array));
        }
    }
	
}