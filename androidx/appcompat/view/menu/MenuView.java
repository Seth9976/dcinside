package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.c})
public interface MenuView {
    public interface ItemView {
        boolean d();

        void e(boolean arg1, char arg2);

        void f(MenuItemImpl arg1, int arg2);

        MenuItemImpl getItemData();

        boolean h();

        void setCheckable(boolean arg1);

        void setChecked(boolean arg1);

        void setEnabled(boolean arg1);

        void setIcon(Drawable arg1);

        void setTitle(CharSequence arg1);
    }

    void a(MenuBuilder arg1);

    int getWindowAnimations();
}

