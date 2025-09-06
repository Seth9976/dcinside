package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewConfigurationCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo({Scope.c})
public class MenuBuilder implements SupportMenu {
    @RestrictTo({Scope.c})
    public interface Callback {
        boolean a(@NonNull MenuBuilder arg1, @NonNull MenuItem arg2);

        void b(@NonNull MenuBuilder arg1);
    }

    @RestrictTo({Scope.c})
    public interface ItemInvoker {
        boolean g(MenuItemImpl arg1);
    }

    View A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private ArrayList G;
    private CopyOnWriteArrayList H;
    private MenuItemImpl I;
    private boolean J;
    private boolean K;
    private static final String L = "MenuBuilder";
    private static final String M = "android:menu:presenters";
    private static final String N = "android:menu:actionviewstates";
    private static final String O = "android:menu:expandedactionview";
    private static final int[] P;
    private final Context l;
    private final Resources m;
    private boolean n;
    private boolean o;
    private Callback p;
    private ArrayList q;
    private ArrayList r;
    private boolean s;
    private ArrayList t;
    private ArrayList u;
    private boolean v;
    private int w;
    private ContextMenu.ContextMenuInfo x;
    CharSequence y;
    Drawable z;

    static {
        MenuBuilder.P = new int[]{1, 4, 5, 3, 2, 0};
    }

    public MenuBuilder(Context context0) {
        this.w = 0;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = new ArrayList();
        this.H = new CopyOnWriteArrayList();
        this.J = false;
        this.l = context0;
        this.m = context0.getResources();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = true;
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = true;
        this.l0(true);
    }

    public CharSequence A() {
        return this.y;
    }

    public View B() {
        return this.A;
    }

    public ArrayList C() {
        this.u();
        return this.u;
    }

    boolean D() {
        return this.E;
    }

    private static int E(int v) {
        int v1 = (0xFFFF0000 & v) >> 16;
        if(v1 >= 0) {
            int[] arr_v = MenuBuilder.P;
            if(v1 < arr_v.length) {
                return v & 0xFFFF | arr_v[v1] << 16;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    Resources F() {
        return this.m;
    }

    public MenuBuilder G() {
        return this;
    }

    @NonNull
    public ArrayList H() {
        if(!this.s) {
            return this.r;
        }
        this.r.clear();
        int v = this.q.size();
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)this.q.get(v1);
            if(menuItemImpl0.isVisible()) {
                this.r.add(menuItemImpl0);
            }
        }
        this.s = false;
        this.v = true;
        return this.r;
    }

    public boolean I() {
        return !this.B;
    }

    public boolean J() {
        return this.J;
    }

    boolean K() {
        return this.n;
    }

    public boolean L() {
        return this.o;
    }

    void M(MenuItemImpl menuItemImpl0) {
        this.v = true;
        this.O(true);
    }

    void N(MenuItemImpl menuItemImpl0) {
        this.s = true;
        this.O(true);
    }

    public void O(boolean z) {
        if(!this.B) {
            if(z) {
                this.s = true;
                this.v = true;
            }
            this.j(z);
            return;
        }
        this.C = true;
        if(z) {
            this.D = true;
        }
    }

    public boolean P(MenuItem menuItem0, int v) {
        return this.Q(menuItem0, null, v);
    }

    public boolean Q(MenuItem menuItem0, MenuPresenter menuPresenter0, int v) {
        if(((MenuItemImpl)menuItem0) != null && ((MenuItemImpl)menuItem0).isEnabled()) {
            boolean z = ((MenuItemImpl)menuItem0).n();
            ActionProvider actionProvider0 = ((MenuItemImpl)menuItem0).a();
            boolean z1 = actionProvider0 != null && actionProvider0.b();
            if(((MenuItemImpl)menuItem0).m()) {
                z |= ((MenuItemImpl)menuItem0).expandActionView();
                if(z) {
                    this.f(true);
                    return true;
                }
            }
            else if(((MenuItemImpl)menuItem0).hasSubMenu() || z1) {
                if((v & 4) == 0) {
                    this.f(false);
                }
                if(!((MenuItemImpl)menuItem0).hasSubMenu()) {
                    ((MenuItemImpl)menuItem0).A(new SubMenuBuilder(this.x(), this, ((MenuItemImpl)menuItem0)));
                }
                SubMenuBuilder subMenuBuilder0 = (SubMenuBuilder)((MenuItemImpl)menuItem0).getSubMenu();
                if(z1) {
                    actionProvider0.g(subMenuBuilder0);
                }
                z |= this.m(subMenuBuilder0, menuPresenter0);
                if(!z) {
                    this.f(true);
                }
            }
            else if((v & 1) == 0) {
                this.f(true);
                return z;
            }
            return z;
        }
        return false;
    }

    public void R(int v) {
        this.S(v, true);
    }

    private void S(int v, boolean z) {
        if(v >= 0 && v < this.q.size()) {
            this.q.remove(v);
            if(z) {
                this.O(true);
            }
        }
    }

    public void T(MenuPresenter menuPresenter0) {
        for(Object object0: this.H) {
            WeakReference weakReference0 = (WeakReference)object0;
            MenuPresenter menuPresenter1 = (MenuPresenter)weakReference0.get();
            if(menuPresenter1 == null || menuPresenter1 == menuPresenter0) {
                this.H.remove(weakReference0);
            }
        }
    }

    public void U(Bundle bundle0) {
        if(bundle0 == null) {
            return;
        }
        SparseArray sparseArray0 = bundle0.getSparseParcelableArray("android:menu:actionviewstates");
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = this.getItem(v1);
            View view0 = menuItem0.getActionView();
            if(view0 != null && view0.getId() != -1) {
                view0.restoreHierarchyState(sparseArray0);
            }
            if(menuItem0.hasSubMenu()) {
                ((SubMenuBuilder)menuItem0.getSubMenu()).U(bundle0);
            }
        }
        int v2 = bundle0.getInt("android:menu:expandedactionview");
        if(v2 > 0) {
            MenuItem menuItem1 = this.findItem(v2);
            if(menuItem1 != null) {
                menuItem1.expandActionView();
            }
        }
    }

