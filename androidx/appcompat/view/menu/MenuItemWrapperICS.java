package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider.VisibilityListener;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider.VisibilityListener;
import androidx.core.view.ActionProvider;
import java.lang.reflect.Method;

@RestrictTo({Scope.c})
public class MenuItemWrapperICS extends BaseMenuWrapper implements MenuItem {
    class ActionProviderWrapper extends ActionProvider implements ActionProvider.VisibilityListener {
        private VisibilityListener e;
        private final android.view.ActionProvider f;
        final MenuItemWrapperICS g;

        ActionProviderWrapper(Context context0, android.view.ActionProvider actionProvider0) {
            super(context0);
            this.f = actionProvider0;
        }

        @Override  // androidx.core.view.ActionProvider
        public boolean b() {
            return this.f.hasSubMenu();
        }

        @Override  // androidx.core.view.ActionProvider
        public boolean c() {
            return this.f.isVisible();
        }

        @Override  // androidx.core.view.ActionProvider
        @NonNull
        public View d() {
            return this.f.onCreateActionView();
        }

        @Override  // androidx.core.view.ActionProvider
        public View e(MenuItem menuItem0) {
            return this.f.onCreateActionView(menuItem0);
        }

        @Override  // androidx.core.view.ActionProvider
        public boolean f() {
            return this.f.onPerformDefaultAction();
        }

        @Override  // androidx.core.view.ActionProvider
        public void g(SubMenu subMenu0) {
            SubMenu subMenu1 = MenuItemWrapperICS.this.f(subMenu0);
            this.f.onPrepareSubMenu(subMenu1);
        }

        @Override  // androidx.core.view.ActionProvider
        public boolean h() {
            return this.f.overridesItemVisibility();
        }

        @Override  // androidx.core.view.ActionProvider
        public void i() {
            this.f.refreshVisibility();
        }

        @Override  // androidx.core.view.ActionProvider
        public void l(VisibilityListener actionProvider$VisibilityListener0) {
            this.e = actionProvider$VisibilityListener0;
            this.f.setVisibilityListener((actionProvider$VisibilityListener0 == null ? null : this));
        }

