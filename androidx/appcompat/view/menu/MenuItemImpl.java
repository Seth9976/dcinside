package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.string;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider.VisibilityListener;
import androidx.core.view.ActionProvider;

@RestrictTo({Scope.c})
public final class MenuItemImpl implements SupportMenuItem {
    private Runnable A;
    private MenuItem.OnMenuItemClickListener B;
    private CharSequence C;
    private CharSequence D;
    private ColorStateList E;
    private PorterDuff.Mode F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private int K;
    private View L;
    private ActionProvider M;
    private MenuItem.OnActionExpandListener N;
    private boolean O;
    private ContextMenu.ContextMenuInfo P;
    private static final String Q = "MenuItemImpl";
    private static final int R = 3;
    private static final int S = 1;
    private static final int T = 2;
    private static final int U = 4;
    private static final int V = 8;
    private static final int W = 16;
    private static final int X = 0x20;
    static final int Y;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private CharSequence p;
    private CharSequence q;
    private Intent r;
    private char s;
    private int t;
    private char u;
    private int v;
    private Drawable w;
    private int x;
    MenuBuilder y;
    private SubMenuBuilder z;

    MenuItemImpl(MenuBuilder menuBuilder0, int v, int v1, int v2, int v3, CharSequence charSequence0, int v4) {
        this.t = 0x1000;
        this.v = 0x1000;
        this.x = 0;
        this.E = null;
        this.F = null;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = 16;
        this.O = false;
        this.y = menuBuilder0;
        this.l = v1;
        this.m = v;
        this.n = v2;
        this.o = v3;
        this.p = charSequence0;
        this.K = v4;
    }

    public void A(SubMenuBuilder subMenuBuilder0) {
        this.z = subMenuBuilder0;
        subMenuBuilder0.setHeaderTitle(this.getTitle());
    }

    boolean B(boolean z) {
        int v = this.J;
        int v1 = (z ? 0 : 8) | v & -9;
        this.J = v1;
        return v != v1;
    }

    public boolean C() {
        return this.y.D();
    }

    boolean D() {
        return this.y.L() && this.j() != 0;
    }

    public boolean E() {
        return (this.K & 4) == 4;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public ActionProvider a() {
        return this.M;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public boolean b() {
        return (this.K & 2) == 2;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public SupportMenuItem c(ActionProvider actionProvider0) {
        ActionProvider actionProvider1 = this.M;
        if(actionProvider1 != null) {
            actionProvider1.j();
        }
        this.L = null;
        this.M = actionProvider0;
        this.y.O(true);
        ActionProvider actionProvider2 = this.M;
        if(actionProvider2 != null) {
            actionProvider2.l(new VisibilityListener() {
                final MenuItemImpl a;

                @Override  // androidx.core.view.ActionProvider$VisibilityListener
                public void onActionProviderVisibilityChanged(boolean z) {
                    MenuItemImpl.this.y.N(MenuItemImpl.this);
                }
            });
        }
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public boolean collapseActionView() {
        if((this.K & 8) == 0) {
            return false;
        }
        if(this.L == null) {
            return true;
        }
        return this.N == null || this.N.onMenuItemActionCollapse(this) ? this.y.g(this) : false;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.core.internal.view.SupportMenuItem
    public boolean d() {
        return !this.b() && !this.q();
    }

    public void e() {
        this.y.M(this);
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public boolean expandActionView() {
        if(!this.m()) {
            return false;
        }
        return this.N == null || this.N.onMenuItemActionExpand(this) ? this.y.n(this) : false;
    }

    private static void f(StringBuilder stringBuilder0, int v, int v1, String s) {
        if((v & v1) == v1) {
            stringBuilder0.append(s);
        }
    }

    private Drawable g(Drawable drawable0) {
        if(drawable0 != null && this.I && (this.G || this.H)) {
            drawable0 = DrawableCompat.r(drawable0).mutate();
            if(this.G) {
                DrawableCompat.o(drawable0, this.E);
            }
            if(this.H) {
                DrawableCompat.p(drawable0, this.F);
            }
            this.I = false;
        }
        return drawable0;
    }

    @Override  // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public View getActionView() {
        View view0 = this.L;
        if(view0 != null) {
            return view0;
        }
        ActionProvider actionProvider0 = this.M;
        if(actionProvider0 != null) {
            View view1 = actionProvider0.e(this);
            this.L = view1;
            return view1;
        }
        return null;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public int getAlphabeticModifiers() {
        return this.v;
    }

    @Override  // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.u;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public CharSequence getContentDescription() {
        return this.C;
    }

    @Override  // android.view.MenuItem
    public int getGroupId() {
        return this.m;
    }

    @Override  // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable0 = this.w;
        if(drawable0 != null) {
            return this.g(drawable0);
        }
        if(this.x != 0) {
            Drawable drawable1 = AppCompatResources.b(this.y.x(), this.x);
            this.x = 0;
            this.w = drawable1;
            return this.g(drawable1);
        }
        return null;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public ColorStateList getIconTintList() {
        return this.E;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.F;
    }

    @Override  // android.view.MenuItem
    public Intent getIntent() {
        return this.r;
    }

    @Override  // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.l;
    }

    @Override  // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.P;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public int getNumericModifiers() {
        return this.t;
    }

    @Override  // android.view.MenuItem
    public char getNumericShortcut() {
        return this.s;
    }

    @Override  // android.view.MenuItem
    public int getOrder() {
        return this.n;
    }

    @Override  // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.z;
    }

    @Override  // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.p;
    }

    @Override  // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.q == null ? this.p : this.q;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public CharSequence getTooltipText() {
        return this.D;
    }

