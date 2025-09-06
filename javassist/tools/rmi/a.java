package javassist.tools.rmi;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javassist.E;
import javassist.b;
import javassist.g;
import javassist.tools.web.d;

public class a extends d {
    private i l;
    private Map m;
    private List n;
    private static final byte[] o;

    static {
        a.o = new byte[]{72, 84, 84, 80, 0x2F, 49, 46, 0x30, 0x20, 50, 0x30, 0x30, 0x20, 0x4F, 75, 13, 10, 13, 10};
    }

    public a(int v) throws IOException, E, b {
        this(g.T(), new i(), v);
    }

    public a(int v, g g0) throws IOException, E, b {
        this(new g(g0), new i(), v);
    }

    public a(String s) throws IOException, E, b {
        this(Integer.parseInt(s));
    }

    private a(g g0, i i0, int v) throws IOException, E, b {
        super(v);
        this.m = new Hashtable();
        this.n = new Vector();
        this.l = i0;
        this.a(g0, i0);
    }

    @Override  // javassist.tools.web.d
    public void c(InputStream inputStream0, OutputStream outputStream0, String s) throws IOException, javassist.tools.web.a {
        if(s.startsWith("POST /rmi ")) {
            this.u(inputStream0, outputStream0);
            return;
        }
        if(s.startsWith("POST /lookup ")) {
            this.t(s, inputStream0, outputStream0);
            return;
        }
        super.c(inputStream0, outputStream0, s);
    }

    @Override  // javassist.tools.web.d
    public void n() {
        super.n();
    }

    private Object r(Object object0) throws b {
        if(object0 == null) {
            return null;
        }
        String s = object0.getClass().getName();
        return this.l.d(s) ? new javassist.tools.rmi.g(this.s(null, object0), s) : object0;
    }

    public int s(String s, Object object0) throws b {
        synchronized(this) {
            Class class0 = object0.getClass();
            javassist.tools.rmi.b b0 = new javassist.tools.rmi.b();
            b0.b = object0;
            b0.c = class0.getMethods();
            this.n.add(b0);
            b0.a = this.n.size() - 1;
            if(s != null) {
                this.m.put(s, b0);
            }
            try {
                this.l.e(class0);
                return b0.a;
            }
            catch(E e0) {
                throw new b(e0);
            }
        }
    }

    private void t(String s, InputStream inputStream0, OutputStream outputStream0) throws IOException {
        ObjectInputStream objectInputStream0 = new ObjectInputStream(inputStream0);
        String s1 = DataInputStream.readUTF(objectInputStream0);
        javassist.tools.rmi.b b0 = (javassist.tools.rmi.b)this.m.get(s1);
        outputStream0.write(a.o);
        ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(outputStream0);
        if(b0 == null) {
            this.i(s1 + "not found.");
            objectOutputStream0.writeInt(-1);
            objectOutputStream0.writeUTF("error");
        }
        else {
            this.i(s1);
            objectOutputStream0.writeInt(b0.a);
            objectOutputStream0.writeUTF(b0.b.getClass().getName());
        }
        objectOutputStream0.flush();
        objectOutputStream0.close();
        objectInputStream0.close();
    }

    private void u(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        Object object0;
        ObjectInputStream objectInputStream0 = new ObjectInputStream(inputStream0);
        int v = objectInputStream0.readInt();
        int v1 = objectInputStream0.readInt();
        Exception exception0 = null;
        try {
            javassist.tools.rmi.b b0 = (javassist.tools.rmi.b)this.n.get(v);
            Object[] arr_object = this.v(objectInputStream0);
            object0 = this.r(b0.c[v1].invoke(b0.b, arr_object));
        }
        catch(Exception exception1) {
            this.i(exception1.toString());
            exception0 = exception1;
            object0 = null;
        }
        outputStream0.write(a.o);
        ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(outputStream0);
        if(exception0 == null) {
            try {
                objectOutputStream0.writeBoolean(true);
                objectOutputStream0.writeObject(object0);
            }
            catch(NotSerializableException notSerializableException0) {
                this.i(notSerializableException0.toString());
            }
            catch(InvalidClassException invalidClassException0) {
                this.i(invalidClassException0.toString());
            }
        }
        else {
            objectOutputStream0.writeBoolean(false);
            objectOutputStream0.writeUTF(exception0.toString());
        }
        objectOutputStream0.flush();
        objectOutputStream0.close();
        objectInputStream0.close();
    }

    private Object[] v(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        int v = objectInputStream0.readInt();
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = objectInputStream0.readObject();
            if(object0 instanceof javassist.tools.rmi.g) {
                object0 = ((javassist.tools.rmi.b)this.n.get(((javassist.tools.rmi.g)object0).a)).b;
            }
            arr_object[v1] = object0;
        }
        return arr_object;
    }
}

