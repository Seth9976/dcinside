package javassist.tools.rmi;

import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Map;
import javassist.D;
import javassist.E;
import javassist.G;
import javassist.b;
import javassist.g;
import javassist.l;
import javassist.o.f;
import javassist.o;
import javassist.q.a;
import javassist.q;
import javassist.s;
import javassist.t;

public class i implements G {
    private g a;
    private Map b;
    private q c;
    private q d;
    private l[] e;
    private l[] f;
    private l[] g;
    private static final String h = "importer";
    private static final String i = "objectId";
    private static final String j = "_getObjectId";
    private static final String k = "javassist.tools.rmi.Sample";

    public i() {
        this.b = new Hashtable();
    }

    @Override  // javassist.G
    public void a(g g0) throws E {
        this.a = g0;
        l l0 = g0.s("javassist.tools.rmi.Sample");
        this.c = l0.H("forward");
        this.d = l0.H("forwardStatic");
        this.e = g0.t(new String[]{"javassist.tools.rmi.ObjectImporter", "int"});
        this.f = g0.t(new String[]{"java.io.Serializable", "javassist.tools.rmi.Proxy"});
        this.g = new l[]{g0.s("javassist.tools.rmi.RemoteException")};
    }

    @Override  // javassist.G
    public void b(g g0, String s) {
    }

    private void c(l l0, Method[] arr_method) throws b, E {
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            int v1 = method0.getModifiers();
            if(method0.getDeclaringClass() != Object.class && !D.e(v1)) {
                if(D.k(v1)) {
                    q q0 = D.l(v1) ? this.d : this.c;
                    q q1 = t.l(this.h(method0.getReturnType()), method0.getName(), this.i(method0.getParameterTypes()), this.g, q0, a.f(v), l0);
                    q1.q(v1);
                    l0.f(q1);
                }
                else if(!D.j(v1) && !D.i(v1)) {
                    throw new b("the methods must be public, protected, or private.");
                }
            }
        }
    }

    public boolean d(String s) {
        return this.b.get(s) != null;
    }

    public boolean e(Class class0) throws b, E {
        synchronized(this) {
            String s = class0.getName();
            if(this.b.get(s) != null) {
                return false;
            }
            l l0 = this.g(this.a.s(s), class0);
            this.b.put(s, l0);
            this.f(l0);
            return true;
        }
    }

    private void f(l l0) throws b, E {
        while(true) {
            l0 = l0.c0();
            if(l0 == null) {
                break;
            }
            try {
                l0.C(null);
                return;
            }
            catch(E unused_ex) {
                l0.a(s.b(l0));
            }
        }
    }

    private l g(l l0, Class class0) throws b, E {
        int v = l0.W();
        if(!D.b(v) && !D.g(v) && D.k(v)) {
            l l1 = this.a.Y0(l0.X(), l0.c0());
            l1.E0(this.f);
            o o0 = new o(this.a.s("javassist.tools.rmi.ObjectImporter"), "importer", l1);
            o0.q(2);
            l1.d(o0, f.m(0));
            o o1 = new o(l.i, "objectId", l1);
            o1.q(2);
            l1.d(o1, f.m(1));
            l1.f(t.f("_getObjectId", o1));
            l1.a(s.b(l1));
            l1.a(s.g(this.e, null, l1));
            try {
                this.c(l1, class0.getMethods());
                return l1;
            }
            catch(SecurityException securityException0) {
                throw new b(securityException0);
            }
        }
        throw new b(l0.X() + " must be public, non-native, and non-abstract.");
    }

    private l h(Class class0) throws E {
        if(!class0.isArray()) {
            return this.a.s(class0.getName());
        }
        StringBuffer stringBuffer0 = new StringBuffer();
        do {
            stringBuffer0.append("[]");
            class0 = class0.getComponentType();
        }
        while(class0.isArray());
        stringBuffer0.insert(0, class0.getName());
        return this.a.s(stringBuffer0.toString());
    }

    private l[] i(Class[] arr_class) throws E {
        l[] arr_l = new l[arr_class.length];
        for(int v = 0; v < arr_class.length; ++v) {
            arr_l[v] = this.h(arr_class[v]);
        }
        return arr_l;
    }
}