    public void V(Bundle bundle0) {
        this.k(bundle0);
    }

    public void W(Bundle bundle0) {
        int v = this.size();
        SparseArray sparseArray0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = this.getItem(v1);
            View view0 = menuItem0.getActionView();
            if(view0 != null && view0.getId() != -1) {
                if(sparseArray0 == null) {
                    sparseArray0 = new SparseArray();
                }
                view0.saveHierarchyState(sparseArray0);
                if(menuItem0.isActionViewExpanded()) {
                    bundle0.putInt("android:menu:expandedactionview", menuItem0.getItemId());
                }
            }
            if(menuItem0.hasSubMenu()) {
                ((SubMenuBuilder)menuItem0.getSubMenu()).W(bundle0);
            }
        }
        if(sparseArray0 != null) {
            bundle0.putSparseParcelableArray("android:menu:actionviewstates", sparseArray0);
        }
    }

    public void X(Bundle bundle0) {
        this.l(bundle0);
    }

    public void Y(Callback menuBuilder$Callback0) {
        this.p = menuBuilder$Callback0;
    }

    public void Z(ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0) {
        this.x = contextMenu$ContextMenuInfo0;
    }

    protected MenuItem a(int v, int v1, int v2, CharSequence charSequence0) {
        int v3 = MenuBuilder.E(v2);
        MenuItem menuItem0 = this.h(v, v1, v2, v3, charSequence0, this.w);
        ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0 = this.x;
        if(contextMenu$ContextMenuInfo0 != null) {
            ((MenuItemImpl)menuItem0).y(contextMenu$ContextMenuInfo0);
        }
        this.q.add(MenuBuilder.q(this.q, v3), menuItem0);
        this.O(true);
        return menuItem0;
    }

    public MenuBuilder a0(int v) {
        this.w = v;
        return this;
    }

    @Override  // android.view.Menu
    public MenuItem add(int v) {
        return this.a(0, 0, 0, this.m.getString(v));
    }

    @Override  // android.view.Menu
    public MenuItem add(int v, int v1, int v2, int v3) {
        return this.a(v, v1, v2, this.m.getString(v3));
    }

    @Override  // android.view.Menu
    public MenuItem add(int v, int v1, int v2, CharSequence charSequence0) {
        return this.a(v, v1, v2, charSequence0);
    }

    @Override  // android.view.Menu
    public MenuItem add(CharSequence charSequence0) {
        return this.a(0, 0, 0, charSequence0);
    }

    @Override  // android.view.Menu
    public int addIntentOptions(int v, int v1, int v2, ComponentName componentName0, Intent[] arr_intent, Intent intent0, int v3, MenuItem[] arr_menuItem) {
        PackageManager packageManager0 = this.l.getPackageManager();
        List list0 = packageManager0.queryIntentActivityOptions(componentName0, arr_intent, intent0, 0);
        int v5 = list0 == null ? 0 : list0.size();
        if((v3 & 1) == 0) {
            this.removeGroup(v);
        }
        for(int v4 = 0; v4 < v5; ++v4) {
            ResolveInfo resolveInfo0 = (ResolveInfo)list0.get(v4);
            Intent intent1 = new Intent((resolveInfo0.specificIndex >= 0 ? arr_intent[resolveInfo0.specificIndex] : intent0));
            intent1.setComponent(new ComponentName(resolveInfo0.activityInfo.applicationInfo.packageName, resolveInfo0.activityInfo.name));
            MenuItem menuItem0 = this.add(v, v1, v2, resolveInfo0.loadLabel(packageManager0)).setIcon(resolveInfo0.loadIcon(packageManager0)).setIntent(intent1);
            if(arr_menuItem != null) {
                int v6 = resolveInfo0.specificIndex;
                if(v6 >= 0) {
                    arr_menuItem[v6] = menuItem0;
                }
            }
        }
        return v5;
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(int v) {
        return this.addSubMenu(0, 0, 0, this.m.getString(v));
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(int v, int v1, int v2, int v3) {
        return this.addSubMenu(v, v1, v2, this.m.getString(v3));
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(int v, int v1, int v2, CharSequence charSequence0) {
        MenuItemImpl menuItemImpl0 = (MenuItemImpl)this.a(v, v1, v2, charSequence0);
        SubMenu subMenu0 = new SubMenuBuilder(this.l, this, menuItemImpl0);
        menuItemImpl0.A(((SubMenuBuilder)subMenu0));
        return subMenu0;
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence0) {
        return this.addSubMenu(0, 0, 0, charSequence0);
    }

    public void b(MenuPresenter menuPresenter0) {
        this.c(menuPresenter0, this.l);
    }

    void b0(MenuItem menuItem0) {
        int v = menuItem0.getGroupId();
        int v1 = this.q.size();
        this.n0();
        for(int v2 = 0; v2 < v1; ++v2) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)this.q.get(v2);
            if(menuItemImpl0.getGroupId() == v && menuItemImpl0.p() && menuItemImpl0.isCheckable()) {
                menuItemImpl0.v(menuItemImpl0 == menuItem0);
            }
        }
        this.m0();
    }

    public void c(MenuPresenter menuPresenter0, Context context0) {
        this.H.add(new WeakReference(menuPresenter0));
        menuPresenter0.i(context0, this);
        this.v = true;
    }

    protected MenuBuilder c0(int v) {
        this.e0(0, null, v, null, null);
        return this;
    }

    @Override  // android.view.Menu
    public void clear() {
        MenuItemImpl menuItemImpl0 = this.I;
        if(menuItemImpl0 != null) {
            this.g(menuItemImpl0);
        }
        this.q.clear();
        this.O(true);
    }

    public void clearHeader() {
        this.z = null;
        this.y = null;
        this.A = null;
        this.O(false);
    }

    @Override  // android.view.Menu
    public void close() {
        this.f(true);
    }

    public void d() {
        Callback menuBuilder$Callback0 = this.p;
        if(menuBuilder$Callback0 != null) {
            menuBuilder$Callback0.b(this);
        }
    }

    protected MenuBuilder d0(Drawable drawable0) {
        this.e0(0, null, 0, drawable0, null);
        return this;
    }

    public void e() {
        this.B = true;
        this.clear();
        this.clearHeader();
        this.H.clear();
        this.B = false;
        this.C = false;
        this.D = false;
        this.O(true);
    }

    private void e0(int v, CharSequence charSequence0, int v1, Drawable drawable0, View view0) {
        Resources resources0 = this.F();
        if(view0 == null) {
            if(v > 0) {
                this.y = resources0.getText(v);
            }
            else if(charSequence0 != null) {
                this.y = charSequence0;
            }
            if(v1 > 0) {
                this.z = ContextCompat.getDrawable(this.x(), v1);
            }
            else if(drawable0 != null) {
                this.z = drawable0;
            }
            this.A = null;
        }
        else {
            this.A = view0;
            this.y = null;
            this.z = null;
        }
        this.O(false);
    }

    public final void f(boolean z) {
        if(this.F) {
            return;
        }
        this.F = true;
        for(Object object0: this.H) {
            WeakReference weakReference0 = (WeakReference)object0;
            MenuPresenter menuPresenter0 = (MenuPresenter)weakReference0.get();
            if(menuPresenter0 == null) {
                this.H.remove(weakReference0);
            }
            else {
                menuPresenter0.c(this, z);
            }
        }
        this.F = false;
    }

    protected MenuBuilder f0(int v) {
        this.e0(v, null, 0, null, null);
        return this;
    }

    @Override  // android.view.Menu
    public MenuItem findItem(int v) {
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            MenuItem menuItem0 = (MenuItemImpl)this.q.get(v2);
            if(((MenuItemImpl)menuItem0).getItemId() == v) {
                return menuItem0;
            }
            if(((MenuItemImpl)menuItem0).hasSubMenu()) {
                MenuItem menuItem1 = ((MenuItemImpl)menuItem0).getSubMenu().findItem(v);
                if(menuItem1 != null) {
                    return menuItem1;
                }
            }
        }
        return null;
    }

    public boolean g(MenuItemImpl menuItemImpl0) {
        boolean z = false;
        if(!this.H.isEmpty() && this.I == menuItemImpl0) {
            this.n0();
            for(Object object0: this.H) {
                WeakReference weakReference0 = (WeakReference)object0;
                MenuPresenter menuPresenter0 = (MenuPresenter)weakReference0.get();
                if(menuPresenter0 == null) {
                    this.H.remove(weakReference0);
                }
                else {
                    z = menuPresenter0.h(this, menuItemImpl0);
                    if(z) {
                        break;
                    }
                }
            }
            this.m0();
            if(z) {
                this.I = null;
            }
        }
        return z;
    }

    protected MenuBuilder g0(CharSequence charSequence0) {
        this.e0(0, charSequence0, 0, null, null);
        return this;
    }

    @Override  // android.view.Menu
    public MenuItem getItem(int v) {
        return (MenuItem)this.q.get(v);
    }

    private MenuItemImpl h(int v, int v1, int v2, int v3, CharSequence charSequence0, int v4) {
        return new MenuItemImpl(this, v, v1, v2, v3, charSequence0, v4);
    }

    protected MenuBuilder h0(View view0) {
        this.e0(0, null, 0, null, view0);
        return this;
    }

    @Override  // android.view.Menu
    public boolean hasVisibleItems() {
        if(this.K) {
            return true;
        }
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((MenuItemImpl)this.q.get(v1)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    boolean i(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
        return this.p != null && this.p.a(menuBuilder0, menuItem0);
    }

    public void i0(boolean z) {
        this.E = z;
    }

    @Override  // android.view.Menu
    public boolean isShortcutKey(int v, KeyEvent keyEvent0) {
        return this.s(v, keyEvent0) != null;
    }

    private void j(boolean z) {
        if(this.H.isEmpty()) {
            return;
        }
        this.n0();
        for(Object object0: this.H) {
            WeakReference weakReference0 = (WeakReference)object0;
            MenuPresenter menuPresenter0 = (MenuPresenter)weakReference0.get();
            if(menuPresenter0 == null) {
                this.H.remove(weakReference0);
            }
            else {
                menuPresenter0.f(z);
            }
        }
        this.m0();
    }

    public void j0(boolean z) {
        this.K = z;
    }

    private void k(Bundle bundle0) {
        SparseArray sparseArray0 = bundle0.getSparseParcelableArray("android:menu:presenters");
        if(sparseArray0 != null && !this.H.isEmpty()) {
            for(Object object0: this.H) {
                WeakReference weakReference0 = (WeakReference)object0;
                MenuPresenter menuPresenter0 = (MenuPresenter)weakReference0.get();
                if(menuPresenter0 == null) {
                    this.H.remove(weakReference0);
                }
                else {
                    int v = menuPresenter0.getId();
                    if(v > 0) {
                        Parcelable parcelable0 = (Parcelable)sparseArray0.get(v);
                        if(parcelable0 != null) {
                            menuPresenter0.d(parcelable0);
                        }
                    }
                }
            }
        }
    }

    public void k0(boolean z) {
        if(this.o == z) {
            return;
        }
        this.l0(z);
        this.O(false);
    }

    private void l(Bundle bundle0) {
        if(this.H.isEmpty()) {
            return;
        }
        SparseArray sparseArray0 = new SparseArray();
        for(Object object0: this.H) {
            WeakReference weakReference0 = (WeakReference)object0;
            MenuPresenter menuPresenter0 = (MenuPresenter)weakReference0.get();
            if(menuPresenter0 == null) {
                this.H.remove(weakReference0);
            }
            else {
                int v = menuPresenter0.getId();
                if(v > 0) {
                    Parcelable parcelable0 = menuPresenter0.a();
                    if(parcelable0 != null) {
                        sparseArray0.put(v, parcelable0);
                    }
                }
            }
        }
        bundle0.putSparseParcelableArray("android:menu:presenters", sparseArray0);
    }

    private void l0(boolean z) {
        this.o = z && this.m.getConfiguration().keyboard != 1 && ViewConfigurationCompat.n(ViewConfiguration.get(this.l), this.l);
    }

    private boolean m(SubMenuBuilder subMenuBuilder0, MenuPresenter menuPresenter0) {
        boolean z = false;
        if(this.H.isEmpty()) {
            return false;
        }
        if(menuPresenter0 != null) {
            z = menuPresenter0.l(subMenuBuilder0);
        }
        for(Object object0: this.H) {
            WeakReference weakReference0 = (WeakReference)object0;
            MenuPresenter menuPresenter1 = (MenuPresenter)weakReference0.get();
            if(menuPresenter1 == null) {
                this.H.remove(weakReference0);
            }
            else if(!z) {
                z = menuPresenter1.l(subMenuBuilder0);
            }
        }
        return z;
    }

    public void m0() {
        this.B = false;
        if(this.C) {
            this.C = false;
            this.O(this.D);
        }
    }

    public boolean n(MenuItemImpl menuItemImpl0) {
        boolean z = false;
        if(this.H.isEmpty()) {
            return false;
        }
        this.n0();
        for(Object object0: this.H) {
            WeakReference weakReference0 = (WeakReference)object0;
            MenuPresenter menuPresenter0 = (MenuPresenter)weakReference0.get();
            if(menuPresenter0 == null) {
                this.H.remove(weakReference0);
            }
            else {
                z = menuPresenter0.e(this, menuItemImpl0);
                if(z) {
                    break;
                }
            }
        }
        this.m0();
        if(z) {
            this.I = menuItemImpl0;
        }
        return z;
    }

    public void n0() {
        if(!this.B) {
            this.B = true;
            this.C = false;
            this.D = false;
        }
    }

    public int o(int v) {
        return this.p(v, 0);
    }

    public int p(int v, int v1) {
        int v2 = this.size();
        if(v1 < 0) {
            v1 = 0;
        }
        while(v1 < v2) {
            if(((MenuItemImpl)this.q.get(v1)).getGroupId() == v) {
                return v1;
            }
            ++v1;
        }
        return -1;
    }

    @Override  // android.view.Menu
    public boolean performIdentifierAction(int v, int v1) {
        return this.P(this.findItem(v), v1);
    }

    @Override  // android.view.Menu
    public boolean performShortcut(int v, KeyEvent keyEvent0, int v1) {
        MenuItemImpl menuItemImpl0 = this.s(v, keyEvent0);
        boolean z = menuItemImpl0 == null ? false : this.P(menuItemImpl0, v1);
        if((v1 & 2) != 0) {
            this.f(true);
        }
        return z;
    }

    private static int q(ArrayList arrayList0, int v) {
        for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
            if(((MenuItemImpl)arrayList0.get(v1)).i() <= v) {
                return v1 + 1;
            }
        }
        return 0;
    }

    public int r(int v) {
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(((MenuItemImpl)this.q.get(v2)).getItemId() == v) {
                return v2;
            }
        }
        return -1;
    }

    @Override  // android.view.Menu
    public void removeGroup(int v) {
        int v1 = this.o(v);
        if(v1 >= 0) {
            int v2 = this.q.size();
            for(int v3 = 0; v3 < v2 - v1 && ((MenuItemImpl)this.q.get(v1)).getGroupId() == v; ++v3) {
                this.S(v1, false);
            }
            this.O(true);
        }
    }

    @Override  // android.view.Menu
    public void removeItem(int v) {
        this.S(this.r(v), true);
    }

    MenuItemImpl s(int v, KeyEvent keyEvent0) {
        ArrayList arrayList0 = this.G;
        arrayList0.clear();
        this.t(arrayList0, v, keyEvent0);
        if(arrayList0.isEmpty()) {
            return null;
        }
        int v1 = keyEvent0.getMetaState();
        KeyCharacterMap.KeyData keyCharacterMap$KeyData0 = new KeyCharacterMap.KeyData();
        keyEvent0.getKeyData(keyCharacterMap$KeyData0);
        int v2 = arrayList0.size();
        if(v2 == 1) {
            return (MenuItemImpl)arrayList0.get(0);
        }
        boolean z = this.K();
        for(int v3 = 0; v3 < v2; ++v3) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)arrayList0.get(v3);
            int v4 = z ? menuItemImpl0.getAlphabeticShortcut() : menuItemImpl0.getNumericShortcut();
            if(v4 == keyCharacterMap$KeyData0.meta[0] && (v1 & 2) == 0 || v4 == keyCharacterMap$KeyData0.meta[2] && (v1 & 2) != 0 || z && v4 == 8 && v == 67) {
                return menuItemImpl0;
            }
        }
        return null;
    }

    @Override  // android.view.Menu
    public void setGroupCheckable(int v, boolean z, boolean z1) {
        int v1 = this.q.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)this.q.get(v2);
            if(menuItemImpl0.getGroupId() == v) {
                menuItemImpl0.w(z1);
                menuItemImpl0.setCheckable(z);
            }
        }
    }

    @Override  // androidx.core.internal.view.SupportMenu
    public void setGroupDividerEnabled(boolean z) {
        this.J = z;
    }

    @Override  // android.view.Menu
    public void setGroupEnabled(int v, boolean z) {
        int v1 = this.q.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)this.q.get(v2);
            if(menuItemImpl0.getGroupId() == v) {
                menuItemImpl0.setEnabled(z);
            }
        }
    }

    @Override  // android.view.Menu
    public void setGroupVisible(int v, boolean z) {
        int v1 = this.q.size();
        boolean z1 = false;
        for(int v2 = 0; v2 < v1; ++v2) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)this.q.get(v2);
            if(menuItemImpl0.getGroupId() == v && menuItemImpl0.B(z)) {
                z1 = true;
            }
        }
        if(z1) {
            this.O(true);
        }
    }

    @Override  // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.n = z;
        this.O(false);
    }

    @Override  // android.view.Menu
    public int size() {
        return this.q.size();
    }

    void t(List list0, int v, KeyEvent keyEvent0) {
        boolean z = this.K();
        int v1 = keyEvent0.getModifiers();
        KeyCharacterMap.KeyData keyCharacterMap$KeyData0 = new KeyCharacterMap.KeyData();
        if(!keyEvent0.getKeyData(keyCharacterMap$KeyData0) && v != 67) {
            return;
        }
        int v2 = this.q.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)this.q.get(v3);
            if(menuItemImpl0.hasSubMenu()) {
                ((MenuBuilder)menuItemImpl0.getSubMenu()).t(list0, v, keyEvent0);
            }
            int v4 = z ? menuItemImpl0.getAlphabeticShortcut() : menuItemImpl0.getNumericShortcut();
            if((v1 & 0x1100F) == ((z ? menuItemImpl0.getAlphabeticModifiers() : menuItemImpl0.getNumericModifiers()) & 0x1100F) && v4 != 0 && ((v4 == keyCharacterMap$KeyData0.meta[0] || v4 == keyCharacterMap$KeyData0.meta[2] || z && v4 == 8 && v == 67) && menuItemImpl0.isEnabled())) {
                list0.add(menuItemImpl0);
            }
        }
    }

    public void u() {
        ArrayList arrayList0 = this.H();
        if(!this.v) {
            return;
        }
        boolean z = false;
        for(Object object0: this.H) {
            WeakReference weakReference0 = (WeakReference)object0;
            MenuPresenter menuPresenter0 = (MenuPresenter)weakReference0.get();
            if(menuPresenter0 == null) {
                this.H.remove(weakReference0);
            }
            else {
                z |= menuPresenter0.g();
            }
        }
        if(z) {
            this.t.clear();
            this.u.clear();
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                MenuItemImpl menuItemImpl0 = (MenuItemImpl)arrayList0.get(v1);
                if(menuItemImpl0.o()) {
                    this.t.add(menuItemImpl0);
                }
                else {
                    this.u.add(menuItemImpl0);
                }
            }
        }
        else {
            this.t.clear();
            this.u.clear();
            this.u.addAll(this.H());
        }
        this.v = false;
    }

    public ArrayList v() {
        this.u();
        return this.t;
    }

    protected String w() [...] // 潜在的解密器

    public Context x() {
        return this.l;
    }

    public MenuItemImpl y() {
        return this.I;
    }

    public Drawable z() {
        return this.z;
    }
}

