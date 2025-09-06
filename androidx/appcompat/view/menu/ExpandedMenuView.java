package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.TintTypedArray;

@RestrictTo({Scope.c})
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, ItemInvoker, MenuView {
    private MenuBuilder a;
    private int b;
    private static final int[] c;

    static {
        ExpandedMenuView.c = new int[]{0x10100D4, 0x1010129};
    }

    public ExpandedMenuView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x1010074);
    }

    public ExpandedMenuView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0);
        this.setOnItemClickListener(this);
        TintTypedArray tintTypedArray0 = TintTypedArray.G(context0, attributeSet0, ExpandedMenuView.c, v, 0);
        if(tintTypedArray0.C(0)) {
            this.setBackgroundDrawable(tintTypedArray0.h(0));
        }
        if(tintTypedArray0.C(1)) {
            this.setDivider(tintTypedArray0.h(1));
        }
        tintTypedArray0.I();
    }

    @Override  // androidx.appcompat.view.menu.MenuView
    public void a(MenuBuilder menuBuilder0) {
        this.a = menuBuilder0;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$ItemInvoker
    public boolean g(MenuItemImpl menuItemImpl0) {
        return this.a.P(menuItemImpl0, 0);
    }

    @Override  // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
        return this.b;
    }

    @Override  // android.widget.ListView
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.g(((MenuItemImpl)this.getAdapter().getItem(v)));
    }
}

