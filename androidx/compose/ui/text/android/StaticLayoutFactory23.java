package androidx.compose.ui.text.android;

import android.os.Build.VERSION;
import android.text.StaticLayout.Builder;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.core.os.BuildCompat.PrereleaseSdkCheck;
import androidx.core.os.BuildCompat;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(23)
final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    @Override  // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    @DoNotInline
    @l
    public StaticLayout a(@l StaticLayoutParams staticLayoutParams0) {
        L.p(staticLayoutParams0, "params");
        StaticLayout.Builder staticLayout$Builder0 = StaticLayout.Builder.obtain(staticLayoutParams0.r(), staticLayoutParams0.q(), staticLayoutParams0.e(), staticLayoutParams0.o(), staticLayoutParams0.u());
        staticLayout$Builder0.setTextDirection(staticLayoutParams0.s());
        staticLayout$Builder0.setAlignment(staticLayoutParams0.a());
        staticLayout$Builder0.setMaxLines(staticLayoutParams0.n());
        staticLayout$Builder0.setEllipsize(staticLayoutParams0.c());
        staticLayout$Builder0.setEllipsizedWidth(staticLayoutParams0.d());
        staticLayout$Builder0.setLineSpacing(staticLayoutParams0.l(), staticLayoutParams0.m());
        staticLayout$Builder0.setIncludePad(staticLayoutParams0.g());
        staticLayout$Builder0.setBreakStrategy(staticLayoutParams0.b());
        staticLayout$Builder0.setHyphenationFrequency(staticLayoutParams0.f());
        staticLayout$Builder0.setIndents(staticLayoutParams0.i(), staticLayoutParams0.p());
        int v = Build.VERSION.SDK_INT;
        if(v >= 26) {
            L.o(staticLayout$Builder0, "this");
            StaticLayoutFactory26.a(staticLayout$Builder0, staticLayoutParams0.h());
        }
        if(v >= 28) {
            L.o(staticLayout$Builder0, "this");
            StaticLayoutFactory28.a(staticLayout$Builder0, staticLayoutParams0.t());
        }
        if(v >= 33) {
            L.o(staticLayout$Builder0, "this");
            StaticLayoutFactory33.b(staticLayout$Builder0, staticLayoutParams0.j(), staticLayoutParams0.k());
        }
        StaticLayout staticLayout0 = staticLayout$Builder0.build();
        L.o(staticLayout0, "obtain(params.text, para…  }\n            }.build()");
        return staticLayout0;
    }

    @Override  // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    @OptIn(markerClass = {PrereleaseSdkCheck.class})
    public boolean b(@l StaticLayout staticLayout0, boolean z) {
        L.p(staticLayout0, "layout");
        if(BuildCompat.m()) {
            return StaticLayoutFactory33.a(staticLayout0);
        }
        return Build.VERSION.SDK_INT >= 28 ? z : false;
    }
}

