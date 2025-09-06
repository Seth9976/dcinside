package com.dcinside.app.model;

import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nFullProfile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullProfile.kt\ncom/dcinside/app/model/FullProfile\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,16:1\n1863#2,2:17\n774#2:19\n865#2,2:20\n*S KotlinDebug\n*F\n+ 1 FullProfile.kt\ncom/dcinside/app/model/FullProfile\n*L\n10#1:17,2\n13#1:19\n13#1:20,2\n*E\n"})
public final class y extends f0 {
    @c("profile")
    @m
    private List e;

    public y() {
        this(null, 1, null);
    }

    public y(@m List list0) {
        this.e = list0;
    }

    public y(List list0, int v, w w0) {
        if((v & 1) != 0) {
            list0 = null;
        }
        this(list0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof y ? L.g(this.e, ((y)object0).e) : false;
    }

    @m
    public final List g() {
        return this.e;
    }

    @l
    public final y h(@m List list0) {
        return new y(list0);
    }

    @Override
    public int hashCode() {
        return this.e == null ? 0 : this.e.hashCode();
    }

    public static y i(y y0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = y0.e;
        }
        return y0.h(list0);
    }

    public final void l() {
        ArrayList arrayList0;
        List list0 = this.e;
        if(list0 != null) {
            for(Object object0: list0) {
                ((ProfileInfo)object0).g();
            }
        }
        List list1 = this.e;
        if(list1 == null) {
            arrayList0 = null;
        }
        else {
            arrayList0 = new ArrayList();
            Iterator iterator1 = list1.iterator();
            while(iterator1.hasNext()) {
                iterator1.next();
            }
        }
        this.e = arrayList0;
    }

    @m
    public final List m() {
        return this.e;
    }

    public final void o(@m List list0) {
        this.e = list0;
    }

    @Override
    @l
    public String toString() {
        return "FullProfile(profiles=" + this.e + ")";
    }
}

