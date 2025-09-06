package com.dcinside.app.type;

import com.dcinside.app.model.ManagerItem;
import com.dcinside.app.model.Q;
import com.dcinside.app.realm.A;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.response.g;
import y4.l;
import y4.m;

public final class s {
    @l
    public static final r a(@m ManagerItem managerItem0) {
        if(managerItem0 != null) {
            String s = managerItem0.m();
            return s == null ? r.f : r.d.a(s);
        }
        return r.f;
    }

    @l
    public static final r b(@m Q q0) {
        if(q0 != null) {
            String s = q0.T0();
            return s == null ? r.f : r.d.a(s);
        }
        return r.f;
    }

    @l
    public static final r c(@m A a0) {
        if(a0 != null) {
            String s = a0.T5();
            return s == null ? r.f : r.d.a(s);
        }
        return r.f;
    }

    @l
    public static final r d(@m GalleryInfo galleryInfo0) {
        if(galleryInfo0 != null) {
            String s = galleryInfo0.B();
            return s == null ? r.f : r.d.a(s);
        }
        return r.f;
    }

    @l
    public static final r e(@m g g0) {
        if(g0 != null) {
            String s = g0.E();
            return s == null ? r.f : r.d.a(s);
        }
        return r.f;
    }
}

