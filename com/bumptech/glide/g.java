package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AbsListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.e;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.request.transition.f;
import java.util.List;
import java.util.Queue;

public class g implements AbsListView.OnScrollListener {
    public interface a {
        @NonNull
        List a(int arg1);

        @Nullable
        m b(@NonNull Object arg1);
    }

    public interface b {
        @Nullable
        int[] a(@NonNull Object arg1, int arg2, int arg3);
    }

    static final class c implements p {
        int a;
        int b;
        @Nullable
        private e c;

        @Override  // com.bumptech.glide.request.target.p
        public void A(@NonNull o o0) {
        }

        @Override  // com.bumptech.glide.request.target.p
        public void B(@Nullable Drawable drawable0) {
        }

        @Override  // com.bumptech.glide.request.target.p
        public void C(@NonNull Object object0, @Nullable f f0) {
        }

        @Override  // com.bumptech.glide.request.target.p
        public void D(@Nullable Drawable drawable0) {
        }

        @Override  // com.bumptech.glide.request.target.p
        public void E(@Nullable e e0) {
            this.c = e0;
        }

        @Override  // com.bumptech.glide.request.target.p
        public void F(@Nullable Drawable drawable0) {
        }

        @Override  // com.bumptech.glide.request.target.p
        public void G(@NonNull o o0) {
            o0.d(this.b, this.a);
        }

        @Override  // com.bumptech.glide.manager.k
        public void onDestroy() {
        }

        @Override  // com.bumptech.glide.manager.k
        public void onStart() {
        }

        @Override  // com.bumptech.glide.manager.k
        public void onStop() {
        }

        @Override  // com.bumptech.glide.request.target.p
        @Nullable
        public e z() {
            return this.c;
        }
    }

    static final class d {
        final Queue a;

        d(int v) {
            this.a = com.bumptech.glide.util.o.g(v);
            for(int v1 = 0; v1 < v; ++v1) {
                c g$c0 = new c();
                this.a.offer(g$c0);
            }
        }

        public c a(int v, int v1) {
            c g$c0 = (c)this.a.poll();
            this.a.offer(g$c0);
            g$c0.b = v;
            g$c0.a = v1;
            return g$c0;
        }
    }

    private final int a;
    private final d b;
    private final n c;
    private final a d;
    private final b e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;

    public g(@NonNull n n0, @NonNull a g$a0, @NonNull b g$b0, int v) {
        this.h = -1;
        this.j = true;
        this.c = n0;
        this.d = g$a0;
        this.e = g$b0;
        this.a = v;
        this.b = new d(v + 1);
    }

    private void a() {
        for(int v = 0; v < this.b.a.size(); ++v) {
            c g$c0 = this.b.a(0, 0);
            this.c.q(g$c0);
        }
    }

    private void b(int v, int v1) {
        int v3;
        int v2;
        if(v < v1) {
            v2 = Math.max(this.f, v);
            v3 = v1;
        }
        else {
            v3 = Math.min(this.g, v);
            v2 = v1;
        }
        int v4 = Math.min(this.i, v3);
        int v5 = Math.min(this.i, Math.max(0, v2));
        if(v < v1) {
            for(int v6 = v5; v6 < v4; ++v6) {
                this.d(this.d.a(v6), v6, true);
            }
        }
        else {
            for(int v7 = v4 - 1; v7 >= v5; --v7) {
                this.d(this.d.a(v7), v7, false);
            }
        }
        this.g = v5;
        this.f = v4;
    }

    private void c(int v, boolean z) {
        if(this.j != z) {
            this.j = z;
            this.a();
        }
        this.b(v, (z ? this.a : -this.a) + v);
    }

    private void d(List list0, int v, boolean z) {
        int v1 = list0.size();
        if(z) {
            for(int v2 = 0; v2 < v1; ++v2) {
                this.e(list0.get(v2), v, v2);
            }
            return;
        }
        for(int v3 = v1 - 1; v3 >= 0; --v3) {
            this.e(list0.get(v3), v, v3);
        }
    }

    private void e(@Nullable Object object0, int v, int v1) {
        if(object0 == null) {
            return;
        }
        int[] arr_v = this.e.a(object0, v, v1);
        if(arr_v == null) {
            return;
        }
        m m0 = this.d.b(object0);
        if(m0 == null) {
            return;
        }
        m0.n1(this.b.a(arr_v[0], arr_v[1]));
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public void onScroll(AbsListView absListView0, int v, int v1, int v2) {
        if(this.i == 0 && v2 == 0) {
            return;
        }
        this.i = v2;
        int v3 = this.h;
        if(v > v3) {
            this.c(v1 + v, true);
        }
        else if(v < v3) {
            this.c(v, false);
        }
        this.h = v;
    }

    @Override  // android.widget.AbsListView$OnScrollListener
    public void onScrollStateChanged(AbsListView absListView0, int v) {
    }
}

