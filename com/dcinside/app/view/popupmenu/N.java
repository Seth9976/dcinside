package com.dcinside.app.view.popupmenu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.PopupWindow;
import androidx.core.widget.PopupWindowCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.R.styleable;
import com.dcinside.app.browser.views.ShadowLayout;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import java.lang.reflect.Method;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import timber.log.b;
import y4.l;
import y4.m;

@SuppressLint({"PrivateResource"})
@s0({"SMAP\nMaterialRecyclerViewPopupWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialRecyclerViewPopupWindow.kt\ncom/dcinside/app/view/popupmenu/MaterialRecyclerViewPopupWindow\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 3 Context.kt\nandroidx/core/content/ContextKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,385:1\n27#2:386\n58#3,2:387\n1#4:389\n*S KotlinDebug\n*F\n+ 1 MaterialRecyclerViewPopupWindow.kt\ncom/dcinside/app/view/popupmenu/MaterialRecyclerViewPopupWindow\n*L\n105#1:386\n115#1:387,2\n*E\n"})
public final class n {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final Context a;
    private int b;
    @m
    private View c;
    @m
    private q d;
    private int e;
    private int f;
    private int g;
    @l
    private final Rect h;
    @l
    private final PopupWindow i;
    private final int j;
    private final int k;
    private final int l;
    private int m;
    private boolean n;
    private int o;
    private int p;
    @l
    public static final a q;
    @m
    private static Method r;
    @m
    private static Method s;

    static {
        Class class0 = PopupWindow.class;
        n.q = new a(null);
        try {
            n.r = class0.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            noSuchMethodException0.printStackTrace();
        }
        try {
            n.s = class0.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        }
        catch(NoSuchMethodException noSuchMethodException1) {
            noSuchMethodException1.printStackTrace();
        }
    }

