package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.layout;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView.ItemView;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ActionProvider.SubUiVisibilityListener;
import androidx.core.view.ActionProvider;
import java.util.ArrayList;

class ActionMenuPresenter extends BaseMenuPresenter implements SubUiVisibilityListener {
    class ActionButtonSubmenu extends MenuPopupHelper {
        final ActionMenuPresenter n;

        public ActionButtonSubmenu(Context context0, SubMenuBuilder subMenuBuilder0, View view0) {
            super(context0, subMenuBuilder0, view0, false, attr.actionOverflowMenuStyle);
            if(!((MenuItemImpl)subMenuBuilder0.getItem()).o()) {
                View view1 = actionMenuPresenter0.k;
                if(view1 == null) {
                    view1 = (View)actionMenuPresenter0.i;
                }
                this.h(view1);
            }
            this.a(actionMenuPresenter0.C);
        }

        @Override  // androidx.appcompat.view.menu.MenuPopupHelper
        protected void g() {
            ActionMenuPresenter.this.z = null;
            ActionMenuPresenter.this.D = 0;
            super.g();
        }
    }

    class ActionMenuPopupCallback extends PopupCallback {
        final ActionMenuPresenter a;

        @Override  // androidx.appcompat.view.menu.ActionMenuItemView$PopupCallback
        public ShowableListMenu a() {
            ActionButtonSubmenu actionMenuPresenter$ActionButtonSubmenu0 = ActionMenuPresenter.this.z;
            return actionMenuPresenter$ActionButtonSubmenu0 != null ? actionMenuPresenter$ActionButtonSubmenu0.e() : null;
        }
    }

    class OpenOverflowRunnable implements Runnable {
        private OverflowPopup a;
        final ActionMenuPresenter b;

        public OpenOverflowRunnable(OverflowPopup actionMenuPresenter$OverflowPopup0) {
            this.a = actionMenuPresenter$OverflowPopup0;
        }

        @Override
        public void run() {
            if(ActionMenuPresenter.this.c != null) {
                ActionMenuPresenter.this.c.d();
            }
            View view0 = (View)ActionMenuPresenter.this.i;
            if(view0 != null && view0.getWindowToken() != null && this.a.o()) {
                ActionMenuPresenter.this.y = this.a;
            }
            ActionMenuPresenter.this.A = null;
        }
    }

    class OverflowMenuButton extends AppCompatImageView implements ActionMenuChildView {
        final ActionMenuPresenter a;

        public OverflowMenuButton(Context context0) {
            super(context0, null, attr.actionOverflowButtonStyle);
            this.setClickable(true);
            this.setFocusable(true);
            this.setVisibility(0);
            this.setEnabled(true);
            TooltipCompat.a(this, this.getContentDescription());
            this.setOnTouchListener(new ForwardingListener(this) {
                final OverflowMenuButton k;

                @Override  // androidx.appcompat.widget.ForwardingListener
                public ShowableListMenu b() {
                    OverflowPopup actionMenuPresenter$OverflowPopup0 = ActionMenuPresenter.this.y;
                    return actionMenuPresenter$OverflowPopup0 == null ? null : actionMenuPresenter$OverflowPopup0.e();
                }

                @Override  // androidx.appcompat.widget.ForwardingListener
                public boolean c() {
                    ActionMenuPresenter.this.Q();
                    return true;
                }

                @Override  // androidx.appcompat.widget.ForwardingListener
                public boolean d() {
                    ActionMenuPresenter actionMenuPresenter0 = ActionMenuPresenter.this;
                    if(actionMenuPresenter0.A != null) {
                        return false;
                    }
                    actionMenuPresenter0.E();
                    return true;
                }
            });
        }

        @Override  // androidx.appcompat.widget.ActionMenuView$ActionMenuChildView
        public boolean b() {
            return false;
        }

        @Override  // androidx.appcompat.widget.ActionMenuView$ActionMenuChildView
        public boolean c() {
            return false;
        }

        @Override  // android.view.View
        public boolean performClick() {
            if(super.performClick()) {
                return true;
            }
            this.playSoundEffect(0);
            ActionMenuPresenter.this.Q();
            return true;
        }

