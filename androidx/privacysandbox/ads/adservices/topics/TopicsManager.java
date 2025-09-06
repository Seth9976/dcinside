package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public abstract class TopicsManager {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @m
        @n
        public final TopicsManager a(@l Context context0) {
            L.p(context0, "context");
            AdServicesInfo adServicesInfo0 = AdServicesInfo.a;
            if(adServicesInfo0.a() >= 5) {
                return new TopicsManagerApi33Ext5Impl(context0);
            }
            return adServicesInfo0.a() == 4 ? new TopicsManagerApi33Ext4Impl(context0) : null;
        }
    }

    @l
    public static final Companion a;

    static {
        TopicsManager.a = new Companion(null);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @m
    public abstract Object a(@l GetTopicsRequest arg1, @l d arg2);

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @m
    @n
    public static final TopicsManager b(@l Context context0) {
        return TopicsManager.a.a(context0);
    }
}

