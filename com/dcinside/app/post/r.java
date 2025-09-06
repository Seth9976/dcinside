package com.dcinside.app.post;

import com.dcinside.app.realm.A;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.type.s;
import io.realm.F0;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nOwnManagerSituations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnManagerSituations.kt\ncom/dcinside/app/post/OwnManagerSituations\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n120#2,3:59\n124#2:63\n120#2,3:64\n124#2:68\n1#3:62\n1#3:67\n*S KotlinDebug\n*F\n+ 1 OwnManagerSituations.kt\ncom/dcinside/app/post/OwnManagerSituations\n*L\n18#1:59,3\n18#1:63\n46#1:64,3\n46#1:68\n18#1:62\n46#1:67\n*E\n"})
public final class r {
    public interface a {
        void r(@l A arg1);
    }

    @l
    private WeakReference a;
    @m
    private A b;

    public r(@l a r$a0) {
        L.p(r$a0, "onChange");
        super();
        this.a = new WeakReference(r$a0);
    }

    public final void a(@m GalleryInfo galleryInfo0) {
        if(galleryInfo0 == null) {
            return;
        }
        F0 f00 = F0.g4();
        try {
            L.m(f00);
            long v = TimeUnit.DAYS.toMillis(7L);
            long v1 = this.b == null ? System.currentTimeMillis() : this.b.U5();
            this.b = A.h.c(f00, galleryInfo0, System.currentTimeMillis() + v, v1);
            a r$a0 = (a)this.a.get();
            if(r$a0 != null) {
                A a0 = this.b;
                L.m(a0);
                r$a0.r(a0);
            }
            goto label_18;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            c.a(f00, throwable0);
            throw throwable1;
        }
    label_18:
        c.a(f00, null);
    }

    public final void b(@m GalleryInfo galleryInfo0) {
        int v1;
        if(galleryInfo0 == null) {
            return;
        }
        F0 f00 = F0.g4();
        try {
            L.m(f00);
            int v = 1;
            if(this.b == null) {
                com.dcinside.app.realm.A.a a$a0 = A.h;
                String s = galleryInfo0.r();
                L.m(s);
                A a0 = a$a0.a(f00, s);
                if(a0 == null) {
                    a0 = com.dcinside.app.realm.A.a.d(a$a0, f00, galleryInfo0, (galleryInfo0.B() == null ? 0x7FFFFFFFFFFFFFFFL : 0L), 0L, 8, null);
                }
                this.b = a0;
                v1 = 1;
            }
            else {
                v1 = 0;
            }
            if(L.g((this.b == null ? null : this.b.T5()), galleryInfo0.B())) {
                v = v1;
            }
            else {
                long v2 = s.d(galleryInfo0) == com.dcinside.app.type.r.f ? 0x7FFFFFFFFFFFFFFFL : 0L;
                this.b = com.dcinside.app.realm.A.a.d(A.h, f00, galleryInfo0, v2, 0L, 8, null);
            }
            if(v != 0) {
                a r$a0 = (a)this.a.get();
                if(r$a0 != null) {
                    A a1 = this.b;
                    L.m(a1);
                    r$a0.r(a1);
                }
            }
        }
        catch(Throwable throwable0) {
            c.a(f00, throwable0);
            throw throwable0;
        }
        c.a(f00, null);
    }
}

