package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R.attr;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class DropDownListView extends ListView {
    @RequiresApi(21)
    static class Api21Impl {
        @DoNotInline
        static void a(View view0, float f, float f1) {
            view0.drawableHotspotChanged(f, f1);
        }
    }

    @RequiresApi(30)
    static class Api30Impl {
        private static Method a;
        private static Method b;
        private static Method c;
        private static boolean d;

        static {
            try {
                Class class0 = Integer.TYPE;
                Method method0 = AbsListView.class.getDeclaredMethod("positionSelector", class0, View.class, Boolean.TYPE, Float.TYPE, Float.TYPE);
                Api30Impl.a = method0;
                method0.setAccessible(true);
                Method method1 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", class0);
                Api30Impl.b = method1;
                method1.setAccessible(true);
                Method method2 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", class0);
                Api30Impl.c = method2;
                method2.setAccessible(true);
                Api30Impl.d = true;
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                noSuchMethodException0.printStackTrace();
            }
        }

        static boolean a() [...] // 潜在的解密器

        @SuppressLint({"BanUncheckedReflection"})
        static void b(DropDownListView dropDownListView0, int v, View view0) {
            try {
                Api30Impl.a.invoke(dropDownListView0, v, view0, Boolean.FALSE, -1, -1);
                Api30Impl.b.invoke(dropDownListView0, v);
                Api30Impl.c.invoke(dropDownListView0, v);
            }
            catch(IllegalAccessException illegalAccessException0) {
                illegalAccessException0.printStackTrace();
            }
            catch(InvocationTargetException invocationTargetException0) {
                invocationTargetException0.printStackTrace();
            }
        }
    }

    @RequiresApi(33)
    static class Api33Impl {
        @DoNotInline
        static boolean a(AbsListView absListView0) {
            return absListView0.isSelectedChildViewEnabled();
        }

        @DoNotInline
        static void b(AbsListView absListView0, boolean z) {
            absListView0.setSelectedChildViewEnabled(z);
        }
    }

    static class GateKeeperDrawable extends DrawableWrapperCompat {
        private boolean b;

        GateKeeperDrawable(Drawable drawable0) {
            super(drawable0);
            this.b = true;
        }

        void c(boolean z) {
            this.b = z;
        }

        @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
        public void draw(@NonNull Canvas canvas0) {
            if(this.b) {
                super.draw(canvas0);
            }
        }

        @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
        public void setHotspot(float f, float f1) {
            if(this.b) {
                super.setHotspot(f, f1);
            }
        }

        @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
        public void setHotspotBounds(int v, int v1, int v2, int v3) {
            if(this.b) {
                super.setHotspotBounds(v, v1, v2, v3);
            }
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
        public boolean setState(int[] arr_v) {
            return this.b ? super.setState(arr_v) : false;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.appcompat.graphics.drawable.DrawableWrapperCompat
        public boolean setVisible(boolean z, boolean z1) {
            return this.b ? super.setVisible(z, z1) : false;
        }
    }

    static class PreApi33Impl {
        private static final Field a;

        static {
            Field field0 = null;
            try {
                field0 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field0.setAccessible(true);
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                noSuchFieldException0.printStackTrace();
            }
            PreApi33Impl.a = field0;
        }

        static boolean a(AbsListView absListView0) {
            Field field0 = PreApi33Impl.a;
            if(field0 != null) {
                try {
                    return field0.getBoolean(absListView0);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    illegalAccessException0.printStackTrace();
                }
            }
            return false;
        }

        static void b(AbsListView absListView0, boolean z) {
            Field field0 = PreApi33Impl.a;
            if(field0 != null) {
                try {
                    field0.set(absListView0, Boolean.valueOf(z));
                }
                catch(IllegalAccessException illegalAccessException0) {
                    illegalAccessException0.printStackTrace();
                }
            }
        }
    }

    class ResolveHoverRunnable implements Runnable {
        final DropDownListView a;

        public void a() {
            DropDownListView.this.m = null;
            DropDownListView.this.removeCallbacks(this);
        }

        public void b() {
            DropDownListView.this.post(this);
        }

        @Override
        public void run() {
            DropDownListView.this.m = null;
            DropDownListView.this.drawableStateChanged();
        }
    }

    private final Rect a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private GateKeeperDrawable g;
    private boolean h;
    private boolean i;
    private boolean j;
    private ViewPropertyAnimatorCompat k;
    private ListViewAutoScrollHelper l;
    ResolveHoverRunnable m;
    public static final int n = -1;
    public static final int o = -1;

    DropDownListView(@NonNull Context context0, boolean z) {
        super(context0, null, attr.dropDownListViewStyle);
        this.a = new Rect();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.i = z;
        this.setCacheColorHint(0);
    }

    private void a() {
        this.j = false;
        this.setPressed(false);
        this.drawableStateChanged();
        View view0 = this.getChildAt(this.f - this.getFirstVisiblePosition());
        if(view0 != null) {
            view0.setPressed(false);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = this.k;
        if(viewPropertyAnimatorCompat0 != null) {
            viewPropertyAnimatorCompat0.d();
            this.k = null;
        }
    }

    private void b(View view0, int v) {
        this.performItemClick(view0, v, this.getItemIdAtPosition(v));
    }

    private void c(Canvas canvas0) {
        if(!this.a.isEmpty()) {
            Drawable drawable0 = this.getSelector();
            if(drawable0 != null) {
                drawable0.setBounds(this.a);
                drawable0.draw(canvas0);
            }
        }
    }

    public int d(int v, boolean z) {
        ListAdapter listAdapter0 = this.getAdapter();
        if(listAdapter0 != null && !this.isInTouchMode()) {
            int v1 = listAdapter0.getCount();
            if(!this.getAdapter().areAllItemsEnabled()) {
                if(z) {
                    int v2;
                    for(v2 = Math.max(0, v); v2 < v1 && !listAdapter0.isEnabled(v2); ++v2) {
                    }
                    return v2 < 0 || v2 >= v1 ? -1 : v2;
                }
                for(v2 = Math.min(v, v1 - 1); v2 >= 0 && !listAdapter0.isEnabled(v2); --v2) {
                }
                return v2 < 0 || v2 >= v1 ? -1 : v2;
            }
            return v < 0 || v >= v1 ? -1 : v;
        }
        return -1;
    }

    @Override  // android.widget.ListView
    protected void dispatchDraw(Canvas canvas0) {
        this.c(canvas0);
        super.dispatchDraw(canvas0);
    }

    @Override  // android.widget.AbsListView
    protected void drawableStateChanged() {
        if(this.m != null) {
            return;
        }
        super.drawableStateChanged();
        this.k(true);
        this.o();
    }

    public int e(int v, int v1, int v2, int v3, int v4) {
        int v5 = this.getListPaddingTop();
        int v6 = this.getListPaddingBottom();
        int v7 = this.getDividerHeight();
        Drawable drawable0 = this.getDivider();
        ListAdapter listAdapter0 = this.getAdapter();
        if(listAdapter0 == null) {
            return v5 + v6;
        }
        int v8 = v5 + v6;
        if(v7 <= 0 || drawable0 == null) {
            v7 = 0;
        }
        int v9 = listAdapter0.getCount();
        View view0 = null;
        int v11 = 0;
        int v12 = 0;
        for(int v10 = 0; v10 < v9; ++v10) {
            int v13 = listAdapter0.getItemViewType(v10);
            if(v13 != v11) {
                view0 = null;
                v11 = v13;
            }
            view0 = listAdapter0.getView(v10, view0, this);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                viewGroup$LayoutParams0 = this.generateDefaultLayoutParams();
                view0.setLayoutParams(viewGroup$LayoutParams0);
            }
            view0.measure(v, (viewGroup$LayoutParams0.height <= 0 ? 0 : View.MeasureSpec.makeMeasureSpec(viewGroup$LayoutParams0.height, 0x40000000)));
            view0.forceLayout();
            if(v10 > 0) {
                v8 += v7;
            }
            v8 += view0.getMeasuredHeight();
            if(v8 >= v3) {
                return v4 < 0 || v10 <= v4 || v12 <= 0 || v8 == v3 ? v3 : v12;
            }
            if(v4 >= 0 && v10 >= v4) {
                v12 = v8;
            }
        }
        return v8;
    }

    public boolean f(MotionEvent motionEvent0, int v) {
        boolean z1;
        boolean z;
        int v1 = motionEvent0.getActionMasked();
        switch(v1) {
            case 1: {
                z1 = false;
                goto label_8;
            }
            case 2: {
                z1 = true;
            label_8:
                int v2 = motionEvent0.findPointerIndex(v);
                if(v2 >= 0) {
                    int v3 = (int)motionEvent0.getX(v2);
                    int v4 = (int)motionEvent0.getY(v2);
                    int v5 = this.pointToPosition(v3, v4);
                    if(v5 == -1) {
                        z = true;
                    }
                    else {
                        View view0 = this.getChildAt(v5 - this.getFirstVisiblePosition());
                        this.j(view0, v5, ((float)v3), ((float)v4));
                        if(v1 == 1) {
                            this.b(view0, v5);
                        }
                        z = false;
                        z1 = true;
                    }
                }
                else {
                    z = false;
                    z1 = false;
                }
                break;
            }
            case 3: {
                z = false;
                z1 = false;
                break;
            }
            default: {
                z = false;
                z1 = true;
            }
        }
        if(!z1 || z) {
            this.a();
        }
        if(z1) {
            if(this.l == null) {
                this.l = new ListViewAutoScrollHelper(this);
            }
            this.l.o(true);
            this.l.onTouch(this, motionEvent0);
            return true;
        }
        ListViewAutoScrollHelper listViewAutoScrollHelper0 = this.l;
        if(listViewAutoScrollHelper0 != null) {
            listViewAutoScrollHelper0.o(false);
        }
        return false;
    }

    private void g(int v, View view0) {
        int v1 = view0.getLeft();
        int v2 = view0.getTop();
        int v3 = view0.getRight();
        int v4 = view0.getBottom();
        this.a.set(v1, v2, v3, v4);
        this.a.left -= this.b;
        this.a.top -= this.c;
        this.a.right += this.d;
        this.a.bottom += this.e;
        boolean z = this.l();
        if(view0.isEnabled() != z) {
            this.m(!z);
            if(v != -1) {
                this.refreshDrawableState();
            }
        }
    }

    private void h(int v, View view0) {
        Drawable drawable0 = this.getSelector();
        boolean z = true;
        boolean z1 = drawable0 != null && v != -1;
        if(z1) {
            drawable0.setVisible(false, false);
        }
        this.g(v, view0);
        if(z1) {
            float f = this.a.exactCenterX();
            float f1 = this.a.exactCenterY();
            if(this.getVisibility() != 0) {
                z = false;
            }
            drawable0.setVisible(z, false);
            DrawableCompat.k(drawable0, f, f1);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public boolean hasFocus() {
        return this.i || super.hasFocus();
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.View
    public boolean hasWindowFocus() {
        return this.i || super.hasWindowFocus();
    }

    private void i(int v, View view0, float f, float f1) {
        this.h(v, view0);
        Drawable drawable0 = this.getSelector();
        if(drawable0 != null && v != -1) {
            DrawableCompat.k(drawable0, f, f1);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.View
    public boolean isFocused() {
        return this.i || super.isFocused();
    }

    // 去混淆评级： 低(30)
    @Override  // android.view.View
    public boolean isInTouchMode() {
        return this.i && this.h || super.isInTouchMode();
    }

    private void j(View view0, int v, float f, float f1) {
        this.j = true;
        Api21Impl.a(this, f, f1);
        if(!this.isPressed()) {
            this.setPressed(true);
        }
        this.layoutChildren();
        int v1 = this.f;
        if(v1 != -1) {
            View view1 = this.getChildAt(v1 - this.getFirstVisiblePosition());
            if(view1 != null && view1 != view0 && view1.isPressed()) {
                view1.setPressed(false);
            }
        }
        this.f = v;
        Api21Impl.a(view0, f - ((float)view0.getLeft()), f1 - ((float)view0.getTop()));
        if(!view0.isPressed()) {
            view0.setPressed(true);
        }
        this.i(v, view0, f, f1);
        this.k(false);
        this.refreshDrawableState();
    }

    private void k(boolean z) {
        GateKeeperDrawable dropDownListView$GateKeeperDrawable0 = this.g;
        if(dropDownListView$GateKeeperDrawable0 != null) {
            dropDownListView$GateKeeperDrawable0.c(z);
        }
    }

    private boolean l() {
        return Build.VERSION.SDK_INT < 33 ? PreApi33Impl.a(this) : Api33Impl.a(this);
    }

    private void m(boolean z) {
        if(Build.VERSION.SDK_INT >= 33) {
            Api33Impl.b(this, z);
            return;
        }
        PreApi33Impl.b(this, z);
    }

    private boolean n() {
        return this.j;
    }

    private void o() {
        Drawable drawable0 = this.getSelector();
        if(drawable0 != null && this.n() && this.isPressed()) {
            drawable0.setState(this.getDrawableState());
        }
    }

    @Override  // android.widget.ListView
    protected void onDetachedFromWindow() {
        this.m = null;
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent0) {
        if(Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent0);
        }
        int v = motionEvent0.getActionMasked();
        if(v == 10 && this.m == null) {
            ResolveHoverRunnable dropDownListView$ResolveHoverRunnable0 = new ResolveHoverRunnable(this);
            this.m = dropDownListView$ResolveHoverRunnable0;
            dropDownListView$ResolveHoverRunnable0.b();
        }
        boolean z = super.onHoverEvent(motionEvent0);
        if(v != 7 && v != 9) {
            this.setSelection(-1);
            return z;
        }
        int v1 = this.pointToPosition(((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
        if(v1 != -1 && v1 != this.getSelectedItemPosition()) {
            View view0 = this.getChildAt(v1 - this.getFirstVisiblePosition());
            if(view0.isEnabled()) {
                this.requestFocus();
                this.setSelectionFromTop(v1, view0.getTop() - this.getTop());
            }
            this.o();
        }
        return z;
    }

    @Override  // android.widget.AbsListView
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 0) {
            this.f = this.pointToPosition(((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
        }
        ResolveHoverRunnable dropDownListView$ResolveHoverRunnable0 = this.m;
        if(dropDownListView$ResolveHoverRunnable0 != null) {
            dropDownListView$ResolveHoverRunnable0.a();
        }
        return super.onTouchEvent(motionEvent0);
    }

    void setListSelectionHidden(boolean z) {
        this.h = z;
    }

    @Override  // android.widget.AbsListView
    public void setSelector(Drawable drawable0) {
        GateKeeperDrawable dropDownListView$GateKeeperDrawable0 = drawable0 == null ? null : new GateKeeperDrawable(drawable0);
        this.g = dropDownListView$GateKeeperDrawable0;
        super.setSelector(dropDownListView$GateKeeperDrawable0);
        Rect rect0 = new Rect();
        if(drawable0 != null) {
            drawable0.getPadding(rect0);
        }
        this.b = rect0.left;
        this.c = rect0.top;
        this.d = rect0.right;
        this.e = rect0.bottom;
    }
}

