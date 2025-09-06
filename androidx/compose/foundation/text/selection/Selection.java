package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class Selection {
    @Immutable
    public static final class AnchorInfo {
        @l
        private final ResolvedTextDirection a;
        private final int b;
        private final long c;

        public AnchorInfo(@l ResolvedTextDirection resolvedTextDirection0, int v, long v1) {
            L.p(resolvedTextDirection0, "direction");
            super();
            this.a = resolvedTextDirection0;
            this.b = v;
            this.c = v1;
        }

        @l
        public final ResolvedTextDirection a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final long c() {
            return this.c;
        }

        @l
        public final AnchorInfo d(@l ResolvedTextDirection resolvedTextDirection0, int v, long v1) {
            L.p(resolvedTextDirection0, "direction");
            return new AnchorInfo(resolvedTextDirection0, v, v1);
        }

        public static AnchorInfo e(AnchorInfo selection$AnchorInfo0, ResolvedTextDirection resolvedTextDirection0, int v, long v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                resolvedTextDirection0 = selection$AnchorInfo0.a;
            }
            if((v2 & 2) != 0) {
                v = selection$AnchorInfo0.b;
            }
            if((v2 & 4) != 0) {
                v1 = selection$AnchorInfo0.c;
            }
            return selection$AnchorInfo0.d(resolvedTextDirection0, v, v1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof AnchorInfo)) {
                return false;
            }
            if(this.a != ((AnchorInfo)object0).a) {
                return false;
            }
            return this.b == ((AnchorInfo)object0).b ? this.c == ((AnchorInfo)object0).c : false;
        }

        @l
        public final ResolvedTextDirection f() {
            return this.a;
        }

        public final int g() {
            return this.b;
        }

        public final long h() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return (this.a.hashCode() * 0x1F + this.b) * 0x1F + ((int)(this.c ^ this.c >>> 0x20));
        }

        @Override
        @l
        public String toString() {
            return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
        }
    }

    @l
    private final AnchorInfo a;
    @l
    private final AnchorInfo b;
    private final boolean c;

    public Selection(@l AnchorInfo selection$AnchorInfo0, @l AnchorInfo selection$AnchorInfo1, boolean z) {
        L.p(selection$AnchorInfo0, "start");
        L.p(selection$AnchorInfo1, "end");
        super();
        this.a = selection$AnchorInfo0;
        this.b = selection$AnchorInfo1;
        this.c = z;
    }

    public Selection(AnchorInfo selection$AnchorInfo0, AnchorInfo selection$AnchorInfo1, boolean z, int v, w w0) {
        if((v & 4) != 0) {
            z = false;
        }
        this(selection$AnchorInfo0, selection$AnchorInfo1, z);
    }

    @l
    public final AnchorInfo a() {
        return this.a;
    }

    @l
    public final AnchorInfo b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    @l
    public final Selection d(@l AnchorInfo selection$AnchorInfo0, @l AnchorInfo selection$AnchorInfo1, boolean z) {
        L.p(selection$AnchorInfo0, "start");
        L.p(selection$AnchorInfo1, "end");
        return new Selection(selection$AnchorInfo0, selection$AnchorInfo1, z);
    }

    public static Selection e(Selection selection0, AnchorInfo selection$AnchorInfo0, AnchorInfo selection$AnchorInfo1, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            selection$AnchorInfo0 = selection0.a;
        }
        if((v & 2) != 0) {
            selection$AnchorInfo1 = selection0.b;
        }
        if((v & 4) != 0) {
            z = selection0.c;
        }
        return selection0.d(selection$AnchorInfo0, selection$AnchorInfo1, z);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Selection)) {
            return false;
        }
        if(!L.g(this.a, ((Selection)object0).a)) {
            return false;
        }
        return L.g(this.b, ((Selection)object0).b) ? this.c == ((Selection)object0).c : false;
    }

    @l
    public final AnchorInfo f() {
        return this.b;
    }

    public final boolean g() {
        return this.c;
    }

    @l
    public final AnchorInfo h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        int v2 = this.c;
        if(v2) {
            v2 = 1;
        }
        return (v * 0x1F + v1) * 0x1F + v2;
    }

    @l
    public final Selection i(@m Selection selection0) {
        if(selection0 == null) {
            return this;
        }
        return this.c ? Selection.e(this, selection0.a, null, false, 6, null) : Selection.e(this, null, selection0.b, false, 5, null);
    }

    public final long j() {
        return TextRangeKt.b(this.a.g(), this.b.g());
    }

    @Override
    @l
    public String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}

