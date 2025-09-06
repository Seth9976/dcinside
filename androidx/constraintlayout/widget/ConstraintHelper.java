package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.Arrays;
import java.util.HashMap;

public abstract class ConstraintHelper extends View {
    protected int[] a;
    protected int b;
    protected Context c;
    protected Helper d;
    protected boolean e;
    protected String f;
    protected String g;
    private View[] h;
    protected HashMap i;
    protected static final String j = "CONSTRAINT_LAYOUT_HELPER_CHILD";

    public ConstraintHelper(Context context0) {
        super(context0);
        this.a = new int[0x20];
        this.e = false;
        this.h = null;
        this.i = new HashMap();
        this.c = context0;
        this.z(null);
    }

    public ConstraintHelper(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new int[0x20];
        this.e = false;
        this.h = null;
        this.i = new HashMap();
        this.c = context0;
        this.z(attributeSet0);
    }

    public ConstraintHelper(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new int[0x20];
        this.e = false;
        this.h = null;
        this.i = new HashMap();
        this.c = context0;
        this.z(attributeSet0);
    }

    public static boolean A(View view0) {
        return "CONSTRAINT_LAYOUT_HELPER_CHILD" == view0.getTag();
    }

    public void B(Constraint constraintSet$Constraint0, HelperWidget helperWidget0, LayoutParams constraintLayout$LayoutParams0, SparseArray sparseArray0) {
        Layout constraintSet$Layout0 = constraintSet$Constraint0.e;
        int[] arr_v = constraintSet$Layout0.k0;
        if(arr_v == null) {
            String s = constraintSet$Layout0.l0;
            if(s != null) {
                constraintSet$Constraint0.e.k0 = s.length() > 0 ? this.u(constraintSet$Constraint0.e.l0) : null;
            }
        }
        else {
            this.setReferencedIds(arr_v);
        }
        if(helperWidget0 != null) {
            helperWidget0.b();
            if(constraintSet$Constraint0.e.k0 != null) {
                for(int v = 0; true; ++v) {
                    int[] arr_v1 = constraintSet$Constraint0.e.k0;
                    if(v >= arr_v1.length) {
                        break;
                    }
                    ConstraintWidget constraintWidget0 = (ConstraintWidget)sparseArray0.get(arr_v1[v]);
                    if(constraintWidget0 != null) {
                        helperWidget0.a(constraintWidget0);
                    }
                }
            }
        }
    }

    public int C(View view0) {
        int v4;
        int v = view0.getId();
        int v1 = -1;
        if(v == -1) {
            return -1;
        }
        this.f = null;
        for(int v2 = 0; v2 < this.b; ++v2) {
            if(this.a[v2] == v) {
                for(int v3 = v2; true; ++v3) {
                    v4 = this.b;
                    if(v3 >= v4 - 1) {
                        break;
                    }
                    this.a[v3] = this.a[v3 + 1];
                }
                this.a[v4 - 1] = 0;
                this.b = v4 - 1;
                v1 = v2;
                break;
            }
        }
        this.requestLayout();
        return v1;
    }

    public void D(ConstraintWidget constraintWidget0, boolean z) {
    }

    public void E(ConstraintLayout constraintLayout0) {
    }

    public void F(ConstraintLayout constraintLayout0) {
    }

    public void G(ConstraintLayout constraintLayout0) {
    }

    public void H(ConstraintLayout constraintLayout0) {
    }

    public void I(ConstraintWidgetContainer constraintWidgetContainer0, Helper helper0, SparseArray sparseArray0) {
        helper0.b();
        for(int v = 0; v < this.b; ++v) {
            helper0.a(((ConstraintWidget)sparseArray0.get(this.a[v])));
        }
    }

    public void J(ConstraintLayout constraintLayout0) {
        if(this.isInEditMode()) {
            this.setIds(this.f);
        }
        Helper helper0 = this.d;
        if(helper0 == null) {
            return;
        }
        helper0.b();
        for(int v = 0; v < this.b; ++v) {
            int v1 = this.a[v];
            View view0 = constraintLayout0.getViewById(v1);
            if(view0 == null) {
                String s = (String)this.i.get(v1);
                int v2 = this.v(constraintLayout0, s);
                if(v2 != 0) {
                    this.a[v] = v2;
                    this.i.put(v2, s);
                    view0 = constraintLayout0.getViewById(v2);
                }
            }
            if(view0 != null) {
                this.d.a(constraintLayout0.getViewWidget(view0));
            }
        }
        this.d.c(constraintLayout0.mLayoutWidget);
    }

    public void K() {
        if(this.d == null) {
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof LayoutParams) {
            ((LayoutParams)viewGroup$LayoutParams0).v0 = (ConstraintWidget)this.d;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.b);
    }

    private void l(String s) {
        if(s == null || s.length() == 0 || this.c == null) {
            return;
        }
        String s1 = s.trim();
        int v = this.w(s1);
        if(v != 0) {
            this.i.put(v, s1);
            this.m(v);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + s1 + "\"");
    }

    private void m(int v) {
        if(v == this.getId()) {
            return;
        }
        int[] arr_v = this.a;
        if(this.b + 1 > arr_v.length) {
            this.a = Arrays.copyOf(arr_v, arr_v.length * 2);
        }
        int v1 = this.b;
        this.a[v1] = v;
        this.b = v1 + 1;
    }

