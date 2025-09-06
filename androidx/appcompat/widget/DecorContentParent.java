package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.Window.Callback;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter.Callback;

@RestrictTo({Scope.c})
public interface DecorContentParent {
    boolean b();

    boolean c();

    boolean d();

    boolean e();

    boolean f();

    void g(Menu arg1, Callback arg2);

    CharSequence getTitle();

    void h();

    boolean i();

    boolean j();

    void k(SparseArray arg1);

    void m(SparseArray arg1);

    void o(int arg1);

    void q();

    void setIcon(int arg1);

    void setIcon(Drawable arg1);

    void setLogo(int arg1);

    void setUiOptions(int arg1);

    void setWindowCallback(Window.Callback arg1);

    void setWindowTitle(CharSequence arg1);
}

