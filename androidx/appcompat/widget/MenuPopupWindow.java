package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.appcompat.view.menu.MenuBuilder;
import java.lang.reflect.Method;

@RestrictTo({Scope.c})
public class MenuPopupWindow extends ListPopupWindow implements MenuItemHoverListener {
    @RequiresApi(23)
    static class Api23Impl {
        @DoNotInline
        static void a(PopupWindow popupWindow0, Transition transition0) {
            popupWindow0.setEnterTransition(transition0);
        }

        @DoNotInline
        static void b(PopupWindow popupWindow0, Transition transition0) {
            popupWindow0.setExitTransition(transition0);
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        @DoNotInline
        static void a(PopupWindow popupWindow0, boolean z) {
            popupWindow0.setTouchModal(z);
        }
    }

    @RestrictTo({Scope.c})
    public static class MenuDropDownListView extends DropDownListView {
        final int p;
        final int q;
        private MenuItemHoverListener r;
        private MenuItem s;

        public MenuDropDownListView(Context context0, boolean z) {
            super(context0, z);
            if(1 == context0.getResources().getConfiguration().getLayoutDirection()) {
                this.p = 21;
                this.q = 22;
                return;
            }
            this.p = 22;
            this.q = 21;
        }

        @Override  // androidx.appcompat.widget.DropDownListView
        public int d(int v, boolean z) {
            return super.d(v, z);
        }

        @Override  // androidx.appcompat.widget.DropDownListView
        public int e(int v, int v1, int v2, int v3, int v4) {
            return super.e(v, v1, v2, v3, v4);
        }

        @Override  // androidx.appcompat.widget.DropDownListView
        public boolean f(MotionEvent motionEvent0, int v) {
            return super.f(motionEvent0, v);
        }

        @Override  // androidx.appcompat.widget.DropDownListView
        public boolean hasFocus() {
            return super.hasFocus();
        }

        @Override  // androidx.appcompat.widget.DropDownListView
        public boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override  // androidx.appcompat.widget.DropDownListView
        public boolean isFocused() {
            return super.isFocused();
        }

        @Override  // androidx.appcompat.widget.DropDownListView
        public boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override  // androidx.appcompat.widget.DropDownListView
        public boolean onHoverEvent(MotionEvent motionEvent0) {
            MenuItem menuItem0;
            MenuAdapter menuAdapter0;
            int v;
            if(this.r != null) {
                ListAdapter listAdapter0 = this.getAdapter();
                if(listAdapter0 instanceof HeaderViewListAdapter) {
                    v = ((HeaderViewListAdapter)listAdapter0).getHeadersCount();
                    menuAdapter0 = (MenuAdapter)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter();
                }
                else {
                    menuAdapter0 = (MenuAdapter)listAdapter0;
                    v = 0;
                }
                if(motionEvent0.getAction() == 10) {
                    menuItem0 = null;
                }
                else {
                    int v1 = this.pointToPosition(((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
                    if(v1 == -1) {
                        menuItem0 = null;
                    }
                    else {
                        int v2 = v1 - v;
                        menuItem0 = v2 < 0 || v2 >= menuAdapter0.getCount() ? null : menuAdapter0.d(v2);
                    }
                }
                MenuItem menuItem1 = this.s;
                if(menuItem1 != menuItem0) {
                    MenuBuilder menuBuilder0 = menuAdapter0.b();
                    if(menuItem1 != null) {
                        this.r.i(menuBuilder0, menuItem1);
                    }
                    this.s = menuItem0;
                    if(menuItem0 != null) {
                        this.r.c(menuBuilder0, menuItem0);
                    }
                }
            }
            return super.onHoverEvent(motionEvent0);
        }

        @Override  // android.widget.ListView
        public boolean onKeyDown(int v, KeyEvent keyEvent0) {
            ListMenuItemView listMenuItemView0 = (ListMenuItemView)this.getSelectedView();
            if(listMenuItemView0 != null && v == this.p) {
                if(listMenuItemView0.isEnabled() && listMenuItemView0.getItemData().hasSubMenu()) {
                    this.performItemClick(listMenuItemView0, this.getSelectedItemPosition(), this.getSelectedItemId());
                }
                return true;
            }
            if(listMenuItemView0 != null && v == this.q) {
                this.setSelection(-1);
                ListAdapter listAdapter0 = this.getAdapter();
                (listAdapter0 instanceof HeaderViewListAdapter ? ((MenuAdapter)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter()) : ((MenuAdapter)listAdapter0)).b().f(false);
                return true;
            }
            return super.onKeyDown(v, keyEvent0);
        }

        @Override  // androidx.appcompat.widget.DropDownListView
        public boolean onTouchEvent(MotionEvent motionEvent0) {
            return super.onTouchEvent(motionEvent0);
        }

        public void p() {
            this.setSelection(-1);
        }

        public void setHoverListener(MenuItemHoverListener menuItemHoverListener0) {
            this.r = menuItemHoverListener0;
        }

        @Override  // androidx.appcompat.widget.DropDownListView
        public void setSelector(Drawable drawable0) {
            super.setSelector(drawable0);
        }
    }

    private static final String M8 = "MenuPopupWindow";
    private static Method N8;
    private MenuItemHoverListener Z;

    static {
        if(Build.VERSION.SDK_INT <= 28) {
            try {
                MenuPopupWindow.N8 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
            catch(NoSuchMethodException unused_ex) {
                Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    public MenuPopupWindow(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
    }

    @Override  // androidx.appcompat.widget.MenuItemHoverListener
    public void c(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
        MenuItemHoverListener menuItemHoverListener0 = this.Z;
        if(menuItemHoverListener0 != null) {
            menuItemHoverListener0.c(menuBuilder0, menuItem0);
        }
    }

    @Override  // androidx.appcompat.widget.MenuItemHoverListener
    public void i(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
        MenuItemHoverListener menuItemHoverListener0 = this.Z;
        if(menuItemHoverListener0 != null) {
            menuItemHoverListener0.i(menuBuilder0, menuItem0);
        }
    }

    public void o0(Object object0) {
        if(Build.VERSION.SDK_INT >= 23) {
            Api23Impl.a(this.F, ((Transition)object0));
        }
    }

    public void p0(Object object0) {
        if(Build.VERSION.SDK_INT >= 23) {
            Api23Impl.b(this.F, ((Transition)object0));
        }
    }

    public void q0(MenuItemHoverListener menuItemHoverListener0) {
        this.Z = menuItemHoverListener0;
    }

    public void r0(boolean z) {
        if(Build.VERSION.SDK_INT <= 28) {
            Method method0 = MenuPopupWindow.N8;
            if(method0 != null) {
                try {
                    method0.invoke(this.F, Boolean.valueOf(z));
                }
                catch(Exception unused_ex) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        }
        else {
            Api29Impl.a(this.F, z);
        }
    }

    @Override  // androidx.appcompat.widget.ListPopupWindow
    @NonNull
    DropDownListView t(Context context0, boolean z) {
        DropDownListView dropDownListView0 = new MenuDropDownListView(context0, z);
        ((MenuDropDownListView)dropDownListView0).setHoverListener(this);
        return dropDownListView0;
    }
}

