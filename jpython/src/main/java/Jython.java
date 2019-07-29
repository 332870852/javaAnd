import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class Jython {
    public static void main(String []args){
        //定义python对象
        PythonInterpreter pi=new PythonInterpreter();
        //执行python语句程序
        pi.exec("import sys");//引入包
       // pi.exec("reload(sys)");
       // pi.exec("sys.setdefaultencoding('utf-8')");
        pi.exec("");
        pi.set("a",new PyInteger(42)); //设置变量a，赋值42
        pi.exec("print a");             //打印a
        pi.exec("x = 2+2");
        PyObject x=pi.get("x");     //通过PyObject 获取对象x
        System.out.println("x: "+x);
    }
}
