package androidx.core.view.insets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.StyleRes;
import androidx.core.R.id;
import androidx.core.graphics.Insets;
import java.util.ArrayList;
import java.util.List;

public class ProtectionLayout extends FrameLayout {
    private final List a;
    private ProtectionGroup b;
    private static final Object c;

    static {
        ProtectionLayout.c = new Object();
    }

    public ProtectionLayout(Context context0) {
        super(context0);
        this.a = new ArrayList();
    }

    public ProtectionLayout(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ProtectionLayout(Context context0, AttributeSet attributeSet0, @AttrRes int v) {
        this(context0, attributeSet0, v, 0);
    }

    public ProtectionLayout(Context context0, AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        super(context0, attributeSet0, v, v1);
        this.a = new ArrayList();
    }

    public ProtectionLayout(Context context0, List list0) {
        super(context0);
        this.a = new ArrayList();
        this.setProtections(list0);
    }

    private void a(Context context0, int v, Protection protection0) {
        int v5;
        int v4;
        Attributes protection$Attributes0 = protection0.j();
        int v1 = protection0.m();
        int v2 = 4;
        int v3 = -1;
        if(v1 == 1) {
            v5 = 3;
            v3 = protection$Attributes0.q();
            v4 = -1;
        }
        else {
            switch(v1) {
                case 2: {
                    v4 = protection$Attributes0.m();
                    v5 = 0x30;
                    break;
                }
                case 4: {
                    v5 = 5;
                    v3 = protection$Attributes0.q();
                    v4 = -1;
                    break;
                }
                default: {
                    if(v1 != 8) {
                        throw new IllegalArgumentException("Unexpected side: " + protection0.m());
                    }
                    v4 = protection$Attributes0.m();
                    v5 = 80;
                    break;
                }
            }
        }
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v3, v4, v5);
        Insets insets0 = protection$Attributes0.n();
        frameLayout$LayoutParams0.leftMargin = insets0.a;
        frameLayout$LayoutParams0.topMargin = insets0.b;
        frameLayout$LayoutParams0.rightMargin = insets0.c;
        frameLayout$LayoutParams0.bottomMargin = insets0.d;
        View view0 = new View(context0);
        view0.setTag(ProtectionLayout.c);
        view0.setTranslationX(protection$Attributes0.o());
        view0.setTranslationY(protection$Attributes0.p());
        view0.setAlpha(protection$Attributes0.k());
        if(protection$Attributes0.r()) {
            v2 = 0;
        }
        view0.setVisibility(v2);
        view0.setBackground(protection$Attributes0.l());
        protection$Attributes0.t(new Callback() {
            final ProtectionLayout c;

            @Override  // androidx.core.view.insets.Protection$Attributes$Callback
            public void a(Drawable drawable0) {
                view0.setBackground(drawable0);
            }

            @Override  // androidx.core.view.insets.Protection$Attributes$Callback
            public void b(int v) {
                frameLayout$LayoutParams0.height = v;
                view0.setLayoutParams(frameLayout$LayoutParams0);
            }

            @Override  // androidx.core.view.insets.Protection$Attributes$Callback
            public void c(boolean z) {
                view0.setVisibility((z ? 0 : 4));
            }

            @Override  // androidx.core.view.insets.Protection$Attributes$Callback
            public void d(Insets insets0) {
                frameLayout$LayoutParams0.leftMargin = insets0.a;
                frameLayout$LayoutParams0.topMargin = insets0.b;
                frameLayout$LayoutParams0.rightMargin = insets0.c;
                frameLayout$LayoutParams0.bottomMargin = insets0.d;
                view0.setLayoutParams(frameLayout$LayoutParams0);
            }

            @Override  // androidx.core.view.insets.Protection$Attributes$Callback
            public void e(float f) {
                view0.setAlpha(f);
            }

            @Override  // androidx.core.view.insets.Protection$Attributes$Callback
            public void f(int v) {
                frameLayout$LayoutParams0.width = v;
                view0.setLayoutParams(frameLayout$LayoutParams0);
            }

            @Override  // androidx.core.view.insets.Protection$Attributes$Callback
            public void g(float f) {
                view0.setTranslationX(f);
            }

            @Override  // androidx.core.view.insets.Protection$Attributes$Callback
            public void h(float f) {
                view0.setTranslationY(f);
            }
        });
        this.addView(view0, v, frameLayout$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(view0 != null && view0.getTag() != ProtectionLayout.c) {
            int v1 = this.b == null ? 0 : this.b.i();
            int v2 = this.getChildCount() - v1;
            if(v > v2 || v < 0) {
                v = v2;
            }
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    private void b() {
        if(this.a.isEmpty()) {
            return;
        }
        this.b = new ProtectionGroup(this.getOrInstallSystemBarStateMonitor(), this.a);
        int v = this.getChildCount();
        int v1 = this.b.i();
        for(int v2 = 0; v2 < v1; ++v2) {
            Protection protection0 = this.b.h(v2);
            this.a(this.getContext(), v2 + v, protection0);
        }
    }

    private void c() {
        ViewGroup viewGroup0 = (ViewGroup)this.getRootView();
        Object object0 = viewGroup0.getTag(id.tag_system_bar_state_monitor);
        if(!(object0 instanceof SystemBarStateMonitor)) {
            return;
        }
        if(((SystemBarStateMonitor)object0).k()) {
            return;
        }
        ((SystemBarStateMonitor)object0).h();
        viewGroup0.setTag(0x7F0B0F64, null);  // id:tag_system_bar_state_monitor
    }

    private void d() {
        if(this.b != null) {
            this.removeViews(this.getChildCount() - this.b.i(), this.b.i());
            int v = this.b.i();
            for(int v1 = 0; v1 < v; ++v1) {
                this.b.h(v1).j().t(null);
            }
            this.b.g();
            this.b = null;
        }
    }

    private SystemBarStateMonitor getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup0 = (ViewGroup)this.getRootView();
        Object object0 = viewGroup0.getTag(id.tag_system_bar_state_monitor);
        if(object0 instanceof SystemBarStateMonitor) {
            return (SystemBarStateMonitor)object0;
        }
        SystemBarStateMonitor systemBarStateMonitor0 = new SystemBarStateMonitor(viewGroup0);
        viewGroup0.setTag(0x7F0B0F64, systemBarStateMonitor0);  // id:tag_system_bar_state_monitor
        return systemBarStateMonitor0;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.b != null) {
            this.d();
        }
        this.b();
        this.requestApplyInsets();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d();
        this.c();
    }

    public void setProtections(List list0) {
        this.a.clear();
        this.a.addAll(list0);
        if(this.isAttachedToWindow()) {
            this.d();
            this.b();
            this.requestApplyInsets();
        }
    }
}

