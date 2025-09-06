package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.google.android.material.R.dimen;
import com.google.android.material.R.layout;
import java.util.ArrayList;

@RestrictTo({Scope.b})
public class t implements MenuPresenter {
    class a implements View.OnClickListener {
        final t a;

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            boolean z = true;
            t.this.b0(true);
            MenuItemImpl menuItemImpl0 = ((NavigationMenuItemView)view0).getItemData();
            if(menuItemImpl0 == null || !menuItemImpl0.isCheckable() || !t.this.d.Q(menuItemImpl0, t.this, 0)) {
                z = false;
            }
            else {
                t.this.f.H(menuItemImpl0);
            }
            t.this.b0(false);
            if(z) {
                t.this.f(false);
            }
        }
    }

    static class b extends l {
        public b(View view0) {
            super(view0);
        }
    }

    class c extends Adapter {
        private final ArrayList a;
        private MenuItemImpl b;
        private boolean c;
        final t d;
        private static final String e = "android:menu:checked";
        private static final String f = "android:menu:action_views";
        private static final int g = 0;
        private static final int h = 1;
        private static final int i = 2;
        private static final int j = 3;

        c() {
            this.a = new ArrayList();
            this.E();
        }

        int A() {
            int v1 = 0;
            for(int v = 0; v < t.this.f.getItemCount(); ++v) {
                switch(t.this.f.getItemViewType(v)) {
                    case 0: 
                    case 1: {
                        ++v1;
                    }
                }
            }
            return v1;
        }

        public void B(@NonNull l t$l0, int v) {
            switch(this.getItemViewType(v)) {
                case 0: {
                    NavigationMenuItemView navigationMenuItemView0 = (NavigationMenuItemView)t$l0.itemView;
                    navigationMenuItemView0.setIconTintList(t.this.m);
                    navigationMenuItemView0.setTextAppearance(t.this.j);
                    ColorStateList colorStateList0 = t.this.l;
                    if(colorStateList0 != null) {
                        navigationMenuItemView0.setTextColor(colorStateList0);
                    }
                    Drawable drawable0 = t.this.n;
                    ViewCompat.R1(navigationMenuItemView0, (drawable0 == null ? null : drawable0.getConstantState().newDrawable()));
                    RippleDrawable rippleDrawable0 = t.this.o;
                    if(rippleDrawable0 != null) {
                        navigationMenuItemView0.setForeground(rippleDrawable0.getConstantState().newDrawable());
                    }
                    g t$g0 = (g)this.a.get(v);
                    navigationMenuItemView0.setNeedsEmptyIcon(t$g0.b);
                    int v1 = t.this.p;
                    int v2 = t.this.q;
                    navigationMenuItemView0.setPadding(v1, v2, v1, v2);
                    navigationMenuItemView0.setIconPadding(t.this.r);
                    t t0 = t.this;
                    if(t0.x) {
                        navigationMenuItemView0.setIconSize(t0.s);
                    }
                    navigationMenuItemView0.setMaxLines(t.this.z);
                    navigationMenuItemView0.H(t$g0.a(), t.this.k);
                    this.G(navigationMenuItemView0, v, false);
                    return;
                }
                case 1: {
                    TextView textView0 = (TextView)t$l0.itemView;
                    textView0.setText(((g)this.a.get(v)).a().getTitle());
                    TextViewCompat.D(textView0, t.this.h);
                    textView0.setPadding(t.this.v, textView0.getPaddingTop(), t.this.w, textView0.getPaddingBottom());
                    ColorStateList colorStateList1 = t.this.i;
                    if(colorStateList1 != null) {
                        textView0.setTextColor(colorStateList1);
                    }
                    this.G(textView0, v, true);
                    return;
                }
                case 2: {
                    f t$f0 = (f)this.a.get(v);
                    t$l0.itemView.setPadding(t.this.t, t$f0.b(), t.this.u, t$f0.a());
                }
            }
        }

        @Nullable
        public l C(ViewGroup viewGroup0, int v) {
            switch(v) {
                case 0: {
                    return new i(t.this.g, viewGroup0, t.this.D);
                }
                case 1: {
                    return new k(t.this.g, viewGroup0);
                }
                case 2: {
                    return new j(t.this.g, viewGroup0);
                }
                case 3: {
                    return new b(t.this.b);
                }
                default: {
                    return null;
                }
            }
        }

        public void D(l t$l0) {
            if(t$l0 instanceof i) {
                ((NavigationMenuItemView)t$l0.itemView).I();
            }
        }

        private void E() {
            if(this.c) {
                return;
            }
            this.c = true;
            this.a.clear();
            d t$d0 = new d();
            this.a.add(t$d0);
            int v = t.this.d.H().size();
            int v1 = -1;
            boolean z = false;
            int v3 = 0;
            for(int v2 = 0; v2 < v; ++v2) {
                MenuItemImpl menuItemImpl0 = (MenuItemImpl)t.this.d.H().get(v2);
                if(menuItemImpl0.isChecked()) {
                    this.H(menuItemImpl0);
                }
                if(menuItemImpl0.isCheckable()) {
                    menuItemImpl0.w(false);
                }
                if(menuItemImpl0.hasSubMenu()) {
                    SubMenu subMenu0 = menuItemImpl0.getSubMenu();
                    if(subMenu0.hasVisibleItems()) {
                        if(v2 != 0) {
                            f t$f0 = new f(t.this.B, 0);
                            this.a.add(t$f0);
                        }
                        g t$g0 = new g(menuItemImpl0);
                        this.a.add(t$g0);
                        int v4 = this.a.size();
                        int v5 = subMenu0.size();
                        boolean z1 = false;
                        for(int v6 = 0; v6 < v5; ++v6) {
                            MenuItemImpl menuItemImpl1 = (MenuItemImpl)subMenu0.getItem(v6);
                            if(menuItemImpl1.isVisible()) {
                                if(!z1 && menuItemImpl1.getIcon() != null) {
                                    z1 = true;
                                }
                                if(menuItemImpl1.isCheckable()) {
                                    menuItemImpl1.w(false);
                                }
                                if(menuItemImpl0.isChecked()) {
                                    this.H(menuItemImpl0);
                                }
                                g t$g1 = new g(menuItemImpl1);
                                this.a.add(t$g1);
                            }
                        }
                        if(z1) {
                            this.x(v4, this.a.size());
                        }
                    }
                }
                else {
                    int v7 = menuItemImpl0.getGroupId();
                    if(v7 != v1) {
                        v3 = this.a.size();
                        z = menuItemImpl0.getIcon() != null;
                        if(v2 != 0) {
                            ++v3;
                            int v8 = t.this.B;
                            f t$f1 = new f(v8, v8);
                            this.a.add(t$f1);
                        }
                    }
                    else if(!z && menuItemImpl0.getIcon() != null) {
                        this.x(v3, this.a.size());
                        z = true;
                    }
                    g t$g2 = new g(menuItemImpl0);
                    t$g2.b = z;
                    this.a.add(t$g2);
                    v1 = v7;
                }
            }
            this.c = false;
        }

        public void F(@NonNull Bundle bundle0) {
            int v1 = bundle0.getInt("android:menu:checked", 0);
            if(v1 != 0) {
                this.c = true;
                int v2 = this.a.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    e t$e0 = (e)this.a.get(v3);
                    if(t$e0 instanceof g) {
                        MenuItemImpl menuItemImpl0 = ((g)t$e0).a();
                        if(menuItemImpl0 != null && menuItemImpl0.getItemId() == v1) {
                            this.H(menuItemImpl0);
                            break;
                        }
                    }
                }
                this.c = false;
                this.E();
            }
            SparseArray sparseArray0 = bundle0.getSparseParcelableArray("android:menu:action_views");
            if(sparseArray0 != null) {
                int v4 = this.a.size();
                for(int v = 0; v < v4; ++v) {
                    e t$e1 = (e)this.a.get(v);
                    if(t$e1 instanceof g) {
                        MenuItemImpl menuItemImpl1 = ((g)t$e1).a();
                        if(menuItemImpl1 != null) {
                            View view0 = menuItemImpl1.getActionView();
                            if(view0 != null) {
                                ParcelableSparseArray parcelableSparseArray0 = (ParcelableSparseArray)sparseArray0.get(menuItemImpl1.getItemId());
                                if(parcelableSparseArray0 != null) {
                                    view0.restoreHierarchyState(parcelableSparseArray0);
                                }
                            }
                        }
                    }
                }
            }
        }

        private void G(View view0, int v, boolean z) {
            class com.google.android.material.internal.t.c.a extends AccessibilityDelegateCompat {
                final int d;
                final boolean e;
                final c f;

                com.google.android.material.internal.t.c.a(int v, boolean z) {
                    this.d = v;
                    this.e = z;
                    super();
                }

                @Override  // androidx.core.view.AccessibilityDelegateCompat
                public void g(@NonNull View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                    super.g(view0, accessibilityNodeInfoCompat0);
                    int v = c.this.w(this.d);
                    boolean z = view0.isSelected();
                    accessibilityNodeInfoCompat0.n1(CollectionItemInfoCompat.j(v, 1, 1, 1, this.e, z));
                }
            }

            ViewCompat.J1(view0, new com.google.android.material.internal.t.c.a(this, v, z));
        }

        public void H(@NonNull MenuItemImpl menuItemImpl0) {
            if(this.b != menuItemImpl0 && menuItemImpl0.isCheckable()) {
                MenuItemImpl menuItemImpl1 = this.b;
                if(menuItemImpl1 != null) {
                    menuItemImpl1.setChecked(false);
                }
                this.b = menuItemImpl0;
                menuItemImpl0.setChecked(true);
            }
        }

        public void I(boolean z) {
            this.c = z;
        }

        public void J() {
            this.E();
            this.notifyDataSetChanged();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return this.a.size();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public long getItemId(int v) {
            return (long)v;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemViewType(int v) {
            e t$e0 = (e)this.a.get(v);
            if(t$e0 instanceof f) {
                return 2;
            }
            if(t$e0 instanceof d) {
                return 3;
            }
            if(!(t$e0 instanceof g)) {
                throw new RuntimeException("Unknown item type.");
            }
            return ((g)t$e0).a().hasSubMenu() ? 1 : 0;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(@NonNull ViewHolder recyclerView$ViewHolder0, int v) {
            this.B(((l)recyclerView$ViewHolder0), v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        @Nullable
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
            return this.C(viewGroup0, v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onViewRecycled(ViewHolder recyclerView$ViewHolder0) {
            this.D(((l)recyclerView$ViewHolder0));
        }

        private int w(int v) {
            int v2 = v;
            for(int v1 = 0; v1 < v; ++v1) {
                switch(t.this.f.getItemViewType(v1)) {
                    case 2: 
                    case 3: {
                        --v2;
                    }
                }
            }
            return v2;
        }

        private void x(int v, int v1) {
            while(v < v1) {
                ((g)this.a.get(v)).b = true;
                ++v;
            }
        }

        @NonNull
        public Bundle y() {
            Bundle bundle0 = new Bundle();
            MenuItemImpl menuItemImpl0 = this.b;
            if(menuItemImpl0 != null) {
                bundle0.putInt("android:menu:checked", menuItemImpl0.getItemId());
            }
            SparseArray sparseArray0 = new SparseArray();
            int v = this.a.size();
            for(int v1 = 0; v1 < v; ++v1) {
                e t$e0 = (e)this.a.get(v1);
                if(t$e0 instanceof g) {
                    MenuItemImpl menuItemImpl1 = ((g)t$e0).a();
                    View view0 = menuItemImpl1 == null ? null : menuItemImpl1.getActionView();
                    if(view0 != null) {
                        ParcelableSparseArray parcelableSparseArray0 = new ParcelableSparseArray();
                        view0.saveHierarchyState(parcelableSparseArray0);
                        sparseArray0.put(menuItemImpl1.getItemId(), parcelableSparseArray0);
                    }
                }
            }
            bundle0.putSparseParcelableArray("android:menu:action_views", sparseArray0);
            return bundle0;
        }

        public MenuItemImpl z() {
            return this.b;
        }
    }

    static class d implements e {
    }

    interface e {
    }

    static class f implements e {
        private final int a;
        private final int b;

        public f(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    static class g implements e {
        private final MenuItemImpl a;
        boolean b;

        g(MenuItemImpl menuItemImpl0) {
            this.a = menuItemImpl0;
        }

        public MenuItemImpl a() {
            return this.a;
        }
    }

    class h extends RecyclerViewAccessibilityDelegate {
        final t f;

        h(@NonNull RecyclerView recyclerView0) {
            super(recyclerView0);
        }

        @Override  // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
        public void g(View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            super.g(view0, accessibilityNodeInfoCompat0);
            accessibilityNodeInfoCompat0.m1(CollectionInfoCompat.g(t.this.f.A(), 1, false));
        }
    }

    static class i extends l {
        public i(@NonNull LayoutInflater layoutInflater0, ViewGroup viewGroup0, View.OnClickListener view$OnClickListener0) {
            super(layoutInflater0.inflate(layout.design_navigation_item, viewGroup0, false));
            this.itemView.setOnClickListener(view$OnClickListener0);
        }
    }

    static class j extends l {
        public j(@NonNull LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
            super(layoutInflater0.inflate(layout.design_navigation_item_separator, viewGroup0, false));
        }
    }

    static class k extends l {
        public k(@NonNull LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
            super(layoutInflater0.inflate(layout.design_navigation_item_subheader, viewGroup0, false));
        }
    }

    static abstract class l extends ViewHolder {
        public l(View view0) {
            super(view0);
        }
    }

    private int A;
    int B;
    private int C;
    final View.OnClickListener D;
    public static final int E = 0;
    private static final String F = "android:menu:list";
    private static final String G = "android:menu:adapter";
    private static final String H = "android:menu:header";
    private NavigationMenuView a;
    LinearLayout b;
    private Callback c;
    MenuBuilder d;
    private int e;
    c f;
    LayoutInflater g;
    int h;
    @Nullable
    ColorStateList i;
    int j;
    boolean k;
    ColorStateList l;
    ColorStateList m;
    Drawable n;
    RippleDrawable o;
    int p;
    @Px
    int q;
    int r;
    int s;
    @Px
    int t;
    @Px
    int u;
    @Px
    int v;
    @Px
    int w;
    boolean x;
    boolean y;
    private int z;

    public t() {
        this.h = 0;
        this.j = 0;
        this.k = true;
        this.y = true;
        this.C = -1;
        this.D = new a(this);
    }

    @Px
    public int A() {
        return this.w;
    }

    @Px
    public int B() {
        return this.v;
    }

    private boolean C() {
        return this.r() > 0;
    }

    public View D(@LayoutRes int v) {
        View view0 = this.g.inflate(v, this.b, false);
        this.j(view0);
        return view0;
    }

    public boolean E() {
        return this.y;
    }

    public void F(@NonNull View view0) {
        this.b.removeView(view0);
        if(!this.C()) {
            this.a.setPadding(0, this.A, 0, this.a.getPaddingBottom());
        }
    }

    public void G(boolean z) {
        if(this.y != z) {
            this.y = z;
            this.c0();
        }
    }

    public void H(@NonNull MenuItemImpl menuItemImpl0) {
        this.f.H(menuItemImpl0);
    }

    public void I(@Px int v) {
        this.u = v;
        this.f(false);
    }

    public void J(@Px int v) {
        this.t = v;
        this.f(false);
    }

    public void K(int v) {
        this.e = v;
    }

    public void L(@Nullable Drawable drawable0) {
        this.n = drawable0;
        this.f(false);
    }

    public void M(@Nullable RippleDrawable rippleDrawable0) {
        this.o = rippleDrawable0;
        this.f(false);
    }

    public void N(int v) {
        this.p = v;
        this.f(false);
    }

    public void O(int v) {
        this.r = v;
        this.f(false);
    }

    public void P(@Dimension int v) {
        if(this.s != v) {
            this.s = v;
            this.x = true;
            this.f(false);
        }
    }

    public void Q(@Nullable ColorStateList colorStateList0) {
        this.m = colorStateList0;
        this.f(false);
    }

    public void R(int v) {
        this.z = v;
        this.f(false);
    }

    public void S(@StyleRes int v) {
        this.j = v;
        this.f(false);
    }

    public void T(boolean z) {
        this.k = z;
        this.f(false);
    }

    public void U(@Nullable ColorStateList colorStateList0) {
        this.l = colorStateList0;
        this.f(false);
    }

    public void V(@Px int v) {
        this.q = v;
        this.f(false);
    }

    public void W(int v) {
        this.C = v;
        NavigationMenuView navigationMenuView0 = this.a;
        if(navigationMenuView0 != null) {
            navigationMenuView0.setOverScrollMode(v);
        }
    }

    public void X(@Nullable ColorStateList colorStateList0) {
        this.i = colorStateList0;
        this.f(false);
    }

    public void Y(@Px int v) {
        this.w = v;
        this.f(false);
    }

    public void Z(@Px int v) {
        this.v = v;
        this.f(false);
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    public Parcelable a() {
        Parcelable parcelable0 = new Bundle();
        if(this.a != null) {
            SparseArray sparseArray0 = new SparseArray();
            this.a.saveHierarchyState(sparseArray0);
            ((Bundle)parcelable0).putSparseParcelableArray("android:menu:list", sparseArray0);
        }
        c t$c0 = this.f;
        if(t$c0 != null) {
            ((Bundle)parcelable0).putBundle("android:menu:adapter", t$c0.y());
        }
        if(this.b != null) {
            SparseArray sparseArray1 = new SparseArray();
            this.b.saveHierarchyState(sparseArray1);
            ((Bundle)parcelable0).putSparseParcelableArray("android:menu:header", sparseArray1);
        }
        return parcelable0;
    }

    public void a0(@StyleRes int v) {
        this.h = v;
        this.f(false);
    }

    public void b0(boolean z) {
        c t$c0 = this.f;
        if(t$c0 != null) {
            t$c0.I(z);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void c(MenuBuilder menuBuilder0, boolean z) {
        Callback menuPresenter$Callback0 = this.c;
        if(menuPresenter$Callback0 != null) {
            menuPresenter$Callback0.c(menuBuilder0, z);
        }
    }

    private void c0() {
        int v = this.C() || !this.y ? 0 : this.A;
        this.a.setPadding(0, v, 0, this.a.getPaddingBottom());
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void d(Parcelable parcelable0) {
        if(parcelable0 instanceof Bundle) {
            SparseArray sparseArray0 = ((Bundle)parcelable0).getSparseParcelableArray("android:menu:list");
            if(sparseArray0 != null) {
                this.a.restoreHierarchyState(sparseArray0);
            }
            Bundle bundle0 = ((Bundle)parcelable0).getBundle("android:menu:adapter");
            if(bundle0 != null) {
                this.f.F(bundle0);
            }
            SparseArray sparseArray1 = ((Bundle)parcelable0).getSparseParcelableArray("android:menu:header");
            if(sparseArray1 != null) {
                this.b.restoreHierarchyState(sparseArray1);
            }
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean e(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void f(boolean z) {
        c t$c0 = this.f;
        if(t$c0 != null) {
            t$c0.J();
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean g() {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.e;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean h(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void i(@NonNull Context context0, @NonNull MenuBuilder menuBuilder0) {
        this.g = LayoutInflater.from(context0);
        this.d = menuBuilder0;
        this.B = context0.getResources().getDimensionPixelOffset(dimen.design_navigation_separator_vertical_padding);
    }

    public void j(@NonNull View view0) {
        this.b.addView(view0);
        this.a.setPadding(0, 0, 0, this.a.getPaddingBottom());
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void k(Callback menuPresenter$Callback0) {
        this.c = menuPresenter$Callback0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean l(SubMenuBuilder subMenuBuilder0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public MenuView m(ViewGroup viewGroup0) {
        if(this.a == null) {
            NavigationMenuView navigationMenuView0 = (NavigationMenuView)this.g.inflate(layout.design_navigation_menu, viewGroup0, false);
            this.a = navigationMenuView0;
            navigationMenuView0.setAccessibilityDelegateCompat(new h(this, this.a));
            if(this.f == null) {
                c t$c0 = new c(this);
                this.f = t$c0;
                t$c0.setHasStableIds(true);
            }
            int v = this.C;
            if(v != -1) {
                this.a.setOverScrollMode(v);
            }
            LinearLayout linearLayout0 = (LinearLayout)this.g.inflate(layout.design_navigation_item_header, this.a, false);
            this.b = linearLayout0;
            ViewCompat.b2(linearLayout0, 2);
            this.a.setAdapter(this.f);
        }
        return this.a;
    }

    public void n(@NonNull WindowInsetsCompat windowInsetsCompat0) {
        int v = windowInsetsCompat0.r();
        if(this.A != v) {
            this.A = v;
            this.c0();
        }
        this.a.setPadding(0, this.a.getPaddingTop(), 0, windowInsetsCompat0.o());
        ViewCompat.q(this.b, windowInsetsCompat0);
    }

    @Nullable
    public MenuItemImpl o() {
        return this.f.z();
    }

    @Px
    public int p() {
        return this.u;
    }

    @Px
    public int q() {
        return this.t;
    }

    public int r() {
        return this.b.getChildCount();
    }

    public View s(int v) {
        return this.b.getChildAt(v);
    }

    @Nullable
    public Drawable t() {
        return this.n;
    }

    public int u() {
        return this.p;
    }

    public int v() {
        return this.r;
    }

    public int w() {
        return this.z;
    }

    @Nullable
    public ColorStateList x() {
        return this.l;
    }

    @Nullable
    public ColorStateList y() {
        return this.m;
    }

    @Px
    public int z() {
        return this.q;
    }
}