    private void n(String s) {
        if(s == null || s.length() == 0 || this.c == null) {
            return;
        }
        String s1 = s.trim();
        ConstraintLayout constraintLayout0 = this.getParent() instanceof ConstraintLayout ? ((ConstraintLayout)this.getParent()) : null;
        if(constraintLayout0 == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int v = constraintLayout0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = constraintLayout0.getChildAt(v1);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            if(viewGroup$LayoutParams0 instanceof LayoutParams && s1.equals(((LayoutParams)viewGroup$LayoutParams0).c0)) {
                if(view0.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + view0.getClass().getSimpleName() + " must have an ID");
                }
                else {
                    this.m(view0.getId());
                }
            }
        }
    }

    public void o(View view0) {
        if(view0 == this) {
            return;
        }
        if(view0.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
            return;
        }
        if(view0.getParent() == null) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
            return;
        }
        this.f = null;
        this.m(view0.getId());
        this.requestLayout();
    }

    @Override  // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String s = this.f;
        if(s != null) {
            this.setIds(s);
        }
        String s1 = this.g;
        if(s1 != null) {
            this.setReferenceTags(s1);
        }
    }

    @Override  // android.view.View
    public void onDraw(@NonNull Canvas canvas0) {
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        if(this.e) {
            super.onMeasure(v, v1);
            return;
        }
        this.setMeasuredDimension(0, 0);
    }

    public void p() {
    }

    protected void q() {
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 != null && viewParent0 instanceof ConstraintLayout) {
            this.r(((ConstraintLayout)viewParent0));
        }
    }

    protected void r(ConstraintLayout constraintLayout0) {
        int v = this.getVisibility();
        float f = this.getElevation();
        for(int v1 = 0; v1 < this.b; ++v1) {
            View view0 = constraintLayout0.getViewById(this.a[v1]);
            if(view0 != null) {
                view0.setVisibility(v);
                if(f > 0.0f) {
                    view0.setTranslationZ(view0.getTranslationZ() + f);
                }
            }
        }
    }

    protected void s(ConstraintLayout constraintLayout0) {
    }

    protected void setIds(String s) {
        this.f = s;
        if(s == null) {
            return;
        }
        int v = 0;
        this.b = 0;
        int v1;
        while((v1 = s.indexOf(44, v)) != -1) {
            this.l(s.substring(v, v1));
            v = v1 + 1;
        }
        this.l(s.substring(v));
    }

    protected void setReferenceTags(String s) {
        this.g = s;
        if(s == null) {
            return;
        }
        int v = 0;
        this.b = 0;
        int v1;
        while((v1 = s.indexOf(44, v)) != -1) {
            this.n(s.substring(v, v1));
            v = v1 + 1;
        }
        this.n(s.substring(v));
    }

    public void setReferencedIds(int[] arr_v) {
        this.f = null;
        this.b = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            this.m(arr_v[v]);
        }
    }

    @Override  // android.view.View
    public void setTag(int v, Object object0) {
        super.setTag(v, object0);
        if(object0 == null && this.f == null) {
            this.m(v);
        }
    }

    public boolean t(int v) {
        int[] arr_v = this.a;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == v) {
                return true;
            }
        }
        return false;
    }

    private int[] u(String s) {
        String[] arr_s = s.split(",");
        int[] arr_v = new int[arr_s.length];
        int v1 = 0;
        for(int v = 0; v < arr_s.length; ++v) {
            int v2 = this.w(arr_s[v].trim());
            if(v2 != 0) {
                arr_v[v1] = v2;
                ++v1;
            }
        }
        return v1 == arr_s.length ? arr_v : Arrays.copyOf(arr_v, v1);
    }

    private int v(ConstraintLayout constraintLayout0, String s) {
        if(s != null && constraintLayout0 != null) {
            Resources resources0 = this.c.getResources();
            if(resources0 == null) {
                return 0;
            }
            int v = constraintLayout0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = constraintLayout0.getChildAt(v1);
                if(view0.getId() != -1) {
                    try {
                        String s1 = null;
                        s1 = resources0.getResourceEntryName(view0.getId());
                    }
                    catch(Resources.NotFoundException unused_ex) {
                    }
                    if(s.equals(s1)) {
                        return view0.getId();
                    }
                }
            }
        }
        return 0;
    }

    private int w(String s) {
        ConstraintLayout constraintLayout0 = this.getParent() instanceof ConstraintLayout ? ((ConstraintLayout)this.getParent()) : null;
        int v = 0;
        if(this.isInEditMode() && constraintLayout0 != null) {
            Object object0 = constraintLayout0.getDesignInformation(0, s);
            if(object0 instanceof Integer) {
                v = (int)(((Integer)object0));
            }
        }
        if(v == 0 && constraintLayout0 != null) {
            v = this.v(constraintLayout0, s);
        }
        if(v == 0) {
            try {
                v = id.class.getField(s).getInt(null);
            }
            catch(Exception unused_ex) {
            }
        }
        return v == 0 ? this.c.getResources().getIdentifier(s, "id", "com.dcinside.app.android") : v;
    }

    protected View[] x(ConstraintLayout constraintLayout0) {
        if(this.h == null || this.h.length != this.b) {
            this.h = new View[this.b];
        }
        for(int v = 0; v < this.b; ++v) {
            View[] arr_view = this.h;
            arr_view[v] = constraintLayout0.getViewById(this.a[v]);
        }
        return this.h;
    }

    public int y(int v) {
        int[] arr_v = this.a;
        int v1 = -1;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            ++v1;
            if(arr_v[v2] == v) {
                return v1;
            }
        }
        return v1;
    }

    protected void z(AttributeSet attributeSet0) {
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.ConstraintLayout_Layout);
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String s = typedArray0.getString(v2);
                    this.f = s;
                    this.setIds(s);
                }
                else if(v2 == styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String s1 = typedArray0.getString(v2);
                    this.g = s1;
                    this.setReferenceTags(s1);
                }
            }
            typedArray0.recycle();
        }
    }
}

