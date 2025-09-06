package com.leinardi.android.speeddial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.IdRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.PopupMenu;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton.b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class SpeedDialView extends LinearLayout implements AttachedBehavior {
    static class InstanceState implements Parcelable {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            public InstanceState a(Parcel parcel0) {
                return new InstanceState(parcel0);
            }

            public InstanceState[] b(int v) {
                return new InstanceState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        private boolean a;
        @ColorInt
        private int b;
        @ColorInt
        private int c;
        @ColorInt
        private int d;
        @ColorInt
        private int e;
        private int f;
        private float g;
        private boolean h;
        private ArrayList i;

        static {
            InstanceState.CREATOR = new a();
        }

        public InstanceState() {
            this.a = false;
            this.b = 0x80000000;
            this.c = 0x80000000;
            this.d = 0x80000000;
            this.e = 0x80000000;
            this.f = 0;
            this.g = 45.0f;
            this.h = false;
            this.i = new ArrayList();
        }

        protected InstanceState(Parcel parcel0) {
            boolean z = false;
            this.a = false;
            this.b = 0x80000000;
            this.c = 0x80000000;
            this.d = 0x80000000;
            this.e = 0x80000000;
            this.f = 0;
            this.g = 45.0f;
            this.h = false;
            this.i = new ArrayList();
            this.a = parcel0.readByte() != 0;
            this.b = parcel0.readInt();
            this.c = parcel0.readInt();
            this.d = parcel0.readInt();
            this.e = parcel0.readInt();
            this.f = parcel0.readInt();
            this.g = parcel0.readFloat();
            if(parcel0.readByte() != 0) {
                z = true;
            }
            this.h = z;
            this.i = parcel0.createTypedArrayList(SpeedDialActionItem.CREATOR);
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeByte(((byte)this.a));
            parcel0.writeInt(this.b);
            parcel0.writeInt(this.c);
            parcel0.writeInt(this.d);
            parcel0.writeInt(this.e);
            parcel0.writeInt(this.f);
            parcel0.writeFloat(this.g);
            parcel0.writeByte(((byte)this.h));
            parcel0.writeTypedList(this.i);
        }
    }

    public static class NoBehavior extends Behavior {
        public NoBehavior() {
        }

        public NoBehavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
        }
    }

    public static class ScrollingViewSnackbarBehavior extends SnackbarBehavior {
        private boolean e;

        public ScrollingViewSnackbarBehavior() {
            this.e = false;
        }

        public ScrollingViewSnackbarBehavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            this.e = false;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public void A(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, int v2, int v3, int v4) {
            super.A(coordinatorLayout0, view0, view1, v, v1, v2, v3, v4);
            this.e = false;
            if(v1 > 0 && view0.getVisibility() == 0) {
                this.O(view0);
                return;
            }
            if(v1 < 0) {
                this.U(view0);
            }
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean I(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v, int v1) {
            return true;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean m(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
            if(!this.e && view1 instanceof RecyclerView && (((RecyclerView)view1).getAdapter() == null || ((RecyclerView)view1).getAdapter().getItemCount() == 0)) {
                this.U(view0);
                this.e = true;
            }
            return view1 instanceof RecyclerView || super.m(coordinatorLayout0, view0, view1);
        }
    }

    public static class SnackbarBehavior extends Behavior {
        @Nullable
        private Rect a;
        @Nullable
        private b b;
        private boolean c;
        private static final boolean d = true;

        public SnackbarBehavior() {
            this.c = true;
        }

        public SnackbarBehavior(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.FloatingActionButton_Behavior_Layout);
            this.c = typedArray0.getBoolean(styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArray0.recycle();
        }

        private int N(AppBarLayout appBarLayout0) {
            int v = ViewCompat.j0(appBarLayout0);
            if(v != 0) {
                return v * 2;
            }
            int v1 = appBarLayout0.getChildCount();
            return v1 < 1 ? 0 : ViewCompat.j0(appBarLayout0.getChildAt(v1 - 1)) * 2;
        }

        protected void O(View view0) {
            if(view0 instanceof FloatingActionButton) {
                ((FloatingActionButton)view0).p(this.b);
                return;
            }
            if(view0 instanceof SpeedDialView) {
                ((SpeedDialView)view0).o(this.b);
                return;
            }
            view0.setVisibility(4);
        }

        public boolean P() {
            return this.c;
        }

        private static boolean Q(@NonNull View view0) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
            return viewGroup$LayoutParams0 instanceof LayoutParams ? ((LayoutParams)viewGroup$LayoutParams0).f() instanceof BottomSheetBehavior : false;
        }

        public void R(boolean z) {
            this.c = z;
        }

        @VisibleForTesting
        void S(@Nullable b floatingActionButton$b0) {
            this.b = floatingActionButton$b0;
        }

        private boolean T(View view0, View view1) {
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
            if(!this.c) {
                return false;
            }
            return coordinatorLayout$LayoutParams0.e() == view0.getId() ? view1.getVisibility() == 0 : false;
        }

        protected void U(View view0) {
            if(view0 instanceof FloatingActionButton) {
                ((FloatingActionButton)view0).A(this.b);
                return;
            }
            if(view0 instanceof SpeedDialView) {
                ((SpeedDialView)view0).E(this.b);
                return;
            }
            view0.setVisibility(0);
        }

        private boolean V(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, View view0) {
            if(!this.T(appBarLayout0, view0)) {
                return false;
            }
            if(this.a == null) {
                this.a = new Rect();
            }
            Rect rect0 = this.a;
            c.a(coordinatorLayout0, appBarLayout0, rect0);
            if(rect0.bottom <= this.N(appBarLayout0)) {
                view0.setVisibility(8);
                return true;
            }
            view0.setVisibility(0);
            return true;
        }

        private boolean W(View view0, View view1) {
            if(!this.T(view0, view1)) {
                return false;
            }
            LayoutParams coordinatorLayout$LayoutParams0 = (LayoutParams)view1.getLayoutParams();
            if(view0.getTop() < view1.getHeight() / 2 + coordinatorLayout$LayoutParams0.topMargin) {
                this.O(view1);
                return true;
            }
            this.U(view1);
            return true;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public void o(@NonNull LayoutParams coordinatorLayout$LayoutParams0) {
            if(coordinatorLayout$LayoutParams0.h == 0) {
                coordinatorLayout$LayoutParams0.h = 80;
            }
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean p(CoordinatorLayout coordinatorLayout0, View view0, View view1) {
            if(view1 instanceof AppBarLayout) {
                this.V(coordinatorLayout0, ((AppBarLayout)view1), view0);
                return false;
            }
            if(SnackbarBehavior.Q(view1)) {
                this.W(view1, view0);
            }
            return false;
        }

        @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
        public boolean t(CoordinatorLayout coordinatorLayout0, View view0, int v) {
            List list0 = coordinatorLayout0.w(view0);
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                View view1 = (View)list0.get(v2);
                if(!(view1 instanceof AppBarLayout)) {
                    if(!SnackbarBehavior.Q(view1) || !this.W(view1, view0)) {
                        continue;
                    }
                    break;
                }
                else if(this.V(coordinatorLayout0, ((AppBarLayout)view1), view0)) {
                    break;
                }
            }
            coordinatorLayout0.N(view0, v);
            return true;
        }
    }

    class com.leinardi.android.speeddial.SpeedDialView.a implements h {
        final SpeedDialView a;

        @Override  // com.leinardi.android.speeddial.SpeedDialView$h
        public boolean a(SpeedDialActionItem speedDialActionItem0) {
            if(SpeedDialView.this.j != null) {
                boolean z = SpeedDialView.this.j.a(speedDialActionItem0);
                if(!z) {
                    SpeedDialView.this.j(false);
                }
                return z;
            }
            return false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
        public static final int k2 = 0;
        public static final int l2 = 1;
        public static final int m2 = 2;
        public static final int n2 = 3;

    }

    public interface h {
        boolean a(SpeedDialActionItem arg1);
    }

    public interface i {
        void a(boolean arg1);

        boolean b();
    }

    private final InstanceState a;
    private List b;
    @Nullable
    private Drawable c;
    @Nullable
    private Drawable d;
    @Nullable
    private Drawable e;
    private FloatingActionButton f;
    @IdRes
    private int g;
    @Nullable
    private SpeedDialOverlayLayout h;
    @Nullable
    private i i;
    @Nullable
    private h j;
    private h k;
    private static final String l = "SpeedDialView";
    private static final String m = "superState";
    private static final String n = "isOpen";
    private static final String o = "expansionMode";
    private static final int p = 45;
    private static final int q = 25;
    private static final int r = 4;
    private static final int s = -2;

    static {
    }

    public SpeedDialView(Context context0) {
        super(context0);
        this.a = new InstanceState();
        this.b = new ArrayList();
        this.c = null;
        this.d = null;
        this.k = new com.leinardi.android.speeddial.SpeedDialView.a(this);
        this.r(context0, null);
    }

    public SpeedDialView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new InstanceState();
        this.b = new ArrayList();
        this.c = null;
        this.d = null;
        this.k = new com.leinardi.android.speeddial.SpeedDialView.a(this);
        this.r(context0, attributeSet0);
    }

    public SpeedDialView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = new InstanceState();
        this.b = new ArrayList();
        this.c = null;
        this.d = null;
        this.k = new com.leinardi.android.speeddial.SpeedDialView.a(this);
        this.r(context0, attributeSet0);
    }

    @Nullable
    public FabWithLabelView A(SpeedDialActionItem speedDialActionItem0, int v) {
        return this.B(((FabWithLabelView)this.b.get(v)).getSpeedDialActionItem(), speedDialActionItem0);
    }

    @Nullable
    public FabWithLabelView B(@Nullable SpeedDialActionItem speedDialActionItem0, SpeedDialActionItem speedDialActionItem1) {
        if(speedDialActionItem0 == null) {
            return null;
        }
        FabWithLabelView fabWithLabelView0 = this.l(speedDialActionItem0.D());
        if(fabWithLabelView0 != null) {
            int v = this.b.indexOf(fabWithLabelView0);
            if(v < 0) {
                return null;
            }
            this.x(this.l(speedDialActionItem1.D()), null, false);
            this.x(this.l(speedDialActionItem0.D()), null, false);
            return this.f(speedDialActionItem1, v, false);
        }
        return null;
    }

    private void C(int v, boolean z) {
        if(this.a.f != v || z) {
            this.a.f = v;
            if(v == 0 || v == 1) {
                this.setOrientation(1);
                for(Object object1: this.b) {
                    ((FabWithLabelView)object1).setOrientation(0);
                }
            }
            else if(v == 2 || v == 3) {
                this.setOrientation(0);
                for(Object object0: this.b) {
                    ((FabWithLabelView)object0).setOrientation(1);
                }
            }
            this.j(false);
            ArrayList arrayList0 = this.getActionItems();
            this.h();
            this.g(arrayList0);
        }
    }

    public void D() {
        this.E(null);
    }

    public void E(@Nullable b floatingActionButton$b0) {
        this.setVisibility(0);
        this.F(this.f, floatingActionButton$b0);
    }

    private void F(FloatingActionButton floatingActionButton0, @Nullable b floatingActionButton$b0) {
        class com.leinardi.android.speeddial.SpeedDialView.b extends b {
            final b a;
            final SpeedDialView b;

            com.leinardi.android.speeddial.SpeedDialView.b(b floatingActionButton$b0) {
                this.a = floatingActionButton$b0;
                super();
            }

            @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$b
            public void a(FloatingActionButton floatingActionButton0) {
                b floatingActionButton$b0 = this.a;
                if(floatingActionButton$b0 != null) {
                    floatingActionButton$b0.a(floatingActionButton0);
                }
            }

            @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$b
            public void b(FloatingActionButton floatingActionButton0) {
                try {
                    Field field0 = floatingActionButton0.getClass().getDeclaredField("impl");
                    field0.setAccessible(true);
                    Object object0 = field0.get(floatingActionButton0);
                    Method method0 = object0.getClass().getSuperclass().getDeclaredMethod("setImageMatrixScale", Float.TYPE);
                    method0.setAccessible(true);
                    method0.invoke(object0, 1.0f);
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    Log.e("SpeedDialView", "Method setImageMatrixScale not found", noSuchMethodException0);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    Log.e("SpeedDialView", "IllegalAccessException", illegalAccessException0);
                }
                catch(InvocationTargetException invocationTargetException0) {
                    Log.e("SpeedDialView", "InvocationTargetException", invocationTargetException0);
                }
                catch(NoSuchFieldException noSuchFieldException0) {
                    Log.e("SpeedDialView", "Field impl not found", noSuchFieldException0);
                }
                b floatingActionButton$b0 = this.a;
                if(floatingActionButton$b0 != null) {
                    floatingActionButton$b0.b(floatingActionButton0);
                }
            }
        }

        floatingActionButton0.A(new com.leinardi.android.speeddial.SpeedDialView.b(this, floatingActionButton$b0));
    }

    private void G(boolean z, boolean z1) {
        SpeedDialOverlayLayout speedDialOverlayLayout0 = this.h;
        if(speedDialOverlayLayout0 != null) {
            if(z) {
                speedDialOverlayLayout0.f(z1);
                return;
            }
            speedDialOverlayLayout0.c(z1);
        }
    }

    private void H(FabWithLabelView fabWithLabelView0, int v) {
        ViewCompat.h(fabWithLabelView0).d();
        com.leinardi.android.speeddial.b.c(fabWithLabelView0.getFab(), ((long)v));
        if(fabWithLabelView0.c()) {
            CardView cardView0 = fabWithLabelView0.getLabelBackground();
            ViewCompat.h(cardView0).d();
            Animation animation0 = AnimationUtils.loadAnimation(this.getContext(), anim.sd_fade_and_translate_in);
            animation0.setStartOffset(((long)v));
            cardView0.startAnimation(animation0);
        }
    }

    public void I() {
        this.K(!this.s(), true);
    }

    public void J(boolean z) {
        this.K(!this.s(), z);
    }

    private void K(boolean z, boolean z1) {
        if(z && this.b.isEmpty()) {
            i speedDialView$i0 = this.i;
            if(speedDialView$i0 != null) {
                speedDialView$i0.b();
            }
            z = false;
        }
        if(this.s() == z) {
            return;
        }
        this.a.a = z;
        this.P(z, z1, this.a.h);
        this.N(z1);
        this.M();
        this.O();
        this.G(z, z1);
        i speedDialView$i1 = this.i;
        if(speedDialView$i1 != null) {
            speedDialView$i1.a(z);
        }
    }

    private void L() {
        if(this.s()) {
            this.setElevation(this.getResources().getDimension(dimen.sd_open_elevation));
            return;
        }
        this.setElevation(this.getResources().getDimension(dimen.sd_close_elevation));
    }

    private void M() {
        int v = this.s() ? this.getMainFabOpenedBackgroundColor() : this.getMainFabClosedBackgroundColor();
        if(v != 0x80000000) {
            this.f.setBackgroundTintList(ColorStateList.valueOf(v));
            return;
        }
        this.f.setBackgroundTintList(ColorStateList.valueOf(com.leinardi.android.speeddial.b.f(this.getContext())));
    }

    private void N(boolean z) {
        if(this.s()) {
            Drawable drawable0 = this.d;
            if(drawable0 != null) {
                int v = Build.VERSION.SDK_INT;
                if(v >= 24 && drawable0 instanceof AnimatedVectorDrawable) {
                    this.f.setImageDrawable(drawable0);
                    ((AnimatedVectorDrawable)this.d).start();
                }
                else if(v < 24 && drawable0 instanceof AnimatedVectorDrawableCompat) {
                    this.f.setImageDrawable(drawable0);
                    ((AnimatedVectorDrawableCompat)this.d).start();
                }
                else if(drawable0 instanceof AnimationDrawable) {
                    this.f.setImageDrawable(drawable0);
                    ((AnimationDrawable)this.d).start();
                }
                else {
                    Bitmap bitmap0 = com.leinardi.android.speeddial.b.g(drawable0);
                    this.f.setImageBitmap(bitmap0);
                }
            }
            com.leinardi.android.speeddial.b.o(this.f, this.getMainFabAnimationRotateAngle(), z);
            return;
        }
        com.leinardi.android.speeddial.b.n(this.f, z);
        this.f.setImageDrawable(this.c);
        Drawable drawable1 = this.c;
        if(drawable1 != null) {
            int v1 = Build.VERSION.SDK_INT;
            if(v1 >= 24 && drawable1 instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable)drawable1).start();
                return;
            }
            if(v1 < 24 && drawable1 instanceof AnimatedVectorDrawableCompat) {
                ((AnimatedVectorDrawableCompat)drawable1).start();
                return;
            }
            if(drawable1 instanceof AnimationDrawable) {
                ((AnimationDrawable)drawable1).start();
            }
        }
    }

    private void O() {
        int v = this.s() ? this.getMainFabOpenedIconColor() : this.getMainFabClosedIconColor();
        if(v != 0x80000000) {
            ImageViewCompat.c(this.f, ColorStateList.valueOf(v));
        }
    }

    private void P(boolean z, boolean z1, boolean z2) {
        int v = this.b.size();
        if(z) {
            for(int v1 = 0; v1 < v; ++v1) {
                FabWithLabelView fabWithLabelView0 = (FabWithLabelView)this.b.get(v1);
                fabWithLabelView0.setAlpha(1.0f);
                fabWithLabelView0.setVisibility(0);
                if(z1) {
                    this.H(fabWithLabelView0, v1 * 25);
                }
                if(v1 == 0) {
                    fabWithLabelView0.getFab().requestFocusFromTouch();
                }
                if(v1 == v - 1) {
                    fabWithLabelView0.getFab().setNextFocusUpId(fabWithLabelView0.getFab().getId());
                    this.getMainFab().setNextFocusDownId(this.getMainFab().getId());
                    this.getMainFab().setNextFocusForwardId(this.getMainFab().getId());
                }
            }
            return;
        }
        for(int v2 = 0; v2 < v; ++v2) {
            FabWithLabelView fabWithLabelView1 = (FabWithLabelView)this.b.get((z2 ? v - 1 - v2 : v2));
            if(!z1) {
                fabWithLabelView1.setAlpha(0.0f);
                fabWithLabelView1.setVisibility(8);
            }
            else if(z2) {
                this.p(fabWithLabelView1, v2 * 25);
            }
            else {
                com.leinardi.android.speeddial.b.q(fabWithLabelView1, false);
            }
        }
    }

    // 去混淆评级： 低(20)
    static String c() [...] // 潜在的解密器

    @Nullable
    public FabWithLabelView d(SpeedDialActionItem speedDialActionItem0) {
        return this.e(speedDialActionItem0, this.b.size());
    }

    @Nullable
    public FabWithLabelView e(SpeedDialActionItem speedDialActionItem0, int v) {
        return this.f(speedDialActionItem0, v, true);
    }

    @Nullable
    public FabWithLabelView f(SpeedDialActionItem speedDialActionItem0, int v, boolean z) {
        FabWithLabelView fabWithLabelView0 = this.l(speedDialActionItem0.D());
        if(fabWithLabelView0 != null) {
            return this.B(fabWithLabelView0.getSpeedDialActionItem(), speedDialActionItem0);
        }
        FabWithLabelView fabWithLabelView1 = speedDialActionItem0.v(this.getContext());
        fabWithLabelView1.setOrientation((this.getOrientation() == 1 ? 0 : 1));
        fabWithLabelView1.setOnActionSelectedListener(this.k);
        this.addView(fabWithLabelView1, this.m(v));
        this.b.add(v, fabWithLabelView1);
        if(!this.s()) {
            fabWithLabelView1.setVisibility(8);
        }
        else if(z) {
            this.H(fabWithLabelView1, 0);
            return fabWithLabelView1;
        }
        return fabWithLabelView1;
    }

    public Collection g(Collection collection0) {
        Collection collection1 = new ArrayList();
        for(Object object0: collection0) {
            ((ArrayList)collection1).add(this.d(((SpeedDialActionItem)object0)));
        }
        return collection1;
    }

    @NonNull
    public ArrayList getActionItems() {
        ArrayList arrayList0 = new ArrayList(this.b.size());
        for(Object object0: this.b) {
            arrayList0.add(((FabWithLabelView)object0).getSpeedDialActionItem());
        }
        return arrayList0;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        return new SnackbarBehavior();
    }

    public int getExpansionMode() {
        return this.a.f;
    }

    public FloatingActionButton getMainFab() {
        return this.f;
    }

    public float getMainFabAnimationRotateAngle() {
        return this.a.g;
    }

    @ColorInt
    public int getMainFabClosedBackgroundColor() {
        return this.a.b;
    }

    @ColorInt
    public int getMainFabClosedIconColor() {
        return this.a.d;
    }

    @ColorInt
    public int getMainFabOpenedBackgroundColor() {
        return this.a.c;
    }

    @ColorInt
    public int getMainFabOpenedIconColor() {
        return this.a.e;
    }

    @Nullable
    public SpeedDialOverlayLayout getOverlayLayout() {
        return this.h;
    }

    public boolean getUseReverseAnimationOnClose() {
        return this.a.h;
    }

    public void h() {
        Iterator iterator0 = this.b.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            this.x(((FabWithLabelView)object0), iterator0, true);
        }
    }

    // 检测为 Lambda 实现
    public void i() [...]

    public void j(boolean z) {
        this.K(false, z);
    }

    private FloatingActionButton k() {
        class e implements View.OnClickListener {
            final SpeedDialView a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                if(!SpeedDialView.this.s()) {
                    SpeedDialView.this.t();
                }
                else if(SpeedDialView.this.i == null || !SpeedDialView.this.i.b()) {
                    SpeedDialView.this.i();
                }
            }
        }

        FloatingActionButton floatingActionButton0 = new FloatingActionButton(this.getContext());
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams0.gravity = 0x800005;
        int v = com.leinardi.android.speeddial.b.b(this.getContext(), 4.0f);
        int v1 = com.leinardi.android.speeddial.b.b(this.getContext(), -2.0f);
        linearLayout$LayoutParams0.setMargins(v, v1, v, v1);
        floatingActionButton0.setId(id.sd_main_fab);
        floatingActionButton0.setUseCompatPadding(true);
        floatingActionButton0.setLayoutParams(linearLayout$LayoutParams0);
        floatingActionButton0.setClickable(true);
        floatingActionButton0.setFocusable(true);
        floatingActionButton0.setSize(0);
        floatingActionButton0.setContentDescription(this.getContentDescription());
        floatingActionButton0.setOnClickListener(new e(this));
        return floatingActionButton0;
    }

    @Nullable
    private FabWithLabelView l(@IdRes int v) {
        for(Object object0: this.b) {
            FabWithLabelView fabWithLabelView0 = (FabWithLabelView)object0;
            if(fabWithLabelView0.getId() == v) {
                return fabWithLabelView0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    private int m(int v) {
        return this.getExpansionMode() == 0 || this.getExpansionMode() == 2 ? this.b.size() - v : v + 1;
    }

    public void n() {
        this.o(null);
    }

    public void o(@Nullable b floatingActionButton$b0) {
        class com.leinardi.android.speeddial.SpeedDialView.c extends b {
            final b a;
            final SpeedDialView b;

            com.leinardi.android.speeddial.SpeedDialView.c(b floatingActionButton$b0) {
                this.a = floatingActionButton$b0;
                super();
            }

            @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$b
            public void a(FloatingActionButton floatingActionButton0) {
                super.a(floatingActionButton0);
                SpeedDialView.this.setVisibility(4);
                b floatingActionButton$b0 = this.a;
                if(floatingActionButton$b0 != null) {
                    floatingActionButton$b0.a(floatingActionButton0);
                }
            }

            @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$b
            public void b(FloatingActionButton floatingActionButton0) {
                super.b(floatingActionButton0);
                b floatingActionButton$b0 = this.a;
                if(floatingActionButton$b0 != null) {
                    floatingActionButton$b0.b(floatingActionButton0);
                }
            }
        }

        if(this.s()) {
            this.i();
            ViewCompat.h(this.f).i(0.0f).s(0L).y();
        }
        this.f.p(new com.leinardi.android.speeddial.SpeedDialView.c(this, floatingActionButton$b0));
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.h == null) {
            this.setOverlayLayout(((SpeedDialOverlayLayout)this.getRootView().findViewById(this.g)));
        }
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(parcelable0 instanceof Bundle) {
            InstanceState speedDialView$InstanceState0 = (InstanceState)((Bundle)parcelable0).getParcelable("com.leinardi.android.speeddial.SpeedDialView$InstanceState");
            if(speedDialView$InstanceState0 != null && speedDialView$InstanceState0.i != null && !speedDialView$InstanceState0.i.isEmpty()) {
                this.setUseReverseAnimationOnClose(speedDialView$InstanceState0.h);
                this.setMainFabAnimationRotateAngle(speedDialView$InstanceState0.g);
                this.setMainFabOpenedBackgroundColor(speedDialView$InstanceState0.c);
                this.setMainFabClosedBackgroundColor(speedDialView$InstanceState0.b);
                this.setMainFabOpenedIconColor(speedDialView$InstanceState0.e);
                this.setMainFabClosedIconColor(speedDialView$InstanceState0.d);
                this.C(speedDialView$InstanceState0.f, true);
                this.g(speedDialView$InstanceState0.i);
                this.K(speedDialView$InstanceState0.a, false);
            }
            parcelable0 = ((Bundle)parcelable0).getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    @Nullable
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ArrayList arrayList0 = this.getActionItems();
        this.a.i = arrayList0;
        ((Bundle)parcelable0).putParcelable("com.leinardi.android.speeddial.SpeedDialView$InstanceState", this.a);
        ((Bundle)parcelable0).putParcelable("superState", super.onSaveInstanceState());
        return parcelable0;
    }

    private void p(FabWithLabelView fabWithLabelView0, int v) {
        class f implements Animation.AnimationListener {
            final CardView a;
            final SpeedDialView b;

            f(CardView cardView0) {
                this.a = cardView0;
                super();
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationEnd(Animation animation0) {
                this.a.setVisibility(8);
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override  // android.view.animation.Animation$AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        ViewCompat.h(fabWithLabelView0).d();
        com.leinardi.android.speeddial.b.p(fabWithLabelView0.getFab(), ((long)v));
        if(fabWithLabelView0.c()) {
            CardView cardView0 = fabWithLabelView0.getLabelBackground();
            ViewCompat.h(cardView0).d();
            Animation animation0 = AnimationUtils.loadAnimation(this.getContext(), anim.sd_fade_and_translate_out);
            animation0.setAnimationListener(new f(this, cardView0));
            animation0.setStartOffset(((long)v));
            cardView0.startAnimation(animation0);
        }
    }

    public void q(@MenuRes int v) {
        this.h();
        PopupMenu popupMenu0 = new PopupMenu(this.getContext(), new View(this.getContext()));
        popupMenu0.g(v);
        Menu menu0 = popupMenu0.d();
        for(int v1 = 0; v1 < menu0.size(); ++v1) {
            MenuItem menuItem0 = menu0.getItem(v1);
            this.d(new com.leinardi.android.speeddial.SpeedDialActionItem.b(menuItem0.getItemId(), menuItem0.getIcon()).y((menuItem0.getTitle() == null ? null : menuItem0.getTitle().toString())).q());
        }
    }

    private void r(Context context0, @Nullable AttributeSet attributeSet0) {
        FloatingActionButton floatingActionButton0 = this.k();
        this.f = floatingActionButton0;
        this.addView(floatingActionButton0);
        this.setClipChildren(false);
        this.setElevation(this.getResources().getDimension(dimen.sd_close_elevation));
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.SpeedDialView, 0, 0);
        try {
            boolean z = this.isEnabled();
            this.setEnabled(typedArray0.getBoolean(styleable.SpeedDialView_android_enabled, z));
            this.setUseReverseAnimationOnClose(typedArray0.getBoolean(styleable.SpeedDialView_sdUseReverseAnimationOnClose, this.getUseReverseAnimationOnClose()));
            float f = this.getMainFabAnimationRotateAngle();
            this.setMainFabAnimationRotateAngle(typedArray0.getFloat(styleable.SpeedDialView_sdMainFabAnimationRotateAngle, f));
            int v1 = typedArray0.getResourceId(styleable.SpeedDialView_sdMainFabClosedSrc, 0x80000000);
            if(v1 != 0x80000000) {
                this.setMainFabClosedDrawable(AppCompatResources.b(this.getContext(), v1));
            }
            int v2 = typedArray0.getResourceId(styleable.SpeedDialView_sdMainFabOpenedSrc, 0x80000000);
            if(v2 != 0x80000000) {
                this.setMainFabOpenedDrawable(AppCompatResources.b(context0, v2));
            }
            this.C(typedArray0.getInt(styleable.SpeedDialView_sdExpansionMode, this.getExpansionMode()), true);
            int v3 = this.getMainFabClosedBackgroundColor();
            this.setMainFabClosedBackgroundColor(typedArray0.getColor(styleable.SpeedDialView_sdMainFabClosedBackgroundColor, v3));
            int v4 = this.getMainFabOpenedBackgroundColor();
            this.setMainFabOpenedBackgroundColor(typedArray0.getColor(styleable.SpeedDialView_sdMainFabOpenedBackgroundColor, v4));
            int v5 = this.getMainFabClosedIconColor();
            this.setMainFabClosedIconColor(typedArray0.getColor(styleable.SpeedDialView_sdMainFabClosedIconColor, v5));
            int v6 = this.getMainFabOpenedIconColor();
            this.setMainFabOpenedIconColor(typedArray0.getColor(styleable.SpeedDialView_sdMainFabOpenedIconColor, v6));
            this.g = typedArray0.getResourceId(styleable.SpeedDialView_sdOverlayLayout, 0x80000000);
        }
        catch(Exception exception0) {
            Log.e("SpeedDialView", "Failure setting FabWithLabelView icon", exception0);
        }
        finally {
            typedArray0.recycle();
        }
    }

    public boolean s() {
        return this.a.a;
    }

    @Override  // android.view.View
    public void setContentDescription(CharSequence charSequence0) {
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.getMainFab().setEnabled(z);
    }

    public void setExpansionMode(int v) {
        this.C(v, false);
    }

    public void setMainFabAnimationRotateAngle(float f) {
        this.a.g = f;
        this.setMainFabOpenedDrawable(this.e);
    }

    public void setMainFabClosedBackgroundColor(@ColorInt int v) {
        this.a.b = v;
        this.M();
    }

    public void setMainFabClosedDrawable(@Nullable Drawable drawable0) {
        this.c = drawable0;
        this.N(false);
    }

    public void setMainFabClosedIconColor(@ColorInt int v) {
        this.a.d = v;
        this.O();
    }

    public void setMainFabOpenedBackgroundColor(@ColorInt int v) {
        this.a.c = v;
        this.M();
    }

    public void setMainFabOpenedDrawable(@Nullable Drawable drawable0) {
        this.e = drawable0;
        this.d = drawable0 == null ? null : com.leinardi.android.speeddial.b.k(drawable0, -this.getMainFabAnimationRotateAngle());
        this.N(false);
    }

    public void setMainFabOpenedIconColor(@ColorInt int v) {
        this.a.e = v;
        this.O();
    }

    public void setOnActionSelectedListener(@Nullable h speedDialView$h0) {
        this.j = speedDialView$h0;
        for(int v = 0; v < this.b.size(); ++v) {
            ((FabWithLabelView)this.b.get(v)).setOnActionSelectedListener(this.k);
        }
    }

    public void setOnChangeListener(@Nullable i speedDialView$i0) {
        this.i = speedDialView$i0;
    }

    @Override  // android.widget.LinearLayout
    public void setOrientation(int v) {
        super.setOrientation(v);
    }

    public void setOverlayLayout(@Nullable SpeedDialOverlayLayout speedDialOverlayLayout0) {
        class d implements View.OnClickListener {
            final SpeedDialView a;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                SpeedDialView.this.i();
            }
        }

        if(this.h != null) {
            this.setOnClickListener(null);
        }
        this.h = speedDialOverlayLayout0;
        if(speedDialOverlayLayout0 != null) {
            speedDialOverlayLayout0.setOnClickListener((/* 缺少LAMBDA参数 */) -> SpeedDialView.this.K(false, true));
            this.G(this.s(), false);
        }
    }

    public void setUseReverseAnimationOnClose(boolean z) {
        this.a.h = z;
    }

    public void t() {
        this.K(true, true);
    }

    public void u(boolean z) {
        this.K(true, z);
    }

    @Nullable
    public SpeedDialActionItem v(int v) {
        SpeedDialActionItem speedDialActionItem0 = ((FabWithLabelView)this.b.get(v)).getSpeedDialActionItem();
        this.y(speedDialActionItem0);
        return speedDialActionItem0;
    }

    @Nullable
    private SpeedDialActionItem w(@Nullable FabWithLabelView fabWithLabelView0) {
        return this.x(fabWithLabelView0, null, true);
    }

    @Nullable
    private SpeedDialActionItem x(@Nullable FabWithLabelView fabWithLabelView0, @Nullable Iterator iterator0, boolean z) {
        if(fabWithLabelView0 != null) {
            SpeedDialActionItem speedDialActionItem0 = fabWithLabelView0.getSpeedDialActionItem();
            if(iterator0 == null) {
                this.b.remove(fabWithLabelView0);
            }
            else {
                iterator0.remove();
            }
            if(this.s()) {
                if(this.b.isEmpty()) {
                    this.i();
                }
                if(z) {
                    com.leinardi.android.speeddial.b.q(fabWithLabelView0, true);
                    return speedDialActionItem0;
                }
                this.removeView(fabWithLabelView0);
                return speedDialActionItem0;
            }
            this.removeView(fabWithLabelView0);
            return speedDialActionItem0;
        }
        return null;
    }

    public boolean y(@Nullable SpeedDialActionItem speedDialActionItem0) {
        return speedDialActionItem0 != null && this.z(speedDialActionItem0.D()) != null;
    }

    @Nullable
    public SpeedDialActionItem z(@IdRes int v) {
        return this.w(this.l(v));
    }
}

