package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenuItem;

public final class MenuItemCompat {
    @RequiresApi(26)
    static class Api26Impl {
        static int a(MenuItem menuItem0) {
            return menuItem0.getAlphabeticModifiers();
        }

        static CharSequence b(MenuItem menuItem0) {
            return menuItem0.getContentDescription();
        }

        static ColorStateList c(MenuItem menuItem0) {
            return menuItem0.getIconTintList();
        }

        static PorterDuff.Mode d(MenuItem menuItem0) {
            return menuItem0.getIconTintMode();
        }

        static int e(MenuItem menuItem0) {
            return menuItem0.getNumericModifiers();
        }

        static CharSequence f(MenuItem menuItem0) {
            return menuItem0.getTooltipText();
        }

        static MenuItem g(MenuItem menuItem0, char c, int v) {
            return menuItem0.setAlphabeticShortcut(c, v);
        }

        static MenuItem h(MenuItem menuItem0, CharSequence charSequence0) {
            return menuItem0.setContentDescription(charSequence0);
        }

        static MenuItem i(MenuItem menuItem0, ColorStateList colorStateList0) {
            return menuItem0.setIconTintList(colorStateList0);
        }

        static MenuItem j(MenuItem menuItem0, PorterDuff.Mode porterDuff$Mode0) {
            return menuItem0.setIconTintMode(porterDuff$Mode0);
        }

        static MenuItem k(MenuItem menuItem0, char c, int v) {
            return menuItem0.setNumericShortcut(c, v);
        }

        static MenuItem l(MenuItem menuItem0, char c, char c1, int v, int v1) {
            return menuItem0.setShortcut(c, c1, v, v1);
        }

        static MenuItem m(MenuItem menuItem0, CharSequence charSequence0) {
            return menuItem0.setTooltipText(charSequence0);
        }
    }

    @Deprecated
    public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(MenuItem arg1);

