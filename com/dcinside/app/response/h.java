package com.dcinside.app.response;

import com.dcinside.app.model.f0;
import com.dcinside.app.model.w;
import com.dcinside.app.type.m.a;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.jvm.internal.s0;
import y4.m;

@s0({"SMAP\nMyMiniGalleryResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyMiniGalleryResponse.kt\ncom/dcinside/app/response/MyMiniGalleryResponse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,51:1\n1863#2,2:52\n1863#2,2:54\n1863#2,2:56\n*S KotlinDebug\n*F\n+ 1 MyMiniGalleryResponse.kt\ncom/dcinside/app/response/MyMiniGalleryResponse\n*L\n38#1:52,2\n42#1:54,2\n46#1:56,2\n*E\n"})
public final class h extends f0 {
    @c("myjoinmini_in")
    @m
    private List e;
    @c("myjoinmini_hold")
    @m
    private List f;
    @c("myjoinmini_out")
    @m
    private List g;

    @m
    public final List g() {
        return this.e;
    }

    @m
    public final List h() {
        return this.f;
    }

    @m
    public final List i() {
        return this.g;
    }

    public final boolean l() {
        if((this.e == null ? true : this.e.isEmpty()) && (this.f == null ? true : this.f.isEmpty())) {
            return this.g == null ? true : this.g.isEmpty();
        }
        return false;
    }

    public final void m() {
        List list0 = this.e;
        if(list0 != null) {
            for(Object object0: list0) {
                w w0 = (w)object0;
                a m$a0 = com.dcinside.app.type.m.d;
                String s = w0.a();
                if(s != null) {
                    w0.f(m$a0.e(s));
                }
            }
        }
        List list1 = this.f;
        if(list1 != null) {
            for(Object object1: list1) {
                w w1 = (w)object1;
                a m$a1 = com.dcinside.app.type.m.d;
                String s1 = w1.a();
                if(s1 != null) {
                    w1.f(m$a1.e(s1));
                }
            }
        }
        List list2 = this.g;
        if(list2 != null) {
            for(Object object2: list2) {
                w w2 = (w)object2;
                a m$a2 = com.dcinside.app.type.m.d;
                String s2 = w2.a();
                if(s2 != null) {
                    w2.f(m$a2.e(s2));
                }
            }
        }
    }

    public final void o(@m List list0) {
        this.e = list0;
    }

    public final void q(@m List list0) {
        this.f = list0;
    }

    public final void r(@m List list0) {
        this.g = list0;
    }
}