        @Override  // android.widget.ImageView
        protected boolean setFrame(int v, int v1, int v2, int v3) {
            boolean z = super.setFrame(v, v1, v2, v3);
            Drawable drawable0 = this.getDrawable();
            Drawable drawable1 = this.getBackground();
            if(drawable0 != null && drawable1 != null) {
                int v4 = this.getWidth();
                int v5 = this.getHeight();
                int v6 = Math.max(v4, v5);
                int v7 = (v4 + (this.getPaddingLeft() - this.getPaddingRight())) / 2;
                int v8 = (v5 + (this.getPaddingTop() - this.getPaddingBottom())) / 2;
                DrawableCompat.l(drawable1, v7 - v6 / 2, v8 - v6 / 2, v7 + v6 / 2, v8 + v6 / 2);
            }
            return z;
        }
    }

    class OverflowPopup extends MenuPopupHelper {
        final ActionMenuPresenter n;

        public OverflowPopup(Context context0, MenuBuilder menuBuilder0, View view0, boolean z) {
            super(context0, menuBuilder0, view0, z, attr.actionOverflowMenuStyle);
            this.j(0x800005);
            this.a(actionMenuPresenter0.C);
        }

        @Override  // androidx.appcompat.view.menu.MenuPopupHelper
        protected void g() {
            if(ActionMenuPresenter.this.c != null) {
                ActionMenuPresenter.this.c.close();
            }
            ActionMenuPresenter.this.y = null;
            super.g();
        }
    }

    class PopupPresenterCallback implements Callback {
        final ActionMenuPresenter a;

        @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
        public void c(@NonNull MenuBuilder menuBuilder0, boolean z) {
            if(menuBuilder0 instanceof SubMenuBuilder) {
                menuBuilder0.G().f(false);
            }
            Callback menuPresenter$Callback0 = ActionMenuPresenter.this.q();
            if(menuPresenter$Callback0 != null) {
                menuPresenter$Callback0.c(menuBuilder0, z);
            }
        }

        @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
        public boolean d(@NonNull MenuBuilder menuBuilder0) {
            if(menuBuilder0 == ActionMenuPresenter.this.c) {
                return false;
            }
            ActionMenuPresenter.this.D = ((SubMenuBuilder)menuBuilder0).getItem().getItemId();
            Callback menuPresenter$Callback0 = ActionMenuPresenter.this.q();
            return menuPresenter$Callback0 == null ? false : menuPresenter$Callback0.d(menuBuilder0);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    static class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR;
        public int a;

        static {
            SavedState.CREATOR = new Parcelable.Creator() {
                public SavedState a(Parcel parcel0) {
                    return new SavedState(parcel0);
                }

                public SavedState[] b(int v) {
                    return new SavedState[v];
                }

                @Override  // android.os.Parcelable$Creator
                public Object createFromParcel(Parcel parcel0) {
                    return this.a(parcel0);
                }

                @Override  // android.os.Parcelable$Creator
                public Object[] newArray(int v) {
                    return this.b(v);
                }
            };
        }

        SavedState() {
        }

        SavedState(Parcel parcel0) {
            this.a = parcel0.readInt();
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeInt(this.a);
        }
    }

    OpenOverflowRunnable A;
    private ActionMenuPopupCallback B;
    final PopupPresenterCallback C;
    int D;
    private static final String E = "ActionMenuPresenter";
    OverflowMenuButton k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private final SparseBooleanArray x;
    OverflowPopup y;
    ActionButtonSubmenu z;

    public ActionMenuPresenter(Context context0) {
        super(context0, layout.abc_action_menu_layout, layout.abc_action_menu_item_layout);
        this.x = new SparseBooleanArray();
        this.C = new PopupPresenterCallback(this);
    }

    public boolean B() {
        return this.E() | this.F();
    }

    private View C(MenuItem menuItem0) {
        ViewGroup viewGroup0 = (ViewGroup)this.i;
        if(viewGroup0 == null) {
            return null;
        }
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            if(view0 instanceof ItemView && ((ItemView)view0).getItemData() == menuItem0) {
                return view0;
            }
        }
        return null;
    }

    public Drawable D() {
        OverflowMenuButton actionMenuPresenter$OverflowMenuButton0 = this.k;
        if(actionMenuPresenter$OverflowMenuButton0 != null) {
            return actionMenuPresenter$OverflowMenuButton0.getDrawable();
        }
        return this.m ? this.l : null;
    }

