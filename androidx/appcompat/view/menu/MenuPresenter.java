package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.c})
public interface MenuPresenter {
    public interface Callback {
        void c(@NonNull MenuBuilder arg1, boolean arg2);

        boolean d(@NonNull MenuBuilder arg1);
    }

    Parcelable a();

    void c(MenuBuilder arg1, boolean arg2);

    void d(Parcelable arg1);

    boolean e(MenuBuilder arg1, MenuItemImpl arg2);

    void f(boolean arg1);

    boolean g();

    int getId();

    boolean h(MenuBuilder arg1, MenuItemImpl arg2);

    void i(Context arg1, MenuBuilder arg2);

    void k(Callback arg1);

    boolean l(SubMenuBuilder arg1);

    MenuView m(ViewGroup arg1);
}

