package com.dcinside.app.gif.frame;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class b {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final void b(int v, String s) {
            if(v < 0) {
                throw new RuntimeException("Unable to locate \'" + s + "\' in program");
            }
        }
    }

    @l
    private final FloatBuffer a;
    @l
    private final float[] b;
    @l
    private final float[] c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    @l
    public static final a j = null;
    private static final int k = 4;
    private static final int l = 20;
    private static final int m = 0;
    private static final int n = 3;
    @l
    private static final String o = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    @l
    private static final String p = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";

    static {
        b.j = new a(null);
    }

    public b() {
        this.b = new float[16];
        float[] arr_f = new float[16];
        this.c = arr_f;
        this.e = 0xFFFFCFC7;
        FloatBuffer floatBuffer0 = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        L.o(floatBuffer0, "asFloatBuffer(...)");
        this.a = floatBuffer0;
        floatBuffer0.put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        Matrix.setIdentityM(arr_f, 0);
    }

    public final void a(@l String s) {
        L.p(s, "op");
        int v = GLES20.glGetError();
        if(v != 0) {
            throw new RuntimeException(s + ": glError " + v);
        }
    }

    private final int b(String s, String s1) {
        int v = this.e(0x8B31, s);
        if(v == 0) {
            return 0;
        }
        int v1 = this.e(0x8B30, s1);
        if(v1 == 0) {
            return 0;
        }
        int v2 = GLES20.glCreateProgram();
        GLES20.glAttachShader(v2, v);
        this.a("glAttachShader");
        GLES20.glAttachShader(v2, v1);
        this.a("glAttachShader");
        GLES20.glLinkProgram(v2);
        int[] arr_v = new int[1];
        GLES20.glGetProgramiv(v2, 0x8B82, arr_v, 0);
        if(arr_v[0] != 1) {
            GLES20.glDeleteProgram(v2);
            return 0;
        }
        return v2;
    }

    public final void c(@l SurfaceTexture surfaceTexture0, float f) {
        L.p(surfaceTexture0, "st");
        this.a("onDrawFrame start");
        surfaceTexture0.getTransformMatrix(this.c);
        Matrix.setIdentityM(this.c, 0);
        int v = Float.compare(f, 0.0f);
        if(v != 0) {
            Matrix.translateM(this.c, 0, 0.5f, 0.5f, 0.0f);
            Matrix.rotateM(this.c, 0, -f, 0.0f, 0.0f, 1.0f);
        }
        Matrix.scaleM(this.c, 0, 1.0f, 1.0f, 1.0f);
        if(v != 0) {
            Matrix.translateM(this.c, 0, -0.5f, -0.5f, 0.0f);
        }
        GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        GLES20.glClear(0x4100);
        GLES20.glUseProgram(this.d);
        this.a("glUseProgram");
        GLES20.glActiveTexture(0x84C0);
        GLES20.glBindTexture(0x8D65, this.e);
        this.a.position(0);
        GLES20.glVertexAttribPointer(this.h, 3, 0x1406, false, 20, this.a);
        this.a("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.h);
        this.a("glEnableVertexAttribArray maPositionHandle");
        this.a.position(3);
        GLES20.glVertexAttribPointer(this.i, 2, 0x1406, false, 20, this.a);
        this.a("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.i);
        this.a("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.b, 0);
        GLES20.glUniformMatrix4fv(this.f, 1, false, this.b, 0);
        GLES20.glUniformMatrix4fv(this.g, 1, false, this.c, 0);
        GLES20.glDrawArrays(5, 0, 4);
        this.a("glDrawArrays");
        GLES20.glBindTexture(0x8D65, 0);
    }

    public final int d() {
        return this.e;
    }

    private final int e(int v, String s) {
        int v1 = GLES20.glCreateShader(v);
        this.a("glCreateShader type=" + v);
        GLES20.glShaderSource(v1, s);
        GLES20.glCompileShader(v1);
        int[] arr_v = new int[1];
        GLES20.glGetShaderiv(v1, 0x8B81, arr_v, 0);
        if(arr_v[0] == 0) {
            GLES20.glDeleteShader(v1);
            return 0;
        }
        return v1;
    }

    public final void f() {
        int v = this.b("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        this.d = v;
        if(v == 0) {
            throw new RuntimeException("failed creating program");
        }
        int v1 = GLES20.glGetAttribLocation(v, "aPosition");
        this.h = v1;
        b.j.b(v1, "aPosition");
        int v2 = GLES20.glGetAttribLocation(this.d, "aTextureCoord");
        this.i = v2;
        b.j.b(v2, "aTextureCoord");
        int v3 = GLES20.glGetUniformLocation(this.d, "uMVPMatrix");
        this.f = v3;
        b.j.b(v3, "uMVPMatrix");
        int v4 = GLES20.glGetUniformLocation(this.d, "uSTMatrix");
        this.g = v4;
        b.j.b(v4, "uSTMatrix");
        int[] arr_v = new int[1];
        GLES20.glGenTextures(1, arr_v, 0);
        this.e = arr_v[0];
        GLES20.glBindTexture(0x8D65, arr_v[0]);
        this.a("glBindTexture mTextureID");
        GLES20.glTexParameterf(0x8D65, 0x2801, 9728.0f);
        GLES20.glTexParameterf(0x8D65, 0x2800, 9729.0f);
        GLES20.glTexParameteri(0x8D65, 0x2802, 0x812F);
        GLES20.glTexParameteri(0x8D65, 0x2803, 0x812F);
        this.a("glTexParameter");
    }
}

