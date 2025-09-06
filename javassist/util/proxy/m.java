package javassist.util.proxy;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class m extends ObjectInputStream {
    private ClassLoader a;

    public m(InputStream inputStream0) throws IOException {
        super(inputStream0);
        ClassLoader classLoader0 = Thread.currentThread().getContextClassLoader();
        this.a = classLoader0;
        if(classLoader0 == null) {
            this.a = ClassLoader.getSystemClassLoader();
        }
    }

    public void a(ClassLoader classLoader0) {
        if(classLoader0 != null) {
            this.a = classLoader0;
            return;
        }
        ClassLoader.getSystemClassLoader();
    }

    @Override
    protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
        if(this.readBoolean()) {
            String s = (String)this.readObject();
            Class class0 = this.a.loadClass(s);
            int v = this.readInt();
            Class[] arr_class = new Class[v];
            for(int v1 = 0; v1 < v; ++v1) {
                String s1 = (String)this.readObject();
                arr_class[v1] = this.a.loadClass(s1);
            }
            byte[] arr_b = new byte[this.readInt()];
            this.read(arr_b);
            k k0 = new k();
            k0.q0(true);
            k0.r0(false);
            k0.n0(class0);
            k0.m0(arr_class);
            return ObjectStreamClass.lookup(k0.t(arr_b));
        }
        return super.readClassDescriptor();
    }
}

