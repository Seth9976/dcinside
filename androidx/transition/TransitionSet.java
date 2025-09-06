package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import java.util.ArrayList;

public class TransitionSet extends Transition {
    static class TransitionSetListener extends TransitionListenerAdapter {
        TransitionSet a;

        TransitionSetListener(TransitionSet transitionSet0) {
            this.a = transitionSet0;
        }

        @Override  // androidx.transition.TransitionListenerAdapter
        public void k(@NonNull Transition transition0) {
            TransitionSet transitionSet0 = this.a;
            if(!transitionSet0.X8) {
                transitionSet0.J0();
                this.a.X8 = true;
            }
        }

        @Override  // androidx.transition.TransitionListenerAdapter
        public void p(@NonNull Transition transition0) {
            TransitionSet transitionSet0 = this.a;
            int v = transitionSet0.W8 - 1;
            transitionSet0.W8 = v;
            if(v == 0) {
                transitionSet0.X8 = false;
                transitionSet0.w();
            }
            transition0.s0(this);
        }
    }

    ArrayList U8;
    private boolean V8;
    int W8;
    boolean X8;
    private int Y8;
    private static final int Z8 = 1;
    private static final int a9 = 2;
    private static final int b9 = 4;
    private static final int c9 = 8;
    public static final int d9 = 0;
    public static final int e9 = 1;

    public TransitionSet() {
        this.U8 = new ArrayList();
        this.V8 = true;
        this.X8 = false;
        this.Y8 = 0;
    }

