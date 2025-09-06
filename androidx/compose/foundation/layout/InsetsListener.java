package androidx.compose.foundation.layout;

import android.os.Build.VERSION;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat;
import androidx.core.view.WindowInsetsAnimationCompat.Callback;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class InsetsListener extends Callback implements View.OnAttachStateChangeListener, OnApplyWindowInsetsListener, Runnable {
    @l
    private final WindowInsetsHolder e;
    private boolean f;
    private boolean g;
    @m
    private WindowInsetsCompat h;

    public InsetsListener(@l WindowInsetsHolder windowInsetsHolder0) {
        L.p(windowInsetsHolder0, "composeInsets");
        super(!windowInsetsHolder0.f());
        this.e = windowInsetsHolder0;
    }

    @Override  // androidx.core.view.OnApplyWindowInsetsListener
    @l
    public WindowInsetsCompat a(@l View view0, @l WindowInsetsCompat windowInsetsCompat0) {
        L.p(view0, "view");
        L.p(windowInsetsCompat0, "insets");
        this.h = windowInsetsCompat0;
        this.e.C(windowInsetsCompat0);
        if(!this.f) {
            if(!this.g) {
                this.e.B(windowInsetsCompat0);
                WindowInsetsHolder.A(this.e, windowInsetsCompat0, 0, 2, null);
            }
        }
        else if(Build.VERSION.SDK_INT == 30) {
            view0.post(this);
        }
        if(this.e.f()) {
            windowInsetsCompat0 = WindowInsetsCompat.c;
            L.o(windowInsetsCompat0, "CONSUMED");
        }
        return windowInsetsCompat0;
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public void c(@l WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
        L.p(windowInsetsAnimationCompat0, "animation");
        this.f = false;
        this.g = false;
        WindowInsetsCompat windowInsetsCompat0 = this.h;
        if(windowInsetsAnimationCompat0.b() != 0L && windowInsetsCompat0 != null) {
            this.e.B(windowInsetsCompat0);
            this.e.C(windowInsetsCompat0);
            WindowInsetsHolder.A(this.e, windowInsetsCompat0, 0, 2, null);
        }
        this.h = null;
        super.c(windowInsetsAnimationCompat0);
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public void d(@l WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
        L.p(windowInsetsAnimationCompat0, "animation");
        this.f = true;
        this.g = true;
        super.d(windowInsetsAnimationCompat0);
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    @l
    public WindowInsetsCompat e(@l WindowInsetsCompat windowInsetsCompat0, @l List list0) {
        L.p(windowInsetsCompat0, "insets");
        L.p(list0, "runningAnimations");
        WindowInsetsHolder.A(this.e, windowInsetsCompat0, 0, 2, null);
        if(this.e.f()) {
            windowInsetsCompat0 = WindowInsetsCompat.c;
            L.o(windowInsetsCompat0, "CONSUMED");
        }
        return windowInsetsCompat0;
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    @l
    public BoundsCompat f(@l WindowInsetsAnimationCompat windowInsetsAnimationCompat0, @l BoundsCompat windowInsetsAnimationCompat$BoundsCompat0) {
        L.p(windowInsetsAnimationCompat0, "animation");
        L.p(windowInsetsAnimationCompat$BoundsCompat0, "bounds");
        this.f = false;
        BoundsCompat windowInsetsAnimationCompat$BoundsCompat1 = super.f(windowInsetsAnimationCompat0, windowInsetsAnimationCompat$BoundsCompat0);
        L.o(windowInsetsAnimationCompat$BoundsCompat1, "super.onStart(animation, bounds)");
        return windowInsetsAnimationCompat$BoundsCompat1;
    }

    @l
    public final WindowInsetsHolder g() {
        return this.e;
    }

    public final boolean h() {
        return this.f;
    }

    public final boolean i() {
        return this.g;
    }

    @m
    public final WindowInsetsCompat j() {
        return this.h;
    }

    public final void k(boolean z) {
        this.f = z;
    }

    public final void l(boolean z) {
        this.g = z;
    }

    public final void m(@m WindowInsetsCompat windowInsetsCompat0) {
        this.h = windowInsetsCompat0;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewAttachedToWindow(@l View view0) {
        L.p(view0, "view");
        view0.requestApplyInsets();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@l View view0) {
        L.p(view0, "v");
    }

    @Override
    public void run() {
        if(this.f) {
            this.f = false;
            this.g = false;
            WindowInsetsCompat windowInsetsCompat0 = this.h;
            if(windowInsetsCompat0 != null) {
                this.e.B(windowInsetsCompat0);
                WindowInsetsHolder.A(this.e, windowInsetsCompat0, 0, 2, null);
                this.h = null;
            }
        }
    }
}

