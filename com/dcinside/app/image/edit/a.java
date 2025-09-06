package com.dcinside.app.image.edit;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public abstract class a extends Fragment {
    protected String a;

    @l
    protected final String i0() {
        String s = this.a;
        if(s != null) {
            return s;
        }
        L.S("path");
        return null;
    }

    public abstract void j0();

    protected final void k0(@l String s) {
        L.p(s, "<set-?>");
        this.a = s;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        bundle0.putString("com.dcinside.app.extra.IMAGE_PATH", this.i0());
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        if(bundle0 == null) {
            bundle0 = this.getArguments();
        }
        String s = bundle0 == null ? null : bundle0.getString("com.dcinside.app.extra.IMAGE_PATH");
        if(s == null) {
            s = "";
        }
        this.k0(s);
    }
}

