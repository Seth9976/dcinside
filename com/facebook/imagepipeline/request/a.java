package com.facebook.imagepipeline.request;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.facebook.cache.common.e;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public abstract class com.facebook.imagepipeline.request.a implements f {
    public static final Bitmap.Config a;
    private static Method b;

    static {
        com.facebook.imagepipeline.request.a.a = Bitmap.Config.ARGB_8888;
    }

    @Override  // com.facebook.imagepipeline.request.f
    @h
    public e a() {
        return null;
    }

    @Override  // com.facebook.imagepipeline.request.f
    public com.facebook.common.references.a b(Bitmap bitmap0, com.facebook.imagepipeline.bitmaps.e e0) {
        Bitmap.Config bitmap$Config0 = bitmap0.getConfig();
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        if(bitmap$Config0 == null) {
            bitmap$Config0 = com.facebook.imagepipeline.request.a.a;
        }
        com.facebook.common.references.a a0 = e0.z(v, v1, bitmap$Config0);
        try {
            this.f(((Bitmap)a0.n()), bitmap0);
            return a0.b();
        }
        finally {
            com.facebook.common.references.a.j(a0);
        }
    }

    private static void d(Bitmap bitmap0, Bitmap bitmap1) {
        if(bitmap0.getConfig() == bitmap1.getConfig()) {
            try {
                if(com.facebook.imagepipeline.request.a.b == null) {
                    com.facebook.imagepipeline.request.a.b = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
                }
                com.facebook.imagepipeline.request.a.b.invoke(null, bitmap0, bitmap1);
                return;
            }
            catch(ClassNotFoundException classNotFoundException0) {
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", illegalAccessException0);
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", noSuchMethodException0);
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", invocationTargetException0);
            }
            throw new RuntimeException("Wrong Native code setup, reflection failed.", classNotFoundException0);
        }
        new Canvas(bitmap0).drawBitmap(bitmap1, 0.0f, 0.0f, null);
    }

    public void e(Bitmap bitmap0) {
    }

    public void f(Bitmap bitmap0, Bitmap bitmap1) {
        com.facebook.imagepipeline.request.a.d(bitmap0, bitmap1);
        this.e(bitmap0);
    }

    @Override  // com.facebook.imagepipeline.request.f
    public String getName() {
        return "Unknown postprocessor";
    }
}

