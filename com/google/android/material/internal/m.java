package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.R.styleable;
import com.google.android.material.drawable.f;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({Scope.b})
public class M {
    public interface d {
        WindowInsetsCompat a(View arg1, WindowInsetsCompat arg2, e arg3);
    }

    public static class e {
        public int a;
        public int b;
        public int c;
        public int d;

        public e(int v, int v1, int v2, int v3) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
        }

        public e(@NonNull e m$e0) {
            this.a = m$e0.a;
            this.b = m$e0.b;
            this.c = m$e0.c;
            this.d = m$e0.d;
        }

        public void a(View view0) {
            ViewCompat.p2(view0, this.a, this.b, this.c, this.d);
        }
    }

    @RequiresApi(16)
    public static final int a = 0x300;

    public static void A(@NonNull View view0, @NonNull Rect rect0) {
        view0.setLeft(rect0.left);
        view0.setTop(rect0.top);
        view0.setRight(rect0.right);
        view0.setBottom(rect0.bottom);
    }

    public static void B(@NonNull View view0) {
        M.C(view0, true);
    }

    public static void C(@NonNull View view0, boolean z) {
        if(z) {
            WindowInsetsControllerCompat windowInsetsControllerCompat0 = ViewCompat.G0(view0);
            if(windowInsetsControllerCompat0 != null) {
                windowInsetsControllerCompat0.k(8);
                return;
            }
        }
        M.n(view0).showSoftInput(view0, 1);
    }

    public static void b(@Nullable View view0, @NonNull ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
        if(view0 != null) {
            view0.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
        }
    }

    @NonNull
    public static Rect c(@NonNull View view0, @NonNull View view1) {
        int[] arr_v = new int[2];
        view1.getLocationOnScreen(arr_v);
        int v = arr_v[0];
        int v1 = arr_v[1];
        int[] arr_v1 = new int[2];
        view0.getLocationOnScreen(arr_v1);
        int v2 = v - arr_v1[0];
        int v3 = v1 - arr_v1[1];
        return new Rect(v2, v3, view1.getWidth() + v2, view1.getHeight() + v3);
    }

    @NonNull
    public static Rect d(@NonNull View view0) {
        return M.e(view0, 0);
    }

    @NonNull
    public static Rect e(@NonNull View view0, int v) {
        return new Rect(view0.getLeft(), view0.getTop() + v, view0.getRight(), view0.getBottom() + v);
    }

    public static void f(@NonNull View view0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        M.g(view0, attributeSet0, v, v1, null);
    }

    public static void g(@NonNull View view0, @Nullable AttributeSet attributeSet0, int v, int v1, @Nullable d m$d0) {
        class a implements d {
            final boolean a;
            final boolean b;
            final boolean c;
            final d d;

            a(boolean z, boolean z1, boolean z2, d m$d0) {
                this.b = z1;
                this.c = z2;
                this.d = m$d0;
                super();
            }

            @Override  // com.google.android.material.internal.M$d
            @NonNull
            public WindowInsetsCompat a(View view0, @NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull e m$e0) {
                if(this.a) {
                    m$e0.d += windowInsetsCompat0.o();
                }
                boolean z = M.s(view0);
                if(this.b) {
                    if(z) {
                        m$e0.c += windowInsetsCompat0.p();
                    }
                    else {
                        m$e0.a += windowInsetsCompat0.p();
                    }
                }
                if(this.c) {
                    if(z) {
                        m$e0.a += windowInsetsCompat0.q();
                    }
                    else {
                        m$e0.c += windowInsetsCompat0.q();
                    }
                }
                m$e0.a(view0);
                return this.d == null ? windowInsetsCompat0 : this.d.a(view0, windowInsetsCompat0, m$e0);
            }
        }

        TypedArray typedArray0 = view0.getContext().obtainStyledAttributes(attributeSet0, styleable.Insets, v, v1);
        boolean z = typedArray0.getBoolean(styleable.Insets_paddingBottomSystemWindowInsets, false);
        boolean z1 = typedArray0.getBoolean(styleable.Insets_paddingLeftSystemWindowInsets, false);
        boolean z2 = typedArray0.getBoolean(styleable.Insets_paddingRightSystemWindowInsets, false);
        typedArray0.recycle();
        M.h(view0, new a(z, z1, z2, m$d0));
    }

    public static void h(@NonNull View view0, @NonNull d m$d0) {
        class b implements OnApplyWindowInsetsListener {
            final d a;
            final e b;

            b(d m$d0, e m$e0) {
                this.b = m$e0;
                super();
            }

            @Override  // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat a(View view0, WindowInsetsCompat windowInsetsCompat0) {
                e m$e0 = new e(this.b);
                return this.a.a(view0, windowInsetsCompat0, m$e0);
            }
        }

        ViewCompat.m2(view0, new b(m$d0, new e(ViewCompat.p0(view0), view0.getPaddingTop(), ViewCompat.o0(view0), view0.getPaddingBottom())));
        M.x(view0);
    }

    public static float i(@NonNull Context context0, @Dimension(unit = 0) int v) {
        return TypedValue.applyDimension(1, ((float)v), context0.getResources().getDisplayMetrics());
    }

    @Nullable
    public static Integer j(@NonNull View view0) {
        ColorStateList colorStateList0 = f.g(view0.getBackground());
        return colorStateList0 == null ? null : colorStateList0.getDefaultColor();
    }

    @NonNull
    public static List k(@Nullable View view0) {
        List list0 = new ArrayList();
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                list0.add(((ViewGroup)view0).getChildAt(v));
            }
        }
        return list0;
    }

    @Nullable
    public static ViewGroup l(@Nullable View view0) {
        if(view0 == null) {
            return null;
        }
        View view1 = view0.getRootView();
        ViewGroup viewGroup0 = (ViewGroup)view1.findViewById(0x1020002);
        if(viewGroup0 != null) {
            return viewGroup0;
        }
        return view1 == view0 || !(view1 instanceof ViewGroup) ? null : ((ViewGroup)view1);
    }

    @Nullable
    public static K m(@NonNull View view0) {
        return M.o(M.l(view0));
    }

    @Nullable
    private static InputMethodManager n(@NonNull View view0) {
        return (InputMethodManager)ContextCompat.getSystemService(view0.getContext(), InputMethodManager.class);
    }

    @Nullable
    public static K o(@Nullable View view0) {
        return view0 == null ? null : new J(view0);
    }

    public static float p(@NonNull View view0) {
        ViewParent viewParent0 = view0.getParent();
        float f = 0.0f;
        while(viewParent0 instanceof View) {
            f += ViewCompat.V(((View)viewParent0));
            viewParent0 = viewParent0.getParent();
        }
        return f;
    }

    public static void q(@NonNull View view0) {
        M.r(view0, true);
    }

    public static void r(@NonNull View view0, boolean z) {
        if(z) {
            WindowInsetsControllerCompat windowInsetsControllerCompat0 = ViewCompat.G0(view0);
            if(windowInsetsControllerCompat0 != null) {
                windowInsetsControllerCompat0.d(8);
                return;
            }
        }
        InputMethodManager inputMethodManager0 = M.n(view0);
        if(inputMethodManager0 != null) {
            inputMethodManager0.hideSoftInputFromWindow(view0.getWindowToken(), 0);
        }
    }

    public static boolean s(View view0) {
        return ViewCompat.e0(view0) == 1;
    }

    public static PorterDuff.Mode u(int v, PorterDuff.Mode porterDuff$Mode0) {
        switch(v) {
            case 3: {
                return PorterDuff.Mode.SRC_OVER;
            }
            case 5: {
                return PorterDuff.Mode.SRC_IN;
            }
            case 9: {
                return PorterDuff.Mode.SRC_ATOP;
            }
            case 14: {
                return PorterDuff.Mode.MULTIPLY;
            }
            case 15: {
                return PorterDuff.Mode.SCREEN;
            }
            case 16: {
                return PorterDuff.Mode.ADD;
            }
            default: {
                return porterDuff$Mode0;
            }
        }
    }

    public static void v(@Nullable View view0, @NonNull ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
        if(view0 != null) {
            M.w(view0.getViewTreeObserver(), viewTreeObserver$OnGlobalLayoutListener0);
        }
    }

    public static void w(@NonNull ViewTreeObserver viewTreeObserver0, @NonNull ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
        viewTreeObserver0.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
    }

    public static void x(@NonNull View view0) {
        class c implements View.OnAttachStateChangeListener {
            c() {
                super();
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NonNull View view0) {
                view0.removeOnAttachStateChangeListener(this);
                ViewCompat.D1(view0);
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
            }
        }

        if(ViewCompat.T0(view0)) {
            ViewCompat.D1(view0);
            return;
        }
        view0.addOnAttachStateChangeListener(new c());
    }

    public static void y(@NonNull View view0) {
        M.z(view0, true);
    }

    public static void z(@NonNull View view0, boolean z) {
        view0.requestFocus();
        view0.post(() -> M.C(view0, z));
    }
}

