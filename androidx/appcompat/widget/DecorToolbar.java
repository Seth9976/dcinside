package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.core.view.ViewPropertyAnimatorCompat;

@RestrictTo({Scope.c})
public interface DecorToolbar {
    void A(int arg1);

    int B();

    void C(View arg1);

    void D();

    void E(Drawable arg1);

    void F(CharSequence arg1);

    void G(int arg1);

    Menu H();

    ViewPropertyAnimatorCompat I(int arg1, long arg2);

    ViewGroup J();

    void K(boolean arg1);

    void L(int arg1);

    void M(ScrollingTabContainerView arg1);

    boolean N();

    void O(int arg1);

    void P(Callback arg1, androidx.appcompat.view.menu.MenuBuilder.Callback arg2);

    void Q(SpinnerAdapter arg1, AdapterView.OnItemSelectedListener arg2);

    void R(SparseArray arg1);

    CharSequence S();

    void a(Drawable arg1);

    boolean b();

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    void g(Menu arg1, Callback arg2);

    Context getContext();

    int getHeight();

    CharSequence getTitle();

    int getVisibility();

    void h();

    boolean i();

    boolean j();

    boolean k();

    boolean l();

    void m(int arg1);

    void n(CharSequence arg1);

    int o();

    void p(int arg1);

    int q();

    void r(int arg1);

    void s();

    void setIcon(int arg1);

    void setIcon(Drawable arg1);

    void setLogo(int arg1);

    void setTitle(CharSequence arg1);

    void setVisibility(int arg1);

    void setWindowCallback(Window.Callback arg1);

    void setWindowTitle(CharSequence arg1);

    int t();

    void u(boolean arg1);

    void v();

    View w();

    void x(Drawable arg1);

    void y(Drawable arg1);

    void z(SparseArray arg1);
}