    Runnable h() {
        return this.A;
    }

    @Override  // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.z != null;
    }

    public int i() {
        return this.o;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public boolean isActionViewExpanded() {
        return this.O;
    }

    @Override  // android.view.MenuItem
    public boolean isCheckable() {
        return (this.J & 1) == 1;
    }

    @Override  // android.view.MenuItem
    public boolean isChecked() {
        return (this.J & 2) == 2;
    }

    @Override  // android.view.MenuItem
    public boolean isEnabled() {
        return (this.J & 16) != 0;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.MenuItem
    public boolean isVisible() {
        return this.M == null || !this.M.h() ? (this.J & 8) == 0 : (this.J & 8) == 0 && this.M.c();
    }

    // 去混淆评级： 低(20)
    char j() {
        return this.y.K() ? this.u : this.s;
    }

    String k() {
        int v = this.j();
        if(v == 0) {
            return "";
        }
        Resources resources0 = this.y.x().getResources();
        StringBuilder stringBuilder0 = new StringBuilder();
        if(ViewConfiguration.get(this.y.x()).hasPermanentMenuKey()) {
            stringBuilder0.append(resources0.getString(string.abc_prepend_shortcut_label));
        }
        int v1 = this.y.K() ? this.v : this.t;
        MenuItemImpl.f(stringBuilder0, v1, 0x10000, resources0.getString(string.abc_menu_meta_shortcut_label));
        MenuItemImpl.f(stringBuilder0, v1, 0x1000, resources0.getString(string.abc_menu_ctrl_shortcut_label));
        MenuItemImpl.f(stringBuilder0, v1, 2, resources0.getString(string.abc_menu_alt_shortcut_label));
        MenuItemImpl.f(stringBuilder0, v1, 1, resources0.getString(string.abc_menu_shift_shortcut_label));
        MenuItemImpl.f(stringBuilder0, v1, 4, resources0.getString(string.abc_menu_sym_shortcut_label));
        MenuItemImpl.f(stringBuilder0, v1, 8, resources0.getString(string.abc_menu_function_shortcut_label));
        switch(v) {
            case 8: {
                stringBuilder0.append(resources0.getString(string.abc_menu_delete_shortcut_label));
                return stringBuilder0.toString();
            }
            case 10: {
                stringBuilder0.append(resources0.getString(string.abc_menu_enter_shortcut_label));
                return stringBuilder0.toString();
            }
            case 0x20: {
                stringBuilder0.append(resources0.getString(string.abc_menu_space_shortcut_label));
                return stringBuilder0.toString();
            }
            default: {
                stringBuilder0.append(((char)v));
                return stringBuilder0.toString();
            }
        }
    }

    CharSequence l(ItemView menuView$ItemView0) {
        return menuView$ItemView0 == null || !menuView$ItemView0.d() ? this.getTitle() : this.getTitleCondensed();
    }

    public boolean m() {
        if((this.K & 8) != 0) {
            if(this.L == null) {
                ActionProvider actionProvider0 = this.M;
                if(actionProvider0 != null) {
                    this.L = actionProvider0.e(this);
                }
            }
            return this.L != null;
        }
        return false;
    }

    public boolean n() {
        if(this.B != null && this.B.onMenuItemClick(this)) {
            return true;
        }
        if(this.y.i(this.y, this)) {
            return true;
        }
        Runnable runnable0 = this.A;
        if(runnable0 != null) {
            runnable0.run();
            return true;
        }
        if(this.r != null) {
            try {
                this.y.x().startActivity(this.r);
                return true;
            }
            catch(ActivityNotFoundException activityNotFoundException0) {
                Log.e("MenuItemImpl", "Can\'t find activity to handle intent; ignoring", activityNotFoundException0);
            }
        }
        return this.M != null && this.M.f();
    }

    public boolean o() {
        return (this.J & 0x20) == 0x20;
    }

    public boolean p() {
        return (this.J & 4) != 0;
    }

    public boolean q() {
        return (this.K & 1) == 1;
    }

    @NonNull
    public SupportMenuItem r(int v) {
        Context context0 = this.y.x();
        this.s(LayoutInflater.from(context0).inflate(v, new LinearLayout(context0), false));
        return this;
    }

    @NonNull
    public SupportMenuItem s(View view0) {
        this.L = view0;
        this.M = null;
        if(view0 != null && view0.getId() == -1) {
            int v = this.l;
            if(v > 0) {
                view0.setId(v);
            }
        }
        this.y.M(this);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider0) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setActionView(int v) {
        return this.r(v);
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setActionView(View view0) {
        return this.s(view0);
    }

    @Override  // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if(this.u == c) {
            return this;
        }
        this.u = Character.toLowerCase(c);
        this.y.O(false);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c, int v) {
        if(this.u == c && this.v == v) {
            return this;
        }
        this.u = Character.toLowerCase(c);
        this.v = KeyEvent.normalizeMetaState(v);
        this.y.O(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int v = this.J;
        int v1 = z | v & -2;
        this.J = v1;
        if(v != v1) {
            this.y.O(false);
        }
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if((this.J & 4) != 0) {
            this.y.b0(this);
            return this;
        }
        this.v(z);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setContentDescription(CharSequence charSequence0) {
        return this.setContentDescription(charSequence0);
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public SupportMenuItem setContentDescription(CharSequence charSequence0) {
        this.C = charSequence0;
        this.y.O(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if(z) {
            this.J |= 16;
        }
        else {
            this.J &= -17;
        }
        this.y.O(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(int v) {
        this.w = null;
        this.x = v;
        this.I = true;
        this.y.O(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable0) {
        this.x = 0;
        this.w = drawable0;
        this.I = true;
        this.y.O(false);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList0) {
        this.E = colorStateList0;
        this.G = true;
        this.I = true;
        this.y.O(false);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.F = porterDuff$Mode0;
        this.H = true;
        this.I = true;
        this.y.O(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIntent(Intent intent0) {
        this.r = intent0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if(this.s == c) {
            return this;
        }
        this.s = c;
        this.y.O(false);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c, int v) {
        if(this.s == c && this.t == v) {
            return this;
        }
        this.s = c;
        this.t = KeyEvent.normalizeMetaState(v);
        this.y.O(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
        this.N = menuItem$OnActionExpandListener0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
        this.B = menuItem$OnMenuItemClickListener0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setShortcut(char c, char c1) {
        this.s = c;
        this.u = Character.toLowerCase(c1);
        this.y.O(false);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setShortcut(char c, char c1, int v, int v1) {
        this.s = c;
        this.t = KeyEvent.normalizeMetaState(v);
        this.u = Character.toLowerCase(c1);
        this.v = KeyEvent.normalizeMetaState(v1);
        this.y.O(false);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public void setShowAsAction(int v) {
        if((v & 3) != 0 && (v & 3) != 1 && (v & 3) != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.K = v;
        this.y.M(this);
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setShowAsActionFlags(int v) {
        return this.z(v);
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(int v) {
        return this.setTitle(this.y.x().getString(v));
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence0) {
        this.p = charSequence0;
        this.y.O(false);
        SubMenuBuilder subMenuBuilder0 = this.z;
        if(subMenuBuilder0 != null) {
            subMenuBuilder0.setHeaderTitle(charSequence0);
        }
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence0) {
        this.q = charSequence0;
        this.y.O(false);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setTooltipText(CharSequence charSequence0) {
        return this.setTooltipText(charSequence0);
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public SupportMenuItem setTooltipText(CharSequence charSequence0) {
        this.D = charSequence0;
        this.y.O(false);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if(this.B(z)) {
            this.y.N(this);
        }
        return this;
    }

    public void t(boolean z) {
        this.O = z;
        this.y.O(false);
    }

    @Override
    public String toString() {
        return this.p == null ? null : this.p.toString();
    }

    public MenuItem u(Runnable runnable0) {
        this.A = runnable0;
        return this;
    }

    void v(boolean z) {
        int v = this.J;
        int v1 = (z ? 2 : 0) | v & -3;
        this.J = v1;
        if(v != v1) {
            this.y.O(false);
        }
    }

    public void w(boolean z) {
        this.J = (z ? 4 : 0) | this.J & -5;
    }

    public void x(boolean z) {
        if(z) {
            this.J |= 0x20;
            return;
        }
        this.J &= -33;
    }

    void y(ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0) {
        this.P = contextMenu$ContextMenuInfo0;
    }

    @NonNull
    public SupportMenuItem z(int v) {
        this.setShowAsAction(v);
        return this;
    }
}

