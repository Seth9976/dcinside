package javassist.tools.reflect;

import javassist.B;
import javassist.E;
import javassist.b;

public class g extends B {
    protected j g;

    public g() throws b, E {
        this.b("javassist.tools.reflect.Loader");
        this.g = new j();
        this.a(javassist.g.T(), this.g);
    }

    @Override  // javassist.B
    public static void g(String[] arr_s) throws Throwable {
        new g().j(arr_s);
    }

    public boolean m(String s, String s1, String s2) throws b, E {
        return this.g.f(s, s1, s2);
    }
}

