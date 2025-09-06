package com.dcinside.app.dccon.setting.tag;

import android.text.InputFilter;
import android.text.Spanned;
import kotlin.text.r;

public final class h implements InputFilter {
    public final r a;

    public h(r r0) {
        this.a = r0;
    }

    @Override  // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence0, int v, int v1, Spanned spanned0, int v2, int v3) {
        return i.u(this.a, charSequence0, v, v1, spanned0, v2, v3);
    }
}