    public boolean E() {
        OpenOverflowRunnable actionMenuPresenter$OpenOverflowRunnable0 = this.A;
        if(actionMenuPresenter$OpenOverflowRunnable0 != null) {
            MenuView menuView0 = this.i;
            if(menuView0 != null) {
                ((View)menuView0).removeCallbacks(actionMenuPresenter$OpenOverflowRunnable0);
                this.A = null;
                return true;
            }
        }
        OverflowPopup actionMenuPresenter$OverflowPopup0 = this.y;
        if(actionMenuPresenter$OverflowPopup0 != null) {
            actionMenuPresenter$OverflowPopup0.dismiss();
            return true;
        }
        return false;
    }

    public boolean F() {
        ActionButtonSubmenu actionMenuPresenter$ActionButtonSubmenu0 = this.z;
        if(actionMenuPresenter$ActionButtonSubmenu0 != null) {
            actionMenuPresenter$ActionButtonSubmenu0.dismiss();
            return true;
        }
        return false;
    }

    public boolean G() {
        return this.A != null || this.H();
    }

    public boolean H() {
        return this.y != null && this.y.f();
    }

    public boolean I() {
        return this.n;
    }

    public void J(Configuration configuration0) {
        if(!this.s) {
            this.r = ActionBarPolicy.b(this.b).d();
        }
        MenuBuilder menuBuilder0 = this.c;
        if(menuBuilder0 != null) {
            menuBuilder0.O(true);
        }
    }

    public void K(boolean z) {
        this.v = z;
    }

    public void L(int v) {
        this.r = v;
        this.s = true;
    }

    public void M(ActionMenuView actionMenuView0) {
        this.i = actionMenuView0;
        actionMenuView0.a(this.c);
    }

    public void N(Drawable drawable0) {
        OverflowMenuButton actionMenuPresenter$OverflowMenuButton0 = this.k;
        if(actionMenuPresenter$OverflowMenuButton0 != null) {
            actionMenuPresenter$OverflowMenuButton0.setImageDrawable(drawable0);
            return;
        }
        this.m = true;
        this.l = drawable0;
    }

    public void O(boolean z) {
        this.n = z;
        this.o = true;
    }

    public void P(int v, boolean z) {
        this.p = v;
        this.t = z;
        this.u = true;
    }