        boolean onMenuItemActionExpand(MenuItem arg1);
    }

    private static final String a = "MenuItemCompat";
    @Deprecated
    public static final int b = 0;
    @Deprecated
    public static final int c = 1;
    @Deprecated
    public static final int d = 2;
    @Deprecated
    public static final int e = 4;
    @Deprecated
    public static final int f = 8;

    @ReplaceWith(expression = "item.collapseActionView()")
    @Deprecated
    public static boolean a(MenuItem menuItem0) {
        return menuItem0.collapseActionView();
    }

    @ReplaceWith(expression = "item.expandActionView()")
    @Deprecated
    public static boolean b(MenuItem menuItem0) {
        return menuItem0.expandActionView();
    }

    public static ActionProvider c(MenuItem menuItem0) {
        if(menuItem0 instanceof SupportMenuItem) {
            return ((SupportMenuItem)menuItem0).a();
        }
        Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @ReplaceWith(expression = "item.getActionView()")
    @Deprecated
    public static View d(MenuItem menuItem0) {
        return menuItem0.getActionView();
    }

    public static int e(MenuItem menuItem0) {
        if(menuItem0 instanceof SupportMenuItem) {
            return ((SupportMenuItem)menuItem0).getAlphabeticModifiers();
        }
        return Build.VERSION.SDK_INT < 26 ? 0 : Api26Impl.a(menuItem0);
    }

    public static CharSequence f(MenuItem menuItem0) {
        if(menuItem0 instanceof SupportMenuItem) {
            return ((SupportMenuItem)menuItem0).getContentDescription();
        }
        return Build.VERSION.SDK_INT < 26 ? null : Api26Impl.b(menuItem0);
    }

    public static ColorStateList g(MenuItem menuItem0) {
        if(menuItem0 instanceof SupportMenuItem) {
            return ((SupportMenuItem)menuItem0).getIconTintList();
        }
        return Build.VERSION.SDK_INT < 26 ? null : Api26Impl.c(menuItem0);
    }

    public static PorterDuff.Mode h(MenuItem menuItem0) {
        if(menuItem0 instanceof SupportMenuItem) {
            return ((SupportMenuItem)menuItem0).getIconTintMode();
        }
        return Build.VERSION.SDK_INT < 26 ? null : Api26Impl.d(menuItem0);
    }

    public static int i(MenuItem menuItem0) {
        if(menuItem0 instanceof SupportMenuItem) {
            return ((SupportMenuItem)menuItem0).getNumericModifiers();
        }
        return Build.VERSION.SDK_INT < 26 ? 0 : Api26Impl.e(menuItem0);
    }

    public static CharSequence j(MenuItem menuItem0) {
        if(menuItem0 instanceof SupportMenuItem) {
            return ((SupportMenuItem)menuItem0).getTooltipText();
        }
        return Build.VERSION.SDK_INT < 26 ? null : Api26Impl.f(menuItem0);
    }

    @ReplaceWith(expression = "item.isActionViewExpanded()")
    @Deprecated
    public static boolean k(MenuItem menuItem0) {
        return menuItem0.isActionViewExpanded();
    }

    public static MenuItem l(MenuItem menuItem0, ActionProvider actionProvider0) {
        if(menuItem0 instanceof SupportMenuItem) {
            return ((SupportMenuItem)menuItem0).c(actionProvider0);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem0;
    }

    @ReplaceWith(expression = "item.setActionView(resId)")
    @Deprecated
    public static MenuItem m(MenuItem menuItem0, int v) {
        return menuItem0.setActionView(v);
    }

    @ReplaceWith(expression = "item.setActionView(view)")
    @Deprecated
    public static MenuItem n(MenuItem menuItem0, View view0) {
        return menuItem0.setActionView(view0);
    }

    public static void o(MenuItem menuItem0, char c, int v) {
        if(menuItem0 instanceof SupportMenuItem) {
            ((SupportMenuItem)menuItem0).setAlphabeticShortcut(c, v);
            return;
        }
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.g(menuItem0, c, v);
        }
    }

    public static void p(MenuItem menuItem0, CharSequence charSequence0) {
        if(menuItem0 instanceof SupportMenuItem) {
            ((SupportMenuItem)menuItem0).setContentDescription(charSequence0);
            return;
        }
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.h(menuItem0, charSequence0);
        }
    }

    public static void q(MenuItem menuItem0, ColorStateList colorStateList0) {
        if(menuItem0 instanceof SupportMenuItem) {
            ((SupportMenuItem)menuItem0).setIconTintList(colorStateList0);
            return;
        }
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.i(menuItem0, colorStateList0);
        }
    }

    public static void r(MenuItem menuItem0, PorterDuff.Mode porterDuff$Mode0) {
        if(menuItem0 instanceof SupportMenuItem) {
            ((SupportMenuItem)menuItem0).setIconTintMode(porterDuff$Mode0);
            return;
        }
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.j(menuItem0, porterDuff$Mode0);
        }
    }

    public static void s(MenuItem menuItem0, char c, int v) {
        if(menuItem0 instanceof SupportMenuItem) {
            ((SupportMenuItem)menuItem0).setNumericShortcut(c, v);
            return;
        }
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.k(menuItem0, c, v);
        }
    }

    @Deprecated
    public static MenuItem t(MenuItem menuItem0, OnActionExpandListener menuItemCompat$OnActionExpandListener0) {
        return menuItem0.setOnActionExpandListener(new MenuItem.OnActionExpandListener() {
            @Override  // android.view.MenuItem$OnActionExpandListener
            public boolean onMenuItemActionCollapse(MenuItem menuItem0) {
                return menuItemCompat$OnActionExpandListener0.onMenuItemActionCollapse(menuItem0);
            }

            @Override  // android.view.MenuItem$OnActionExpandListener
            public boolean onMenuItemActionExpand(MenuItem menuItem0) {
                return menuItemCompat$OnActionExpandListener0.onMenuItemActionExpand(menuItem0);
            }
        });
    }

    public static void u(MenuItem menuItem0, char c, char c1, int v, int v1) {
        if(menuItem0 instanceof SupportMenuItem) {
            ((SupportMenuItem)menuItem0).setShortcut(c, c1, v, v1);
            return;
        }
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.l(menuItem0, c, c1, v, v1);
        }
    }

    @ReplaceWith(expression = "item.setShowAsAction(actionEnum)")
    @Deprecated
    public static void v(MenuItem menuItem0, int v) {
        menuItem0.setShowAsAction(v);
    }

    public static void w(MenuItem menuItem0, CharSequence charSequence0) {
        if(menuItem0 instanceof SupportMenuItem) {
            ((SupportMenuItem)menuItem0).setTooltipText(charSequence0);
            return;
        }
        if(Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m(menuItem0, charSequence0);
        }
    }
}

