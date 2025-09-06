package com.bumptech.glide.util;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.g.b;
import com.bumptech.glide.request.target.f;
import com.bumptech.glide.request.target.o;
import java.util.Arrays;

public class p implements b, o {
    static final class a extends f {
        a(@NonNull View view0) {
            super(view0);
        }

        @Override  // com.bumptech.glide.request.target.p
        public void C(@NonNull Object object0, @Nullable com.bumptech.glide.request.transition.f f0) {
        }

        @Override  // com.bumptech.glide.request.target.p
        public void F(@Nullable Drawable drawable0) {
        }

        @Override  // com.bumptech.glide.request.target.f
        protected void f(@Nullable Drawable drawable0) {
        }
    }

    private int[] a;
    private a b;

    public p() {
    }

    public p(@NonNull View view0) {
        a p$a0 = new a(view0);
        this.b = p$a0;
        p$a0.G(this);
    }

    @Override  // com.bumptech.glide.g$b
    @Nullable
    public int[] a(@NonNull Object object0, int v, int v1) {
        return this.a == null ? null : Arrays.copyOf(this.a, this.a.length);
    }

    public void b(@NonNull View view0) {
        if(this.a == null && this.b == null) {
            a p$a0 = new a(view0);
            this.b = p$a0;
            p$a0.G(this);
        }
    }

    @Override  // com.bumptech.glide.request.target.o
    public void d(int v, int v1) {
        this.a = new int[]{v, v1};
        this.b = null;
    }
}

