package androidx.core.view.insets;

import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class SystemBarStateMonitor {
    interface Callback {
        void a();

        void b(int arg1, Insets arg2, RectF arg3);

        void c(Insets arg1, Insets arg2);

        void d();

        void e(int arg1);
    }

    private final View a;
    private final ArrayList b;
    private Insets c;
    private Insets d;
    private int e;

    SystemBarStateMonitor(ViewGroup viewGroup0) {
        this.b = new ArrayList();
        this.c = Insets.e;
        this.d = Insets.e;
        Drawable drawable0 = viewGroup0.getBackground();
        this.e = drawable0 instanceof ColorDrawable ? ((ColorDrawable)drawable0).getColor() : 0;
        androidx.core.view.insets.SystemBarStateMonitor.1 systemBarStateMonitor$10 = new View(viewGroup0.getContext()) {
            final SystemBarStateMonitor b;

            @Override  // android.view.View
            protected void onConfigurationChanged(Configuration configuration0) {
                Drawable drawable0 = viewGroup0.getBackground();
                int v = drawable0 instanceof ColorDrawable ? ((ColorDrawable)drawable0).getColor() : 0;
                if(SystemBarStateMonitor.this.e != v) {
                    SystemBarStateMonitor.this.e = v;
                    for(int v1 = SystemBarStateMonitor.this.b.size() - 1; v1 >= 0; --v1) {
                        ((Callback)SystemBarStateMonitor.this.b.get(v1)).e(v);
                    }
                }
            }
        };
        this.a = systemBarStateMonitor$10;
        systemBarStateMonitor$10.setWillNotDraw(true);
        ViewCompat.m2(systemBarStateMonitor$10, (View view0, WindowInsetsCompat windowInsetsCompat0) -> {
            Insets insets0 = this.i(windowInsetsCompat0);
            Insets insets1 = this.j(windowInsetsCompat0);
            if(!insets0.equals(this.c) || !insets1.equals(this.d)) {
                this.c = insets0;
                this.d = insets1;
                for(int v = this.b.size() - 1; v >= 0; --v) {
                    ((Callback)this.b.get(v)).c(insets0, insets1);
                }
            }
            return windowInsetsCompat0;
        });
        ViewCompat.J2(systemBarStateMonitor$10, new androidx.core.view.WindowInsetsAnimationCompat.Callback(0) {
            private final HashMap e;
            final SystemBarStateMonitor f;

            {
                int v = 0;  // 捕获的参数
                this.e = new HashMap();
            }

            @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
            public void c(WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
                if(!this.g(windowInsetsAnimationCompat0)) {
                    return;
                }
                this.e.remove(windowInsetsAnimationCompat0);
                for(int v = SystemBarStateMonitor.this.b.size() - 1; v >= 0; --v) {
                    ((Callback)SystemBarStateMonitor.this.b.get(v)).a();
                }
            }

            @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
            public void d(WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
                if(!this.g(windowInsetsAnimationCompat0)) {
                    return;
                }
                for(int v = SystemBarStateMonitor.this.b.size() - 1; v >= 0; --v) {
                    ((Callback)SystemBarStateMonitor.this.b.get(v)).d();
                }
            }

            @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
            public WindowInsetsCompat e(WindowInsetsCompat windowInsetsCompat0, List list0) {
                RectF rectF0 = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
                int v = list0.size() - 1;
                int v1 = 0;
                while(v >= 0) {
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = (WindowInsetsAnimationCompat)list0.get(v);
                    Integer integer0 = (Integer)this.e.get(windowInsetsAnimationCompat0);
                    if(integer0 != null) {
                        int v2 = (int)integer0;
                        float f = windowInsetsAnimationCompat0.a();
                        if((v2 & 1) != 0) {
                            rectF0.left = f;
                        }
                        if((v2 & 2) != 0) {
                            rectF0.top = f;
                        }
                        if((v2 & 4) != 0) {
                            rectF0.right = f;
                        }
                        if((v2 & 8) != 0) {
                            rectF0.bottom = f;
                        }
                        v1 |= v2;
                    }
                    --v;
                }
                Insets insets0 = SystemBarStateMonitor.this.i(windowInsetsCompat0);
                for(int v3 = SystemBarStateMonitor.this.b.size() - 1; v3 >= 0; --v3) {
                    ((Callback)SystemBarStateMonitor.this.b.get(v3)).b(v1, insets0, rectF0);
                }
                return windowInsetsCompat0;
            }

            @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
            public BoundsCompat f(WindowInsetsAnimationCompat windowInsetsAnimationCompat0, BoundsCompat windowInsetsAnimationCompat$BoundsCompat0) {
                if(!this.g(windowInsetsAnimationCompat0)) {
                    return windowInsetsAnimationCompat$BoundsCompat0;
                }
                Insets insets0 = windowInsetsAnimationCompat$BoundsCompat0.b();
                Insets insets1 = windowInsetsAnimationCompat$BoundsCompat0.a();
                int v = insets0.a == insets1.a ? 0 : 1;
                if(insets0.b != insets1.b) {
                    v |= 2;
                }
                if(insets0.c != insets1.c) {
                    v |= 4;
                }
                if(insets0.d != insets1.d) {
                    v |= 8;
                }
                this.e.put(windowInsetsAnimationCompat0, v);
                return windowInsetsAnimationCompat$BoundsCompat0;
            }

            private boolean g(WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
                return (windowInsetsAnimationCompat0.f() & 0x207) != 0;
            }
        });
        viewGroup0.addView(systemBarStateMonitor$10, 0);
    }

    void g(Callback systemBarStateMonitor$Callback0) {
        if(this.b.contains(systemBarStateMonitor$Callback0)) {
            return;
        }
        this.b.add(systemBarStateMonitor$Callback0);
        systemBarStateMonitor$Callback0.c(this.c, this.d);
        systemBarStateMonitor$Callback0.e(this.e);
    }

    void h() {
        e e0 = () -> {
            ViewParent viewParent0 = this.a.getParent();
            if(viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(this.a);
            }
        };
        this.a.post(e0);
    }

    private Insets i(WindowInsetsCompat windowInsetsCompat0) {
        return Insets.c(windowInsetsCompat0.f(0x207), windowInsetsCompat0.f(0x40));
    }

    private Insets j(WindowInsetsCompat windowInsetsCompat0) {
        return Insets.c(windowInsetsCompat0.g(0x207), windowInsetsCompat0.g(0x40));
    }

    boolean k() {
        return !this.b.isEmpty();
    }

    // 检测为 Lambda 实现
    private void l() [...]

    // 检测为 Lambda 实现
    private WindowInsetsCompat m(View view0, WindowInsetsCompat windowInsetsCompat0) [...]

    void n(Callback systemBarStateMonitor$Callback0) {
        this.b.remove(systemBarStateMonitor$Callback0);
    }
}

