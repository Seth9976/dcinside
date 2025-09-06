package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({Scope.c})
public class MenuAdapter extends BaseAdapter {
    MenuBuilder a;
    private int b;
    private boolean c;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public MenuAdapter(MenuBuilder menuBuilder0, LayoutInflater layoutInflater0, boolean z, int v) {
        this.b = -1;
        this.d = z;
        this.e = layoutInflater0;
        this.a = menuBuilder0;
        this.f = v;
        this.a();
    }

    void a() {
        MenuItemImpl menuItemImpl0 = this.a.y();
        if(menuItemImpl0 != null) {
            ArrayList arrayList0 = this.a.C();
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                if(((MenuItemImpl)arrayList0.get(v1)) == menuItemImpl0) {
                    this.b = v1;
                    return;
                }
            }
        }
        this.b = -1;
    }

    public MenuBuilder b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    public MenuItemImpl d(int v) {
        ArrayList arrayList0 = this.d ? this.a.C() : this.a.H();
        if(this.b >= 0 && v >= this.b) {
            ++v;
        }
        return (MenuItemImpl)arrayList0.get(v);
    }

    public void e(boolean z) {
        this.c = z;
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList0 = this.d ? this.a.C() : this.a.H();
        return this.b >= 0 ? arrayList0.size() - 1 : arrayList0.size();
    }

    @Override  // android.widget.Adapter
    public Object getItem(int v) {
        return this.d(v);
    }

    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        if(view0 == null) {
            view0 = this.e.inflate(this.f, viewGroup0, false);
        }
        int v1 = this.d(v).getGroupId();
        int v2 = v - 1 < 0 ? v1 : this.d(v - 1).getGroupId();
        ((ListMenuItemView)view0).setGroupDividerEnabled(this.a.J() && v1 != v2);
        if(this.c) {
            ((ListMenuItemView)view0).setForceShowIcon(true);
        }
        ((ItemView)view0).f(this.d(v), 0);
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }
}

