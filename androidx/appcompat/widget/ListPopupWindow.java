package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AbsListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.widget.PopupWindowCompat;
import java.lang.reflect.Method;

public class ListPopupWindow implements ShowableListMenu {
    @RequiresApi(24)
    static class Api24Impl {
        @DoNotInline
        static int a(PopupWindow popupWindow0, View view0, int v, boolean z) {
            return popupWindow0.getMaxAvailableHeight(view0, v, z);
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        @DoNotInline
        static void a(PopupWindow popupWindow0, Rect rect0) {
            popupWindow0.setEpicenterBounds(rect0);
        }

        @DoNotInline
        static void b(PopupWindow popupWindow0, boolean z) {
            popupWindow0.setIsClippedToScreen(z);
        }
    }

    class ListSelectorHider implements Runnable {
        final ListPopupWindow a;

        @Override
        public void run() {
            ListPopupWindow.this.r();
        }
    }

    class PopupDataSetObserver extends DataSetObserver {
        final ListPopupWindow a;

        @Override  // android.database.DataSetObserver
        public void onChanged() {
            if(ListPopupWindow.this.b()) {
                ListPopupWindow.this.show();
            }
        }

        @Override  // android.database.DataSetObserver
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    class PopupScrollListener implements AbsListView.OnScrollListener {
        final ListPopupWindow a;

        @Override  // android.widget.AbsListView$OnScrollListener
        public void onScroll(AbsListView absListView0, int v, int v1, int v2) {
        }

        @Override  // android.widget.AbsListView$OnScrollListener
        public void onScrollStateChanged(AbsListView absListView0, int v) {
            if(v == 1 && !ListPopupWindow.this.J() && ListPopupWindow.this.F.getContentView() != null) {
                ListPopupWindow.this.B.removeCallbacks(ListPopupWindow.this.w);
                ListPopupWindow.this.w.run();
            }
        }
    }

    class PopupTouchInterceptor implements View.OnTouchListener {
        final ListPopupWindow a;

        @Override  // android.view.View$OnTouchListener
        public boolean onTouch(View view0, MotionEvent motionEvent0) {
            int v = motionEvent0.getAction();
            int v1 = (int)motionEvent0.getX();
            int v2 = (int)motionEvent0.getY();
            if(v == 0) {
                PopupWindow popupWindow0 = ListPopupWindow.this.F;
                if(popupWindow0 != null && popupWindow0.isShowing() && v1 >= 0 && v1 < ListPopupWindow.this.F.getWidth() && v2 >= 0 && v2 < ListPopupWindow.this.F.getHeight()) {
                    ListPopupWindow.this.B.postDelayed(ListPopupWindow.this.w, 0xFAL);
                    return false;
                }
            }
            if(v == 1) {
                ListPopupWindow.this.B.removeCallbacks(ListPopupWindow.this.w);
            }
            return false;
        }
    }

    class ResizePopupRunnable implements Runnable {
        final ListPopupWindow a;

        @Override
        public void run() {
            DropDownListView dropDownListView0 = ListPopupWindow.this.c;
            if(dropDownListView0 != null && dropDownListView0.isAttachedToWindow() && ListPopupWindow.this.c.getCount() > ListPopupWindow.this.c.getChildCount()) {
                int v = ListPopupWindow.this.c.getChildCount();
                ListPopupWindow listPopupWindow0 = ListPopupWindow.this;
                if(v <= listPopupWindow0.o) {
                    listPopupWindow0.F.setInputMethodMode(2);
                    ListPopupWindow.this.show();
                }
            }
        }
    }

