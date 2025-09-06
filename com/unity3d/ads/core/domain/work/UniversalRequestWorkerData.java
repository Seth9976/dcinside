package com.unity3d.ads.core.domain.work;

import androidx.work.Data.Builder;
import androidx.work.Data;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class UniversalRequestWorkerData {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";
    @l
    private final String universalRequestId;

    static {
        UniversalRequestWorkerData.Companion = new Companion(null);
    }

    public UniversalRequestWorkerData(@l String s) {
        L.p(s, "universalRequestId");
        super();
        this.universalRequestId = s;
    }

    @l
    public final Data invoke() {
        Data data0 = new Builder().r("universalRequestId", this.universalRequestId).a();
        L.o(data0, "Builder()\n            .p…tId)\n            .build()");
        return data0;
    }
}

