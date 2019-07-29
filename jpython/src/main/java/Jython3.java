import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class Jython3 {

    public static void main(String []args){

            //定义python对象
            PythonInterpreter pi=new PythonInterpreter();
            pi.set("cnt",5); //给变量cnt 赋值5
            pi.execfile("jpython/src/main/java/py/randomSum.py");
            //获取对象sum总和
            PyObject sum=pi.get("sum");
          System.out.println("sum :"+sum);


    }
}
