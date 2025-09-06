package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.layout;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.GravityCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

final class CascadingMenuPopup extends MenuPopup implements View.OnKeyListener, PopupWindow.OnDismissListener, MenuPresenter {
    static class CascadingMenuInfo {
        public final MenuPopupWindow a;
        public final MenuBuilder b;
        public final int c;

        public CascadingMenuInfo(@NonNull MenuPopupWindow menuPopupWindow0, @NonNull MenuBuilder menuBuilder0, int v) {
            this.a = menuPopupWindow0;
            this.b = menuBuilder0;
            this.c = v;
        }

        public ListView a() {
            return this.a.j();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    boolean A;
    private static final int B = 0;
    static final int C = 0;
    static final int D = 1;
    static final int E = 200;
    private final Context b;
    private final int c;
    private final int d;
    private final int e;
    private final boolean f;
    final Handler g;
    private final List h;
    final List i;
    final ViewTreeObserver.OnGlobalLayoutListener j;
    private final View.OnAttachStateChangeListener k;
    private final MenuItemHoverListener l;
    private int m;
    private int n;
    private View o;
    View p;
    private int q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private Callback x;
    ViewTreeObserver y;
    private PopupWindow.OnDismissListener z;

    static {
        CascadingMenuPopup.B = layout.abc_cascading_menu_item_layout;
    }

    public CascadingMenuPopup(@NonNull Context context0, @NonNull View view0, @AttrRes int v, @StyleRes int v1, boolean z) {
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ViewTreeObserver.OnGlobalLayoutListener() {
            final CascadingMenuPopup a;

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public void onGlobalLayout() {
                if(CascadingMenuPopup.this.b() && CascadingMenuPopup.this.i.size() > 0 && !((CascadingMenuInfo)CascadingMenuPopup.this.i.get(0)).a.K()) {
                    View view0 = CascadingMenuPopup.this.p;
                    if(view0 != null && view0.isShown()) {
                        for(Object object0: CascadingMenuPopup.this.i) {
                            ((CascadingMenuInfo)object0).a.show();
                        }
                        return;
                    }
                    CascadingMenuPopup.this.dismiss();
                }
            }
        };
        this.k = new View.OnAttachStateChangeListener() {
            final CascadingMenuPopup a;

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                ViewTreeObserver viewTreeObserver0 = CascadingMenuPopup.this.y;
                if(viewTreeObserver0 != null) {
                    if(!viewTreeObserver0.isAlive()) {
                        CascadingMenuPopup.this.y = view0.getViewTreeObserver();
                    }
                    CascadingMenuPopup.this.y.removeGlobalOnLayoutListener(CascadingMenuPopup.this.j);
                }
                view0.removeOnAttachStateChangeListener(this);
            }
        };
        this.l = new MenuItemHoverListener() {
            final CascadingMenuPopup a;

            @Override  // androidx.appcompat.widget.MenuItemHoverListener
            public void c(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
                CascadingMenuInfo cascadingMenuPopup$CascadingMenuInfo0 = null;
                CascadingMenuPopup.this.g.removeCallbacksAndMessages(null);
                int v = CascadingMenuPopup.this.i.size();
                int v1;
                for(v1 = 0; true; ++v1) {
                    if(v1 >= v) {
                        v1 = -1;
                        break;
                    }
                    if(menuBuilder0 == ((CascadingMenuInfo)CascadingMenuPopup.this.i.get(v1)).b) {
                        break;
                    }
                }
                if(v1 == -1) {
                    return;
                }
                if(v1 + 1 < CascadingMenuPopup.this.i.size()) {
                    cascadingMenuPopup$CascadingMenuInfo0 = (CascadingMenuInfo)CascadingMenuPopup.this.i.get(v1 + 1);
                }
                androidx.appcompat.view.menu.CascadingMenuPopup.3.1 cascadingMenuPopup$3$10 = new Runnable() {
                    final androidx.appcompat.view.menu.CascadingMenuPopup.3 d;

                    @Override
                    public void run() {
                        CascadingMenuInfo cascadingMenuPopup$CascadingMenuInfo0 = cascadingMenuPopup$CascadingMenuInfo0;
                        if(cascadingMenuPopup$CascadingMenuInfo0 != null) {
                            CascadingMenuPopup.this.A = true;
                            cascadingMenuPopup$CascadingMenuInfo0.b.f(false);
                            CascadingMenuPopup.this.A = false;
                        }
                        if(menuItem0.isEnabled() && menuItem0.hasSubMenu()) {
                            menuBuilder0.P(menuItem0, 4);
                        }
                    }
                };
                long v2 = SystemClock.uptimeMillis();
                CascadingMenuPopup.this.g.postAtTime(cascadingMenuPopup$3$10, menuBuilder0, v2 + 200L);
            }

            @Override  // androidx.appcompat.widget.MenuItemHoverListener
            public void i(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
                CascadingMenuPopup.this.g.removeCallbacksAndMessages(menuBuilder0);
            }
        };
        this.m = 0;
        this.n = 0;
        this.b = context0;
        this.o = view0;
        this.d = v;
        this.e = v1;
        this.f = z;
        this.v = false;
        this.q = this.F();
        Resources resources0 = context0.getResources();
        this.c = Math.max(resources0.getDisplayMetrics().widthPixels / 2, resources0.getDimensionPixelSize(dimen.abc_config_prefDialogWidth));
        this.g = new Handler();
    }

