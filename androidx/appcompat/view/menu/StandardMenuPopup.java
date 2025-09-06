package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.layout;
import androidx.appcompat.widget.MenuPopupWindow;

final class StandardMenuPopup extends MenuPopup implements View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener, MenuPresenter {
    private final Context b;
    private final MenuBuilder c;
    private final MenuAdapter d;
    private final boolean e;
    private final int f;
    private final int g;
    private final int h;
    final MenuPopupWindow i;
    final ViewTreeObserver.OnGlobalLayoutListener j;
    private final View.OnAttachStateChangeListener k;
    private PopupWindow.OnDismissListener l;
    private View m;
    View n;
    private Callback o;
    ViewTreeObserver p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private boolean u;
    private static final int v;

    static {
        StandardMenuPopup.v = layout.abc_popup_menu_item_layout;
    }

    public StandardMenuPopup(Context context0, MenuBuilder menuBuilder0, View view0, int v, int v1, boolean z) {
        this.j = new ViewTreeObserver.OnGlobalLayoutListener() {
            final StandardMenuPopup a;

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public void onGlobalLayout() {
                if(StandardMenuPopup.this.b() && !StandardMenuPopup.this.i.K()) {
                    View view0 = StandardMenuPopup.this.n;
                    if(view0 != null && view0.isShown()) {
                        StandardMenuPopup.this.i.show();
                        return;
                    }
                    StandardMenuPopup.this.dismiss();
                }
            }
        };
        this.k = new View.OnAttachStateChangeListener() {
            final StandardMenuPopup a;

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                ViewTreeObserver viewTreeObserver0 = StandardMenuPopup.this.p;
                if(viewTreeObserver0 != null) {
                    if(!viewTreeObserver0.isAlive()) {
                        StandardMenuPopup.this.p = view0.getViewTreeObserver();
                    }
                    StandardMenuPopup.this.p.removeGlobalOnLayoutListener(StandardMenuPopup.this.j);
                }
                view0.removeOnAttachStateChangeListener(this);
            }
        };
        this.t = 0;
        this.b = context0;
        this.c = menuBuilder0;
        this.e = z;
        this.d = new MenuAdapter(menuBuilder0, LayoutInflater.from(context0), z, StandardMenuPopup.v);
        this.g = v;
        this.h = v1;
        Resources resources0 = context0.getResources();
        this.f = Math.max(resources0.getDisplayMetrics().widthPixels / 2, resources0.getDimensionPixelSize(dimen.abc_config_prefDialogWidth));
        this.m = view0;
        this.i = new MenuPopupWindow(context0, null, v, v1);
        menuBuilder0.c(this, context0);
    }

    private boolean B() {
        if(this.b()) {
            return true;
        }
        if(!this.q) {
            View view0 = this.m;
            if(view0 != null) {
                this.n = view0;
                this.i.d0(this);
                this.i.e0(this);
                this.i.c0(true);
                View view1 = this.n;
                boolean z = this.p == null;
                ViewTreeObserver viewTreeObserver0 = view1.getViewTreeObserver();
                this.p = viewTreeObserver0;
                if(z) {
                    viewTreeObserver0.addOnGlobalLayoutListener(this.j);
                }
                view1.addOnAttachStateChangeListener(this.k);
                this.i.R(view1);
                this.i.V(this.t);
                if(!this.r) {
                    this.s = MenuPopup.q(this.d, null, this.b, this.f);
                    this.r = true;
                }
                this.i.T(this.s);
                this.i.Z(2);
                this.i.W(this.p());
                this.i.show();
                ListView listView0 = this.i.j();
                listView0.setOnKeyListener(this);
                if(this.u && this.c.A() != null) {
                    FrameLayout frameLayout0 = (FrameLayout)LayoutInflater.from(this.b).inflate(layout.abc_popup_menu_header_item_layout, listView0, false);
                    TextView textView0 = (TextView)frameLayout0.findViewById(0x1020016);
                    if(textView0 != null) {
                        textView0.setText(this.c.A());
                    }
                    frameLayout0.setEnabled(false);
                    listView0.addHeaderView(frameLayout0, null, false);
                }
                this.i.p(this.d);
                this.i.show();
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable a() {
        return null;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public boolean b() {
        return !this.q && this.i.b();
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void c(MenuBuilder menuBuilder0, boolean z) {
        if(menuBuilder0 != this.c) {
            return;
        }
        this.dismiss();
        Callback menuPresenter$Callback0 = this.o;
        if(menuPresenter$Callback0 != null) {
            menuPresenter$Callback0.c(menuBuilder0, z);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void d(Parcelable parcelable0) {
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        if(this.b()) {
            this.i.dismiss();
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void f(boolean z) {
        this.r = false;
        MenuAdapter menuAdapter0 = this.d;
        if(menuAdapter0 != null) {
            menuAdapter0.notifyDataSetChanged();
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean g() {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public ListView j() {
        return this.i.j();
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void k(Callback menuPresenter$Callback0) {
        this.o = menuPresenter$Callback0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean l(SubMenuBuilder subMenuBuilder0) {
        if(subMenuBuilder0.hasVisibleItems()) {
            MenuPopupHelper menuPopupHelper0 = new MenuPopupHelper(this.b, subMenuBuilder0, this.n, this.e, this.g, this.h);
            menuPopupHelper0.a(this.o);
            menuPopupHelper0.i(MenuPopup.z(subMenuBuilder0));
            menuPopupHelper0.k(this.l);
            this.l = null;
            this.c.f(false);
            int v = this.i.k();
            int v1 = this.i.h();
            if((Gravity.getAbsoluteGravity(this.t, this.m.getLayoutDirection()) & 7) == 5) {
                v += this.m.getWidth();
            }
            if(menuPopupHelper0.p(v, v1)) {
                Callback menuPresenter$Callback0 = this.o;
                if(menuPresenter$Callback0 != null) {
                    menuPresenter$Callback0.d(subMenuBuilder0);
                }
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    public void n(MenuBuilder menuBuilder0) {
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public void onDismiss() {
        this.q = true;
        this.c.close();
        ViewTreeObserver viewTreeObserver0 = this.p;
        if(viewTreeObserver0 != null) {
            if(!viewTreeObserver0.isAlive()) {
                this.p = this.n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.j);
            this.p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        PopupWindow.OnDismissListener popupWindow$OnDismissListener0 = this.l;
        if(popupWindow$OnDismissListener0 != null) {
            popupWindow$OnDismissListener0.onDismiss();
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
    public void r(View view0) {
        this.m = view0;
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        if(!this.B()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    public void t(boolean z) {
        this.d.e(z);
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    public void u(int v) {
        this.t = v;
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    public void v(int v) {
        this.i.l(v);
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    public void w(PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.l = popupWindow$OnDismissListener0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    public void x(boolean z) {
        this.u = z;
    }

    @Override  // androidx.appcompat.view.menu.MenuPopup
    public void y(int v) {
        this.i.e(v);
    }
}

