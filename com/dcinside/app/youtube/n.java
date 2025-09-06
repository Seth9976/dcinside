package com.dcinside.app.youtube;

import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import y4.l;

public final class n extends AdapterDataObserver {
    @l
    private final WeakReference a;

    public n(@l YoutubeSearchActivity youtubeSearchActivity0) {
        L.p(youtubeSearchActivity0, "activity");
        super();
        this.a = new WeakReference(youtubeSearchActivity0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$AdapterDataObserver
    public void f() {
        YoutubeSearchActivity youtubeSearchActivity0 = (YoutubeSearchActivity)this.a.get();
        if(youtubeSearchActivity0 != null) {
            youtubeSearchActivity0.g2();
        }
    }
}

