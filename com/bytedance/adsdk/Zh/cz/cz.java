package com.bytedance.adsdk.Zh.cz;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import com.bytedance.adsdk.Zh.JQp;
import com.bytedance.adsdk.Zh.PjT.PjT.RD;
import com.bytedance.adsdk.Zh.PjT.Zh.cr;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

public final class cz {
    private static final float JQp;
    private static final ThreadLocal PjT;
    private static final ThreadLocal ReZ;
    private static final ThreadLocal Zh;
    private static final ThreadLocal cr;

    static {
        cz.PjT = new ThreadLocal() {
            protected PathMeasure PjT() {
                return new PathMeasure();
            }

            @Override
            protected Object initialValue() {
                return this.PjT();
            }
        };
        cz.Zh = new ThreadLocal() {
            protected Path PjT() {
                return new Path();
            }

            @Override
            protected Object initialValue() {
                return this.PjT();
            }
        };
        cz.ReZ = new ThreadLocal() {
            protected Path PjT() {
                return new Path();
            }

            @Override
            protected Object initialValue() {
                return this.PjT();
            }
        };
        cz.cr = new ThreadLocal() {
            protected float[] PjT() {
                return new float[4];
            }

            @Override
            protected Object initialValue() {
                return this.PjT();
            }
        };
        cz.JQp = 0.707107f;
    }

    public static float PjT() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float PjT(Context context0) {
        return Settings.Global.getFloat(context0.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float PjT(Matrix matrix0) {
        float[] arr_f = (float[])cz.cr.get();
        arr_f[0] = 0.0f;
        arr_f[1] = 0.0f;
        arr_f[2] = cz.JQp;
        arr_f[3] = cz.JQp;
        matrix0.mapPoints(arr_f);
        return (float)Math.hypot(arr_f[2] - arr_f[0], arr_f[3] - arr_f[1]);
    }

    public static int PjT(float f, float f1, float f2, float f3) {
        int v = f == 0.0f ? 17 : ((int)(f * 527.0f));
        if(f1 != 0.0f) {
            v = (int)(((float)(v * 0x1F)) * f1);
        }
        if(f2 != 0.0f) {
            v = (int)(((float)(v * 0x1F)) * f2);
        }
        return f3 == 0.0f ? v : ((int)(((float)(v * 0x1F)) * f3));
    }

    public static Bitmap PjT(Bitmap bitmap0, int v, int v1) {
        if(bitmap0.getWidth() == v && bitmap0.getHeight() == v1) {
            return bitmap0;
        }
        Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, v, v1, true);
        bitmap0.recycle();
        return bitmap1;
    }

    public static Path PjT(PointF pointF0, PointF pointF1, PointF pointF2, PointF pointF3) {
        Path path0 = new Path();
        path0.moveTo(pointF0.x, pointF0.y);
        if(pointF2 != null && pointF3 != null && (pointF2.length() != 0.0f || pointF3.length() != 0.0f)) {
            path0.cubicTo(pointF2.x + pointF0.x, pointF0.y + pointF2.y, pointF1.x + pointF3.x, pointF1.y + pointF3.y, pointF1.x, pointF1.y);
            return path0;
        }
        path0.lineTo(pointF1.x, pointF1.y);
        return path0;
    }

    public static void PjT(Canvas canvas0, RectF rectF0, Paint paint0) {
        cz.PjT(canvas0, rectF0, paint0, 0x1F);
    }

    public static void PjT(Canvas canvas0, RectF rectF0, Paint paint0, int v) {
        JQp.PjT("Utils#saveLayer");
        if(Build.VERSION.SDK_INT < 23) {
            canvas0.saveLayer(rectF0, paint0, v);
        }
        else {
            canvas0.saveLayer(rectF0, paint0);
        }
        JQp.Zh("Utils#saveLayer");
    }

    public static void PjT(Path path0, float f, float f1, float f2) {
        JQp.PjT("applyTrimPathIfNeeded");
        PathMeasure pathMeasure0 = (PathMeasure)cz.PjT.get();
        Path path1 = (Path)cz.Zh.get();
        Path path2 = (Path)cz.ReZ.get();
        pathMeasure0.setPath(path0, false);
        float f3 = pathMeasure0.getLength();
        if(f == 1.0f && f1 == 0.0f) {
            JQp.Zh("applyTrimPathIfNeeded");
            return;
        }
        if(f3 >= 1.0f && ((double)Math.abs(f1 - f - 1.0f)) >= 0.01) {
            float f4 = f * f3;
            float f5 = f1 * f3;
            float f6 = f2 * f3;
            float f7 = Math.min(f4, f5) + f6;
            float f8 = Math.max(f4, f5) + f6;
            if(f7 >= f3 && f8 >= f3) {
                f7 = (float)com.bytedance.adsdk.Zh.cz.JQp.PjT(f7, f3);
                f8 = (float)com.bytedance.adsdk.Zh.cz.JQp.PjT(f8, f3);
            }
            if(f7 < 0.0f) {
                f7 = (float)com.bytedance.adsdk.Zh.cz.JQp.PjT(f7, f3);
            }
            if(f8 < 0.0f) {
                f8 = (float)com.bytedance.adsdk.Zh.cz.JQp.PjT(f8, f3);
            }
            int v = Float.compare(f7, f8);
            if(v == 0) {
                path0.reset();
                JQp.Zh("applyTrimPathIfNeeded");
                return;
            }
            if(v >= 0) {
                f7 -= f3;
            }
            path1.reset();
            pathMeasure0.getSegment(f7, f8, path1, true);
            if(f8 > f3) {
                path2.reset();
                pathMeasure0.getSegment(0.0f, f8 % f3, path2, true);
                path1.addPath(path2);
            }
            else if(f7 < 0.0f) {
                path2.reset();
                pathMeasure0.getSegment(f7 + f3, f3, path2, true);
                path1.addPath(path2);
            }
            path0.set(path1);
            JQp.Zh("applyTrimPathIfNeeded");
            return;
        }
        JQp.Zh("applyTrimPathIfNeeded");
    }

    public static void PjT(Path path0, RD rD0) {
        if(rD0 != null && !rD0.cz()) {
            cz.PjT(path0, ((cr)rD0.ReZ()).SM() / 100.0f, ((cr)rD0.cr()).SM() / 100.0f, ((cr)rD0.JQp()).SM() / 360.0f);
        }
    }

    public static void PjT(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Exception unused_ex) {
                return;
            }
            throw runtimeException0;
        }
    }

    public static boolean PjT(int v, int v1, int v2, int v3, int v4, int v5) {
        if(v < v3) {
            return false;
        }
        if(v > v3) {
            return true;
        }
        if(v1 < v4) {
            return false;
        }
        return v1 <= v4 ? v2 >= v5 : true;
    }

    // 去混淆评级： 中等(70)
    public static boolean PjT(Throwable throwable0) {
        return throwable0 instanceof SocketException || throwable0 instanceof ClosedChannelException || throwable0 instanceof InterruptedIOException || throwable0 instanceof ProtocolException || throwable0 instanceof SSLException || throwable0 instanceof UnknownHostException || throwable0 instanceof UnknownServiceException;
    }

    public static boolean Zh(Matrix matrix0) {
        float[] arr_f = (float[])cz.cr.get();
        arr_f[0] = 0.0f;
        arr_f[1] = 0.0f;
        arr_f[2] = 37394.730469f;
        arr_f[3] = 39575.234375f;
        matrix0.mapPoints(arr_f);
        return arr_f[0] == arr_f[2] || arr_f[1] == arr_f[3];
    }
}

