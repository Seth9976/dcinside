package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ConstraintAnchor {
    public static enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y;

        private static Type[] a() [...] // Inlined contents
    }

    private HashSet a;
    private int b;
    private boolean c;
    public final ConstraintWidget d;
    public final Type e;
    public ConstraintAnchor f;
    public int g;
    int h;
    SolverVariable i;
    private static final boolean j = false;
    private static final int k = 0x80000000;

    public ConstraintAnchor(ConstraintWidget constraintWidget0, Type constraintAnchor$Type0) {
        this.a = null;
        this.g = 0;
        this.h = 0x80000000;
        this.d = constraintWidget0;
        this.e = constraintAnchor$Type0;
    }

    public void A(int v) {
        this.b = v;
        this.c = true;
    }

    public void B(int v) {
        if(this.p()) {
            this.h = v;
        }
    }

    public void C(int v) {
        if(this.p()) {
            this.g = v;
        }
    }

    public boolean a(ConstraintAnchor constraintAnchor0, int v) {
        return this.b(constraintAnchor0, v, 0x80000000, false);
    }

    public boolean b(ConstraintAnchor constraintAnchor0, int v, int v1, boolean z) {
        if(constraintAnchor0 == null) {
            this.x();
            return true;
        }
        if(!z && !this.v(constraintAnchor0)) {
            return false;
        }
        this.f = constraintAnchor0;
        if(constraintAnchor0.a == null) {
            constraintAnchor0.a = new HashSet();
        }
        HashSet hashSet0 = this.f.a;
        if(hashSet0 != null) {
            hashSet0.add(this);
        }
        this.g = v;
        this.h = v1;
        return true;
    }

    public void c(ConstraintAnchor constraintAnchor0, HashMap hashMap0) {
        ConstraintAnchor constraintAnchor1 = this.f;
        if(constraintAnchor1 != null) {
            HashSet hashSet0 = constraintAnchor1.a;
            if(hashSet0 != null) {
                hashSet0.remove(this);
            }
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchor0.f;
        this.f = constraintAnchor2 == null ? null : ((ConstraintWidget)hashMap0.get(constraintAnchor0.f.d)).r(constraintAnchor2.l());
        ConstraintAnchor constraintAnchor3 = this.f;
        if(constraintAnchor3 != null) {
            if(constraintAnchor3.a == null) {
                constraintAnchor3.a = new HashSet();
            }
            this.f.a.add(this);
        }
        this.g = constraintAnchor0.g;
        this.h = constraintAnchor0.h;
    }

    public void d(int v, ArrayList arrayList0, WidgetGroup widgetGroup0) {
        HashSet hashSet0 = this.a;
        if(hashSet0 != null) {
            for(Object object0: hashSet0) {
                Grouping.a(((ConstraintAnchor)object0).d, v, arrayList0, widgetGroup0);
            }
        }
    }

    public HashSet e() {
        return this.a;
    }

    public int f() {
        return this.c ? this.b : 0;
    }

    public int g() {
        if(this.d.l0() == 8) {
            return 0;
        }
        return this.h == 0x80000000 || (this.f == null || this.f.d.l0() != 8) ? this.g : this.h;
    }

    public final ConstraintAnchor h() {
        switch(this.e.ordinal()) {
            case 1: {
                return this.d.S;
            }
            case 2: {
                return this.d.T;
            }
            case 3: {
                return this.d.Q;
            }
            case 4: {
                return this.d.R;
            }
            case 0: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return null;
            }
            default: {
                throw new AssertionError(this.e.name());
            }
        }
    }

    public ConstraintWidget i() {
        return this.d;
    }

    public SolverVariable j() {
        return this.i;
    }

    public ConstraintAnchor k() {
        return this.f;
    }

    public Type l() {
        return this.e;
    }

    public boolean m() {
        HashSet hashSet0 = this.a;
        if(hashSet0 == null) {
            return false;
        }
        for(Object object0: hashSet0) {
            if(((ConstraintAnchor)object0).h().p()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public boolean n() {
        return this.a == null ? false : this.a.size() > 0;
    }

    public boolean o() {
        return this.c;
    }

    public boolean p() {
        return this.f != null;
    }

    public boolean q(ConstraintWidget constraintWidget0) {
        if(this.s(constraintWidget0, new HashSet())) {
            return false;
        }
        ConstraintWidget constraintWidget1 = this.i().U();
        return constraintWidget1 == constraintWidget0 ? true : constraintWidget0.U() == constraintWidget1;
    }

    public boolean r(ConstraintWidget constraintWidget0, ConstraintAnchor constraintAnchor0) {
        return this.q(constraintWidget0);
    }

    private boolean s(ConstraintWidget constraintWidget0, HashSet hashSet0) {
        if(hashSet0.contains(constraintWidget0)) {
            return false;
        }
        hashSet0.add(constraintWidget0);
        if(constraintWidget0 == this.i()) {
            return true;
        }
        ArrayList arrayList0 = constraintWidget0.s();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintAnchor constraintAnchor0 = (ConstraintAnchor)arrayList0.get(v1);
            if(constraintAnchor0.u(this) && constraintAnchor0.p() && this.s(constraintAnchor0.k().i(), hashSet0)) {
                return true;
            }
        }
        return false;
    }

    public boolean t() {
        switch(this.e.ordinal()) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                return true;
            }
            case 0: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                return false;
            }
            default: {
                throw new AssertionError(this.e.name());
            }
        }
    }

    @Override
    public String toString() {
        return this.d.y() + ":" + this.e.toString();
    }

    public boolean u(ConstraintAnchor constraintAnchor0) {
        Type constraintAnchor$Type0 = constraintAnchor0.l();
        Type constraintAnchor$Type1 = this.e;
        if(constraintAnchor$Type0 == constraintAnchor$Type1) {
            return true;
        }
        switch(constraintAnchor$Type1.ordinal()) {
            case 0: {
                return false;
            }
            case 6: {
                return constraintAnchor$Type0 != Type.f;
            }
            case 1: 
            case 3: 
            case 7: {
                return constraintAnchor$Type0 == Type.b || constraintAnchor$Type0 == Type.d || constraintAnchor$Type0 == Type.h;
            }
            case 2: 
            case 4: 
            case 5: 
            case 8: {
                return constraintAnchor$Type0 == Type.c || constraintAnchor$Type0 == Type.e || constraintAnchor$Type0 == Type.i || constraintAnchor$Type0 == Type.f;
            }
            default: {
                throw new AssertionError(this.e.name());
            }
        }
    }

    public boolean v(ConstraintAnchor constraintAnchor0) {
        if(constraintAnchor0 == null) {
            return false;
        }
        Type constraintAnchor$Type0 = constraintAnchor0.l();
        Type constraintAnchor$Type1 = this.e;
        if(constraintAnchor$Type0 == constraintAnchor$Type1) {
            return constraintAnchor$Type1 != Type.f || constraintAnchor0.i().q0() && this.i().q0();
        }
        switch(constraintAnchor$Type1.ordinal()) {
            case 1: 
            case 3: {
                boolean z = constraintAnchor$Type0 == Type.b || constraintAnchor$Type0 == Type.d;
                return constraintAnchor0.i() instanceof Guideline ? z || constraintAnchor$Type0 == Type.h : z;
            }
            case 2: 
            case 4: {
                boolean z1 = constraintAnchor$Type0 == Type.c || constraintAnchor$Type0 == Type.e;
                return constraintAnchor0.i() instanceof Guideline ? z1 || constraintAnchor$Type0 == Type.i : z1;
            }
            case 5: {
                return constraintAnchor$Type0 != Type.b && constraintAnchor$Type0 != Type.d;
            }
            case 6: {
                return constraintAnchor$Type0 != Type.f && constraintAnchor$Type0 != Type.h && constraintAnchor$Type0 != Type.i;
            }
            case 0: 
            case 7: 
            case 8: {
                return false;
            }
            default: {
                throw new AssertionError(this.e.name());
            }
        }
    }

    public boolean w() {
        switch(this.e.ordinal()) {
            case 1: 
            case 3: 
            case 6: 
            case 7: {
                return false;
            }
            case 0: 
            case 2: 
            case 4: 
            case 5: 
            case 8: {
                return true;
            }
            default: {
                throw new AssertionError(this.e.name());
            }
        }
    }

    public void x() {
        ConstraintAnchor constraintAnchor0 = this.f;
        if(constraintAnchor0 != null) {
            HashSet hashSet0 = constraintAnchor0.a;
            if(hashSet0 != null) {
                hashSet0.remove(this);
                if(this.f.a.size() == 0) {
                    this.f.a = null;
                }
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = 0x80000000;
        this.c = false;
        this.b = 0;
    }

    public void y() {
        this.c = false;
        this.b = 0;
    }

    public void z(Cache cache0) {
        SolverVariable solverVariable0 = this.i;
        if(solverVariable0 == null) {
            this.i = new SolverVariable(androidx.constraintlayout.core.SolverVariable.Type.a, null);
            return;
        }
        solverVariable0.h();
    }
}

