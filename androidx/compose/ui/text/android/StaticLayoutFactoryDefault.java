package androidx.compose.ui.text.android;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.util.Log;
import androidx.annotation.DoNotInline;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

final class StaticLayoutFactoryDefault implements StaticLayoutFactoryImpl {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final Constructor b() {
            StaticLayoutFactoryDefault.b = true;
            try {
                StaticLayoutFactoryDefault.c = StaticLayout.class.getConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
            }
            catch(NoSuchMethodException unused_ex) {
                StaticLayoutFactoryDefault.c = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            return StaticLayoutFactoryDefault.c;
        }
    }

    @l
    public static final Companion a;
    private static boolean b;
    @m
    private static Constructor c;

    static {
        StaticLayoutFactoryDefault.a = new Companion(null);
    }

    @Override  // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    @DoNotInline
    @l
    public StaticLayout a(@l StaticLayoutParams staticLayoutParams0) {
        StaticLayout staticLayout0;
        L.p(staticLayoutParams0, "params");
        Constructor constructor0 = StaticLayoutFactoryDefault.a.b();
        if(constructor0 != null) {
            try {
                staticLayout0 = null;
                staticLayout0 = (StaticLayout)constructor0.newInstance(staticLayoutParams0.r(), staticLayoutParams0.q(), staticLayoutParams0.e(), staticLayoutParams0.o(), staticLayoutParams0.u(), staticLayoutParams0.a(), staticLayoutParams0.s(), staticLayoutParams0.m(), staticLayoutParams0.l(), Boolean.valueOf(staticLayoutParams0.g()), staticLayoutParams0.c(), staticLayoutParams0.d(), staticLayoutParams0.n());
                return staticLayout0 == null ? new StaticLayout(staticLayoutParams0.r(), staticLayoutParams0.q(), staticLayoutParams0.e(), staticLayoutParams0.o(), staticLayoutParams0.u(), staticLayoutParams0.a(), staticLayoutParams0.m(), staticLayoutParams0.l(), staticLayoutParams0.g(), staticLayoutParams0.c(), staticLayoutParams0.d()) : staticLayout0;
            }
            catch(IllegalAccessException unused_ex) {
                StaticLayoutFactoryDefault.c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
                return staticLayout0 == null ? new StaticLayout(staticLayoutParams0.r(), staticLayoutParams0.q(), staticLayoutParams0.e(), staticLayoutParams0.o(), staticLayoutParams0.u(), staticLayoutParams0.a(), staticLayoutParams0.m(), staticLayoutParams0.l(), staticLayoutParams0.g(), staticLayoutParams0.c(), staticLayoutParams0.d()) : staticLayout0;
            }
            catch(InstantiationException unused_ex) {
                StaticLayoutFactoryDefault.c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
                return staticLayout0 == null ? new StaticLayout(staticLayoutParams0.r(), staticLayoutParams0.q(), staticLayoutParams0.e(), staticLayoutParams0.o(), staticLayoutParams0.u(), staticLayoutParams0.a(), staticLayoutParams0.m(), staticLayoutParams0.l(), staticLayoutParams0.g(), staticLayoutParams0.c(), staticLayoutParams0.d()) : staticLayout0;
            }
            catch(InvocationTargetException unused_ex) {
                StaticLayoutFactoryDefault.c = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
                return staticLayout0 == null ? new StaticLayout(staticLayoutParams0.r(), staticLayoutParams0.q(), staticLayoutParams0.e(), staticLayoutParams0.o(), staticLayoutParams0.u(), staticLayoutParams0.a(), staticLayoutParams0.m(), staticLayoutParams0.l(), staticLayoutParams0.g(), staticLayoutParams0.c(), staticLayoutParams0.d()) : staticLayout0;
            }
        }
        return new StaticLayout(staticLayoutParams0.r(), staticLayoutParams0.q(), staticLayoutParams0.e(), staticLayoutParams0.o(), staticLayoutParams0.u(), staticLayoutParams0.a(), staticLayoutParams0.m(), staticLayoutParams0.l(), staticLayoutParams0.g(), staticLayoutParams0.c(), staticLayoutParams0.d());
    }

    @Override  // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public boolean b(@l StaticLayout staticLayout0, boolean z) {
        L.p(staticLayout0, "layout");
        return false;
    }

    public static final boolean d() [...] // 潜在的解密器
}

