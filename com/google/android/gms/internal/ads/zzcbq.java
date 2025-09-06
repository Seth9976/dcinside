package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import jeb.synthetic.FIN;

public final class zzcbq extends Thread implements SurfaceTexture.OnFrameAvailableListener, zzcbo {
    private volatile boolean zzA;
    private volatile boolean zzB;
    private static final float[] zza;
    private final zzcbp zzb;
    private final float[] zzc;
    private final float[] zzd;
    private final float[] zze;
    private final float[] zzf;
    private final float[] zzg;
    private final float[] zzh;
    private final float[] zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private SurfaceTexture zzo;
    private SurfaceTexture zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private final FloatBuffer zzt;
    private final CountDownLatch zzu;
    private final Object zzv;
    private EGL10 zzw;
    private EGLDisplay zzx;
    private EGLContext zzy;
    private EGLSurface zzz;

    static {
        zzcbq.zza = new float[]{-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    }

    public zzcbq(Context context0) {
        super("SphericalVideoProcessor");
        FloatBuffer floatBuffer0 = ByteBuffer.allocateDirect(0x30).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.zzt = floatBuffer0;
        floatBuffer0.put(zzcbq.zza).position(0);
        this.zzc = new float[9];
        this.zzd = new float[9];
        this.zze = new float[9];
        this.zzf = new float[9];
        this.zzg = new float[9];
        this.zzh = new float[9];
        this.zzi = new float[9];
        this.zzj = NaNf;
        zzcbp zzcbp0 = new zzcbp(context0);
        this.zzb = zzcbp0;
        zzcbp0.zzb(this);
        this.zzu = new CountDownLatch(1);
        this.zzv = new Object();
    }

    @Override  // android.graphics.SurfaceTexture$OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture0) {
        ++this.zzs;
        synchronized(this.zzv) {
            this.zzv.notifyAll();
        }
    }

