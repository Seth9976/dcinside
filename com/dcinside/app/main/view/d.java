package com.dcinside.app.main.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;
import android.widget.ViewSwitcher;
import com.dcinside.app.Application;
import com.dcinside.app.util.Ok;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.n;

public final class d implements ViewSwitcher.ViewFactory {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @n
        public final void a(@l ViewSwitcher viewSwitcher0) {
            L.p(viewSwitcher0, "switcher");
            if(viewSwitcher0.getTag(0x7F0B031F) == null) {  // id:crowd_switcher_factory_tag
                viewSwitcher0.setTag(0x7F0B031F, new d(viewSwitcher0, null));  // id:crowd_switcher_factory_tag
            }
        }
    }

    @l
    private final WeakReference a;
    @l
    public static final a b;

    static {
        d.b = new a(null);
    }

    private d(ViewSwitcher viewSwitcher0) {
        this.a = new WeakReference(viewSwitcher0);
        viewSwitcher0.setFactory(this);
    }

    public d(ViewSwitcher viewSwitcher0, w w0) {
        this(viewSwitcher0);
    }

    @n
    public static final void a(@l ViewSwitcher viewSwitcher0) {
        d.b.a(viewSwitcher0);
    }

    @Override  // android.widget.ViewSwitcher$ViewFactory
    @l
    public View makeView() {
        ViewSwitcher viewSwitcher0 = (ViewSwitcher)this.a.get();
        Context context0 = viewSwitcher0 == null ? null : viewSwitcher0.getContext();
        if(context0 == null) {
            context0 = Application.e.c();
        }
        View view0 = LayoutInflater.from(context0).inflate(0x7F0E01B5, viewSwitcher0, false);  // layout:view_crowd_item
        ColorStateList colorStateList0 = Ok.c.c(context0);
        ((TextView)view0.findViewById(0x7F0B0310)).setTextColor(colorStateList0);  // id:crowd_item_index
        L.m(view0);
        return view0;
    }
}