    private MenuPopupWindow B() {
        MenuPopupWindow menuPopupWindow0 = new MenuPopupWindow(this.b, null, this.d, this.e);
        menuPopupWindow0.q0(this.l);
        menuPopupWindow0.e0(this);
        menuPopupWindow0.d0(this);
        menuPopupWindow0.R(this.o);
        menuPopupWindow0.V(this.n);
        menuPopupWindow0.c0(true);
        menuPopupWindow0.Z(2);
        return menuPopupWindow0;
    }

    private int C(@NonNull MenuBuilder menuBuilder0) {
        int v = this.i.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(menuBuilder0 == ((CascadingMenuInfo)this.i.get(v1)).b) {
                return v1;
            }
        }
        return -1;
    }

    private MenuItem D(@NonNull MenuBuilder menuBuilder0, @NonNull MenuBuilder menuBuilder1) {
        int v = menuBuilder0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = menuBuilder0.getItem(v1);
            if(menuItem0.hasSubMenu() && menuBuilder1 == menuItem0.getSubMenu()) {
                return menuItem0;
            }
        }
        return null;
    }

    @Nullable
    private View E(@NonNull CascadingMenuInfo cascadingMenuPopup$CascadingMenuInfo0, @NonNull MenuBuilder menuBuilder0) {
        MenuAdapter menuAdapter0;
        int v1;
        MenuItem menuItem0 = this.D(cascadingMenuPopup$CascadingMenuInfo0.b, menuBuilder0);
        if(menuItem0 == null) {
            return null;
        }
        ListView listView0 = cascadingMenuPopup$CascadingMenuInfo0.a();
        ListAdapter listAdapter0 = listView0.getAdapter();
        int v = 0;
        if(listAdapter0 instanceof HeaderViewListAdapter) {
            v1 = ((HeaderViewListAdapter)listAdapter0).getHeadersCount();
            menuAdapter0 = (MenuAdapter)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter();
        }
        else {
            menuAdapter0 = (MenuAdapter)listAdapter0;
            v1 = 0;
        }
        int v2 = menuAdapter0.getCount();
        while(true) {
            if(v >= v2) {
                v = -1;
                break;
            }
            if(menuItem0 == menuAdapter0.d(v)) {
                break;
            }
            ++v;
        }
        if(v == -1) {
            return null;
        }
        int v3 = v + v1 - listView0.getFirstVisiblePosition();
        return v3 < 0 || v3 >= listView0.getChildCount() ? null : listView0.getChildAt(v3);
    }

    private int F() {
        return this.o.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int G(int v) {
        ListView listView0 = ((CascadingMenuInfo)this.i.get(this.i.size() - 1)).a();
        int[] arr_v = new int[2];
        listView0.getLocationOnScreen(arr_v);
        Rect rect0 = new Rect();
        this.p.getWindowVisibleDisplayFrame(rect0);
        if(this.q == 1) {
            return arr_v[0] + listView0.getWidth() + v <= rect0.right ? 1 : 0;
        }
        return arr_v[0] - v >= 0 ? 0 : 1;
    }

    private void H(@NonNull MenuBuilder menuBuilder0) {
        int v4;
        int v3;
        int v2;
        View view0;
        CascadingMenuInfo cascadingMenuPopup$CascadingMenuInfo0;
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.b);
        MenuAdapter menuAdapter0 = new MenuAdapter(menuBuilder0, layoutInflater0, this.f, CascadingMenuPopup.B);
        if(!this.b() && this.v) {
            menuAdapter0.e(true);
        }
        else if(this.b()) {
            menuAdapter0.e(MenuPopup.z(menuBuilder0));
        }
        int v = MenuPopup.q(menuAdapter0, null, this.b, this.c);
        MenuPopupWindow menuPopupWindow0 = this.B();
        menuPopupWindow0.p(menuAdapter0);
        menuPopupWindow0.T(v);
        menuPopupWindow0.V(this.n);
        if(this.i.size() > 0) {
            cascadingMenuPopup$CascadingMenuInfo0 = (CascadingMenuInfo)this.i.get(this.i.size() - 1);
            view0 = this.E(cascadingMenuPopup$CascadingMenuInfo0, menuBuilder0);
        }
        else {
            cascadingMenuPopup$CascadingMenuInfo0 = null;
            view0 = null;
        }
        if(view0 == null) {
            if(this.r) {
                menuPopupWindow0.l(this.t);
            }
            if(this.s) {
                menuPopupWindow0.e(this.u);
            }
            menuPopupWindow0.W(this.p());
        }
        else {
            menuPopupWindow0.r0(false);
            menuPopupWindow0.o0(null);
            int v1 = this.G(v);
            this.q = v1;
            if(Build.VERSION.SDK_INT >= 26) {
                menuPopupWindow0.R(view0);
                v2 = 0;
                v3 = 0;
            }
            else {
                int[] arr_v = new int[2];
                this.o.getLocationOnScreen(arr_v);
                int[] arr_v1 = new int[2];
                view0.getLocationOnScreen(arr_v1);
                if((this.n & 7) == 5) {
                    arr_v[0] += this.o.getWidth();
                    arr_v1[0] += view0.getWidth();
                }
                v3 = arr_v1[0] - arr_v[0];
                v2 = arr_v1[1] - arr_v[1];
            }
            if((this.n & 5) != 5) {
                v4 = v1 == 1 ? v3 + view0.getWidth() : v3 - v;
            }
            else if(v1 != 1) {
                v4 = v3 - view0.getWidth();
            }
            else {
                v4 = v3 + v;
            }
            menuPopupWindow0.l(v4);
            menuPopupWindow0.g0(true);
            menuPopupWindow0.e(v2);
        }
        CascadingMenuInfo cascadingMenuPopup$CascadingMenuInfo1 = new CascadingMenuInfo(menuPopupWindow0, menuBuilder0, this.q);
        this.i.add(cascadingMenuPopup$CascadingMenuInfo1);
        menuPopupWindow0.show();
        ListView listView0 = menuPopupWindow0.j();
        listView0.setOnKeyListener(this);
        if(cascadingMenuPopup$CascadingMenuInfo0 == null && this.w && menuBuilder0.A() != null) {
            FrameLayout frameLayout0 = (FrameLayout)layoutInflater0.inflate(layout.abc_popup_menu_header_item_layout, listView0, false);
            TextView textView0 = (TextView)frameLayout0.findViewById(0x1020016);
            frameLayout0.setEnabled(false);
            textView0.setText(menuBuilder0.A());
            listView0.addHeaderView(frameLayout0, null, false);
            menuPopupWindow0.show();
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable a() {
        return null;
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public boolean b() {
        return this.i.size() > 0 && ((CascadingMenuInfo)this.i.get(0)).a.b();
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void c(MenuBuilder menuBuilder0, boolean z) {
        int v = this.C(menuBuilder0);
        if(v < 0) {
            return;
        }
        if(v + 1 < this.i.size()) {
            ((CascadingMenuInfo)this.i.get(v + 1)).b.f(false);
        }
        CascadingMenuInfo cascadingMenuPopup$CascadingMenuInfo0 = (CascadingMenuInfo)this.i.remove(v);
        cascadingMenuPopup$CascadingMenuInfo0.b.T(this);
        if(this.A) {
            cascadingMenuPopup$CascadingMenuInfo0.a.p0(null);
            cascadingMenuPopup$CascadingMenuInfo0.a.S(0);
        }
        cascadingMenuPopup$CascadingMenuInfo0.a.dismiss();
        int v1 = this.i.size();
        this.q = v1 > 0 ? ((CascadingMenuInfo)this.i.get(v1 - 1)).c : this.F();
        if(v1 == 0) {
            this.dismiss();
            Callback menuPresenter$Callback0 = this.x;
            if(menuPresenter$Callback0 != null) {
                menuPresenter$Callback0.c(menuBuilder0, true);
            }
            ViewTreeObserver viewTreeObserver0 = this.y;
            if(viewTreeObserver0 != null) {
                if(viewTreeObserver0.isAlive()) {
                    this.y.removeGlobalOnLayoutListener(this.j);
                }
                this.y = null;
            }
            this.p.removeOnAttachStateChangeListener(this.k);
            this.z.onDismiss();
            return;
        }
        if(z) {
            ((CascadingMenuInfo)this.i.get(0)).b.f(false);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void d(Parcelable parcelable0) {
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        int v = this.i.size();
        if(v > 0) {
            CascadingMenuInfo[] arr_cascadingMenuPopup$CascadingMenuInfo = (CascadingMenuInfo[])this.i.toArray(new CascadingMenuInfo[v]);
            for(int v1 = v - 1; v1 >= 0; --v1) {
                CascadingMenuInfo cascadingMenuPopup$CascadingMenuInfo0 = arr_cascadingMenuPopup$CascadingMenuInfo[v1];
                if(cascadingMenuPopup$CascadingMenuInfo0.a.b()) {
                    cascadingMenuPopup$CascadingMenuInfo0.a.dismiss();
                }
            }
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void f(boolean z) {
        for(Object object0: this.i) {
            MenuPopup.A(((CascadingMenuInfo)object0).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean g() {
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public ListView j() {
        return this.i.isEmpty() ? null : ((CascadingMenuInfo)this.i.get(this.i.size() - 1)).a();
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void k(Callback menuPresenter$Callback0) {
        this.x = menuPresenter$Callback0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean l(SubMenuBuilder subMenuBuilder0) {
        for(Object object0: this.i) {
            CascadingMenuInfo cascadingMenuPopup$CascadingMenuInfo0 = (CascadingMenuInfo)object0;
            if(subMenuBuilder0 == cascadingMenuPopup$CascadingMenuInfo0.b) {
                cascadingMenuPopup$CascadingMenuInfo0.a().requestFocus();
                return true;
            }
            if(false) {
                break;
            }
        }
        if(subMenuBuilder0.hasVisibleItems()) {
            this.n(subMenuBuilder0);
            Callback menuPresenter$Callback0 = this.x;
            if(menuPresenter$Callback0 != null) {
                menuPresenter$Callback0.d(subMenuBuilder0);
            }
            return true;
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    public void n(MenuBuilder menuBuilder0) {
        menuBuilder0.c(this, this.b);
        if(this.b()) {
            this.H(menuBuilder0);
            return;
        }
        this.h.add(menuBuilder0);
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    protected boolean o() {
        return false;
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public void onDismiss() {
        CascadingMenuInfo cascadingMenuPopup$CascadingMenuInfo0;
        int v = this.i.size();
        for(int v1 = 0; true; ++v1) {
            cascadingMenuPopup$CascadingMenuInfo0 = null;
            if(v1 >= v) {
                break;
            }
            CascadingMenuInfo cascadingMenuPopup$CascadingMenuInfo1 = (CascadingMenuInfo)this.i.get(v1);
            if(!cascadingMenuPopup$CascadingMenuInfo1.a.b()) {
                cascadingMenuPopup$CascadingMenuInfo0 = cascadingMenuPopup$CascadingMenuInfo1;
                break;
            }
        }
        if(cascadingMenuPopup$CascadingMenuInfo0 != null) {
            cascadingMenuPopup$CascadingMenuInfo0.b.f(false);
        }
    }

    @Override  // android.view.View$OnKeyListener
    public boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 1 && v == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    public void r(@NonNull View view0) {
        if(this.o != view0) {
            this.o = view0;
            this.n = GravityCompat.d(this.m, view0.getLayoutDirection());
        }
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        if(this.b()) {
            return;
        }
        for(Object object0: this.h) {
            this.H(((MenuBuilder)object0));
        }
        this.h.clear();
        View view0 = this.o;
        this.p = view0;
        if(view0 != null) {
            boolean z = this.y == null;
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            this.y = viewTreeObserver0;
            if(z) {
                viewTreeObserver0.addOnGlobalLayoutListener(this.j);
            }
            this.p.addOnAttachStateChangeListener(this.k);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    public void t(boolean z) {
        this.v = z;
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    public void u(int v) {
        if(this.m != v) {
            this.m = v;
            this.n = GravityCompat.d(v, this.o.getLayoutDirection());
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    public void v(int v) {
        this.r = true;
        this.t = v;
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    public void w(PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.z = popupWindow$OnDismissListener0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    public void x(boolean z) {
        this.w = z;
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    public void y(int v) {
        this.s = true;
        this.u = v;
    }
}

