package javassist.tools.rmi;

import java.applet.Applet;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.URL;

public class c implements Serializable {
    private final byte[] a;
    private String b;
    private String c;
    private int d;
    private int e;
    protected byte[] f;
    protected byte[] g;
    private static final long h = 1L;
    private static final Class[] i;

    static {
        c.i = new Class[]{c.class, Integer.TYPE};
    }

    public c(Applet applet0) {
        this.a = new byte[]{13, 10};
        this.f = "POST /lookup HTTP/1.0".getBytes();
        this.g = "POST /rmi HTTP/1.0".getBytes();
        URL uRL0 = applet0.getCodeBase();
        String s = uRL0.getHost();
        this.b = s;
        this.c = s;
        int v = uRL0.getPort();
        this.d = v;
        this.e = v;
    }

    public c(String s, int v) {
        this.a = new byte[]{13, 10};
        this.f = "POST /lookup HTTP/1.0".getBytes();
        this.g = "POST /rmi HTTP/1.0".getBytes();
        this.b = s;
        this.c = s;
        this.d = v;
        this.e = v;
    }

    public Object a(int v, int v1, Object[] arr_object) throws f {
        String s;
        Object object0;
        try {
            Socket socket0 = new Socket(this.b, this.d);
            BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(socket0.getOutputStream());
            bufferedOutputStream0.write(this.g);
            bufferedOutputStream0.write(this.a);
            bufferedOutputStream0.write(this.a);
            ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(bufferedOutputStream0);
            objectOutputStream0.writeInt(v);
            objectOutputStream0.writeInt(v1);
            this.g(objectOutputStream0, arr_object);
            objectOutputStream0.flush();
            BufferedInputStream bufferedInputStream0 = new BufferedInputStream(socket0.getInputStream());
            this.f(bufferedInputStream0);
            ObjectInputStream objectInputStream0 = new ObjectInputStream(bufferedInputStream0);
            boolean z = objectInputStream0.readBoolean();
            object0 = null;
            if(z) {
                s = null;
                object0 = objectInputStream0.readObject();
            }
            else {
                s = objectInputStream0.readUTF();
            }
            objectInputStream0.close();
            objectOutputStream0.close();
            socket0.close();
            if(object0 instanceof g) {
                object0 = this.b(((g)object0).a, ((g)object0).b);
            }
            goto label_34;
        }
        catch(ClassNotFoundException classNotFoundException0) {
        }
        catch(IOException iOException0) {
            throw new f(iOException0);
        }
        catch(Exception exception0) {
            throw new f(exception0);
        }
        throw new f(classNotFoundException0);
    label_34:
        if(!z) {
            throw new f(s);
        }
        return object0;
    }

    private Object b(int v, String s) throws Exception {
        return Class.forName(s).getConstructor(c.i).newInstance(this, v);
    }

    public Object c(String s) {
        try {
            return this.d(s);
        }
        catch(d unused_ex) {
            return null;
        }
    }

    public Object d(String s) throws d {
        try {
            Socket socket0 = new Socket(this.b, this.d);
            OutputStream outputStream0 = socket0.getOutputStream();
            outputStream0.write(this.f);
            outputStream0.write(this.a);
            outputStream0.write(this.a);
            ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(outputStream0);
            objectOutputStream0.writeUTF(s);
            objectOutputStream0.flush();
            BufferedInputStream bufferedInputStream0 = new BufferedInputStream(socket0.getInputStream());
            this.f(bufferedInputStream0);
            ObjectInputStream objectInputStream0 = new ObjectInputStream(bufferedInputStream0);
            int v = objectInputStream0.readInt();
            String s1 = objectInputStream0.readUTF();
            objectInputStream0.close();
            objectOutputStream0.close();
            socket0.close();
            if(v >= 0) {
                return this.b(v, s1);
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            throw new d(s, exception0);
        }
        throw new d(s);
    }

    public void e(String s, int v) {
        String s1 = "POST http://" + this.c + ":" + this.e;
        this.f = (s1 + "/lookup HTTP/1.0").getBytes();
        this.g = (s1 + "/rmi HTTP/1.0").getBytes();
        this.b = s;
        this.d = v;
    }

    private void f(InputStream inputStream0) throws IOException {
        do {
            int v;
            for(v = 0; true; ++v) {
                int v1 = inputStream0.read();
                if(v1 < 0 || v1 == 13) {
                    break;
                }
            }
            inputStream0.read();
        }
        while(v > 0);
    }

    private void g(ObjectOutputStream objectOutputStream0, Object[] arr_object) throws IOException {
        objectOutputStream0.writeInt(arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(object0 instanceof e) {
                objectOutputStream0.writeObject(new g(((e)object0).a()));
            }
            else {
                objectOutputStream0.writeObject(object0);
            }
        }
    }
}

