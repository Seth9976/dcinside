package androidx.work.impl.model;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class c {
    @m
    public static SystemIdInfo a(SystemIdInfoDao systemIdInfoDao0, @l WorkGenerationalId workGenerationalId0) {
        L.p(workGenerationalId0, "id");
        return systemIdInfoDao0.a(workGenerationalId0.f(), workGenerationalId0.e());
    }

    public static void b(SystemIdInfoDao systemIdInfoDao0, @l WorkGenerationalId workGenerationalId0) {
        L.p(workGenerationalId0, "id");
        systemIdInfoDao0.f(workGenerationalId0.f(), workGenerationalId0.e());
    }
}

