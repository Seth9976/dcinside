package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.c;
import com.bumptech.glide.n;
import com.bumptech.glide.util.o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class l {
    final class b implements p {
        private final FragmentManager a;
        final l b;

        b(FragmentManager fragmentManager0) {
            this.a = fragmentManager0;
        }

        @Override  // com.bumptech.glide.manager.p
        @NonNull
        public Set a() {
            Set set0 = new HashSet();
            this.b(this.a, set0);
            return set0;
        }

        private void b(FragmentManager fragmentManager0, Set set0) {
            List list0 = fragmentManager0.I0();
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Fragment fragment0 = (Fragment)list0.get(v1);
                this.b(fragment0.getChildFragmentManager(), set0);
                n n0 = l.this.a(fragment0.getLifecycle());
                if(n0 != null) {
                    set0.add(n0);
                }
            }
        }
    }

    final Map a;
    @NonNull
    private final com.bumptech.glide.manager.o.b b;

    l(@NonNull com.bumptech.glide.manager.o.b o$b0) {
        this.a = new HashMap();
        this.b = o$b0;
    }

    n a(Lifecycle lifecycle0) {
        o.b();
        return (n)this.a.get(lifecycle0);
    }

    n b(Context context0, c c0, Lifecycle lifecycle0, FragmentManager fragmentManager0, boolean z) {
        class a implements k {
            final Lifecycle a;
            final l b;

            a(Lifecycle lifecycle0) {
                this.a = lifecycle0;
                super();
            }

            @Override  // com.bumptech.glide.manager.k
            public void onDestroy() {
                l.this.a.remove(this.a);
            }

            @Override  // com.bumptech.glide.manager.k
            public void onStart() {
            }

            @Override  // com.bumptech.glide.manager.k
            public void onStop() {
            }
        }

        o.b();
        n n0 = this.a(lifecycle0);
        if(n0 == null) {
            LifecycleLifecycle lifecycleLifecycle0 = new LifecycleLifecycle(lifecycle0);
            b l$b0 = new b(this, fragmentManager0);
            n n1 = this.b.a(c0, lifecycleLifecycle0, l$b0, context0);
            this.a.put(lifecycle0, n1);
            lifecycleLifecycle0.b(new a(this, lifecycle0));
            if(z) {
                n1.onStart();
            }
            return n1;
        }
        return n0;
    }
}