    private Runnable A;
    final Handler B;
    private final Rect C;
    private Rect D;
    private boolean E;
    PopupWindow F;
    private static final String G = "ListPopupWindow";
    private static final boolean H = false;
    static final int I = 0xFA;
    private static Method J = null;
    private static Method K = null;
    private static Method L = null;
    public static final int M = 0;
    public static final int N = 1;
    public static final int O = -1;
    public static final int P = -2;
    public static final int Q = 0;
    public static final int X = 1;
    public static final int Y = 2;
    private Context a;
    private ListAdapter b;
    DropDownListView c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private boolean m;
    private boolean n;
    int o;
    private View p;
    private int q;
    private DataSetObserver r;
    private View s;
    private Drawable t;
    private AdapterView.OnItemClickListener u;
    private AdapterView.OnItemSelectedListener v;
    final ResizePopupRunnable w;
    private final PopupTouchInterceptor x;
    private final PopupScrollListener y;
    private final ListSelectorHider z;

    static {
        Class class0 = PopupWindow.class;
        if(Build.VERSION.SDK_INT <= 28) {
            try {
                ListPopupWindow.J = class0.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            }
            catch(NoSuchMethodException unused_ex) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                ListPopupWindow.L = class0.getDeclaredMethod("setEpicenterBounds", Rect.class);
            }
            catch(NoSuchMethodException unused_ex) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if(Build.VERSION.SDK_INT <= 23) {
            try {
                ListPopupWindow.K = class0.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            }
            catch(NoSuchMethodException unused_ex) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(@NonNull Context context0) {
        this(context0, null, attr.listPopupWindowStyle);
    }

    public ListPopupWindow(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.listPopupWindowStyle);
    }

    public ListPopupWindow(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        this(context0, attributeSet0, v, 0);
    }

    public ListPopupWindow(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        this.d = -2;
        this.e = -2;
        this.h = 1002;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.o = 0x7FFFFFFF;
        this.q = 0;
        this.w = new ResizePopupRunnable(this);
        this.x = new PopupTouchInterceptor(this);
        this.y = new PopupScrollListener(this);
        this.z = () -> {
            DropDownListView dropDownListView0 = ListPopupWindow.this.c;
            if(dropDownListView0 != null) {
                dropDownListView0.setListSelectionHidden(true);
                dropDownListView0.requestLayout();
            }
        };
        this.C = new Rect();
        this.a = context0;
        this.B = new Handler(context0.getMainLooper());
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ListPopupWindow, v, v1);
        this.f = typedArray0.getDimensionPixelOffset(styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int v2 = typedArray0.getDimensionPixelOffset(styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.g = v2;
        if(v2 != 0) {
            this.i = true;
        }
        typedArray0.recycle();
        AppCompatPopupWindow appCompatPopupWindow0 = new AppCompatPopupWindow(context0, attributeSet0, v, v1);
        this.F = appCompatPopupWindow0;
        appCompatPopupWindow0.setInputMethodMode(1);
    }

    public int A() {
        return this.q;
    }

    @Nullable
    public Object B() {
        return this.b() ? this.c.getSelectedItem() : null;
    }

    public long C() {
        return this.b() ? this.c.getSelectedItemId() : 0x8000000000000000L;
    }

    public int D() {
        return this.b() ? this.c.getSelectedItemPosition() : -1;
    }

    @Nullable
    public View E() {
        return this.b() ? this.c.getSelectedView() : null;
    }

    public int F() {
        return this.F.getSoftInputMode();
    }

    public int G() {
        return this.e;
    }

    private static boolean H(int v) {
        return v == 23 || v == 66;
    }

    @RestrictTo({Scope.c})
    public boolean I() {
        return this.m;
    }

    public boolean J() {
        return this.F.getInputMethodMode() == 2;
    }

    public boolean K() {
        return this.E;
    }

    public boolean L(int v, @NonNull KeyEvent keyEvent0) {
        int v3;
        int v2;
        if(this.b() && v != 62 && (this.c.getSelectedItemPosition() >= 0 || !ListPopupWindow.H(v))) {
            int v1 = this.c.getSelectedItemPosition();
            boolean z = this.F.isAboveAnchor();
            ListAdapter listAdapter0 = this.b;
            if(listAdapter0 == null) {
                v2 = 0x7FFFFFFF;
                v3 = 0x80000000;
            }
            else {
                boolean z1 = listAdapter0.areAllItemsEnabled();
                v2 = z1 ? 0 : this.c.d(0, true);
                v3 = z1 ? listAdapter0.getCount() - 1 : this.c.d(listAdapter0.getCount() - 1, false);
            }
            if(!z && v == 19 && v1 <= v2 || z && v == 20 && v1 >= v3) {
                this.r();
                this.F.setInputMethodMode(1);
                this.show();
                return true;
            }
            this.c.setListSelectionHidden(false);
            if(this.c.onKeyDown(v, keyEvent0)) {
                this.F.setInputMethodMode(2);
                this.c.requestFocusFromTouch();
                this.show();
                return v == 19 || v == 20 || (v == 23 || v == 66);
            }
            return z || v != 20 ? z && v == 19 && v1 == v2 : v1 == v3;
        }
        return false;
    }

    public boolean M(int v, @NonNull KeyEvent keyEvent0) {
        if(v == 4 && this.b()) {
            View view0 = this.s;
            if(keyEvent0.getAction() == 0 && keyEvent0.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyEvent$DispatcherState0 = view0.getKeyDispatcherState();
                if(keyEvent$DispatcherState0 != null) {
                    keyEvent$DispatcherState0.startTracking(keyEvent0, this);
                }
                return true;
            }
            if(keyEvent0.getAction() == 1) {
                KeyEvent.DispatcherState keyEvent$DispatcherState1 = view0.getKeyDispatcherState();
                if(keyEvent$DispatcherState1 != null) {
                    keyEvent$DispatcherState1.handleUpEvent(keyEvent0);
                }
                if(keyEvent0.isTracking() && !keyEvent0.isCanceled()) {
                    this.dismiss();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean N(int v, @NonNull KeyEvent keyEvent0) {
        if(this.b() && this.c.getSelectedItemPosition() >= 0) {
            boolean z = this.c.onKeyUp(v, keyEvent0);
            if(z && ListPopupWindow.H(v)) {
                this.dismiss();
            }
            return z;
        }
        return false;
    }

    public boolean O(int v) {
        if(this.b()) {
            if(this.u != null) {
                DropDownListView dropDownListView0 = this.c;
                View view0 = dropDownListView0.getChildAt(v - dropDownListView0.getFirstVisiblePosition());
                ListAdapter listAdapter0 = dropDownListView0.getAdapter();
                this.u.onItemClick(dropDownListView0, view0, v, listAdapter0.getItemId(v));
            }
            return true;
        }
        return false;
    }

    public void P() {
        this.B.post(this.A);
    }

    private void Q() {
        View view0 = this.p;
        if(view0 != null) {
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(this.p);
            }
        }
    }

    public void R(@Nullable View view0) {
        this.s = view0;
    }

    public void S(@StyleRes int v) {
        this.F.setAnimationStyle(v);
    }

    public void T(int v) {
        Drawable drawable0 = this.F.getBackground();
        if(drawable0 != null) {
            drawable0.getPadding(this.C);
            this.e = this.C.left + this.C.right + v;
            return;
        }
        this.m0(v);
    }

    @RestrictTo({Scope.c})
    public void U(boolean z) {
        this.m = z;
    }

    public void V(int v) {
        this.l = v;
    }

    public void W(@Nullable Rect rect0) {
        this.D = rect0 == null ? null : new Rect(rect0);
    }

    @RestrictTo({Scope.c})
    public void X(boolean z) {
        this.n = z;
    }

    public void Y(int v) {
        if(v < 0 && -2 != v && -1 != v) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.d = v;
    }

    public void Z(int v) {
        this.F.setInputMethodMode(v);
    }

    public void a(@Nullable Drawable drawable0) {
        this.F.setBackgroundDrawable(drawable0);
    }

    void a0(int v) {
        this.o = v;
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public boolean b() {
        return this.F.isShowing();
    }

    public void b0(Drawable drawable0) {
        this.t = drawable0;
    }

    public void c0(boolean z) {
        this.E = z;
        this.F.setFocusable(z);
    }

    @Nullable
    public Drawable d() {
        return this.F.getBackground();
    }

    public void d0(@Nullable PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.F.setOnDismissListener(popupWindow$OnDismissListener0);
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        this.F.dismiss();
        this.Q();
        this.F.setContentView(null);
        this.c = null;
        this.B.removeCallbacks(this.w);
    }

    public void e(int v) {
        this.g = v;
        this.i = true;
    }

    public void e0(@Nullable AdapterView.OnItemClickListener adapterView$OnItemClickListener0) {
        this.u = adapterView$OnItemClickListener0;
    }

    public void f0(@Nullable AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0) {
        this.v = adapterView$OnItemSelectedListener0;
    }

    @RestrictTo({Scope.c})
    public void g0(boolean z) {
        this.k = true;
        this.j = z;
    }

    public int h() {
        return this.i ? this.g : 0;
    }

    private void h0(boolean z) {
        if(Build.VERSION.SDK_INT <= 28) {
            Method method0 = ListPopupWindow.J;
            if(method0 != null) {
                try {
                    method0.invoke(this.F, Boolean.valueOf(z));
                }
                catch(Exception unused_ex) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        }
        else {
            Api29Impl.b(this.F, z);
        }
    }

    public void i0(int v) {
        this.q = v;
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    @Nullable
    public ListView j() {
        return this.c;
    }

    public void j0(@Nullable View view0) {
        boolean z = this.b();
        if(z) {
            this.Q();
        }
        this.p = view0;
        if(z) {
            this.show();
        }
    }

    public int k() {
        return this.f;
    }

    public void k0(int v) {
        DropDownListView dropDownListView0 = this.c;
        if(this.b() && dropDownListView0 != null) {
            dropDownListView0.setListSelectionHidden(false);
            dropDownListView0.setSelection(v);
            if(dropDownListView0.getChoiceMode() != 0) {
                dropDownListView0.setItemChecked(v, true);
            }
        }
    }

    public void l(int v) {
        this.f = v;
    }

    public void l0(int v) {
        this.F.setSoftInputMode(v);
    }

    public void m0(int v) {
        this.e = v;
    }

    public void n0(int v) {
        this.h = v;
    }

    public void p(@Nullable ListAdapter listAdapter0) {
        DataSetObserver dataSetObserver0 = this.r;
        if(dataSetObserver0 == null) {
            this.r = new PopupDataSetObserver(this);
        }
        else {
            ListAdapter listAdapter1 = this.b;
            if(listAdapter1 != null) {
                listAdapter1.unregisterDataSetObserver(dataSetObserver0);
            }
        }
        this.b = listAdapter0;
        if(listAdapter0 != null) {
            listAdapter0.registerDataSetObserver(this.r);
        }
        DropDownListView dropDownListView0 = this.c;
        if(dropDownListView0 != null) {
            dropDownListView0.setAdapter(this.b);
        }
    }

    private int q() {
        int v7;
        int v4;
        int v2;
        int v1;
        boolean z = true;
        if(this.c == null) {
            Context context0 = this.a;
            this.A = new Runnable() {
                final ListPopupWindow a;

                @Override
                public void run() {
                    View view0 = ListPopupWindow.this.u();
                    if(view0 != null && view0.getWindowToken() != null) {
                        ListPopupWindow.this.show();
                    }
                }
            };
            DropDownListView dropDownListView0 = this.t(context0, !this.E);
            this.c = dropDownListView0;
            Drawable drawable0 = this.t;
            if(drawable0 != null) {
                dropDownListView0.setSelector(drawable0);
            }
            this.c.setAdapter(this.b);
            this.c.setOnItemClickListener(this.u);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                final ListPopupWindow a;

                @Override  // android.widget.AdapterView$OnItemSelectedListener
                public void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
                    if(v != -1) {
                        DropDownListView dropDownListView0 = ListPopupWindow.this.c;
                        if(dropDownListView0 != null) {
                            dropDownListView0.setListSelectionHidden(false);
                        }
                    }
                }

                @Override  // android.widget.AdapterView$OnItemSelectedListener
                public void onNothingSelected(AdapterView adapterView0) {
                }
            });
            this.c.setOnScrollListener(this.y);
            AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0 = this.v;
            if(adapterView$OnItemSelectedListener0 != null) {
                this.c.setOnItemSelectedListener(adapterView$OnItemSelectedListener0);
            }
            DropDownListView dropDownListView1 = this.c;
            View view0 = this.p;
            if(view0 == null) {
                v2 = 0;
            }
            else {
                LinearLayout linearLayout0 = new LinearLayout(context0);
                linearLayout0.setOrientation(1);
                LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch(this.q) {
                    case 0: {
                        linearLayout0.addView(view0);
                        linearLayout0.addView(dropDownListView1, linearLayout$LayoutParams0);
                        break;
                    }
                    case 1: {
                        linearLayout0.addView(dropDownListView1, linearLayout$LayoutParams0);
                        linearLayout0.addView(view0);
                        break;
                    }
                    default: {
                        Log.e("ListPopupWindow", "Invalid hint position " + this.q);
                    }
                }
                int v = this.e;
                if(v >= 0) {
                    v1 = 0x80000000;
                }
                else {
                    v = 0;
                    v1 = 0;
                }
                view0.measure(View.MeasureSpec.makeMeasureSpec(v, v1), 0);
                LinearLayout.LayoutParams linearLayout$LayoutParams1 = (LinearLayout.LayoutParams)view0.getLayoutParams();
                v2 = view0.getMeasuredHeight() + linearLayout$LayoutParams1.topMargin + linearLayout$LayoutParams1.bottomMargin;
                dropDownListView1 = linearLayout0;
            }
            this.F.setContentView(dropDownListView1);
        }
        else {
            ViewGroup viewGroup0 = (ViewGroup)this.F.getContentView();
            View view1 = this.p;
            if(view1 == null) {
                v2 = 0;
            }
            else {
                LinearLayout.LayoutParams linearLayout$LayoutParams2 = (LinearLayout.LayoutParams)view1.getLayoutParams();
                v2 = view1.getMeasuredHeight() + linearLayout$LayoutParams2.topMargin + linearLayout$LayoutParams2.bottomMargin;
            }
        }
        Drawable drawable1 = this.F.getBackground();
        if(drawable1 == null) {
            this.C.setEmpty();
            v4 = 0;
        }
        else {
            drawable1.getPadding(this.C);
            int v3 = this.C.top;
            v4 = this.C.bottom + v3;
            if(!this.i) {
                this.g = -v3;
            }
        }
        if(this.F.getInputMethodMode() != 2) {
            z = false;
        }
        int v5 = this.z(this.u(), this.g, z);
        if(!this.m && this.d != -1) {
            int v6 = this.e;
            switch(v6) {
                case -2: {
                    v7 = View.MeasureSpec.makeMeasureSpec(this.a.getResources().getDisplayMetrics().widthPixels - (this.C.left + this.C.right), 0x80000000);
                    break;
                }
                case -1: {
                    v7 = View.MeasureSpec.makeMeasureSpec(this.a.getResources().getDisplayMetrics().widthPixels - (this.C.left + this.C.right), 0x40000000);
                    break;
                }
                default: {
                    v7 = View.MeasureSpec.makeMeasureSpec(v6, 0x40000000);
                }
            }
            int v8 = this.c.e(v7, 0, -1, v5 - v2, -1);
            if(v8 > 0) {
                v2 += v4 + (this.c.getPaddingTop() + this.c.getPaddingBottom());
            }
            return v8 + v2;
        }
        return v5 + v4;
    }

    // 检测为 Lambda 实现
    public void r() [...]

    public View.OnTouchListener s(View view0) {
        return new ForwardingListener(view0) {
            final ListPopupWindow j;

            @Override  // androidx.appcompat.widget.ForwardingListener
            public ShowableListMenu b() {
                return this.k();
            }

            public ListPopupWindow k() {
                return ListPopupWindow.this;
            }
        };
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        int v = this.q();
        boolean z = this.J();
        PopupWindowCompat.d(this.F, this.h);
        boolean z1 = true;
        if(this.F.isShowing()) {
            if(!this.u().isAttachedToWindow()) {
                return;
            }
            int v1 = this.e;
            if(v1 == -1) {
                v1 = -1;
            }
            else if(v1 == -2) {
                v1 = this.u().getWidth();
            }
            int v2 = this.d;
            if(v2 == -1) {
                if(!z) {
                    v = -1;
                }
                if(z) {
                    this.F.setWidth((this.e == -1 ? -1 : 0));
                    this.F.setHeight(0);
                }
                else {
                    this.F.setWidth((this.e == -1 ? -1 : 0));
                    this.F.setHeight(-1);
                }
            }
            else if(v2 != -2) {
                v = v2;
            }
            PopupWindow popupWindow0 = this.F;
            if(this.n || this.m) {
                z1 = false;
            }
            popupWindow0.setOutsideTouchable(z1);
            this.F.update(this.u(), this.f, this.g, (v1 >= 0 ? v1 : -1), (v >= 0 ? v : -1));
            return;
        }
        int v3 = this.e;
        if(v3 == -1) {
            v3 = -1;
        }
        else if(v3 == -2) {
            v3 = this.u().getWidth();
        }
        int v4 = this.d;
        if(v4 == -1) {
            v = -1;
        }
        else if(v4 != -2) {
            v = v4;
        }
        this.F.setWidth(v3);
        this.F.setHeight(v);
        this.h0(true);
        this.F.setOutsideTouchable(!this.n && !this.m);
        this.F.setTouchInterceptor(this.x);
        if(this.k) {
            PopupWindowCompat.c(this.F, this.j);
        }
        if(Build.VERSION.SDK_INT <= 28) {
            Method method0 = ListPopupWindow.L;
            if(method0 != null) {
                try {
                    method0.invoke(this.F, this.D);
                }
                catch(Exception exception0) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", exception0);
                }
            }
        }
        else {
            Api29Impl.a(this.F, this.D);
        }
        PopupWindowCompat.e(this.F, this.u(), this.f, this.g, this.l);
        this.c.setSelection(-1);
        if(!this.E || this.c.isInTouchMode()) {
            this.r();
        }
        if(!this.E) {
            this.B.post(this.z);
        }
    }

    @NonNull
    DropDownListView t(Context context0, boolean z) {
        return new DropDownListView(context0, z);
    }

    @Nullable
    public View u() {
        return this.s;
    }

    @StyleRes
    public int v() {
        return this.F.getAnimationStyle();
    }

    @Nullable
    public Rect w() {
        return this.D == null ? null : new Rect(this.D);
    }

    public int x() {
        return this.d;
    }

    public int y() {
        return this.F.getInputMethodMode();
    }

    private int z(View view0, int v, boolean z) {
        if(Build.VERSION.SDK_INT <= 23) {
            Method method0 = ListPopupWindow.K;
            if(method0 != null) {
                try {
                    return (int)(((Integer)method0.invoke(this.F, view0, v, Boolean.valueOf(z))));
                }
                catch(Exception unused_ex) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.F.getMaxAvailableHeight(view0, v);
        }
        return Api24Impl.a(this.F, view0, v, z);
    }
}

