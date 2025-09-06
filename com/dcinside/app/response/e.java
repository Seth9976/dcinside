package com.dcinside.app.response;

import com.dcinside.app.model.D;
import com.dcinside.app.model.f0;
import com.dcinside.app.type.m.a;
import com.google.gson.annotations.c;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.m;

@s0({"SMAP\nManageGalleryResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManageGalleryResponse.kt\ncom/dcinside/app/response/ManageGalleryResponse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n1863#2,2:32\n*S KotlinDebug\n*F\n+ 1 ManageGalleryResponse.kt\ncom/dcinside/app/response/ManageGalleryResponse\n*L\n22#1:32,2\n*E\n"})
public final class e extends f0 {
    @c("mymanageList")
    @m
    private List e;

    @m
    public final List g() {
        return this.e;
    }

    public final boolean h() {
        return this.e == null ? true : this.e.isEmpty();
    }

    public final void i() {
        String s2;
        List list0 = this.e;
        if(list0 != null) {
            for(Object object0: list0) {
                D d0 = (D)object0;
                String s = d0.c();
                String s1 = null;
                if(s == null) {
                    s2 = null;
                }
                else {
                    Locale locale0 = Locale.ROOT;
                    L.o(locale0, "ROOT");
                    s2 = s.toUpperCase(locale0);
                    L.o(s2, "toUpperCase(...)");
                }
                if(L.g(s2, "MI")) {
                    a m$a0 = com.dcinside.app.type.m.d;
                    String s3 = d0.a();
                    if(s3 == null) {
                        continue;
                    }
                    d0.i(m$a0.e(s3));
                }
                else {
                    String s4 = d0.c();
                    if(s4 != null) {
                        Locale locale1 = Locale.ROOT;
                        L.o(locale1, "ROOT");
                        s1 = s4.toUpperCase(locale1);
                        L.o(s1, "toUpperCase(...)");
                    }
                    if(L.g(s1, "PR")) {
                        a m$a1 = com.dcinside.app.type.m.d;
                        String s5 = d0.a();
                        if(s5 != null) {
                            d0.i(m$a1.f(s5));
                        }
                    }
                }
            }
        }
    }

    public final void l(@m List list0) {
        this.e = list0;
    }
}

