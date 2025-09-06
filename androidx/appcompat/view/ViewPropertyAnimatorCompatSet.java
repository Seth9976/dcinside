package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;

@RestrictTo({Scope.c})
public class ViewPropertyAnimatorCompatSet {
    final ArrayList a;
    private long b;
    private Interpolator c;
    ViewPropertyAnimatorListener d;
    private boolean e;
    private final ViewPropertyAnimatorListenerAdapter f;

    public ViewPropertyAnimatorCompatSet() {
        this.b = -1L;
        this.f = new ViewPropertyAnimatorListenerAdapter() {
            private boolean a;
            private int b;
            final ViewPropertyAnimatorCompatSet c;

            {
                this.a = false;
                this.b = 0;
            }

            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
            public void b(View view0) {
                int v = this.b + 1;
                this.b = v;
                if(v == ViewPropertyAnimatorCompatSet.this.a.size()) {
                    ViewPropertyAnimatorListener viewPropertyAnimatorListener0 = ViewPropertyAnimatorCompatSet.this.d;
                    if(viewPropertyAnimatorListener0 != null) {
                        viewPropertyAnimatorListener0.b(null);
                    }
                    this.d();
                }
            }

            @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
            public void c(View view0) {
                if(this.a) {
                    return;
                }
                this.a = true;
                ViewPropertyAnimatorListener viewPropertyAnimatorListener0 = ViewPropertyAnimatorCompatSet.this.d;
                if(viewPropertyAnimatorListener0 != null) {
                    viewPropertyAnimatorListener0.c(null);
                }
            }

            void d() {
                this.b = 0;
                this.a = false;
                ViewPropertyAnimatorCompatSet.this.b();
            }
        };
        this.a = new ArrayList();
    }

    public void a() {
        if(!this.e) {
            return;
        }
        for(Object object0: this.a) {
            ((ViewPropertyAnimatorCompat)object0).d();
        }
        this.e = false;
    }

    void b() {
        this.e = false;
    }

    public ViewPropertyAnimatorCompatSet c(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0) {
        if(!this.e) {
            this.a.add(viewPropertyAnimatorCompat0);
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet d(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat1) {
        this.a.add(viewPropertyAnimatorCompat0);
        viewPropertyAnimatorCompat1.w(viewPropertyAnimatorCompat0.e());
        this.a.add(viewPropertyAnimatorCompat1);
        return this;
    }

    public ViewPropertyAnimatorCompatSet e(long v) {
        if(!this.e) {
            this.b = v;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet f(Interpolator interpolator0) {
        if(!this.e) {
            this.c = interpolator0;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet g(ViewPropertyAnimatorListener viewPropertyAnimatorListener0) {
        if(!this.e) {
            this.d = viewPropertyAnimatorListener0;
        }
        return this;
    }

    public void h() {
        if(this.e) {
            return;
        }
        for(Object object0: this.a) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = (ViewPropertyAnimatorCompat)object0;
            long v = this.b;
            if(v >= 0L) {
                viewPropertyAnimatorCompat0.s(v);
            }
            Interpolator interpolator0 = this.c;
            if(interpolator0 != null) {
                viewPropertyAnimatorCompat0.t(interpolator0);
            }
            if(this.d != null) {
                viewPropertyAnimatorCompat0.u(this.f);
            }
            viewPropertyAnimatorCompat0.y();
        }
        this.e = true;
    }
}