        @Override  // android.view.ActionProvider$VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            VisibilityListener actionProvider$VisibilityListener0 = this.e;
            if(actionProvider$VisibilityListener0 != null) {
                actionProvider$VisibilityListener0.onActionProviderVisibilityChanged(z);
            }
        }
    }

    static class CollapsibleActionViewWrapper extends FrameLayout implements CollapsibleActionView {
        final android.view.CollapsibleActionView a;

        CollapsibleActionViewWrapper(View view0) {
            super(view0.getContext());
            this.a = (android.view.CollapsibleActionView)view0;
            this.addView(view0);
        }

        View a() {
            return (View)this.a;
        }

        @Override  // androidx.appcompat.view.CollapsibleActionView
        public void b() {
            this.a.onActionViewCollapsed();
        }

        @Override  // androidx.appcompat.view.CollapsibleActionView
        public void c() {
            this.a.onActionViewExpanded();
        }
    }

    class OnActionExpandListenerWrapper implements MenuItem.OnActionExpandListener {
        private final MenuItem.OnActionExpandListener a;
        final MenuItemWrapperICS b;

        OnActionExpandListenerWrapper(MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
            this.a = menuItem$OnActionExpandListener0;
        }

        @Override  // android.view.MenuItem$OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem0) {
            MenuItem menuItem1 = MenuItemWrapperICS.this.e(menuItem0);
            return this.a.onMenuItemActionCollapse(menuItem1);
        }

        @Override  // android.view.MenuItem$OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem0) {
            MenuItem menuItem1 = MenuItemWrapperICS.this.e(menuItem0);
            return this.a.onMenuItemActionExpand(menuItem1);
        }
    }

    class OnMenuItemClickListenerWrapper implements MenuItem.OnMenuItemClickListener {
        private final MenuItem.OnMenuItemClickListener a;
        final MenuItemWrapperICS b;

        OnMenuItemClickListenerWrapper(MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
            this.a = menuItem$OnMenuItemClickListener0;
        }

        @Override  // android.view.MenuItem$OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem0) {
            MenuItem menuItem1 = MenuItemWrapperICS.this.e(menuItem0);
            return this.a.onMenuItemClick(menuItem1);
        }
    }

    private final SupportMenuItem o;
    private Method p;
    static final String q = "MenuItemWrapper";

    public MenuItemWrapperICS(Context context0, SupportMenuItem supportMenuItem0) {
        super(context0);
        if(supportMenuItem0 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.o = supportMenuItem0;
    }

    @Override  // android.view.MenuItem
    public boolean collapseActionView() {
        return this.o.collapseActionView();
    }

    @Override  // android.view.MenuItem
    public boolean expandActionView() {
        return this.o.expandActionView();
    }

    @Override  // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        ActionProvider actionProvider0 = this.o.a();
        return actionProvider0 instanceof ActionProviderWrapper ? ((ActionProviderWrapper)actionProvider0).f : null;
    }

    @Override  // android.view.MenuItem
    public View getActionView() {
        View view0 = this.o.getActionView();
        return view0 instanceof CollapsibleActionViewWrapper ? ((CollapsibleActionViewWrapper)view0).a() : view0;
    }

    @Override  // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.o.getAlphabeticModifiers();
    }

    @Override  // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.o.getAlphabeticShortcut();
    }

    @Override  // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.o.getContentDescription();
    }

    @Override  // android.view.MenuItem
    public int getGroupId() {
        return this.o.getGroupId();
    }

    @Override  // android.view.MenuItem
    public Drawable getIcon() {
        return this.o.getIcon();
    }

    @Override  // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.o.getIconTintList();
    }

    @Override  // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.o.getIconTintMode();
    }

    @Override  // android.view.MenuItem
    public Intent getIntent() {
        return this.o.getIntent();
    }

    @Override  // android.view.MenuItem
    public int getItemId() {
        return this.o.getItemId();
    }

    @Override  // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.o.getMenuInfo();
    }

    @Override  // android.view.MenuItem
    public int getNumericModifiers() {
        return this.o.getNumericModifiers();
    }

    @Override  // android.view.MenuItem
    public char getNumericShortcut() {
        return this.o.getNumericShortcut();
    }

    @Override  // android.view.MenuItem
    public int getOrder() {
        return this.o.getOrder();
    }

    @Override  // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f(this.o.getSubMenu());
    }

    @Override  // android.view.MenuItem
    public CharSequence getTitle() {
        return this.o.getTitle();
    }

    @Override  // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.o.getTitleCondensed();
    }

    @Override  // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.o.getTooltipText();
    }

    @Override  // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.o.hasSubMenu();
    }

    @Override  // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.o.isActionViewExpanded();
    }

    @Override  // android.view.MenuItem
    public boolean isCheckable() {
        return this.o.isCheckable();
    }

    @Override  // android.view.MenuItem
    public boolean isChecked() {
        return this.o.isChecked();
    }

    @Override  // android.view.MenuItem
    public boolean isEnabled() {
        return this.o.isEnabled();
    }

    @Override  // android.view.MenuItem
    public boolean isVisible() {
        return this.o.isVisible();
    }

    public void j(boolean z) {
        try {
            if(this.p == null) {
                this.p = this.o.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.p.invoke(this.o, Boolean.valueOf(z));
            return;
        }
        catch(Exception exception0) {
        }
        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", exception0);
    }

    @Override  // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider0) {
        ActionProviderWrapper menuItemWrapperICS$ActionProviderWrapper0 = new ActionProviderWrapper(this, this.l, actionProvider0);
        SupportMenuItem supportMenuItem0 = this.o;
        if(actionProvider0 == null) {
            menuItemWrapperICS$ActionProviderWrapper0 = null;
        }
        supportMenuItem0.c(menuItemWrapperICS$ActionProviderWrapper0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setActionView(int v) {
        this.o.setActionView(v);
        View view0 = this.o.getActionView();
        if(view0 instanceof android.view.CollapsibleActionView) {
            CollapsibleActionViewWrapper menuItemWrapperICS$CollapsibleActionViewWrapper0 = new CollapsibleActionViewWrapper(view0);
            this.o.setActionView(menuItemWrapperICS$CollapsibleActionViewWrapper0);
        }
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setActionView(View view0) {
        if(view0 instanceof android.view.CollapsibleActionView) {
            view0 = new CollapsibleActionViewWrapper(view0);
        }
        this.o.setActionView(view0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.o.setAlphabeticShortcut(c);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int v) {
        this.o.setAlphabeticShortcut(c, v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.o.setCheckable(z);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.o.setChecked(z);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence0) {
        this.o.setContentDescription(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.o.setEnabled(z);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(int v) {
        this.o.setIcon(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable0) {
        this.o.setIcon(drawable0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList0) {
        this.o.setIconTintList(colorStateList0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.o.setIconTintMode(porterDuff$Mode0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setIntent(Intent intent0) {
        this.o.setIntent(intent0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.o.setNumericShortcut(c);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int v) {
        this.o.setNumericShortcut(c, v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
        OnActionExpandListenerWrapper menuItemWrapperICS$OnActionExpandListenerWrapper0 = menuItem$OnActionExpandListener0 == null ? null : new OnActionExpandListenerWrapper(this, menuItem$OnActionExpandListener0);
        this.o.setOnActionExpandListener(menuItemWrapperICS$OnActionExpandListenerWrapper0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
        OnMenuItemClickListenerWrapper menuItemWrapperICS$OnMenuItemClickListenerWrapper0 = menuItem$OnMenuItemClickListener0 == null ? null : new OnMenuItemClickListenerWrapper(this, menuItem$OnMenuItemClickListener0);
        this.o.setOnMenuItemClickListener(menuItemWrapperICS$OnMenuItemClickListenerWrapper0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setShortcut(char c, char c1) {
        this.o.setShortcut(c, c1);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setShortcut(char c, char c1, int v, int v1) {
        this.o.setShortcut(c, c1, v, v1);
        return this;
    }

    @Override  // android.view.MenuItem
    public void setShowAsAction(int v) {
        this.o.setShowAsAction(v);
    }

    @Override  // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int v) {
        this.o.setShowAsActionFlags(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(int v) {
        this.o.setTitle(v);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence0) {
        this.o.setTitle(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence0) {
        this.o.setTitleCondensed(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence0) {
        this.o.setTooltipText(charSequence0);
        return this;
    }

    @Override  // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.o.setVisible(z);
    }
}