    public TransitionSet(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.U8 = new ArrayList();
        this.V8 = true;
        this.X8 = false;
        this.Y8 = 0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, Styleable.i);
        this.e1(TypedArrayUtils.k(typedArray0, ((XmlResourceParser)attributeSet0), "transitionOrdering", 0, 0));
        typedArray0.recycle();
    }

    @Override  // androidx.transition.Transition
    void A0(boolean z) {
        super.A0(z);
        int v = this.U8.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.U8.get(v1)).A0(z);
        }
    }

    @Override  // androidx.transition.Transition
    @RequiresApi(34)
    void B0(long v, long v1) {
        long v2 = this.Y();
        if(this.r != null && (v < 0L && v1 < 0L || v > v2 && v1 > v2)) {
            return;
        }
        int v4 = Long.compare(v, v1);
        int v5 = Long.compare(v, 0L);
        if(v5 >= 0 && v1 < 0L || v <= v2 && v1 > v2) {
            this.B = false;
            this.n0(TransitionNotification.a, v4 < 0);
        }
        if(this.V8) {
            for(int v3 = 0; v3 < this.U8.size(); ++v3) {
                ((Transition)this.U8.get(v3)).B0(v, v1);
            }
        }
        else {
            int v6 = this.V0(v1);
            if(v4 >= 0) {
                while(v6 < this.U8.size()) {
                    Transition transition0 = (Transition)this.U8.get(v6);
                    long v7 = transition0.L;
                    long v8 = v - v7;
                    if(v8 < 0L) {
                        break;
                    }
                    transition0.B0(v8, v1 - v7);
                    ++v6;
                }
            }
            else {
                while(v6 >= 0) {
                    Transition transition1 = (Transition)this.U8.get(v6);
                    long v9 = v - transition1.L;
                    transition1.B0(v9, v1 - transition1.L);
                    if(v9 >= 0L) {
                        break;
                    }
                    --v6;
                }
            }
        }
        if(this.r != null) {
            int v10 = Long.compare(v, v2);
            if(v10 > 0 && v1 <= v2 || v5 < 0 && v1 >= 0L) {
                if(v10 > 0) {
                    this.B = true;
                }
                this.n0(TransitionNotification.b, v4 < 0);
            }
        }
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition C(int v, boolean z) {
        for(int v1 = 0; v1 < this.U8.size(); ++v1) {
            ((Transition)this.U8.get(v1)).C(v, z);
        }
        return super.C(v, z);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition C0(long v) {
        return this.c1(v);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition D(@NonNull View view0, boolean z) {
        for(int v = 0; v < this.U8.size(); ++v) {
            ((Transition)this.U8.get(v)).D(view0, z);
        }
        return super.D(view0, z);
    }

    @Override  // androidx.transition.Transition
    public void D0(@Nullable EpicenterCallback transition$EpicenterCallback0) {
        super.D0(transition$EpicenterCallback0);
        this.Y8 |= 8;
        int v = this.U8.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.U8.get(v1)).D0(transition$EpicenterCallback0);
        }
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition E(@NonNull Class class0, boolean z) {
        for(int v = 0; v < this.U8.size(); ++v) {
            ((Transition)this.U8.get(v)).E(class0, z);
        }
        return super.E(class0, z);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition E0(@Nullable TimeInterpolator timeInterpolator0) {
        return this.d1(timeInterpolator0);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition F(@NonNull String s, boolean z) {
        for(int v = 0; v < this.U8.size(); ++v) {
            ((Transition)this.U8.get(v)).F(s, z);
        }
        return super.F(s, z);
    }

    @Override  // androidx.transition.Transition
    public void G0(@Nullable PathMotion pathMotion0) {
        super.G0(pathMotion0);
        this.Y8 |= 4;
        if(this.U8 != null) {
            for(int v = 0; v < this.U8.size(); ++v) {
                ((Transition)this.U8.get(v)).G0(pathMotion0);
            }
        }
    }

    @Override  // androidx.transition.Transition
    public void H0(@Nullable TransitionPropagation transitionPropagation0) {
        super.H0(transitionPropagation0);
        this.Y8 |= 2;
        int v = this.U8.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.U8.get(v1)).H0(transitionPropagation0);
        }
    }

    @Override  // androidx.transition.Transition
    @RestrictTo({Scope.c})
    void I(ViewGroup viewGroup0) {
        super.I(viewGroup0);
        int v = this.U8.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.U8.get(v1)).I(viewGroup0);
        }
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition I0(long v) {
        return this.f1(v);
    }

    @Override  // androidx.transition.Transition
    String K0(String s) {
        String s1 = super.K0(s);
        for(int v = 0; v < this.U8.size(); ++v) {
            s1 = s1 + "\n" + ((Transition)this.U8.get(v)).K0(s + "  ");
        }
        return s1;
    }

    @NonNull
    public TransitionSet L0(@NonNull TransitionListener transition$TransitionListener0) {
        return (TransitionSet)super.c(transition$TransitionListener0);
    }

    @NonNull
    public TransitionSet M0(@IdRes int v) {
        for(int v1 = 0; v1 < this.U8.size(); ++v1) {
            ((Transition)this.U8.get(v1)).d(v);
        }
        return (TransitionSet)super.d(v);
    }

    @NonNull
    public TransitionSet N0(@NonNull View view0) {
        for(int v = 0; v < this.U8.size(); ++v) {
            ((Transition)this.U8.get(v)).e(view0);
        }
        return (TransitionSet)super.e(view0);
    }

    @NonNull
    public TransitionSet O0(@NonNull Class class0) {
        for(int v = 0; v < this.U8.size(); ++v) {
            ((Transition)this.U8.get(v)).f(class0);
        }
        return (TransitionSet)super.f(class0);
    }

    @NonNull
    public TransitionSet P0(@NonNull String s) {
        for(int v = 0; v < this.U8.size(); ++v) {
            ((Transition)this.U8.get(v)).g(s);
        }
        return (TransitionSet)super.g(s);
    }

    @NonNull
    public TransitionSet Q0(@NonNull Transition transition0) {
        this.R0(transition0);
        long v = this.c;
        if(v >= 0L) {
            transition0.C0(v);
        }
        if((this.Y8 & 1) != 0) {
            transition0.E0(this.M());
        }
        if((this.Y8 & 2) != 0) {
            transition0.H0(this.Q());
        }
        if((this.Y8 & 4) != 0) {
            transition0.G0(this.P());
        }
        if((this.Y8 & 8) != 0) {
            transition0.D0(this.L());
        }
        return this;
    }

    private void R0(@NonNull Transition transition0) {
        this.U8.add(transition0);
        transition0.r = this;
    }

    public int S0() {
        return !this.V8;
    }

    @Nullable
    public Transition T0(int v) {
        return v < 0 || v >= this.U8.size() ? null : ((Transition)this.U8.get(v));
    }

    public int U0() {
        return this.U8.size();
    }

    private int V0(long v) {
        for(int v1 = 1; v1 < this.U8.size(); ++v1) {
            if(((Transition)this.U8.get(v1)).L > v) {
                return v1 - 1;
            }
        }
        return this.U8.size() - 1;
    }

    @NonNull
    public TransitionSet W0(@NonNull TransitionListener transition$TransitionListener0) {
        return (TransitionSet)super.s0(transition$TransitionListener0);
    }

    @NonNull
    public TransitionSet X0(@IdRes int v) {
        for(int v1 = 0; v1 < this.U8.size(); ++v1) {
            ((Transition)this.U8.get(v1)).t0(v);
        }
        return (TransitionSet)super.t0(v);
    }

    @NonNull
    public TransitionSet Y0(@NonNull View view0) {
        for(int v = 0; v < this.U8.size(); ++v) {
            ((Transition)this.U8.get(v)).u0(view0);
        }
        return (TransitionSet)super.u0(view0);
    }

    @NonNull
    public TransitionSet Z0(@NonNull Class class0) {
        for(int v = 0; v < this.U8.size(); ++v) {
            ((Transition)this.U8.get(v)).v0(class0);
        }
        return (TransitionSet)super.v0(class0);
    }

    @NonNull
    public TransitionSet a1(@NonNull String s) {
        for(int v = 0; v < this.U8.size(); ++v) {
            ((Transition)this.U8.get(v)).w0(s);
        }
        return (TransitionSet)super.w0(s);
    }

    @Override  // androidx.transition.Transition
    boolean b0() {
        for(int v = 0; v < this.U8.size(); ++v) {
            if(((Transition)this.U8.get(v)).b0()) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public TransitionSet b1(@NonNull Transition transition0) {
        this.U8.remove(transition0);
        transition0.r = null;
        return this;
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition c(@NonNull TransitionListener transition$TransitionListener0) {
        return this.L0(transition$TransitionListener0);
    }

    @Override  // androidx.transition.Transition
    public boolean c0() {
        int v = this.U8.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Transition)this.U8.get(v1)).c0()) {
                return false;
            }
        }
        return true;
    }

    @NonNull
    public TransitionSet c1(long v) {
        super.C0(v);
        if(this.c >= 0L) {
            ArrayList arrayList0 = this.U8;
            if(arrayList0 != null) {
                int v1 = arrayList0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    ((Transition)this.U8.get(v2)).C0(v);
                }
            }
        }
        return this;
    }

    @Override  // androidx.transition.Transition
    @RestrictTo({Scope.c})
    protected void cancel() {
        super.cancel();
        int v = this.U8.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.U8.get(v1)).cancel();
        }
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Object clone() throws CloneNotSupportedException {
        return this.s();
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition d(@IdRes int v) {
        return this.M0(v);
    }

    @NonNull
    public TransitionSet d1(@Nullable TimeInterpolator timeInterpolator0) {
        this.Y8 |= 1;
        ArrayList arrayList0 = this.U8;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((Transition)this.U8.get(v1)).E0(timeInterpolator0);
            }
        }
        return (TransitionSet)super.E0(timeInterpolator0);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition e(@NonNull View view0) {
        return this.N0(view0);
    }

    @NonNull
    public TransitionSet e1(int v) {
        switch(v) {
            case 0: {
                this.V8 = true;
                return this;
            }
            case 1: {
                this.V8 = false;
                return this;
            }
            default: {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + v);
            }
        }
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition f(@NonNull Class class0) {
        return this.O0(class0);
    }

    @NonNull
    public TransitionSet f1(long v) {
        return (TransitionSet)super.I0(v);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition g(@NonNull String s) {
        return this.P0(s);
    }

    private void g1() {
        TransitionSetListener transitionSet$TransitionSetListener0 = new TransitionSetListener(this);
        for(Object object0: this.U8) {
            ((Transition)object0).c(transitionSet$TransitionSetListener0);
        }
        this.W8 = this.U8.size();
    }

    @Override  // androidx.transition.Transition
    public void m(@NonNull TransitionValues transitionValues0) {
        if(this.f0(transitionValues0.b)) {
            for(Object object0: this.U8) {
                Transition transition0 = (Transition)object0;
                if(transition0.f0(transitionValues0.b)) {
                    transition0.m(transitionValues0);
                    transitionValues0.c.add(transition0);
                }
            }
        }
    }

    @Override  // androidx.transition.Transition
    void o(TransitionValues transitionValues0) {
        super.o(transitionValues0);
        int v = this.U8.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.U8.get(v1)).o(transitionValues0);
        }
    }

    @Override  // androidx.transition.Transition
    public void p(@NonNull TransitionValues transitionValues0) {
        if(this.f0(transitionValues0.b)) {
            for(Object object0: this.U8) {
                Transition transition0 = (Transition)object0;
                if(transition0.f0(transitionValues0.b)) {
                    transition0.p(transitionValues0);
                    transitionValues0.c.add(transition0);
                }
            }
        }
    }

    @Override  // androidx.transition.Transition
    @RestrictTo({Scope.c})
    public void p0(@Nullable View view0) {
        super.p0(view0);
        int v = this.U8.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.U8.get(v1)).p0(view0);
        }
    }

    @Override  // androidx.transition.Transition
    @RequiresApi(34)
    void r0() {
        this.J = 0L;
        androidx.transition.TransitionSet.2 transitionSet$20 = new TransitionListenerAdapter() {
            final TransitionSet a;

            @Override  // androidx.transition.TransitionListenerAdapter
            public void r(@NonNull Transition transition0) {
                TransitionSet.this.U8.remove(transition0);
                if(!TransitionSet.this.b0()) {
                    TransitionSet.this.n0(TransitionNotification.c, false);
                    TransitionSet.this.B = true;
                    TransitionSet.this.n0(TransitionNotification.b, false);
                }
            }
        };
        for(int v = 0; v < this.U8.size(); ++v) {
            Transition transition0 = (Transition)this.U8.get(v);
            transition0.c(transitionSet$20);
            transition0.r0();
            long v1 = transition0.Y();
            if(this.V8) {
                this.J = Math.max(this.J, v1);
            }
            else {
                transition0.L = this.J;
                this.J += v1;
            }
        }
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition s() {
        Transition transition0 = (TransitionSet)super.s();
        transition0.U8 = new ArrayList();
        int v = this.U8.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((TransitionSet)transition0).R0(((Transition)this.U8.get(v1)).s());
        }
        return transition0;
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition s0(@NonNull TransitionListener transition$TransitionListener0) {
        return this.W0(transition$TransitionListener0);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition t0(@IdRes int v) {
        return this.X0(v);
    }

    @Override  // androidx.transition.Transition
    void u(@NonNull ViewGroup viewGroup0, @NonNull TransitionValuesMaps transitionValuesMaps0, @NonNull TransitionValuesMaps transitionValuesMaps1, @NonNull ArrayList arrayList0, @NonNull ArrayList arrayList1) {
        long v = this.T();
        int v1 = this.U8.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Transition transition0 = (Transition)this.U8.get(v2);
            if(v > 0L && (this.V8 || v2 == 0)) {
                long v3 = transition0.T();
                if(v3 > 0L) {
                    transition0.I0(v3 + v);
                }
                else {
                    transition0.I0(v);
                }
            }
            transition0.u(viewGroup0, transitionValuesMaps0, transitionValuesMaps1, arrayList0, arrayList1);
        }
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition u0(@NonNull View view0) {
        return this.Y0(view0);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition v0(@NonNull Class class0) {
        return this.Z0(class0);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public Transition w0(@NonNull String s) {
        return this.a1(s);
    }

    @Override  // androidx.transition.Transition
    @RestrictTo({Scope.c})
    public void x0(@Nullable View view0) {
        super.x0(view0);
        int v = this.U8.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Transition)this.U8.get(v1)).x0(view0);
        }
    }

    @Override  // androidx.transition.Transition
    @RestrictTo({Scope.c})
    protected void z0() {
        if(this.U8.isEmpty()) {
            this.J0();
            this.w();
            return;
        }
        this.g1();
        if(this.V8) {
            for(Object object0: this.U8) {
                ((Transition)object0).z0();
            }
        }
        else {
            for(int v = 1; v < this.U8.size(); ++v) {
                ((Transition)this.U8.get(v - 1)).c(new TransitionListenerAdapter() {
                    final TransitionSet b;

                    @Override  // androidx.transition.TransitionListenerAdapter
                    public void p(@NonNull Transition transition0) {
                        ((Transition)this.U8.get(v)).z0();
                        transition0.s0(this);
                    }
                });
            }
            Transition transition0 = (Transition)this.U8.get(0);
            if(transition0 != null) {
                transition0.z0();
            }
        }
    }
}

