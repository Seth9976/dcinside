package androidx.media3.common.util;

import android.content.Context;
import android.opengl.GLES20;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

@UnstableApi
public final class GlProgram {
    static final class Attribute {
        public final String a;
        private final int b;
        @Nullable
        private Buffer c;
        private int d;

        private Attribute(String s, int v) {
            this.a = s;
            this.b = v;
        }

        public void a() throws GlException {
            Object object0 = Assertions.h(this.c, "call setBuffer before bind");
            GLES20.glBindBuffer(0x8892, 0);
            GLES20.glVertexAttribPointer(this.b, this.d, 0x1406, false, 0, ((Buffer)object0));
            GLES20.glEnableVertexAttribArray(this.b);
            GlUtil.e();
        }

        public static Attribute b(int v, int v1) {
            int[] arr_v = new int[1];
            GLES20.glGetProgramiv(v, 0x8B8A, arr_v, 0);
            int v2 = arr_v[0];
            byte[] arr_b = new byte[v2];
            GLES20.glGetActiveAttrib(v, v1, v2, new int[1], 0, new int[1], 0, new int[1], 0, arr_b, 0);
            String s = new String(arr_b, 0, GlProgram.j(arr_b));
            return new Attribute(s, GlProgram.h(v, s));
        }

        public void c(float[] arr_f, int v) {
            this.c = GlUtil.j(arr_f);
            this.d = v;
        }
    }

    static final class Uniform {
        public final String a;
        private final int b;
        private final int c;
        private final float[] d;
        private final int[] e;
        private int f;
        private int g;

        private Uniform(String s, int v, int v1) {
            this.a = s;
            this.b = v;
            this.c = v1;
            this.d = new float[16];
            this.e = new int[4];
        }

        public void a(boolean z) throws GlException {
            switch(this.c) {
                case 0x1404: {
                    GLES20.glUniform1iv(this.b, 1, this.e, 0);
                    GlUtil.e();
                    return;
                }
                case 0x1406: {
                    GLES20.glUniform1fv(this.b, 1, this.d, 0);
                    GlUtil.e();
                    return;
                }
                case 0x8B50: {
                    GLES20.glUniform2fv(this.b, 1, this.d, 0);
                    GlUtil.e();
                    return;
                }
                case 0x8B51: {
                    GLES20.glUniform3fv(this.b, 1, this.d, 0);
                    GlUtil.e();
                    return;
                }
                case 0x8B52: {
                    GLES20.glUniform4fv(this.b, 1, this.d, 0);
                    GlUtil.e();
                    return;
                }
                case 0x8B53: {
                    GLES20.glUniform2iv(this.b, 1, this.e, 0);
                    GlUtil.e();
                    return;
                }
                case 0x8B54: {
                    GLES20.glUniform3iv(this.b, 1, this.e, 0);
                    GlUtil.e();
                    return;
                }
                case 0x8B55: {
                    GLES20.glUniform4iv(this.b, 1, this.e, 0);
                    GlUtil.e();
                    return;
                }
                case 0x8B5B: {
                    GLES20.glUniformMatrix3fv(this.b, 1, false, this.d, 0);
                    GlUtil.e();
                    return;
                }
                case 0x8B5C: {
                    GLES20.glUniformMatrix4fv(this.b, 1, false, this.d, 0);
                    GlUtil.e();
                    return;
                }
                case 0x8B5E: 
                case 0x8BE7: 
                case 0x8D66: {
                    if(this.f == 0) {
                        throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                    }
                    GLES20.glActiveTexture(this.g + 0x84C0);
                    GlUtil.e();
                    GlUtil.c((this.c == 0x8B5E ? 0xDE1 : 0x8D65), this.f, (this.c != 0x8B5E || z ? 0x2600 : 0x2601));
                    GLES20.glUniform1i(this.b, this.g);
                    GlUtil.e();
                    return;
                }
                default: {
                    throw new IllegalStateException("Unexpected uniform type: " + this.c);
                }
            }
        }

        public static Uniform b(int v, int v1) {
            int[] arr_v = new int[1];
            GLES20.glGetProgramiv(v, 0x8B87, arr_v, 0);
            int[] arr_v1 = new int[1];
            int v2 = arr_v[0];
            byte[] arr_b = new byte[v2];
            GLES20.glGetActiveUniform(v, v1, v2, new int[1], 0, new int[1], 0, arr_v1, 0, arr_b, 0);
            String s = new String(arr_b, 0, GlProgram.j(arr_b));
            return new Uniform(s, GlProgram.k(v, s), arr_v1[0]);
        }

        public void c(float f) {
            this.d[0] = f;
        }

        public void d(float[] arr_f) {
            System.arraycopy(arr_f, 0, this.d, 0, arr_f.length);
        }

        public void e(int v) {
            this.e[0] = v;
        }

        public void f(int[] arr_v) {
            System.arraycopy(arr_v, 0, this.e, 0, arr_v.length);
        }

        public void g(int v, int v1) {
            this.f = v;
            this.g = v1;
        }
    }

