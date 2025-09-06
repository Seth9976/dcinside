package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import java.util.ArrayList;
import java.util.List;

public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {
    class MyNodeProvider extends AccessibilityNodeProviderCompat {
        final ExploreByTouchHelper c;

        @Override  // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat b(int v) {
            return AccessibilityNodeInfoCompat.R0(ExploreByTouchHelper.this.L(v));
        }

        @Override  // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat d(int v) {
            int v1 = v == 2 ? ExploreByTouchHelper.this.k : ExploreByTouchHelper.this.l;
            return v1 == 0x80000000 ? null : this.b(v1);
        }

        @Override  // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean f(int v, int v1, Bundle bundle0) {
            return ExploreByTouchHelper.this.T(v, v1, bundle0);
        }
    }

    private final Rect d;
    private final Rect e;
    private final Rect f;
    private final int[] g;
    private final AccessibilityManager h;
    private final View i;
    private MyNodeProvider j;
    int k;
    int l;
    private int m;
    public static final int n = 0x80000000;
    public static final int o = -1;
    private static final String p = "android.view.View";
    private static final Rect q;
    private static final BoundsAdapter r;
    private static final CollectionAdapter s;

    static {
        ExploreByTouchHelper.q = new Rect(0x7FFFFFFF, 0x7FFFFFFF, 0x80000000, 0x80000000);
        ExploreByTouchHelper.r = new BoundsAdapter() {
            @Override  // androidx.customview.widget.FocusStrategy$BoundsAdapter
            public void a(Object object0, Rect rect0) {
                this.b(((AccessibilityNodeInfoCompat)object0), rect0);
            }

            public void b(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0, Rect rect0) {
                accessibilityNodeInfoCompat0.s(rect0);
            }
        };
        ExploreByTouchHelper.s = new CollectionAdapter() {
            @Override  // androidx.customview.widget.FocusStrategy$CollectionAdapter
            public Object a(Object object0, int v) {
                return this.c(((SparseArrayCompat)object0), v);
            }

            @Override  // androidx.customview.widget.FocusStrategy$CollectionAdapter
            public int b(Object object0) {
                return this.d(((SparseArrayCompat)object0));
            }

            public AccessibilityNodeInfoCompat c(SparseArrayCompat sparseArrayCompat0, int v) {
                return (AccessibilityNodeInfoCompat)sparseArrayCompat0.z(v);
            }

            public int d(SparseArrayCompat sparseArrayCompat0) {
                return sparseArrayCompat0.y();
            }
        };
    }

    public ExploreByTouchHelper(@NonNull View view0) {
        this.d = new Rect();
        this.e = new Rect();
        this.f = new Rect();
        this.g = new int[2];
        this.k = 0x80000000;
        this.l = 0x80000000;
        this.m = 0x80000000;
        if(view0 == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.i = view0;
        this.h = (AccessibilityManager)view0.getContext().getSystemService("accessibility");
        view0.setFocusable(true);
        if(ViewCompat.Z(view0) == 0) {
            ViewCompat.b2(view0, 1);
        }
    }

    @Deprecated
    public int A() {
        return this.x();
    }

    public final int B() {
        return this.l;
    }

    protected abstract int C(float arg1, float arg2);

    protected abstract void D(List arg1);

    private static Rect E(@NonNull View view0, int v, @NonNull Rect rect0) {
        int v1 = view0.getWidth();
        int v2 = view0.getHeight();
        switch(v) {
            case 17: {
                rect0.set(v1, 0, v1, v2);
                return rect0;
            }
            case 33: {
                rect0.set(0, v2, v1, v2);
                return rect0;
            }
            case 66: {
                rect0.set(-1, 0, -1, v2);
                return rect0;
            }
            case 130: {
                rect0.set(0, -1, v1, -1);
                return rect0;
            }
            default: {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        }
    }

    public final void F() {
        this.H(-1, 1);
    }

    public final void G(int v) {
        this.H(v, 0);
    }

    public final void H(int v, int v1) {
        if(v != 0x80000000 && this.h.isEnabled()) {
            ViewParent viewParent0 = this.i.getParent();
            if(viewParent0 != null) {
                AccessibilityEvent accessibilityEvent0 = this.q(v, 0x800);
                AccessibilityEventCompat.k(accessibilityEvent0, v1);
                viewParent0.requestSendAccessibilityEvent(this.i, accessibilityEvent0);
            }
        }
    }

    private boolean I(Rect rect0) {
        if(rect0 == null || rect0.isEmpty() || this.i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent viewParent0 = this.i.getParent();
        while(viewParent0 instanceof View) {
            if(((View)viewParent0).getAlpha() > 0.0f && ((View)viewParent0).getVisibility() == 0) {
                viewParent0 = ((View)viewParent0).getParent();
                continue;
            }
            return false;
        }
        return viewParent0 != null;
    }

    private static int J(int v) {
        switch(v) {
            case 19: {
                return 33;
            }
            case 21: {
                return 17;
            }
            case 22: {
                return 66;
            }
            default: {
                return 130;
            }
        }
    }

    private boolean K(int v, @Nullable Rect rect0) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat1;
        SparseArrayCompat sparseArrayCompat0 = this.y();
        int v1 = 0x80000000;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = this.l == 0x80000000 ? null : ((AccessibilityNodeInfoCompat)sparseArrayCompat0.g(this.l));
        switch(v) {
            case 1: 
            case 2: {
                boolean z = ViewCompat.e0(this.i) == 1;
                accessibilityNodeInfoCompat1 = (AccessibilityNodeInfoCompat)FocusStrategy.d(sparseArrayCompat0, ExploreByTouchHelper.s, ExploreByTouchHelper.r, accessibilityNodeInfoCompat0, v, z, false);
                break;
            }
            case 17: 
            case 33: 
            case 66: 
            case 130: {
                Rect rect1 = new Rect();
                int v2 = this.l;
                if(v2 != 0x80000000) {
                    this.z(v2, rect1);
                }
                else if(rect0 == null) {
                    ExploreByTouchHelper.E(this.i, v, rect1);
                }
                else {
                    rect1.set(rect0);
                }
                accessibilityNodeInfoCompat1 = (AccessibilityNodeInfoCompat)FocusStrategy.c(sparseArrayCompat0, ExploreByTouchHelper.s, ExploreByTouchHelper.r, accessibilityNodeInfoCompat0, rect1, v);
                break;
            }
            default: {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        }
        if(accessibilityNodeInfoCompat1 != null) {
            v1 = sparseArrayCompat0.n(sparseArrayCompat0.l(accessibilityNodeInfoCompat1));
        }
        return this.X(v1);
    }

    @NonNull
    AccessibilityNodeInfoCompat L(int v) {
        return v == -1 ? this.u() : this.t(v);
    }

    public final void M(boolean z, int v, @Nullable Rect rect0) {
        int v1 = this.l;
        if(v1 != 0x80000000) {
            this.o(v1);
        }
        if(z) {
            this.K(v, rect0);
        }
    }

    protected abstract boolean N(int arg1, int arg2, @Nullable Bundle arg3);

    protected void O(@NonNull AccessibilityEvent accessibilityEvent0) {
    }

    protected void P(int v, @NonNull AccessibilityEvent accessibilityEvent0) {
    }

    protected void Q(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
    }

    protected abstract void R(int arg1, @NonNull AccessibilityNodeInfoCompat arg2);

    protected void S(int v, boolean z) {
    }

    boolean T(int v, int v1, Bundle bundle0) {
        return v == -1 ? this.V(v1, bundle0) : this.U(v, v1, bundle0);
    }

    private boolean U(int v, int v1, Bundle bundle0) {
        switch(v1) {
            case 1: {
                return this.X(v);
            }
            case 2: {
                return this.o(v);
            }
            case 0x40: {
                return this.W(v);
            }
            case 0x80: {
                return this.n(v);
            }
            default: {
                return this.N(v, v1, bundle0);
            }
        }
    }

    private boolean V(int v, Bundle bundle0) {
        return ViewCompat.r1(this.i, v, bundle0);
    }

    private boolean W(int v) {
        if(this.h.isEnabled() && this.h.isTouchExplorationEnabled()) {
            int v1 = this.k;
            if(v1 != v) {
                if(v1 != 0x80000000) {
                    this.n(v1);
                }
                this.k = v;
                this.i.invalidate();
                this.Y(v, 0x8000);
                return true;
            }
        }
        return false;
    }

    public final boolean X(int v) {
        if(!this.i.isFocused() && !this.i.requestFocus()) {
            return false;
        }
        int v1 = this.l;
        if(v1 == v) {
            return false;
        }
        if(v1 != 0x80000000) {
            this.o(v1);
        }
        if(v == 0x80000000) {
            return false;
        }
        this.l = v;
        this.S(v, true);
        this.Y(v, 8);
        return true;
    }

    public final boolean Y(int v, int v1) {
        if(v != 0x80000000 && this.h.isEnabled()) {
            ViewParent viewParent0 = this.i.getParent();
            if(viewParent0 == null) {
                return false;
            }
            AccessibilityEvent accessibilityEvent0 = this.q(v, v1);
            return viewParent0.requestSendAccessibilityEvent(this.i, accessibilityEvent0);
        }
        return false;
    }

    private void Z(int v) {
        int v1 = this.m;
        if(v1 == v) {
            return;
        }
        this.m = v;
        this.Y(v, 0x80);
        this.Y(v1, 0x100);
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat b(View view0) {
        if(this.j == null) {
            this.j = new MyNodeProvider(this);
        }
        return this.j;
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public void f(View view0, AccessibilityEvent accessibilityEvent0) {
        super.f(view0, accessibilityEvent0);
    }

    @Override  // androidx.core.view.AccessibilityDelegateCompat
    public void g(View view0, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        super.g(view0, accessibilityNodeInfoCompat0);
        this.Q(accessibilityNodeInfoCompat0);
    }

    private boolean n(int v) {
        if(this.k == v) {
            this.k = 0x80000000;
            this.i.invalidate();
            this.Y(v, 0x10000);
            return true;
        }
        return false;
    }

    public final boolean o(int v) {
        if(this.l != v) {
            return false;
        }
        this.l = 0x80000000;
        this.S(v, false);
        this.Y(v, 8);
        return true;
    }

    private boolean p() {
        return this.l != 0x80000000 && this.N(this.l, 16, null);
    }

    private AccessibilityEvent q(int v, int v1) {
        return v == -1 ? this.s(v1) : this.r(v, v1);
    }

    private AccessibilityEvent r(int v, int v1) {
        AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain(v1);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = this.L(v);
        accessibilityEvent0.getText().add(accessibilityNodeInfoCompat0.a0());
        accessibilityEvent0.setContentDescription(accessibilityNodeInfoCompat0.D());
        accessibilityEvent0.setScrollable(accessibilityNodeInfoCompat0.I0());
        accessibilityEvent0.setPassword(accessibilityNodeInfoCompat0.G0());
        accessibilityEvent0.setEnabled(accessibilityNodeInfoCompat0.x0());
        accessibilityEvent0.setChecked(accessibilityNodeInfoCompat0.r0());
        if(accessibilityEvent0.getText().isEmpty() && accessibilityEvent0.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEvent0.setClassName(accessibilityNodeInfoCompat0.y());
        AccessibilityRecordCompat.Y(accessibilityEvent0, this.i, v);
        accessibilityEvent0.setPackageName("com.dcinside.app.android");
        return accessibilityEvent0;
    }

    private AccessibilityEvent s(int v) {
        AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain(v);
        this.i.onInitializeAccessibilityEvent(accessibilityEvent0);
        return accessibilityEvent0;
    }

    @NonNull
    private AccessibilityNodeInfoCompat t(int v) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.O0();
        accessibilityNodeInfoCompat0.v1(true);
        accessibilityNodeInfoCompat0.y1(true);
        accessibilityNodeInfoCompat0.k1("android.view.View");
        Rect rect0 = ExploreByTouchHelper.q;
        accessibilityNodeInfoCompat0.e1(rect0);
        accessibilityNodeInfoCompat0.f1(rect0);
        accessibilityNodeInfoCompat0.R1(this.i);
        this.R(v, accessibilityNodeInfoCompat0);
        if(accessibilityNodeInfoCompat0.a0() == null && accessibilityNodeInfoCompat0.D() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoCompat0.s(this.e);
        if(this.e.equals(rect0)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int v1 = accessibilityNodeInfoCompat0.p();
        if((v1 & 0x40) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if((v1 & 0x80) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoCompat0.P1("com.dcinside.app.android");
        accessibilityNodeInfoCompat0.d2(this.i, v);
        if(this.k == v) {
            accessibilityNodeInfoCompat0.b1(true);
            accessibilityNodeInfoCompat0.a(0x80);
        }
        else {
            accessibilityNodeInfoCompat0.b1(false);
            accessibilityNodeInfoCompat0.a(0x40);
        }
        boolean z = this.l == v;
        if(z) {
            accessibilityNodeInfoCompat0.a(2);
        }
        else if(accessibilityNodeInfoCompat0.z0()) {
            accessibilityNodeInfoCompat0.a(1);
        }
        accessibilityNodeInfoCompat0.z1(z);
        this.i.getLocationOnScreen(this.g);
        accessibilityNodeInfoCompat0.t(this.d);
        if(this.d.equals(rect0)) {
            accessibilityNodeInfoCompat0.s(this.d);
            if(accessibilityNodeInfoCompat0.b != -1) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat1 = AccessibilityNodeInfoCompat.O0();
                for(int v2 = accessibilityNodeInfoCompat0.b; v2 != -1; v2 = accessibilityNodeInfoCompat1.b) {
                    accessibilityNodeInfoCompat1.S1(this.i, -1);
                    accessibilityNodeInfoCompat1.e1(ExploreByTouchHelper.q);
                    this.R(v2, accessibilityNodeInfoCompat1);
                    accessibilityNodeInfoCompat1.s(this.e);
                    this.d.offset(this.e.left, this.e.top);
                }
            }
            int v3 = this.g[0];
            int v4 = this.i.getScrollX();
            int v5 = this.g[1];
            int v6 = this.i.getScrollY();
            this.d.offset(v3 - v4, v5 - v6);
        }
        if(this.i.getLocalVisibleRect(this.f)) {
            int v7 = this.g[0];
            int v8 = this.i.getScrollX();
            int v9 = this.g[1];
            int v10 = this.i.getScrollY();
            this.f.offset(v7 - v8, v9 - v10);
            if(this.d.intersect(this.f)) {
                accessibilityNodeInfoCompat0.f1(this.d);
                if(this.I(this.d)) {
                    accessibilityNodeInfoCompat0.r2(true);
                }
            }
        }
        return accessibilityNodeInfoCompat0;
    }

    @NonNull
    private AccessibilityNodeInfoCompat u() {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.P0(this.i);
        ViewCompat.o1(this.i, accessibilityNodeInfoCompat0);
        ArrayList arrayList0 = new ArrayList();
        this.D(arrayList0);
        if(accessibilityNodeInfoCompat0.x() > 0 && arrayList0.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = (int)(((Integer)arrayList0.get(v1)));
            accessibilityNodeInfoCompat0.d(this.i, v2);
        }
        return accessibilityNodeInfoCompat0;
    }

    public final boolean v(@NonNull MotionEvent motionEvent0) {
        if(this.h.isEnabled() && this.h.isTouchExplorationEnabled()) {
            switch(motionEvent0.getAction()) {
                case 7: 
                case 9: {
                    int v = this.C(motionEvent0.getX(), motionEvent0.getY());
                    this.Z(v);
                    return v != 0x80000000;
                }
                case 10: {
                    if(this.m != 0x80000000) {
                        this.Z(0x80000000);
                        return true;
                    }
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    public final boolean w(@NonNull KeyEvent keyEvent0) {
        int v = 0;
        if(keyEvent0.getAction() != 1) {
            int v1 = keyEvent0.getKeyCode();
            switch(v1) {
                case 19: 
                case 20: 
                case 21: 
                case 22: {
                    if(keyEvent0.hasNoModifiers()) {
                        int v2 = ExploreByTouchHelper.J(v1);
                        int v3 = keyEvent0.getRepeatCount();
                        boolean z;
                        for(z = false; v < v3 + 1 && this.K(v2, null); z = true) {
                            ++v;
                        }
                        return z;
                    }
                    break;
                }
                case 61: {
                    if(keyEvent0.hasNoModifiers()) {
                        return this.K(2, null);
                    }
                    if(keyEvent0.hasModifiers(1)) {
                        v = this.K(1, null);
                    }
                    break;
                }
                case 23: 
                case 66: {
                    if(keyEvent0.hasNoModifiers() && keyEvent0.getRepeatCount() == 0) {
                        this.p();
                        return true;
                    }
                    break;
                }
                default: {
                    return false;
                }
            }
        }
        return v != 0;
    }

    public final int x() {
        return this.k;
    }

    private SparseArrayCompat y() {
        ArrayList arrayList0 = new ArrayList();
        this.D(arrayList0);
        SparseArrayCompat sparseArrayCompat0 = new SparseArrayCompat();
        for(int v = 0; v < arrayList0.size(); ++v) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = this.t(((int)(((Integer)arrayList0.get(v)))));
            sparseArrayCompat0.o(((int)(((Integer)arrayList0.get(v)))), accessibilityNodeInfoCompat0);
        }
        return sparseArrayCompat0;
    }

    private void z(int v, Rect rect0) {
        this.L(v).s(rect0);
    }
}

