package com.bumptech.glide.request.transition;

import android.view.View;

public class j implements f {
    public interface a {
        void a(View arg1);
    }

    private final a a;

    public j(a j$a0) {
        this.a = j$a0;
    }

    @Override  // com.bumptech.glide.request.transition.f
    public boolean a(Object object0, com.bumptech.glide.request.transition.f.a f$a0) {
        if(f$a0.getView() != null) {
            View view0 = f$a0.getView();
            this.a.a(view0);
        }
        return false;
    }
}