    private final int a;
    private final Attribute[] b;
    private final Uniform[] c;
    private final Map d;
    private final Map e;
    private boolean f;
    private static final int g = 0x8BE7;

    public GlProgram(Context context0, String s, String s1) throws IOException, GlException {
        this(Util.w1(context0, s), Util.w1(context0, s1));
    }

    public GlProgram(String s, String s1) throws GlException {
        int v = GLES20.glCreateProgram();
        this.a = v;
        GlUtil.e();
        GlProgram.d(v, 0x8B31, s);
        GlProgram.d(v, 0x8B30, s1);
        GLES20.glLinkProgram(v);
        int[] arr_v = {0};
        GLES20.glGetProgramiv(v, 0x8B82, arr_v, 0);
        GlUtil.f(arr_v[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(v));
        GLES20.glUseProgram(v);
        this.d = new HashMap();
        int[] arr_v1 = new int[1];
        GLES20.glGetProgramiv(v, 0x8B89, arr_v1, 0);
        this.b = new Attribute[arr_v1[0]];
        for(int v1 = 0; v1 < arr_v1[0]; ++v1) {
            Attribute glProgram$Attribute0 = Attribute.b(this.a, v1);
            this.b[v1] = glProgram$Attribute0;
            this.d.put(glProgram$Attribute0.a, glProgram$Attribute0);
        }
        this.e = new HashMap();
        int[] arr_v2 = new int[1];
        GLES20.glGetProgramiv(this.a, 0x8B86, arr_v2, 0);
        this.c = new Uniform[arr_v2[0]];
        for(int v2 = 0; v2 < arr_v2[0]; ++v2) {
            Uniform glProgram$Uniform0 = Uniform.b(this.a, v2);
            this.c[v2] = glProgram$Uniform0;
            this.e.put(glProgram$Uniform0.a, glProgram$Uniform0);
        }
        GlUtil.e();
    }

    private static void d(int v, int v1, String s) throws GlException {
        int v2 = GLES20.glCreateShader(v1);
        GLES20.glShaderSource(v2, s);
        GLES20.glCompileShader(v2);
        boolean z = false;
        int[] arr_v = {0};
        GLES20.glGetShaderiv(v2, 0x8B81, arr_v, 0);
        if(arr_v[0] == 1) {
            z = true;
        }
        GlUtil.f(z, GLES20.glGetShaderInfoLog(v2) + ", source: \n" + s);
        GLES20.glAttachShader(v, v2);
        GLES20.glDeleteShader(v2);
        GlUtil.e();
    }

    public void e() throws GlException {
        Attribute[] arr_glProgram$Attribute = this.b;
        for(int v1 = 0; v1 < arr_glProgram$Attribute.length; ++v1) {
            arr_glProgram$Attribute[v1].a();
        }
        Uniform[] arr_glProgram$Uniform = this.c;
        for(int v = 0; v < arr_glProgram$Uniform.length; ++v) {
            arr_glProgram$Uniform[v].a(this.f);
        }
    }

    public void f() throws GlException {
        GLES20.glDeleteProgram(this.a);
        GlUtil.e();
    }

    public int g(String s) throws GlException {
        int v = this.i(s);
        GLES20.glEnableVertexAttribArray(v);
        GlUtil.e();
        return v;
    }

    private static int h(int v, String s) {
        return GLES20.glGetAttribLocation(v, s);
    }

    private int i(String s) {
        return GlProgram.h(this.a, s);
    }

    private static int j(byte[] arr_b) {
        for(int v = 0; v < arr_b.length; ++v) {
            if(arr_b[v] == 0) {
                return v;
            }
        }
        return arr_b.length;
    }

    private static int k(int v, String s) {
        return GLES20.glGetUniformLocation(v, s);
    }

    public int l(String s) {
        return GlProgram.k(this.a, s);
    }

    public void m(String s, float[] arr_f, int v) {
        ((Attribute)Assertions.g(((Attribute)this.d.get(s)))).c(arr_f, v);
    }

    public void n(boolean z) {
        this.f = z;
    }

    public void o(String s, float f) {
        ((Uniform)Assertions.g(((Uniform)this.e.get(s)))).c(f);
    }

    public void p(String s, float[] arr_f) {
        ((Uniform)Assertions.g(((Uniform)this.e.get(s)))).d(arr_f);
    }

    public void q(String s, float[] arr_f) {
        Uniform glProgram$Uniform0 = (Uniform)this.e.get(s);
        if(glProgram$Uniform0 == null) {
            return;
        }
        glProgram$Uniform0.d(arr_f);
    }

    public void r(String s, int v) {
        ((Uniform)Assertions.g(((Uniform)this.e.get(s)))).e(v);
    }

    public void s(String s, int[] arr_v) {
        ((Uniform)Assertions.g(((Uniform)this.e.get(s)))).f(arr_v);
    }

    public void t(String s, int v, int v1) {
        ((Uniform)Assertions.g(((Uniform)this.e.get(s)))).g(v, v1);
    }

    public void u() throws GlException {
        GLES20.glUseProgram(this.a);
        GlUtil.e();
    }
}

