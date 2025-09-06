package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

abstract class BaseMenuWrapper {
    final Context l;
    private SimpleArrayMap m;
    private SimpleArrayMap n;

    BaseMenuWrapper(Context context0) {
        this.l = context0;
    }

    final MenuItem e(MenuItem menuItem0) {
        if(menuItem0 instanceof SupportMenuItem) {
            if(this.m == null) {
                this.m = new SimpleArrayMap();
            }
            MenuItem menuItem1 = (MenuItem)this.m.get(((SupportMenuItem)menuItem0));
            if(menuItem1 == null) {
                menuItem1 = new MenuItemWrapperICS(this.l, ((SupportMenuItem)menuItem0));
                this.m.put(((SupportMenuItem)menuItem0), menuItem1);
            }
            return menuItem1;
        }
        return menuItem0;
    }

    final SubMenu f(SubMenu subMenu0) {
        if(subMenu0 instanceof SupportSubMenu) {
            if(this.n == null) {
                this.n = new SimpleArrayMap();
            }
            SubMenu subMenu1 = (SubMenu)this.n.get(((SupportSubMenu)subMenu0));
            if(subMenu1 == null) {
                subMenu1 = new SubMenuWrapperICS(this.l, ((SupportSubMenu)subMenu0));
                this.n.put(((SupportSubMenu)subMenu0), subMenu1);
            }
            return subMenu1;
        }
        return subMenu0;
    }

    final void g() {
        SimpleArrayMap simpleArrayMap0 = this.m;
        if(simpleArrayMap0 != null) {
            simpleArrayMap0.clear();
        }
        SimpleArrayMap simpleArrayMap1 = this.n;
        if(simpleArrayMap1 != null) {
            simpleArrayMap1.clear();
        }
    }

    final void h(int v) {
        if(this.m == null) {
            return;
        }
        for(int v1 = 0; v1 < this.m.size(); ++v1) {
            if(((SupportMenuItem)this.m.g(v1)).getGroupId() == v) {
                this.m.i(v1);
                --v1;
            }
        }
    }

    final void i(int v) {
        if(this.m == null) {
            return;
        }
        for(int v1 = 0; v1 < this.m.size(); ++v1) {
            if(((SupportMenuItem)this.m.g(v1)).getItemId() == v) {
                this.m.i(v1);
                return;
            }
        }
    }
}

