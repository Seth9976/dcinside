package javassist.bytecode;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class e0 extends d {
    public static final String d = "RuntimeVisibleParameterAnnotations";
    public static final String e = "RuntimeInvisibleParameterAnnotations";

    e0(t t0, int v, DataInputStream dataInputStream0) throws IOException {
        super(t0, v, dataInputStream0);
    }

    public e0(t t0, String s) {
        this(t0, s, new byte[]{0});
    }

    public e0(t t0, String s, byte[] arr_b) {
        super(t0, s, arr_b);
    }

    @Override  // javassist.bytecode.d
    public d a(t t0, Map map0) {
        a c$a0 = new a(this.c, this.a, t0, map0);
        try {
            c$a0.n();
            return new e0(t0, this.f(), c$a0.p());
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0.toString());
        }
    }

    @Override  // javassist.bytecode.d
    void h(Map map0) {
        this.p(map0);
    }

    @Override  // javassist.bytecode.d
    void m(String s, String s1) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(s, s1);
        this.p(hashMap0);
    }

    @Override  // javassist.bytecode.d
    void p(Map map0) {
        c c$c0 = new c(this.c, this.d(), map0);
        try {
            c$c0.n();
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0);
        }
    }

    public javassist.bytecode.annotation.a[][] t() {
        try {
            return new b(this.c, this.a).r();
        }
        catch(Exception exception0) {
            throw new RuntimeException(exception0.toString());
        }
    }

    @Override
    public String toString() {
        javassist.bytecode.annotation.a[][] arr2_a = this.t();
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr2_a.length; ++v) {
            javassist.bytecode.annotation.a[] arr_a = arr2_a[v];
            for(int v1 = 0; v1 < arr_a.length; ++v1) {
                stringBuilder0.append(arr_a[v1].toString());
                stringBuilder0.append(" ");
            }
            stringBuilder0.append(", ");
        }
        return stringBuilder0.toString().replaceAll(" (?=,)|, $", "");
    }

    public int u() {
        return this.c[0] & 0xFF;
    }

    public void v(javassist.bytecode.annotation.a[][] arr2_a) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        javassist.bytecode.annotation.d d0 = new javassist.bytecode.annotation.d(byteArrayOutputStream0, this.a);
        try {
            d0.x(arr2_a.length);
            for(int v = 0; v < arr2_a.length; ++v) {
                javassist.bytecode.annotation.a[] arr_a = arr2_a[v];
                d0.w(arr_a.length);
                for(int v1 = 0; v1 < arr_a.length; ++v1) {
                    arr_a[v1].i(d0);
                }
            }
            d0.g();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
        this.q(byteArrayOutputStream0.toByteArray());
    }
}

