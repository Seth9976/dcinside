package javassist.util.proxy;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;

public class n extends ObjectOutputStream {
    public n(OutputStream outputStream0) throws IOException {
        super(outputStream0);
    }

    @Override
    protected void writeClassDescriptor(ObjectStreamClass objectStreamClass0) throws IOException {
        Class class0 = objectStreamClass0.forClass();
        if(k.O(class0)) {
            this.writeBoolean(true);
            Class[] arr_class = class0.getInterfaces();
            byte[] arr_b = k.C(class0);
            this.writeObject(class0.getSuperclass().getName());
            this.writeInt(arr_class.length - 1);
            for(int v = 0; v < arr_class.length; ++v) {
                Class class1 = arr_class[v];
                if(class1 != l.class && class1 != j.class) {
                    this.writeObject(class1.getName());
                }
            }
            this.writeInt(arr_b.length);
            this.write(arr_b);
            return;
        }
        this.writeBoolean(false);
        super.writeClassDescriptor(objectStreamClass0);
    }
}

