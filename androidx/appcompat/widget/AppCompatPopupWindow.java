package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.styleable;
import androidx.core.widget.PopupWindowCompat;

class AppCompatPopupWindow extends PopupWindow {
    private boolean a;
    private static final boolean b;

    static {
        AppCompatPopupWindow.b = false;
    }

    public AppCompatPopupWindow(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v) {
        super(context0, attributeSet0, v);
        this.a(context0, attributeSet0, v, 0);
    }

    public AppCompatPopupWindow(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        super(context0, attributeSet0, v, v1);
        this.a(context0, attributeSet0, v, v1);
    }

    private void a(Context context0, AttributeSet attributeSet0, int v, int v1) {
        TintTypedArray tintTypedArray0 = TintTypedArray.G(context0, attributeSet0, styleable.PopupWindow, v, v1);
        if(tintTypedArray0.C(styleable.PopupWindow_overlapAnchor)) {
            this.b(tintTypedArray0.a(2, false));
        }
        this.setBackgroundDrawable(tintTypedArray0.h(styleable.PopupWindow_android_popupBackground));
        tintTypedArray0.I();
    }

    private void b(boolean z) {
        if(AppCompatPopupWindow.b) {
            this.a = z;
            return;
        }
        PopupWindowCompat.c(this, z);
    }

    @Override  // android.widget.PopupWindow
    public void showAsDropDown(View view0, int v, int v1) {
        if(AppCompatPopupWindow.b && this.a) {
            v1 -= view0.getHeight();
        }
        super.showAsDropDown(view0, v, v1);
    }

    @Override  // android.widget.PopupWindow
    public void showAsDropDown(View view0, int v, int v1, int v2) {
        if(AppCompatPopupWindow.b && this.a) {
            v1 -= view0.getHeight();
        }
        super.showAsDropDown(view0, v, v1, v2);
    }

    @Override  // android.widget.PopupWindow
    public void update(View view0, int v, int v1, int v2, int v3) {
        if(AppCompatPopupWindow.b && this.a) {
            v1 -= view0.getHeight();
        }
        super.update(view0, v, v1, v2, v3);
    }
}

