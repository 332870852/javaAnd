import org.python.core.Py;
import org.python.core.PyFunction;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class Jython5 {

    public static void main(String []args){

        //定义python对象
        PythonInterpreter pi=new PythonInterpreter();
        pi.set("cnt",5); //给变量cnt 赋值5
        pi.execfile("jpython/src/main/java/py/calculate1.py");

        //在java中调用python中的函数
        PyFunction pf=pi.get("power",PyFunction.class);
        PyObject result=pf.__call__(Py.newInteger(2),Py.newInteger(5));

        System.out.println(result);
        pi.cleanup();

    }
}
