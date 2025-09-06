package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.RequiresApi;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@RequiresApi(33)
public final class WebSourceRegistrationRequest {
    public static final class Builder {
        @l
        private final List a;
        @l
        private final Uri b;
        @m
        private InputEvent c;
        @m
        private Uri d;
        @m
        private Uri e;
        @m
        private Uri f;

        public Builder(@l List list0, @l Uri uri0) {
            L.p(list0, "webSourceParams");
            L.p(uri0, "topOriginUri");
            super();
            this.a = list0;
            this.b = uri0;
        }

        @l
        public final WebSourceRegistrationRequest a() {
            return new WebSourceRegistrationRequest(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        @l
        public final Builder b(@m Uri uri0) {
            this.d = uri0;
            return this;
        }

        @l
        public final Builder c(@l InputEvent inputEvent0) {
            L.p(inputEvent0, "inputEvent");
            this.c = inputEvent0;
            return this;
        }

        @l
        public final Builder d(@m Uri uri0) {
            this.f = uri0;
            return this;
        }

        @l
        public final Builder e(@m Uri uri0) {
            this.e = uri0;
            return this;
        }
    }

    @l
    private final List a;
    @l
    private final Uri b;
    @m
    private final InputEvent c;
    @m
    private final Uri d;
    @m
    private final Uri e;
    @m
    private final Uri f;

    public WebSourceRegistrationRequest(@l List list0, @l Uri uri0, @m InputEvent inputEvent0, @m Uri uri1, @m Uri uri2, @m Uri uri3) {
        L.p(list0, "webSourceParams");
        L.p(uri0, "topOriginUri");
        super();
        this.a = list0;
        this.b = uri0;
        this.c = inputEvent0;
        this.d = uri1;
        this.e = uri2;
        this.f = uri3;
    }

    public WebSourceRegistrationRequest(List list0, Uri uri0, InputEvent inputEvent0, Uri uri1, Uri uri2, Uri uri3, int v, w w0) {
        this(list0, uri0, ((v & 4) == 0 ? inputEvent0 : null), ((v & 8) == 0 ? uri1 : null), ((v & 16) == 0 ? uri2 : null), ((v & 0x20) == 0 ? uri3 : null));
    }

    @m
    public final Uri a() {
        return this.d;
    }

    @m
    public final InputEvent b() {
        return this.c;
    }

    @l
    public final Uri c() {
        return this.b;
    }

    @m
    public final Uri d() {
        return this.f;
    }

    @m
    public final Uri e() {
        return this.e;
    }

    // 去混淆评级： 低(23)
    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof WebSourceRegistrationRequest ? L.g(this.a, ((WebSourceRegistrationRequest)object0).a) && L.g(this.e, ((WebSourceRegistrationRequest)object0).e) && L.g(this.d, ((WebSourceRegistrationRequest)object0).d) && L.g(this.b, ((WebSourceRegistrationRequest)object0).b) && L.g(this.c, ((WebSourceRegistrationRequest)object0).c) && L.g(this.f, ((WebSourceRegistrationRequest)object0).f) : false;
    }

    @l
    public final List f() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode() * 0x1F + this.b.hashCode();
        InputEvent inputEvent0 = this.c;
        if(inputEvent0 != null) {
            v = v * 0x1F + inputEvent0.hashCode();
        }
        Uri uri0 = this.d;
        if(uri0 != null) {
            v = v * 0x1F + uri0.hashCode();
        }
        Uri uri1 = this.e;
        if(uri1 != null) {
            v = v * 0x1F + uri1.hashCode();
        }
        int v1 = v * 0x1F + this.b.hashCode();
        InputEvent inputEvent1 = this.c;
        if(inputEvent1 != null) {
            v1 = v1 * 0x1F + inputEvent1.hashCode();
        }
        return this.f == null ? v1 : v1 * 0x1F + this.f.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "WebSourceRegistrationRequest { " + ("WebSourceParams=[" + this.a + "], TopOriginUri=" + this.b + ", InputEvent=" + this.c + ", AppDestination=" + this.d + ", WebDestination=" + this.e + ", VerifiedDestination=" + this.f) + " }";
    }
}

