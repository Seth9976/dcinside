package com.dcinside.app.post;

import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.ll;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nOwnNotices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnNotices.kt\ncom/dcinside/app/post/OwnNotices\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
public final class s {
    public interface a {
        void w();
    }

    @l
    private WeakReference a;

    public s(@l a s$a0) {
        L.p(s$a0, "onNewNotice");
        super();
        this.a = new WeakReference(s$a0);
    }

    public final void a(@m GalleryInfo galleryInfo0) {
        a s$a0 = (a)this.a.get();
        if(s$a0 == null) {
            return;
        }
        long v = this.b(galleryInfo0);
        if(TimeUnit.DAYS.toMillis(7L) + v < System.currentTimeMillis()) {
            return;
        }
        long v1 = ll.r((galleryInfo0 == null ? null : galleryInfo0.r()));
        if(v1 == -1L || v1 < v) {
            s$a0.w();
        }
    }

    private final long b(GalleryInfo galleryInfo0) {
        if(galleryInfo0 != null) {
            String s = galleryInfo0.K();
            return s == null ? 0L : Bk.e(s);
        }
        return 0L;
    }

    public final void c(@m GalleryInfo galleryInfo0) {
        if(galleryInfo0 == null) {
            return;
        }
        long v = this.b(galleryInfo0);
        if(v >= 0L) {
            ll.o0(galleryInfo0.r(), v);
        }
    }
}

