import org.python.core.Py;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class Jython4 {

    public static void main(String []args){

        //定义python对象
        PythonInterpreter pi=new PythonInterpreter();
        pi.set("cnt",5); //给变量cnt 赋值5
        pi.execfile("jpython/src/main/java/py/calculate.py");

        //在java中调用python对象实例的方法
        String pythonClassName="Calculate";//python类名
        String pythonObjectName="cal";  //python对象名
        pi.exec(pythonObjectName+"="+pythonClassName+" ()"); //实例化python对象
        PyObject pyObject=pi.get(pythonObjectName);//获取实例化python对象

        //调用python对象方法，传递参数并接收返回值
        PyObject result=pyObject.invoke("power",new PyObject[]{Py.newInteger(2),Py.newInteger(3)});
        double power=Py.py2double(result);
        System.out.println(power);

        pi.cleanup();

    }
}
