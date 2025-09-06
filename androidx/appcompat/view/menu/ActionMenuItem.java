package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;

@RestrictTo({Scope.c})
public class ActionMenuItem implements SupportMenuItem {
    private ColorStateList A;
    private PorterDuff.Mode B;
    private boolean C;
    private boolean D;
    private int E;
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 4;
    private static final int I = 8;
    private static final int J = 16;
    private final int l;
    private final int m;
    private final int n;
    private CharSequence o;
    private CharSequence p;
    private Intent q;
    private char r;
    private int s;
    private char t;
    private int u;
    private Drawable v;
    private Context w;
    private MenuItem.OnMenuItemClickListener x;
    private CharSequence y;
    private CharSequence z;

    public ActionMenuItem(Context context0, int v, int v1, int v2, int v3, CharSequence charSequence0) {
        this.s = 0x1000;
        this.u = 0x1000;
        this.A = null;
        this.B = null;
        this.C = false;
        this.D = false;
        this.E = 16;
        this.w = context0;
        this.l = v1;
        this.m = v;
        this.n = v3;
        this.o = charSequence0;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public ActionProvider a() {
        return null;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public boolean b() {
        return true;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public SupportMenuItem c(ActionProvider actionProvider0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public boolean d() {
        return false;
    }

    private void e() {
        Drawable drawable0 = this.v;
        if(drawable0 != null && (this.C || this.D)) {
            Drawable drawable1 = DrawableCompat.r(drawable0);
            this.v = drawable1;
            Drawable drawable2 = drawable1.mutate();
            this.v = drawable2;
            if(this.C) {
                DrawableCompat.o(drawable2, this.A);
            }
            if(this.D) {
                DrawableCompat.p(this.v, this.B);
            }
        }
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public boolean expandActionView() {
        return false;
    }

    public boolean f() {
        if(this.x != null && this.x.onMenuItemClick(this)) {
            return true;
        }
        Intent intent0 = this.q;
        if(intent0 != null) {
            this.w.startActivity(intent0);
            return true;
        }
        return false;
    }

    @NonNull
    public SupportMenuItem g(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public View getActionView() {
        return null;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public int getAlphabeticModifiers() {
        return this.u;
    }

    @Override  // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.t;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public CharSequence getContentDescription() {
        return this.y;
    }

    @Override  // android.view.MenuItem
    public int getGroupId() {
        return this.m;
    }

    @Override  // android.view.MenuItem
    public Drawable getIcon() {
        return this.v;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public ColorStateList getIconTintList() {
        return this.A;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.B;
    }

    @Override  // android.view.MenuItem
    public Intent getIntent() {
        return this.q;
    }

    @Override  // android.view.MenuItem
    public int getItemId() {
        return this.l;
    }

    @Override  // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public int getNumericModifiers() {
        return this.s;
    }

    @Override  // android.view.MenuItem
    public char getNumericShortcut() {
        return this.r;
    }

    @Override  // android.view.MenuItem
    public int getOrder() {
        return this.n;
    }

    @Override  // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override  // android.view.MenuItem
    public CharSequence getTitle() {
        return this.o;
    }

    @Override  // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.p == null ? this.o : this.p;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public CharSequence getTooltipText() {
        return this.z;
    }

    @NonNull
    public SupportMenuItem h(View view0) {
        throw new UnsupportedOperationException();
    }

    @Override  // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    public ActionMenuItem i(boolean z) {
        this.E = (z ? 4 : 0) | this.E & -5;
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override  // android.view.MenuItem
    public boolean isCheckable() {
        return (this.E & 1) != 0;
    }

    @Override  // android.view.MenuItem
    public boolean isChecked() {
        return (this.E & 2) != 0;
    }

    @Override  // android.view.MenuItem
    public boolean isEnabled() {
        return (this.E & 16) != 0;
    }

    @Override  // android.view.MenuItem
    public boolean isVisible() {
        return (this.E & 8) == 0;
    }

    @NonNull
    public SupportMenuItem j(int v) {
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setActionView(int v) {
        return this.g(v);
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setActionView(View view0) {
        return this.h(view0);
    }

    @Override  // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.t = Character.toLowerCase(c);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c, int v) {
        this.t = Character.toLowerCase(c);
        this.u = KeyEvent.normalizeMetaState(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.E = z | this.E & -2;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.E = (z ? 2 : 0) | this.E & -3;
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
        this.y = charSequence0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.E = (z ? 16 : 0) | this.E & -17;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(int v) {
        this.v = ContextCompat.getDrawable(this.w, v);
        this.e();
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable0) {
        this.v = drawable0;
        this.e();
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList0) {
        this.A = colorStateList0;
        this.C = true;
        this.e();
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.B = porterDuff$Mode0;
        this.D = true;
        this.e();
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIntent(Intent intent0) {
        this.q = intent0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.r = c;
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c, int v) {
        this.r = c;
        this.s = KeyEvent.normalizeMetaState(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
        throw new UnsupportedOperationException();
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
        this.x = menuItem$OnMenuItemClickListener0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setShortcut(char c, char c1) {
        this.r = c;
        this.t = Character.toLowerCase(c1);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setShortcut(char c, char c1, int v, int v1) {
        this.r = c;
        this.s = KeyEvent.normalizeMetaState(v);
        this.t = Character.toLowerCase(c1);
        this.u = KeyEvent.normalizeMetaState(v1);
        return this;
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    public void setShowAsAction(int v) {
    }

    @Override  // androidx.core.internal.view.SupportMenuItem
    @NonNull
    public MenuItem setShowAsActionFlags(int v) {
        return this.j(v);
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(int v) {
        this.o = this.w.getResources().getString(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence0) {
        this.o = charSequence0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence0) {
        this.p = charSequence0;
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
        this.z = charSequence0;
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        int v = 8;
        int v1 = this.E & 8;
        if(z) {
            v = 0;
        }
        this.E = v1 | v;
        return this;
    }
}

