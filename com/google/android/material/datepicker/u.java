package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

abstract class u extends Fragment {
    protected final LinkedHashSet a;

    u() {
        this.a = new LinkedHashSet();
    }

    boolean i0(t t0) {
        return this.a.add(t0);
    }

    void j0() {
        this.a.clear();
    }

    abstract DateSelector k0();

    boolean l0(t t0) {
        return this.a.remove(t0);
    }
}

