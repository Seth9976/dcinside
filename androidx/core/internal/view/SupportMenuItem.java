package androidx.core.internal.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ActionProvider;

@RestrictTo({Scope.c})
public interface SupportMenuItem extends MenuItem {
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 4;
    public static final int k = 8;

    ActionProvider a();

    boolean b();

    SupportMenuItem c(ActionProvider arg1);

    @Override  // android.view.MenuItem
    boolean collapseActionView();

    boolean d();

    @Override  // android.view.MenuItem
    boolean expandActionView();

    @Override  // android.view.MenuItem
    View getActionView();

    @Override  // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override  // android.view.MenuItem
    CharSequence getContentDescription();

    @Override  // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override  // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override  // android.view.MenuItem
    int getNumericModifiers();

    @Override  // android.view.MenuItem
    CharSequence getTooltipText();

    @Override  // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override  // android.view.MenuItem
    MenuItem setActionView(int arg1);

    @Override  // android.view.MenuItem
    MenuItem setActionView(View arg1);

    @Override  // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char arg1, int arg2);

    @Override  // android.view.MenuItem
    MenuItem setContentDescription(CharSequence arg1);

    SupportMenuItem setContentDescription(CharSequence arg1);

    @Override  // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList arg1);

    @Override  // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode arg1);

    @Override  // android.view.MenuItem
    MenuItem setNumericShortcut(char arg1, int arg2);

    @Override  // android.view.MenuItem
    MenuItem setShortcut(char arg1, char arg2, int arg3, int arg4);

    @Override  // android.view.MenuItem
    void setShowAsAction(int arg1);

    @Override  // android.view.MenuItem
    MenuItem setShowAsActionFlags(int arg1);

    @Override  // android.view.MenuItem
    MenuItem setTooltipText(CharSequence arg1);

    SupportMenuItem setTooltipText(CharSequence arg1);
}