    public boolean Q() {
        if(this.n && !this.H() && (this.c != null && this.i != null && this.A == null && !this.c.C().isEmpty())) {
            OpenOverflowRunnable actionMenuPresenter$OpenOverflowRunnable0 = new OpenOverflowRunnable(this, new OverflowPopup(this, this.b, this.c, this.k, true));
            this.A = actionMenuPresenter$OpenOverflowRunnable0;
            ((View)this.i).post(actionMenuPresenter$OpenOverflowRunnable0);
            return true;
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable a() {
        Parcelable parcelable0 = new SavedState();
        parcelable0.a = this.D;
        return parcelable0;
    }

    @Override  // androidx.core.view.ActionProvider$SubUiVisibilityListener
    public void b(boolean z) {
        if(z) {
            super.l(null);
            return;
        }
        MenuBuilder menuBuilder0 = this.c;
        if(menuBuilder0 != null) {
            menuBuilder0.f(false);
        }
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public void c(MenuBuilder menuBuilder0, boolean z) {
        this.B();
        super.c(menuBuilder0, z);
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void d(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            return;
        }
        int v = ((SavedState)parcelable0).a;
        if(v > 0) {
            MenuItem menuItem0 = this.c.findItem(v);
            if(menuItem0 != null) {
                this.l(((SubMenuBuilder)menuItem0.getSubMenu()));
            }
        }
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public void f(boolean z) {
        super.f(z);
        ((View)this.i).requestLayout();
        MenuBuilder menuBuilder0 = this.c;
        int v = 0;
        if(menuBuilder0 != null) {
            ArrayList arrayList0 = menuBuilder0.v();
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ActionProvider actionProvider0 = ((MenuItemImpl)arrayList0.get(v2)).a();
                if(actionProvider0 != null) {
                    actionProvider0.k(this);
                }
            }
        }
        ArrayList arrayList1 = this.c == null ? null : this.c.C();
        if(this.n && arrayList1 != null) {
            int v3 = arrayList1.size();
            if(v3 == 1) {
                v = !((MenuItemImpl)arrayList1.get(0)).isActionViewExpanded();
            }
            else if(v3 > 0) {
                v = 1;
            }
        }
        if(v == 0) {
            OverflowMenuButton actionMenuPresenter$OverflowMenuButton0 = this.k;
            if(actionMenuPresenter$OverflowMenuButton0 != null) {
                ViewParent viewParent0 = actionMenuPresenter$OverflowMenuButton0.getParent();
                MenuView menuView0 = this.i;
                if(viewParent0 == menuView0) {
                    ((ViewGroup)menuView0).removeView(this.k);
                }
            }
        }
        else {
            if(this.k == null) {
                this.k = new OverflowMenuButton(this, this.a);
            }
            ViewGroup viewGroup0 = (ViewGroup)this.k.getParent();
            if(viewGroup0 != this.i) {
                if(viewGroup0 != null) {
                    viewGroup0.removeView(this.k);
                }
                ActionMenuView actionMenuView0 = (ActionMenuView)this.i;
                actionMenuView0.addView(this.k, actionMenuView0.J());
            }
        }
        ((ActionMenuView)this.i).setOverflowReserved(this.n);
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean g() {
        boolean z4;
        int v14;
        int v9;
        int v8;
        int v;
        ArrayList arrayList0;
        MenuBuilder menuBuilder0 = this.c;
        if(menuBuilder0 == null) {
            arrayList0 = null;
            v = 0;
        }
        else {
            arrayList0 = menuBuilder0.H();
            v = arrayList0.size();
        }
        int v1 = this.r;
        int v2 = this.q;
        ViewGroup viewGroup0 = (ViewGroup)this.i;
        boolean z = false;
        int v4 = 0;
        int v5 = 0;
        for(int v3 = 0; v3 < v; ++v3) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)arrayList0.get(v3);
            if(menuItemImpl0.b()) {
                ++v4;
            }
            else if(menuItemImpl0.q()) {
                ++v5;
            }
            else {
                z = true;
            }
            if(this.v && menuItemImpl0.isActionViewExpanded()) {
                v1 = 0;
            }
        }
        if(this.n && (z || v5 + v4 > v1)) {
            --v1;
        }
        int v6 = v1 - v4;
        SparseBooleanArray sparseBooleanArray0 = this.x;
        sparseBooleanArray0.clear();
        if(this.t) {
            int v7 = this.w;
            v8 = v2 / v7;
            v9 = v7 + v2 % v7 / v8;
        }
        else {
            v9 = 0;
            v8 = 0;
        }
        int v10 = 0;
        int v11 = 0;
        while(v10 < v) {
            MenuItemImpl menuItemImpl1 = (MenuItemImpl)arrayList0.get(v10);
            if(menuItemImpl1.b()) {
                View view0 = this.r(menuItemImpl1, null, viewGroup0);
                if(this.t) {
                    v8 -= ActionMenuView.P(view0, v9, v8, 0, 0);
                }
                else {
                    view0.measure(0, 0);
                }
                int v12 = view0.getMeasuredWidth();
                v2 -= v12;
                if(v11 == 0) {
                    v11 = v12;
                }
                int v13 = menuItemImpl1.getGroupId();
                if(v13 != 0) {
                    sparseBooleanArray0.put(v13, true);
                }
                menuItemImpl1.x(true);
                v14 = v;
            }
            else if(menuItemImpl1.q()) {
                int v15 = menuItemImpl1.getGroupId();
                boolean z1 = sparseBooleanArray0.get(v15);
                boolean z2 = (v6 > 0 || z1) && v2 > 0 && (!this.t || v8 > 0);
                boolean z3 = z2;
                v14 = v;
                if(z2) {
                    View view1 = this.r(menuItemImpl1, null, viewGroup0);
                    if(this.t) {
                        int v16 = ActionMenuView.P(view1, v9, v8, 0, 0);
                        v8 -= v16;
                        if(v16 == 0) {
                            z3 = false;
                        }
                    }
                    else {
                        view1.measure(0, 0);
                    }
                    int v17 = view1.getMeasuredWidth();
                    v2 -= v17;
                    if(v11 == 0) {
                        v11 = v17;
                    }
                    if(!this.t) {
                        if(v2 + v11 > 0) {
                            z4 = true;
                        }
                    }
                    else if(v2 >= 0) {
                        z4 = true;
                    }
                    else {
                        z4 = false;
                    }
                    z2 = z3 & z4;
                }
                if(z2 && v15 != 0) {
                    sparseBooleanArray0.put(v15, true);
                }
                else if(z1) {
                    sparseBooleanArray0.put(v15, false);
                    for(int v18 = 0; v18 < v10; ++v18) {
                        MenuItemImpl menuItemImpl2 = (MenuItemImpl)arrayList0.get(v18);
                        if(menuItemImpl2.getGroupId() == v15) {
                            if(menuItemImpl2.o()) {
                                ++v6;
                            }
                            menuItemImpl2.x(false);
                        }
                    }
                }
                if(z2) {
                    --v6;
                }
                menuItemImpl1.x(z2);
            }
            else {
                v14 = v;
                menuItemImpl1.x(false);
            }
            ++v10;
            v = v14;
        }
        return true;
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public void i(@NonNull Context context0, @Nullable MenuBuilder menuBuilder0) {
        super.i(context0, menuBuilder0);
        Resources resources0 = context0.getResources();
        ActionBarPolicy actionBarPolicy0 = ActionBarPolicy.b(context0);
        if(!this.o) {
            this.n = true;
        }
        if(!this.u) {
            this.p = actionBarPolicy0.c();
        }
        if(!this.s) {
            this.r = actionBarPolicy0.d();
        }
        int v = this.p;
        if(this.n) {
            if(this.k == null) {
                OverflowMenuButton actionMenuPresenter$OverflowMenuButton0 = new OverflowMenuButton(this, this.a);
                this.k = actionMenuPresenter$OverflowMenuButton0;
                if(this.m) {
                    actionMenuPresenter$OverflowMenuButton0.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                this.k.measure(0, 0);
            }
            v -= this.k.getMeasuredWidth();
        }
        else {
            this.k = null;
        }
        this.q = v;
        this.w = (int)(resources0.getDisplayMetrics().density * 56.0f);
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean l(SubMenuBuilder subMenuBuilder0) {
        boolean z = false;
        if(!subMenuBuilder0.hasVisibleItems()) {
            return false;
        }
        SubMenuBuilder subMenuBuilder1;
        for(subMenuBuilder1 = subMenuBuilder0; subMenuBuilder1.o0() != this.c; subMenuBuilder1 = (SubMenuBuilder)subMenuBuilder1.o0()) {
        }
        View view0 = this.C(subMenuBuilder1.getItem());
        if(view0 == null) {
            return false;
        }
        this.D = subMenuBuilder0.getItem().getItemId();
        int v = subMenuBuilder0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = subMenuBuilder0.getItem(v1);
            if(menuItem0.isVisible() && menuItem0.getIcon() != null) {
                z = true;
                break;
            }
        }
        ActionButtonSubmenu actionMenuPresenter$ActionButtonSubmenu0 = new ActionButtonSubmenu(this, this.b, subMenuBuilder0, view0);
        this.z = actionMenuPresenter$ActionButtonSubmenu0;
        actionMenuPresenter$ActionButtonSubmenu0.i(z);
        this.z.l();
        super.l(subMenuBuilder0);
        return true;
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public MenuView m(ViewGroup viewGroup0) {
        MenuView menuView0 = this.i;
        MenuView menuView1 = super.m(viewGroup0);
        if(menuView0 != menuView1) {
            ((ActionMenuView)menuView1).setPresenter(this);
        }
        return menuView1;
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public void n(MenuItemImpl menuItemImpl0, ItemView menuView$ItemView0) {
        menuView$ItemView0.f(menuItemImpl0, 0);
        ((ActionMenuItemView)menuView$ItemView0).setItemInvoker(((ActionMenuView)this.i));
        if(this.B == null) {
            this.B = new ActionMenuPopupCallback(this);
        }
        ((ActionMenuItemView)menuView$ItemView0).setPopupCallback(this.B);
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean p(ViewGroup viewGroup0, int v) {
        return viewGroup0.getChildAt(v) == this.k ? false : super.p(viewGroup0, v);
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public View r(MenuItemImpl menuItemImpl0, View view0, ViewGroup viewGroup0) {
        View view1 = menuItemImpl0.getActionView();
        if(view1 == null || menuItemImpl0.m()) {
            view1 = super.r(menuItemImpl0, view0, viewGroup0);
        }
        view1.setVisibility((menuItemImpl0.isActionViewExpanded() ? 8 : 0));
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
        if(!((ActionMenuView)viewGroup0).checkLayoutParams(viewGroup$LayoutParams0)) {
            view1.setLayoutParams(((ActionMenuView)viewGroup0).I(viewGroup$LayoutParams0));
        }
        return view1;
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean t(int v, MenuItemImpl menuItemImpl0) {
        return menuItemImpl0.o();
    }
}

