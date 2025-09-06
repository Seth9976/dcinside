package V;

import com.google.gson.annotations.c;

public final class m {
    @c("isEnabled")
    private final boolean a;
    @c("activityEnable")
    private final boolean b;
    @c("keywordEnable")
    private final boolean c;
    @c("galleryEnable")
    private final boolean d;
    @c("attentionEnable")
    private final boolean e;
    @c("noticeEnable")
    private final boolean f;
    @c("userEnable")
    private final boolean g;
    @c("postLikeEnable")
    private final boolean h;

    public m(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.f;
    }

    public final boolean f() {
        return this.h;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.a;
    }
}

