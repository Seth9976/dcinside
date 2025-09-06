package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(33)
public final class WebTriggerRegistrationRequest {
    @l
    private final List a;
    @l
    private final Uri b;

    public WebTriggerRegistrationRequest(@l List list0, @l Uri uri0) {
        L.p(list0, "webTriggerParams");
        L.p(uri0, "destination");
        super();
        this.a = list0;
        this.b = uri0;
    }

    @l
    public final Uri a() {
        return this.b;
    }

    @l
    public final List b() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof WebTriggerRegistrationRequest ? L.g(this.a, ((WebTriggerRegistrationRequest)object0).a) && L.g(this.b, ((WebTriggerRegistrationRequest)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.a + ", Destination=" + this.b;
    }
}

