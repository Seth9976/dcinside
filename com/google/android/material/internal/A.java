package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestrictTo({Scope.b})
@UiThread
public class a {
    public interface b {
        void a(@NonNull Set arg1);
    }

    private final Map a;
    private final Set b;
    private b c;
    private boolean d;
    private boolean e;

    public a() {
        this.a = new HashMap();
        this.b = new HashSet();
    }

    public void e(m m0) {
        class com.google.android.material.internal.a.a implements com.google.android.material.internal.m.a {
            final a a;

            @Override  // com.google.android.material.internal.m$a
            public void a(Object object0, boolean z) {
                this.b(((m)object0), z);
            }

            public void b(m m0, boolean z) {
                if(z) {
                    if(a.this.g(m0)) {
                        a.this.n();
                    }
                }
                else if(a.this.t(m0, a.this.e)) {
                    a.this.n();
                }
            }
        }

        Integer integer0 = m0.getId();
        this.a.put(integer0, m0);
        if(m0.isChecked()) {
            this.g(m0);
        }
        m0.setInternalOnCheckedChangeListener(new com.google.android.material.internal.a.a(this));
    }

    public void f(@IdRes int v) {
        m m0 = (m)this.a.get(v);
        if(m0 == null) {
            return;
        }
        if(this.g(m0)) {
            this.n();
        }
    }

    private boolean g(@NonNull m m0) {
        int v = m0.getId();
        if(this.b.contains(v)) {
            return false;
        }
        Integer integer0 = this.k();
        m m1 = (m)this.a.get(integer0);
        if(m1 != null) {
            this.t(m1, false);
        }
        boolean z = this.b.add(v);
        if(!m0.isChecked()) {
            m0.setChecked(true);
        }
        return z;
    }

    public void h() {
        boolean z = this.b.isEmpty();
        for(Object object0: this.a.values()) {
            this.t(((m)object0), false);
        }
        if(!z) {
            this.n();
        }
    }

    @NonNull
    public Set i() {
        return new HashSet(this.b);
    }

    @NonNull
    public List j(@NonNull ViewGroup viewGroup0) {
        Set set0 = this.i();
        List list0 = new ArrayList();
        for(int v = 0; v < viewGroup0.getChildCount(); ++v) {
            View view0 = viewGroup0.getChildAt(v);
            if(view0 instanceof m && set0.contains(view0.getId())) {
                list0.add(view0.getId());
            }
        }
        return list0;
    }

    @IdRes
    public int k() {
        return this.d && !this.b.isEmpty() ? this.b.iterator().next() : -1;
    }

    public boolean l() {
        return this.e;
    }

    public boolean m() {
        return this.d;
    }

    private void n() {
        b a$b0 = this.c;
        if(a$b0 != null) {
            a$b0.a(this.i());
        }
    }

    public void o(m m0) {
        m0.setInternalOnCheckedChangeListener(null);
        Integer integer0 = m0.getId();
        this.a.remove(integer0);
        Integer integer1 = m0.getId();
        this.b.remove(integer1);
    }

    public void p(@Nullable b a$b0) {
        this.c = a$b0;
    }

    public void q(boolean z) {
        this.e = z;
    }

    public void r(boolean z) {
        if(this.d != z) {
            this.d = z;
            this.h();
        }
    }

    public void s(@IdRes int v) {
        m m0 = (m)this.a.get(v);
        if(m0 == null) {
            return;
        }
        if(this.t(m0, this.e)) {
            this.n();
        }
    }

    private boolean t(@NonNull m m0, boolean z) {
        int v = m0.getId();
        if(!this.b.contains(v)) {
            return false;
        }
        if(z && this.b.size() == 1 && this.b.contains(v)) {
            m0.setChecked(true);
            return false;
        }
        boolean z1 = this.b.remove(v);
        if(m0.isChecked()) {
            m0.setChecked(false);
        }
        return z1;
    }
}

