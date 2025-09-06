package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.c;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(33)
public final class WebSourceParams {
    @l
    private final Uri a;
    private final boolean b;

    public WebSourceParams(@l Uri uri0, boolean z) {
        L.p(uri0, "registrationUri");
        super();
        this.a = uri0;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    @l
    public final Uri b() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof WebSourceParams ? L.g(this.a, ((WebSourceParams)object0).a) && this.b == ((WebSourceParams)object0).b : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + c.a(this.b);
    }

    @Override
    @l
    public String toString() {
        return "WebSourceParams { RegistrationUri=" + this.a + ", DebugKeyAllowed=" + this.b + " }";
    }
}

