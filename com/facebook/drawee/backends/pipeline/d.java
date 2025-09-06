package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.m0;
import com.facebook.imagepipeline.core.p0;
import com.facebook.imagepipeline.core.x;
import com.facebook.imagepipeline.core.y;
import java.lang.reflect.InvocationTargetException;
import o1.c;
import o3.h;
import x0.a;

public class d {
    private static final Class a = null;
    @h
    private static g b = null;
    private static volatile boolean c = false;

    static {
        d.a = d.class;
    }

    public static g a() {
        return d.b;
    }

    public static x b() {
        return d.c().l();
    }

    public static m0 c() {
        return m0.n();
    }

    public static boolean d() {
        return d.c;
    }

    public static void e(Context context0) {
        d.g(context0, null, null);
    }

    public static void f(Context context0, @h y y0) {
        d.g(context0, y0, null);
    }

    public static void g(Context context0, @h y y0, @h b b0) {
        d.h(context0, y0, b0, true);
    }

    public static void h(Context context0, @h y y0, @h b b0, boolean z) {
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("Fresco#initialize");
        }
        if(d.c) {
            a.k0(d.a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        }
        else {
            d.c = true;
        }
        p0.b(z);
        if(!o1.a.e()) {
            if(com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("Fresco.initialize->SoLoader.init");
            }
            try {
                try {
                    Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context0);
                    goto label_32;
                }
                catch(ClassNotFoundException unused_ex) {
                }
                catch(IllegalAccessException unused_ex) {
                    goto label_16;
                }
                catch(InvocationTargetException unused_ex) {
                    goto label_20;
                }
                catch(NoSuchMethodException unused_ex) {
                    goto label_24;
                }
                o1.a.d(new c());
            }
            catch(Throwable throwable0) {
                goto label_29;
            }
            if(com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.c();
                goto label_34;
                try {
                label_16:
                    o1.a.d(new c());
                }
                catch(Throwable throwable0) {
                    goto label_29;
                }
                if(com.facebook.imagepipeline.systrace.b.e()) {
                    com.facebook.imagepipeline.systrace.b.c();
                    goto label_34;
                    try {
                    label_20:
                        o1.a.d(new c());
                    }
                    catch(Throwable throwable0) {
                        goto label_29;
                    }
                    if(com.facebook.imagepipeline.systrace.b.e()) {
                        com.facebook.imagepipeline.systrace.b.c();
                        goto label_34;
                        try {
                        label_24:
                            o1.a.d(new c());
                        }
                        catch(Throwable throwable0) {
                            goto label_29;
                        }
                        if(com.facebook.imagepipeline.systrace.b.e()) {
                            com.facebook.imagepipeline.systrace.b.c();
                            goto label_34;
                        label_29:
                            if(com.facebook.imagepipeline.systrace.b.e()) {
                                com.facebook.imagepipeline.systrace.b.c();
                            }
                            throw throwable0;
                        label_32:
                            if(com.facebook.imagepipeline.systrace.b.e()) {
                                com.facebook.imagepipeline.systrace.b.c();
                            }
                        }
                    }
                }
            }
        }
    label_34:
        Context context1 = context0.getApplicationContext();
        if(y0 == null) {
            m0.v(context1);
        }
        else {
            m0.w(y0);
        }
        d.i(context1, b0);
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    private static void i(Context context0, @h b b0) {
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("Fresco.initializeDrawee");
        }
        g g0 = new g(context0, b0);
        d.b = g0;
        SimpleDraweeView.l(g0);
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    public static f j() {
        return d.b.a();
    }

    public static void k() {
        d.b = null;
        SimpleDraweeView.p();
        m0.z();
    }
}

