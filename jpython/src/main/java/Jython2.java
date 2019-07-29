import org.python.core.Py;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.util.PythonInterpreter;

public class Jython2 {
    public static void main(String []args){

        //定义python对象
        PythonInterpreter pi=new PythonInterpreter();
        //执行python文件程序
        pi.execfile("F:\\javaAndc\\jpython\\src\\main\\java\\py\\hello.py");
        pi.cleanup();

    }
}
