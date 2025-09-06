package javassist;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javassist.bytecode.k;
import jeb.synthetic.TWR;

final class h {
    protected f a;

    public h() {
        this.a = null;
    }

    public e a(String s) throws E {
        return this.b(h.h(s));
    }

    public e b(e e0) {
        synchronized(this) {
            f f0 = new f(e0, null);
            f f1 = this.a;
            if(f1 == null) {
                this.a = f0;
            }
            else {
                f f2;
                while((f2 = f1.a) != null) {
                    f1 = f2;
                }
                f1.a = f0;
            }
            return e0;
        }
    }

    public e c() {
        return k.y >= 53 ? this.b(new C(Thread.currentThread().getContextClassLoader())) : this.b(new c());
    }

    public static void d(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        int v = 0x1000;
        byte[] arr_b = null;
        int v1 = 0;
    label_3:
        while(v1 < 0x40) {
            if(v1 < 8) {
                v *= 2;
                arr_b = new byte[v];
            }
            int v2 = 0;
            int v3;
            while((v3 = inputStream0.read(arr_b, v2, v - v2)) >= 0) {
                int v4 = v2 + v3;
                if(v4 < v) {
                    v2 = v4;
                    continue;
                }
                outputStream0.write(arr_b);
                ++v1;
                continue label_3;
            }
            outputStream0.write(arr_b, 0, v2);
            return;
        }
        throw new IOException("too much data");
    }

    public URL e(String s) {
        f f0 = this.a;
        while(f0 != null) {
            URL uRL0 = f0.b.a(s);
            if(uRL0 == null) {
                f0 = f0.a;
                continue;
            }
            return uRL0;
        }
        return null;
    }

    public e f(String s) throws E {
        return this.g(h.h(s));
    }

    public e g(e e0) {
        synchronized(this) {
            this.a = new f(e0, this.a);
            return e0;
        }
    }

    private static e h(String s) throws E {
        String s1 = s.toLowerCase();
        if(!s1.endsWith(".jar") && !s1.endsWith(".zip")) {
            int v = s.length();
            return v > 2 && s.charAt(v - 1) == 42 && (s.charAt(v - 2) == 0x2F || s.charAt(v - 2) == File.separatorChar) ? new A(s.substring(0, v - 2)) : new x(s);
        }
        return new z(s);
    }

    InputStream i(String s) throws E {
        f f0 = this.a;
        Throwable throwable0 = null;
        InputStream inputStream0 = null;
        while(f0 != null) {
            try {
                inputStream0 = f0.b.b(s);
            }
            catch(E e0) {
                if(throwable0 == null) {
                    throwable0 = e0;
                }
            }
            if(inputStream0 == null) {
                f0 = f0.a;
                continue;
            }
            return inputStream0;
        }
        if(throwable0 != null) {
            throw throwable0;
        }
        return null;
    }

    public static byte[] j(InputStream inputStream0) throws IOException {
        byte[][] arr2_b = new byte[8][];
        int v = 0x1000;
        int v1 = 0;
    label_3:
        while(v1 < 8) {
            arr2_b[v1] = new byte[v];
            int v2 = 0;
            int v3;
            while((v3 = inputStream0.read(arr2_b[v1], v2, v - v2)) >= 0) {
                int v4 = v2 + v3;
                if(v4 < v) {
                    v2 = v4;
                    continue;
                }
                v *= 2;
                ++v1;
                continue label_3;
            }
            byte[] arr_b = new byte[v - 0x1000 + v2];
            int v6 = 0;
            for(int v5 = 0; v5 < v1; ++v5) {
                System.arraycopy(arr2_b[v5], 0, arr_b, v6, v6 + 0x1000);
                v6 = v6 * 2 + 0x1000;
            }
            System.arraycopy(arr2_b[v1], 0, arr_b, v6, v2);
            return arr_b;
        }
        throw new IOException("too much data");
    }

    public void k(e e0) {
        synchronized(this) {
            f f0 = this.a;
            if(f0 != null) {
                if(f0.b == e0) {
                    this.a = f0.a;
                }
                else {
                    f f1;
                    while((f1 = f0.a) != null) {
                        if(f1.b == e0) {
                            f0.a = f1.a;
                        }
                        else {
                            f0 = f1;
                        }
                    }
                }
            }
        }
    }

    void l(String s, OutputStream outputStream0) throws E, IOException, b {
        InputStream inputStream0 = this.i(s);
        if(inputStream0 == null) {
            throw new E(s);
        }
        try {
            h.d(inputStream0, outputStream0);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(inputStream0, throwable0);
            throw throwable0;
        }
        inputStream0.close();
    }

    @Override
    public String toString() [...] // 潜在的解密器
}

