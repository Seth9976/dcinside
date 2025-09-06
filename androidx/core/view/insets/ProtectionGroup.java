package androidx.core.view.insets;

import android.graphics.RectF;
import androidx.core.graphics.Insets;
import java.util.ArrayList;
import java.util.List;

class ProtectionGroup implements Callback {
    private final ArrayList a;
    private final SystemBarStateMonitor b;
    private Insets c;
    private Insets d;
    private int e;
    private boolean f;

    ProtectionGroup(SystemBarStateMonitor systemBarStateMonitor0, List list0) {
        this.a = new ArrayList();
        this.c = Insets.e;
        this.d = Insets.e;
        this.f(list0, false);
        this.f(list0, true);
        systemBarStateMonitor0.g(this);
        this.b = systemBarStateMonitor0;
    }

    @Override  // androidx.core.view.insets.SystemBarStateMonitor$Callback
    public void a() {
        int v = this.e;
        this.e = v - 1;
        if(v > 0 && v - 1 == 0) {
            this.j();
        }
    }

    @Override  // androidx.core.view.insets.SystemBarStateMonitor$Callback
    public void b(int v, Insets insets0, RectF rectF0) {
        Insets insets1 = this.d;
        for(int v1 = this.a.size() - 1; v1 >= 0; --v1) {
            Protection protection0 = (Protection)this.a.get(v1);
            int v2 = protection0.m();
            if((v2 & v) != 0) {
                protection0.z(true);
                switch(v2) {
                    case 1: {
                        int v3 = insets1.a;
                        if(v3 > 0) {
                            protection0.y(((float)insets0.a) / ((float)v3));
                        }
                        protection0.x(rectF0.left);
                        break;
                    }
                    case 2: {
                        int v4 = insets1.b;
                        if(v4 > 0) {
                            protection0.y(((float)insets0.b) / ((float)v4));
                        }
                        protection0.x(rectF0.top);
                        break;
                    }
                    case 4: {
                        int v5 = insets1.c;
                        if(v5 > 0) {
                            protection0.y(((float)insets0.c) / ((float)v5));
                        }
                        protection0.x(rectF0.right);
                        break;
                    }
                    case 8: {
                        int v6 = insets1.d;
                        if(v6 > 0) {
                            protection0.y(((float)insets0.d) / ((float)v6));
                        }
                        protection0.x(rectF0.bottom);
                    }
                }
            }
        }
    }

    @Override  // androidx.core.view.insets.SystemBarStateMonitor$Callback
    public void c(Insets insets0, Insets insets1) {
        this.c = insets0;
        this.d = insets1;
        this.j();
    }

    @Override  // androidx.core.view.insets.SystemBarStateMonitor$Callback
    public void d() {
        ++this.e;
    }

    @Override  // androidx.core.view.insets.SystemBarStateMonitor$Callback
    public void e(int v) {
        for(int v1 = this.a.size() - 1; v1 >= 0; --v1) {
            ((Protection)this.a.get(v1)).g(v);
        }
    }

    private void f(List list0, boolean z) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Protection protection0 = (Protection)list0.get(v1);
            if(protection0.q() == z) {
                Object object0 = protection0.k();
                if(object0 != null) {
                    throw new IllegalStateException(protection0 + " is already controlled by " + object0);
                }
                protection0.t(this);
                this.a.add(protection0);
                continue;
            }
        }
    }

    void g() {
        if(this.f) {
            return;
        }
        this.f = true;
        this.b.n(this);
        for(int v = this.a.size() - 1; v >= 0; --v) {
            ((Protection)this.a.get(v)).t(null);
        }
        this.a.clear();
    }

    Protection h(int v) {
        return (Protection)this.a.get(v);
    }

    int i() {
        return this.a.size();
    }

    private void j() {
        Insets insets0 = Insets.e;
        for(int v = this.a.size() - 1; v >= 0; --v) {
            insets0 = Insets.b(insets0, ((Protection)this.a.get(v)).h(this.c, this.d, insets0));
        }
    }
}

