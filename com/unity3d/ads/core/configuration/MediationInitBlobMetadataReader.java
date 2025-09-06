package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class MediationInitBlobMetadataReader extends MetadataReader {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String MEDIATION_UADS_INIT_BLOB = "mediation.uads_init_blob.value";

    static {
        MediationInitBlobMetadataReader.Companion = new Companion(null);
    }

    public MediationInitBlobMetadataReader(@l JsonStorage jsonStorage0) {
        L.p(jsonStorage0, "jsonStorage");
        super(jsonStorage0, "mediation.uads_init_blob.value");
    }
}

