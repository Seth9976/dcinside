package androidx.appcompat.view.menu;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.annotation.NonNull;
import androidx.appcompat.R.layout;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AlertDialog;

class MenuDialogHelper implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, Callback {
    private MenuBuilder a;
    private AlertDialog b;
    ListMenuPresenter c;
    private Callback d;

    public MenuDialogHelper(MenuBuilder menuBuilder0) {
        this.a = menuBuilder0;
    }

    public void a() {
        AlertDialog alertDialog0 = this.b;
        if(alertDialog0 != null) {
            alertDialog0.dismiss();
        }
    }

    public void b(Callback menuPresenter$Callback0) {
        this.d = menuPresenter$Callback0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
    public void c(@NonNull MenuBuilder menuBuilder0, boolean z) {
        if(z || menuBuilder0 == this.a) {
            this.a();
        }
        Callback menuPresenter$Callback0 = this.d;
        if(menuPresenter$Callback0 != null) {
            menuPresenter$Callback0.c(menuBuilder0, z);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
    public boolean d(@NonNull MenuBuilder menuBuilder0) {
        return this.d == null ? false : this.d.d(menuBuilder0);
    }

    public void e(IBinder iBinder0) {
        MenuBuilder menuBuilder0 = this.a;
        Builder alertDialog$Builder0 = new Builder(menuBuilder0.x());
        ListMenuPresenter listMenuPresenter0 = new ListMenuPresenter(alertDialog$Builder0.getContext(), layout.abc_list_menu_item_layout);
        this.c = listMenuPresenter0;
        listMenuPresenter0.k(this);
        this.a.b(this.c);
        alertDialog$Builder0.a(this.c.b(), this);
        View view0 = menuBuilder0.B();
        if(view0 == null) {
            alertDialog$Builder0.f(menuBuilder0.z()).setTitle(menuBuilder0.A());
        }
        else {
            alertDialog$Builder0.d(view0);
        }
        alertDialog$Builder0.x(this);
        AlertDialog alertDialog0 = alertDialog$Builder0.create();
        this.b = alertDialog0;
        alertDialog0.setOnDismissListener(this);
        WindowManager.LayoutParams windowManager$LayoutParams0 = this.b.getWindow().getAttributes();
        windowManager$LayoutParams0.type = 1003;
        if(iBinder0 != null) {
            windowManager$LayoutParams0.token = iBinder0;
        }
        windowManager$LayoutParams0.flags |= 0x20000;
        this.b.show();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public void onClick(DialogInterface dialogInterface0, int v) {
        this.a.P(((MenuItemImpl)this.c.b().getItem(v)), 0);
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public void onDismiss(DialogInterface dialogInterface0) {
        this.c.c(this.a, true);
    }

    @Override  // android.content.DialogInterface$OnKeyListener
    public boolean onKey(DialogInterface dialogInterface0, int v, KeyEvent keyEvent0) {
        if(v == 4 || v == 82) {
            if(keyEvent0.getAction() == 0 && keyEvent0.getRepeatCount() == 0) {
                Window window0 = this.b.getWindow();
                if(window0 != null) {
                    View view0 = window0.getDecorView();
                    if(view0 != null) {
                        KeyEvent.DispatcherState keyEvent$DispatcherState0 = view0.getKeyDispatcherState();
                        if(keyEvent$DispatcherState0 != null) {
                            keyEvent$DispatcherState0.startTracking(keyEvent0, this);
                            return true;
                        }
                    }
                }
            }
            else if(keyEvent0.getAction() == 1 && !keyEvent0.isCanceled()) {
                Window window1 = this.b.getWindow();
                if(window1 != null) {
                    View view1 = window1.getDecorView();
                    if(view1 != null) {
                        KeyEvent.DispatcherState keyEvent$DispatcherState1 = view1.getKeyDispatcherState();
                        if(keyEvent$DispatcherState1 != null && keyEvent$DispatcherState1.isTracking(keyEvent0)) {
                            this.a.f(true);
                            dialogInterface0.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.a.performShortcut(v, keyEvent0, 0);
    }
}