    @Override
    public final void run() {
        Object object0;
        int v2;
        boolean z;
        EGLConfig eGLConfig0;
        if(this.zzp != null) {
            EGL10 eGL100 = (EGL10)EGLContext.getEGL();
            this.zzw = eGL100;
            EGLDisplay eGLDisplay0 = eGL100.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.zzx = eGLDisplay0;
            if(eGLDisplay0 == EGL10.EGL_NO_DISPLAY) {
                z = false;
            }
            else if(this.zzw.eglInitialize(eGLDisplay0, new int[2])) {
                int[] arr_v = new int[1];
                EGLConfig[] arr_eGLConfig = new EGLConfig[1];
                if(!this.zzw.eglChooseConfig(this.zzx, new int[]{0x3040, 4, 0x3024, 8, 0x3023, 8, 0x3022, 8, 0x3025, 16, 0x3038}, arr_eGLConfig, 1, arr_v)) {
                    eGLConfig0 = null;
                }
                else if(arr_v[0] > 0) {
                    eGLConfig0 = arr_eGLConfig[0];
                }
                else {
                    eGLConfig0 = null;
                }
                if(eGLConfig0 == null) {
                    z = false;
                }
                else {
                    EGLContext eGLContext0 = EGL10.EGL_NO_CONTEXT;
                    EGLContext eGLContext1 = this.zzw.eglCreateContext(this.zzx, eGLConfig0, eGLContext0, new int[]{0x3098, 2, 0x3038});
                    this.zzy = eGLContext1;
                    if(eGLContext1 == null || eGLContext1 == eGLContext0) {
                        z = false;
                    }
                    else {
                        EGLSurface eGLSurface0 = this.zzw.eglCreateWindowSurface(this.zzx, eGLConfig0, this.zzp, null);
                        this.zzz = eGLSurface0;
                        z = eGLSurface0 == null || eGLSurface0 == EGL10.EGL_NO_SURFACE || !this.zzw.eglMakeCurrent(this.zzx, eGLSurface0, eGLSurface0, this.zzy) ? false : true;
                    }
                }
            }
            else {
                z = false;
            }
            int v = zzcbq.zzl(0x8B31, (((String)zzbe.zzc().zza(zzbcl.zzbs)).equals(zzbcl.zzbs.zzk()) ? "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}" : ((String)zzbe.zzc().zza(zzbcl.zzbs))));
            if(v == 0) {
                v2 = 0;
            }
            else {
                int v1 = zzcbq.zzl(0x8B30, (((String)zzbe.zzc().zza(zzbcl.zzbt)).equals(zzbcl.zzbt.zzk()) ? "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}" : ((String)zzbe.zzc().zza(zzbcl.zzbt))));
                if(v1 == 0) {
                    v2 = 0;
                }
                else {
                    v2 = GLES20.glCreateProgram();
                    zzcbq.zzh("createProgram");
                    if(v2 != 0) {
                        GLES20.glAttachShader(v2, v);
                        zzcbq.zzh("attachShader");
                        GLES20.glAttachShader(v2, v1);
                        zzcbq.zzh("attachShader");
                        GLES20.glLinkProgram(v2);
                        zzcbq.zzh("linkProgram");
                        int[] arr_v1 = new int[1];
                        GLES20.glGetProgramiv(v2, 0x8B82, arr_v1, 0);
                        zzcbq.zzh("getProgramiv");
                        if(arr_v1[0] == 1) {
                            GLES20.glValidateProgram(v2);
                            zzcbq.zzh("validateProgram");
                        }
                        else {
                            Log.e("SphericalVideoRenderer", "Could not link program: ");
                            Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(v2));
                            GLES20.glDeleteProgram(v2);
                            zzcbq.zzh("deleteProgram");
                            v2 = 0;
                        }
                    }
                }
            }
            this.zzq = v2;
            GLES20.glUseProgram(v2);
            zzcbq.zzh("useProgram");
            int v3 = GLES20.glGetAttribLocation(this.zzq, "aPosition");
            GLES20.glVertexAttribPointer(v3, 3, 0x1406, false, 12, this.zzt);
            zzcbq.zzh("vertexAttribPointer");
            GLES20.glEnableVertexAttribArray(v3);
            zzcbq.zzh("enableVertexAttribArray");
            int[] arr_v2 = new int[1];
            GLES20.glGenTextures(1, arr_v2, 0);
            zzcbq.zzh("genTextures");
            int v4 = arr_v2[0];
            GLES20.glBindTexture(0x8D65, v4);
            zzcbq.zzh("bindTextures");
            GLES20.glTexParameteri(0x8D65, 0x2800, 0x2601);
            zzcbq.zzh("texParameteri");
            GLES20.glTexParameteri(0x8D65, 0x2801, 0x2601);
            zzcbq.zzh("texParameteri");
            GLES20.glTexParameteri(0x8D65, 0x2802, 0x812F);
            zzcbq.zzh("texParameteri");
            GLES20.glTexParameteri(0x8D65, 0x2803, 0x812F);
            zzcbq.zzh("texParameteri");
            int v5 = GLES20.glGetUniformLocation(this.zzq, "uVMat");
            this.zzr = v5;
            GLES20.glUniformMatrix3fv(v5, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
            if(z && this.zzq != 0) {
                SurfaceTexture surfaceTexture0 = new SurfaceTexture(v4);
                this.zzo = surfaceTexture0;
                surfaceTexture0.setOnFrameAvailableListener(this);
                this.zzu.countDown();
                this.zzb.zzc();
                try {
                    this.zzA = true;
                }
                catch(IllegalStateException unused_ex) {
                    goto label_148;
                }
                catch(Throwable throwable0) {
                    goto label_147;
                }
                finally {
                    this.zzb.zzd();
                    this.zzo.setOnFrameAvailableListener(null);
                    this.zzo = null;
                    this.zzg();
                }
                while(!this.zzB) {
                    try {
                        try {
                            while(this.zzs > 0) {
                                this.zzo.updateTexImage();
                                --this.zzs;
                            }
                            if(this.zzb.zze(this.zzc)) {
                                if(Float.isNaN(this.zzj)) {
                                    new float[]{this.zzc[0] * 0.0f + this.zzc[1] * 1.0f + this.zzc[2] * 0.0f, this.zzc[3] * 0.0f + this.zzc[4] * 1.0f + this.zzc[5] * 0.0f, this.zzc[6] * 0.0f + this.zzc[7] * 1.0f + this.zzc[8] * 0.0f};
                                    float f = this.zzc[0] * 0.0f + this.zzc[1] * 1.0f + this.zzc[2] * 0.0f;
                                    float f1 = this.zzc[3] * 0.0f + this.zzc[4] * 1.0f + this.zzc[5] * 0.0f;
                                    float f2 = this.zzc[6] * 0.0f + this.zzc[7] * 1.0f + this.zzc[8] * 0.0f;
                                    this.zzj = -(((float)Math.atan2(f1, f)) - 1.570796f);
                                }
                                zzcbq.zzk(this.zzh, this.zzj + this.zzk);
                            }
                            else {
                                zzcbq.zzj(this.zzc, -1.570796f);
                                zzcbq.zzk(this.zzh, this.zzk);
                            }
                            zzcbq.zzj(this.zzd, 1.570796f);
                            zzcbq.zzi(this.zze, this.zzh, this.zzd);
                            zzcbq.zzi(this.zzf, this.zzc, this.zze);
                            zzcbq.zzj(this.zzg, this.zzl);
                            zzcbq.zzi(this.zzi, this.zzg, this.zzf);
                            GLES20.glUniformMatrix3fv(this.zzr, 1, false, this.zzi, 0);
                            GLES20.glDrawArrays(5, 0, 4);
                            zzcbq.zzh("drawArrays");
                            GLES20.glFinish();
                            this.zzw.eglSwapBuffers(this.zzx, this.zzz);
                            if(this.zzA) {
                                GLES20.glViewport(0, 0, this.zzn, this.zzm);
                                zzcbq.zzh("viewport");
                                int v7 = GLES20.glGetUniformLocation(this.zzq, "uFOVx");
                                int v8 = GLES20.glGetUniformLocation(this.zzq, "uFOVy");
                                int v9 = this.zzn;
                                int v10 = this.zzm;
                                if(v9 > v10) {
                                    GLES20.glUniform1f(v7, 0.872665f);
                                    GLES20.glUniform1f(v8, ((float)this.zzm) * 0.872665f / ((float)this.zzn));
                                }
                                else {
                                    GLES20.glUniform1f(v7, ((float)v9) * 0.872665f / ((float)v10));
                                    GLES20.glUniform1f(v8, 0.872665f);
                                }
                                this.zzA = false;
                            }
                            try {
                                object0 = this.zzv;
                                __monitor_enter(object0);
                            }
                            catch(InterruptedException unused_ex) {
                                continue;
                            }
                            int v11 = FIN.finallyOpen$NT();
                            if(this.zzB || this.zzA || this.zzs != 0) {
                                goto label_142;
                            }
                            else {
                                try {
                                    this.zzv.wait();
                                label_142:
                                    FIN.finallyCodeBegin$NT(v11);
                                    __monitor_exit(object0);
                                    FIN.finallyCodeEnd$NT(v11);
                                }
                                catch(InterruptedException unused_ex) {
                                }
                                continue;
                            }
                        label_147:
                            goto label_150;
                        }
                        catch(IllegalStateException unused_ex) {
                        }
                    }
                    catch(Throwable throwable0) {
                        goto label_147;
                    }
                label_148:
                    zzo.zzj("SphericalVideoProcessor halted unexpectedly.");
                    break;
                label_150:
                    zzo.zzh("SphericalVideoProcessor died.", throwable0);
                    zzv.zzp().zzw(throwable0, "SphericalVideoProcessor.run.2");
                    if(true) {
                        break;
                    }
                }
                return;
            }
            String s = "EGL initialization failed: " + GLUtils.getEGLErrorString(this.zzw.eglGetError());
            zzo.zzg(s);
            zzv.zzp().zzw(new Throwable(s), "SphericalVideoProcessor.run.1");
            this.zzg();
            this.zzu.countDown();
            return;
        }
        zzo.zzg("SphericalVideoProcessor started with no output texture.");
        this.zzu.countDown();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbo
    public final void zza() {
        synchronized(this.zzv) {
            this.zzv.notifyAll();
        }
    }

    @Nullable
    public final SurfaceTexture zzb() {
        if(this.zzp == null) {
            return null;
        }
        try {
            this.zzu.await();
        }
        catch(InterruptedException unused_ex) {
        }
        return this.zzo;
    }

    public final void zzc(int v, int v1) {
        synchronized(this.zzv) {
            this.zzn = v;
            this.zzm = v1;
            this.zzA = true;
            this.zzv.notifyAll();
        }
    }

    public final void zzd(SurfaceTexture surfaceTexture0, int v, int v1) {
        this.zzn = v;
        this.zzm = v1;
        this.zzp = surfaceTexture0;
    }

    public final void zze() {
        synchronized(this.zzv) {
            this.zzB = true;
            this.zzp = null;
            this.zzv.notifyAll();
        }
    }

    public final void zzf(float f, float f1) {
        int v = this.zzn;
        int v1 = this.zzm;
        if(v <= v1) {
            v = v1;
        }
        this.zzk -= f * 1.745329f / ((float)v);
        float f2 = this.zzl - f1 * 1.745329f / ((float)v);
        this.zzl = f2;
        if(f2 < -1.570796f) {
            this.zzl = -1.570796f;
            f2 = -1.570796f;
        }
        if(f2 > 1.570796f) {
            this.zzl = 1.570796f;
        }
    }

    @VisibleForTesting
    final boolean zzg() {
        EGLSurface eGLSurface0 = this.zzz;
        boolean z = false;
        if(eGLSurface0 != null) {
            EGLSurface eGLSurface1 = EGL10.EGL_NO_SURFACE;
            if(eGLSurface0 != eGLSurface1) {
                boolean z1 = this.zzw.eglMakeCurrent(this.zzx, eGLSurface1, eGLSurface1, EGL10.EGL_NO_CONTEXT);
                z = this.zzw.eglDestroySurface(this.zzx, this.zzz) | z1;
                this.zzz = null;
            }
        }
        EGLContext eGLContext0 = this.zzy;
        if(eGLContext0 != null) {
            z |= this.zzw.eglDestroyContext(this.zzx, eGLContext0);
            this.zzy = null;
        }
        EGLDisplay eGLDisplay0 = this.zzx;
        if(eGLDisplay0 != null) {
            boolean z2 = this.zzw.eglTerminate(eGLDisplay0);
            this.zzx = null;
            return z2 | z;
        }
        return z;
    }

    private static final void zzh(String s) {
        int v = GLES20.glGetError();
        if(v != 0) {
            Log.e("SphericalVideoRenderer", s + ": glError " + v);
        }
    }

    private static final void zzi(float[] arr_f, float[] arr_f1, float[] arr_f2) {
        float f = arr_f1[0] * arr_f2[0];
        float f1 = arr_f1[1];
        float f2 = arr_f2[3];
        float f3 = arr_f1[2];
        float f4 = arr_f2[6];
        arr_f[0] = f + f1 * f2 + f3 * f4;
        float f5 = arr_f1[0];
        float f6 = arr_f2[1] * f5;
        float f7 = arr_f2[4];
        float f8 = arr_f2[7];
        arr_f[1] = f6 + f1 * f7 + f3 * f8;
        float f9 = f5 * arr_f2[2];
        float f10 = arr_f1[1];
        float f11 = arr_f2[5];
        float f12 = arr_f2[8];
        arr_f[2] = f9 + f10 * f11 + f3 * f12;
        float f13 = arr_f1[3];
        float f14 = arr_f2[0];
        float f15 = arr_f1[4];
        float f16 = arr_f1[5];
        arr_f[3] = f13 * f14 + f2 * f15 + f16 * f4;
        float f17 = arr_f1[3];
        float f18 = arr_f2[1];
        arr_f[4] = f17 * f18 + f15 * f7 + f16 * f8;
        float f19 = arr_f2[2];
        arr_f[5] = f17 * f19 + arr_f1[4] * f11 + f16 * f12;
        float f20 = arr_f1[6] * f14;
        float f21 = arr_f1[7];
        float f22 = arr_f2[3] * f21;
        float f23 = arr_f1[8];
        arr_f[6] = f20 + f22 + f4 * f23;
        float f24 = arr_f1[6];
        arr_f[7] = f18 * f24 + f21 * arr_f2[4] + f8 * f23;
        arr_f[8] = f24 * f19 + arr_f1[7] * arr_f2[5] + f23 * f12;
    }

    private static final void zzj(float[] arr_f, float f) {
        arr_f[0] = 1.0f;
        arr_f[1] = 0.0f;
        arr_f[2] = 0.0f;
        arr_f[3] = 0.0f;
        arr_f[4] = (float)Math.cos(f);
        arr_f[5] = (float)(-Math.sin(f));
        arr_f[6] = 0.0f;
        arr_f[7] = (float)Math.sin(f);
        arr_f[8] = (float)Math.cos(f);
    }

    private static final void zzk(float[] arr_f, float f) {
        arr_f[0] = (float)Math.cos(f);
        arr_f[1] = (float)(-Math.sin(f));
        arr_f[2] = 0.0f;
        arr_f[3] = (float)Math.sin(f);
        arr_f[4] = (float)Math.cos(f);
        arr_f[5] = 0.0f;
        arr_f[6] = 0.0f;
        arr_f[7] = 0.0f;
        arr_f[8] = 1.0f;
    }

    private static final int zzl(int v, String s) {
        int v1 = GLES20.glCreateShader(v);
        zzcbq.zzh("createShader");
        if(v1 != 0) {
            GLES20.glShaderSource(v1, s);
            zzcbq.zzh("shaderSource");
            GLES20.glCompileShader(v1);
            zzcbq.zzh("compileShader");
            int[] arr_v = new int[1];
            GLES20.glGetShaderiv(v1, 0x8B81, arr_v, 0);
            zzcbq.zzh("getShaderiv");
            if(arr_v[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + v + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(v1));
                GLES20.glDeleteShader(v1);
                zzcbq.zzh("deleteShader");
                return 0;
            }
        }
        return v1;
    }
}

