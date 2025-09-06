package androidx.compose.ui.text;

import androidx.compose.foundation.c;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Immutable
public final class CacheTextLayoutInput {
    @l
    private final TextLayoutInput a;

    public CacheTextLayoutInput(@l TextLayoutInput textLayoutInput0) {
        L.p(textLayoutInput0, "textLayoutInput");
        super();
        this.a = textLayoutInput0;
    }

    @l
    public final TextLayoutInput a() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CacheTextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput0 = this.a;
        if(!L.g(textLayoutInput0.n(), ((CacheTextLayoutInput)object0).a.n())) {
            return false;
        }
        if(!textLayoutInput0.m().R(((CacheTextLayoutInput)object0).a.m())) {
            return false;
        }
        if(!L.g(textLayoutInput0.i(), ((CacheTextLayoutInput)object0).a.i())) {
            return false;
        }
        if(textLayoutInput0.g() != ((CacheTextLayoutInput)object0).a.g()) {
            return false;
        }
        if(textLayoutInput0.l() != ((CacheTextLayoutInput)object0).a.l()) {
            return false;
        }
        if(!TextOverflow.g(textLayoutInput0.h(), ((CacheTextLayoutInput)object0).a.h())) {
            return false;
        }
        if(!L.g(textLayoutInput0.d(), ((CacheTextLayoutInput)object0).a.d())) {
            return false;
        }
        if(textLayoutInput0.f() != ((CacheTextLayoutInput)object0).a.f()) {
            return false;
        }
        if(textLayoutInput0.e() != ((CacheTextLayoutInput)object0).a.e()) {
            return false;
        }
        return Constraints.p(textLayoutInput0.c()) == Constraints.p(((CacheTextLayoutInput)object0).a.c()) ? Constraints.o(textLayoutInput0.c()) == Constraints.o(((CacheTextLayoutInput)object0).a.c()) : false;
    }

    @Override
    public int hashCode() {
        int v = this.a.m().S();
        int v1 = Constraints.p(this.a.c());
        int v2 = Constraints.o(this.a.c());
        return (((((((((this.a.n().hashCode() * 0x1F + v) * 0x1F + this.a.i().hashCode()) * 0x1F + this.a.g()) * 0x1F + c.a(this.a.l())) * 0x1F + TextOverflow.h(this.a.h())) * 0x1F + this.a.d().hashCode()) * 0x1F + this.a.f().hashCode()) * 0x1F + this.a.e().hashCode()) * 0x1F + v1) * 0x1F + v2;
    }
}

