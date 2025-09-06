package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({Scope.c})
public abstract class BaseMenuPresenter implements MenuPresenter {
    protected Context a;
    protected Context b;
    protected MenuBuilder c;
    protected LayoutInflater d;
    protected LayoutInflater e;
    private Callback f;
    private int g;
    private int h;
    protected MenuView i;
    private int j;

    public BaseMenuPresenter(Context context0, int v, int v1) {
        this.a = context0;
        this.d = LayoutInflater.from(context0);
        this.g = v;
        this.h = v1;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void c(MenuBuilder menuBuilder0, boolean z) {
        Callback menuPresenter$Callback0 = this.f;
        if(menuPresenter$Callback0 != null) {
            menuPresenter$Callback0.c(menuBuilder0, z);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean e(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void f(boolean z) {
        ViewGroup viewGroup0 = (ViewGroup)this.i;
        if(viewGroup0 == null) {
            return;
        }
        MenuBuilder menuBuilder0 = this.c;
        int v = 0;
        if(menuBuilder0 != null) {
            menuBuilder0.u();
            ArrayList arrayList0 = this.c.H();
            int v1 = arrayList0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                MenuItemImpl menuItemImpl0 = (MenuItemImpl)arrayList0.get(v2);
                if(this.t(v3, menuItemImpl0)) {
                    View view0 = viewGroup0.getChildAt(v3);
                    MenuItemImpl menuItemImpl1 = view0 instanceof ItemView ? ((ItemView)view0).getItemData() : null;
                    View view1 = this.r(menuItemImpl0, view0, viewGroup0);
                    if(menuItemImpl0 != menuItemImpl1) {
                        view1.setPressed(false);
                        view1.jumpDrawablesToCurrentState();
                    }
                    if(view1 != view0) {
                        this.j(view1, v3);
                    }
                    ++v3;
                }
            }
            v = v3;
        }
        while(v < viewGroup0.getChildCount()) {
            if(!this.p(viewGroup0, v)) {
                ++v;
            }
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean g() {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.j;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean h(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void i(Context context0, MenuBuilder menuBuilder0) {
        this.b = context0;
        this.e = LayoutInflater.from(context0);
        this.c = menuBuilder0;
    }

    protected void j(View view0, int v) {
        ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
        if(viewGroup0 != null) {
            viewGroup0.removeView(view0);
        }
        ((ViewGroup)this.i).addView(view0, v);
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void k(Callback menuPresenter$Callback0) {
        this.f = menuPresenter$Callback0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean l(SubMenuBuilder subMenuBuilder0) {
        Callback menuPresenter$Callback0 = this.f;
        if(menuPresenter$Callback0 != null) {
            if(subMenuBuilder0 == null) {
                subMenuBuilder0 = this.c;
            }
            return menuPresenter$Callback0.d(subMenuBuilder0);
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public MenuView m(ViewGroup viewGroup0) {
        if(this.i == null) {
            MenuView menuView0 = (MenuView)this.d.inflate(this.g, viewGroup0, false);
            this.i = menuView0;
            menuView0.a(this.c);
            this.f(true);
        }
        return this.i;
    }

    public abstract void n(MenuItemImpl arg1, ItemView arg2);

    public ItemView o(ViewGroup viewGroup0) {
        return (ItemView)this.d.inflate(this.h, viewGroup0, false);
    }

    protected boolean p(ViewGroup viewGroup0, int v) {
        viewGroup0.removeViewAt(v);
        return true;
    }

    public Callback q() {
        return this.f;
    }

    public View r(MenuItemImpl menuItemImpl0, View view0, ViewGroup viewGroup0) {
        ItemView menuView$ItemView0 = view0 instanceof ItemView ? ((ItemView)view0) : this.o(viewGroup0);
        this.n(menuItemImpl0, menuView$ItemView0);
        return (View)menuView$ItemView0;
    }

    public void s(int v) {
        this.j = v;
    }

    public boolean t(int v, MenuItemImpl menuItemImpl0) {
        return true;
    }
}

