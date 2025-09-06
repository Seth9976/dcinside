package androidx.compose.ui.text;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ParagraphIntrinsicInfo {
    @l
    private final ParagraphIntrinsics a;
    private final int b;
    private final int c;

    public ParagraphIntrinsicInfo(@l ParagraphIntrinsics paragraphIntrinsics0, int v, int v1) {
        L.p(paragraphIntrinsics0, "intrinsics");
        super();
        this.a = paragraphIntrinsics0;
        this.b = v;
        this.c = v1;
    }

    @l
    public final ParagraphIntrinsics a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    @l
    public final ParagraphIntrinsicInfo d(@l ParagraphIntrinsics paragraphIntrinsics0, int v, int v1) {
        L.p(paragraphIntrinsics0, "intrinsics");
        return new ParagraphIntrinsicInfo(paragraphIntrinsics0, v, v1);
    }

    public static ParagraphIntrinsicInfo e(ParagraphIntrinsicInfo paragraphIntrinsicInfo0, ParagraphIntrinsics paragraphIntrinsics0, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            paragraphIntrinsics0 = paragraphIntrinsicInfo0.a;
        }
        if((v2 & 2) != 0) {
            v = paragraphIntrinsicInfo0.b;
        }
        if((v2 & 4) != 0) {
            v1 = paragraphIntrinsicInfo0.c;
        }
        return paragraphIntrinsicInfo0.d(paragraphIntrinsics0, v, v1);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ParagraphIntrinsicInfo)) {
            return false;
        }
        if(!L.g(this.a, ((ParagraphIntrinsicInfo)object0).a)) {
            return false;
        }
        return this.b == ((ParagraphIntrinsicInfo)object0).b ? this.c == ((ParagraphIntrinsicInfo)object0).c : false;
    }

    public final int f() {
        return this.c;
    }

    @l
    public final ParagraphIntrinsics g() {
        return this.a;
    }

    public final int h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c;
    }

    @Override
    @l
    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ')';
    }
}

