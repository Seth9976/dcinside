package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.layout;
import java.util.ArrayList;

@RestrictTo({Scope.c})
public class ListMenuPresenter implements AdapterView.OnItemClickListener, MenuPresenter {
    class MenuAdapter extends BaseAdapter {
        private int a;
        final ListMenuPresenter b;

        public MenuAdapter() {
            this.a = -1;
            this.a();
        }

        void a() {
            MenuItemImpl menuItemImpl0 = ListMenuPresenter.this.c.y();
            if(menuItemImpl0 != null) {
                ArrayList arrayList0 = ListMenuPresenter.this.c.C();
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(((MenuItemImpl)arrayList0.get(v1)) == menuItemImpl0) {
                        this.a = v1;
                        return;
                    }
                }
            }
            this.a = -1;
        }

        public MenuItemImpl b(int v) {
            ArrayList arrayList0 = ListMenuPresenter.this.c.C();
            int v1 = v + ListMenuPresenter.this.e;
            return (MenuItemImpl)arrayList0.get((this.a < 0 || v1 < this.a ? v + ListMenuPresenter.this.e : v1 + 1));
        }

        @Override  // android.widget.Adapter
        public int getCount() {
            int v = ListMenuPresenter.this.c.C().size() - ListMenuPresenter.this.e;
            return this.a >= 0 ? v - 1 : v;
        }

        @Override  // android.widget.Adapter
        public Object getItem(int v) {
            return this.b(v);
        }

        @Override  // android.widget.Adapter
        public long getItemId(int v) {
            return (long)v;
        }

        @Override  // android.widget.Adapter
        public View getView(int v, View view0, ViewGroup viewGroup0) {
            if(view0 == null) {
                view0 = ListMenuPresenter.this.b.inflate(ListMenuPresenter.this.g, viewGroup0, false);
            }
            ((ItemView)view0).f(this.b(v), 0);
            return view0;
        }

        @Override  // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            this.a();
            super.notifyDataSetChanged();
        }
    }

    Context a;
    LayoutInflater b;
    MenuBuilder c;
    ExpandedMenuView d;
    int e;
    int f;
    int g;
    private Callback h;
    MenuAdapter i;
    private int j;
    private static final String k = "ListMenuPresenter";
    public static final String l = "android:menu:list";

    public ListMenuPresenter(int v, int v1) {
        this.g = v;
        this.f = v1;
    }

    public ListMenuPresenter(Context context0, int v) {
        this(v, 0);
        this.a = context0;
        this.b = LayoutInflater.from(context0);
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable a() {
        if(this.d == null) {
            return null;
        }
        Parcelable parcelable0 = new Bundle();
        this.o(((Bundle)parcelable0));
        return parcelable0;
    }

    public ListAdapter b() {
        if(this.i == null) {
            this.i = new MenuAdapter(this);
        }
        return this.i;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void c(MenuBuilder menuBuilder0, boolean z) {
        Callback menuPresenter$Callback0 = this.h;
        if(menuPresenter$Callback0 != null) {
            menuPresenter$Callback0.c(menuBuilder0, z);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void d(Parcelable parcelable0) {
        this.n(((Bundle)parcelable0));
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean e(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void f(boolean z) {
        MenuAdapter listMenuPresenter$MenuAdapter0 = this.i;
        if(listMenuPresenter$MenuAdapter0 != null) {
            listMenuPresenter$MenuAdapter0.notifyDataSetChanged();
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
        if(this.f != 0) {
            ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(context0, this.f);
            this.a = contextThemeWrapper0;
            this.b = LayoutInflater.from(contextThemeWrapper0);
        }
        else if(this.a != null) {
            this.a = context0;
            if(this.b == null) {
                this.b = LayoutInflater.from(context0);
            }
        }
        this.c = menuBuilder0;
        MenuAdapter listMenuPresenter$MenuAdapter0 = this.i;
        if(listMenuPresenter$MenuAdapter0 != null) {
            listMenuPresenter$MenuAdapter0.notifyDataSetChanged();
        }
    }

    int j() {
        return this.e;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void k(Callback menuPresenter$Callback0) {
        this.h = menuPresenter$Callback0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean l(SubMenuBuilder subMenuBuilder0) {
        if(!subMenuBuilder0.hasVisibleItems()) {
            return false;
        }
        new MenuDialogHelper(subMenuBuilder0).e(null);
        Callback menuPresenter$Callback0 = this.h;
        if(menuPresenter$Callback0 != null) {
            menuPresenter$Callback0.d(subMenuBuilder0);
        }
        return true;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public MenuView m(ViewGroup viewGroup0) {
        if(this.d == null) {
            this.d = (ExpandedMenuView)this.b.inflate(layout.abc_expanded_menu_layout, viewGroup0, false);
            if(this.i == null) {
                this.i = new MenuAdapter(this);
            }
            this.d.setAdapter(this.i);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    public void n(Bundle bundle0) {
        SparseArray sparseArray0 = bundle0.getSparseParcelableArray("android:menu:list");
        if(sparseArray0 != null) {
            this.d.restoreHierarchyState(sparseArray0);
        }
    }

    public void o(Bundle bundle0) {
        SparseArray sparseArray0 = new SparseArray();
        ExpandedMenuView expandedMenuView0 = this.d;
        if(expandedMenuView0 != null) {
            expandedMenuView0.saveHierarchyState(sparseArray0);
        }
        bundle0.putSparseParcelableArray("android:menu:list", sparseArray0);
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.c.Q(this.i.b(v), this, 0);
    }

    public void p(int v) {
        this.j = v;
    }

    public void q(int v) {
        this.e = v;
        if(this.d != null) {
            this.f(false);
        }
    }
}

