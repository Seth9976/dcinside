package javassist.bytecode;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;
import javassist.bytecode.annotation.o;

public class b extends d {
    public static final String d = "AnnotationDefault";

    public b(t t0) {
        this(t0, new byte[]{0, 0});
    }

    b(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, dataInputStream0);
    }

    public b(t t0, byte[] arr_b) {
        super(t0, "AnnotationDefault", arr_b);
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) {
        a c$a0 = new a(this.c, this.a, t0, map0);
        try {
            c$a0.k(0);
            return new b(t0, c$a0.p());
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0.toString());
        }
    }

    public o t() {
        try {
            return new javassist.bytecode.c.b(this.c, this.a).q();
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0.toString());
        }
    }

    @Override
    public String toString() {
        return this.t().toString();
    }

    public void u(o o0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        javassist.bytecode.annotation.d d0 = new javassist.bytecode.annotation.d(byteArrayOutputStream0, this.a);
        try {
            o0.f(d0);
            d0.g();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
        this.q(byteArrayOutputStream0.toByteArray());
    }
}