    public n(@l Context context0, int v) {
        L.p(context0, "context");
        super();
        this.a = context0;
        this.b = v;
        this.e = -2;
        this.h = new Rect();
        this.m = 0x7F0804B0;  // drawable:popup_menu_bg
        this.o = 0;
        this.p = 0;
        PopupWindow popupWindow0 = new PopupWindow(context0, null, 0);
        this.i = popupWindow0;
        popupWindow0.setInputMethodMode(1);
        popupWindow0.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow0.setElevation(5.0f);
        popupWindow0.setFocusable(true);
        popupWindow0.setOutsideTouchable(true);
        this.j = context0.getResources().getDimensionPixelSize(0x7F0702DF);  // dimen:mpm_popup_menu_max_width
        this.k = context0.getResources().getDimensionPixelSize(0x7F0702E0);  // dimen:mpm_popup_menu_min_width
        this.l = context0.getResources().getDimensionPixelSize(0x7F0702E3);  // dimen:mpm_popup_menu_width_unit
        L.o(styleable.ListPopupWindow, "ListPopupWindow");
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, styleable.ListPopupWindow, 0, 0x7F160184);
        this.g = typedArray0.getDimensionPixelOffset(0, 0);
        typedArray0.recycle();
    }

    private final int a() {
        int v1;
        View view0 = View.inflate(this.a, 0x7F0E0143, null);  // layout:mpm_popup_menu
        View view1 = view0.findViewById(0x7F0B089D);  // id:mpm_popup_menu_recycler
        L.o(view1, "findViewById(...)");
        ((RecyclerView)view1).setAdapter(this.d);
        ((RecyclerView)view1).setLayoutManager(new LinearLayoutManager(this.a));
        boolean z = true;
        ((RecyclerView)view1).setFocusable(true);
        ((RecyclerView)view1).setFocusableInTouchMode(true);
        ((RecyclerView)view1).setBackgroundResource(this.m);
        if(this.n) {
            ((ShadowLayout)view0.findViewById(0x7F0B08A0)).setShadowSize(0.0f);  // id:mpm_popup_menu_shadow
        }
        this.i.setContentView(view0);
        Drawable drawable0 = this.i.getBackground();
        int v = 0;
        if(drawable0 == null) {
            this.h.setEmpty();
            v1 = 0;
        }
        else {
            drawable0.getPadding(this.h);
            v1 = this.h.bottom + this.h.top;
            this.f = -this.h.top;
        }
        if(this.i.getInputMethodMode() != 2) {
            z = false;
        }
        View view2 = this.c;
        L.m(view2);
        int v2 = this.i(this.f(view2, this.f, z));
        int v3 = Dk.b(0x7F0702E1);  // dimen:mpm_popup_menu_shadow_size
        if(v2 > 0) {
            v = v1 + (((RecyclerView)view1).getPaddingTop() + ((RecyclerView)view1).getPaddingBottom()) + v3 * 2;
        }
        return v2 + v;
    }

    public final void b() {
        try {
            this.i.dismiss();
        }
        catch(Exception unused_ex) {
        }
        try {
            this.i.setContentView(null);
        }
        catch(Exception unused_ex) {
        }
    }

    private final LayoutParams c() {
        return new LayoutParams(-1, -2);
    }

    @m
    public final q d() {
        return this.d;
    }

    @m
    public final View e() {
        return this.c;
    }

    private final int f(View view0, int v, boolean z) {
        Method method0 = n.s;
        if(method0 != null) {
            try {
                Object object0 = method0.invoke(this.i, view0, v, Boolean.valueOf(z));
                L.n(object0, "null cannot be cast to non-null type kotlin.Int");
                return (int)(((Integer)object0));
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }
        return this.i.getMaxAvailableHeight(view0, v);
    }

    public final int g() {
        return this.o;
    }

    public final int h() {
        return this.p;
    }

    private final int i(int v) {
        FrameLayout frameLayout0 = new FrameLayout(this.a);
        int v1 = this.d == null ? 0 : this.d.getItemCount();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            q q0 = this.d;
            L.m(q0);
            int v4 = q0.getItemViewType(v2);
            q q1 = this.d;
            L.m(q1);
            ViewHolder recyclerView$ViewHolder0 = q1.createViewHolder(frameLayout0, v4);
            L.o(recyclerView$ViewHolder0, "createViewHolder(...)");
            q q2 = this.d;
            L.m(q2);
            q2.bindViewHolder(recyclerView$ViewHolder0, v2);
            View view0 = recyclerView$ViewHolder0.itemView;
            L.o(view0, "itemView");
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                viewGroup$LayoutParams0 = this.c();
                view0.setLayoutParams(viewGroup$LayoutParams0);
            }
            view0.measure(0, (viewGroup$LayoutParams0.height <= 0 ? 0 : View.MeasureSpec.makeMeasureSpec(viewGroup$LayoutParams0.height, 0x40000000)));
            v3 += view0.getMeasuredHeight();
            if(v3 >= v) {
                return v;
            }
        }
        return v3;
    }

    private final int j(q q0) {
        q0.J();
        FrameLayout frameLayout0 = new FrameLayout(this.a);
        int v = this.k;
        int v1 = this.a.getResources().getDimensionPixelSize(0x7F0702E1);  // dimen:mpm_popup_menu_shadow_size
        int v2 = this.a.getResources().getDimensionPixelSize(0x7F0702D4);  // dimen:mpm_popup_menu_extra_width
        int v4 = q0.getItemCount();
        for(int v3 = 0; v3 < v4; ++v3) {
            ViewHolder recyclerView$ViewHolder0 = q0.createViewHolder(frameLayout0, q0.getItemViewType(v3));
            L.o(recyclerView$ViewHolder0, "createViewHolder(...)");
            q0.bindViewHolder(recyclerView$ViewHolder0, v3);
            L.o(recyclerView$ViewHolder0.itemView, "itemView");
            recyclerView$ViewHolder0.itemView.measure(0, 0);
            int v5 = recyclerView$ViewHolder0.itemView.getMeasuredWidth();
            int v6 = this.j;
            if(v5 >= v6) {
                return v6;
            }
            if(v5 > v) {
                v = v5;
            }
        }
        return ((int)Math.ceil(((double)v) / ((double)this.l))) * this.l + v1 * 2 + v2;
    }

    public final void k(@m q q0) {
        if(q0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.n(this.j(q0));
        this.d = q0;
    }

    public final void l(@m View view0) {
        this.c = view0;
    }

    public final void m(int v, boolean z) {
        this.m = v;
        this.n = z;
    }

    private final void n(int v) {
        Drawable drawable0 = this.i.getBackground();
        if(drawable0 != null) {
            drawable0.getPadding(this.h);
            v += this.h.left + this.h.right;
        }
        this.e = v;
    }

    public final void o(int v, int v1) {
        this.o = v;
        this.p = v1;
    }

    public final void p(@l PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        L.p(popupWindow$OnDismissListener0, "listener");
        this.i.setOnDismissListener(popupWindow$OnDismissListener0);
    }

    private final void q(boolean z) {
        Method method0 = n.r;
        if(method0 != null) {
            try {
                method0.invoke(this.i, Boolean.valueOf(z));
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }
    }

    public final void r(int v) {
        this.o = v;
    }

    public final void s(int v) {
        this.p = v;
    }

    public final void t() {
        View view0 = this.i.getContentView();
        if(Dl.n((view0 == null ? null : view0.getContext()))) {
            return;
        }
        if(this.c == null) {
            throw new IllegalStateException("Anchor view must be set!");
        }
        int v = this.a();
        PopupWindowCompat.d(this.i, 1002);
        int v1 = this.e;
        if(this.i.isShowing()) {
            this.i.update(this.c, this.g, this.f, v1, (v >= 0 ? v : -1));
            return;
        }
        this.i.setWidth(v1);
        this.i.setHeight(v);
        this.q(true);
        try {
            View view1 = this.c;
            L.m(view1);
            PopupWindowCompat.e(this.i, view1, this.o, this.p, this.b);
        }
        catch(Exception exception0) {
            b.a.y(exception0);
        }
    }
}

