package com.dcinside.app.model;

import com.google.gson.annotations.c;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class i {
    @c("result")
    @m
    private final Boolean a;
    @c("msg")
    @m
    private final String b;
    @c("prompt_list")
    @m
    private final List c;
    @c("list_cnt")
    @m
    private final Long d;

    public i() {
        this(null, null, null, null, 15, null);
    }

    public i(@m Boolean boolean0, @m String s, @m List list0, @m Long long0) {
        this.a = boolean0;
        this.b = s;
        this.c = list0;
        this.d = long0;
    }

    public i(Boolean boolean0, String s, List list0, Long long0, int v, w w0) {
        if((v & 1) != 0) {
            boolean0 = null;
        }
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            list0 = null;
        }
        if((v & 8) != 0) {
            long0 = null;
        }
        this(boolean0, s, list0, long0);
    }

    @m
    public final Boolean a() {
        return this.a;
    }

    @m
    public final String b() {
        return this.b;
    }

    @m
    public final List c() {
        return this.c;
    }

    @m
    public final Long d() {
        return this.d;
    }

    @l
    public final i e(@m Boolean boolean0, @m String s, @m List list0, @m Long long0) {
        return new i(boolean0, s, list0, long0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i)) {
            return false;
        }
        if(!L.g(this.a, ((i)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((i)object0).b)) {
            return false;
        }
        return L.g(this.c, ((i)object0).c) ? L.g(this.d, ((i)object0).d) : false;
    }

    public static i f(i i0, Boolean boolean0, String s, List list0, Long long0, int v, Object object0) {
        if((v & 1) != 0) {
            boolean0 = i0.a;
        }
        if((v & 2) != 0) {
            s = i0.b;
        }
        if((v & 4) != 0) {
            list0 = i0.c;
        }
        if((v & 8) != 0) {
            long0 = i0.d;
        }
        return i0.e(boolean0, s, list0, long0);
    }

    @m
    public final Long g() {
        return this.d;
    }

    @m
    public final List h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        Long long0 = this.d;
        if(long0 != null) {
            v = long0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @m
    public final String i() {
        return this.b;
    }

    @m
    public final Boolean j() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "AiPromptLoadResult(result=" + this.a + ", msg=" + this.b + ", list=" + this.c + ", count=" + this.d + ")";
    }
}

