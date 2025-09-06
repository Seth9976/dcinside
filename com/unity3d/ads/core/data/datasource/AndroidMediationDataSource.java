package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AndroidMediationDataSource implements MediationDataSource {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    private static final String MEDIATION_NAME = "name";
    @l
    public static final String MEDIATION_NAME_KEY = "mediation.name.value";
    @l
    private static final String MEDIATION_STORAGE_NAME = "mediation";
    @l
    private static final String MEDIATION_VALUE = "value";
    @l
    private static final String MEDIATION_VERSION = "version";
    @l
    public static final String MEDIATION_VERSION_KEY = "mediation.version.value";
    @l
    private final JsonStorage publicStorage;

    static {
        AndroidMediationDataSource.Companion = new Companion(null);
    }

    public AndroidMediationDataSource(@l JsonStorage jsonStorage0) {
        L.p(jsonStorage0, "publicStorage");
        super();
        this.publicStorage = jsonStorage0;
    }

    @Override  // com.unity3d.ads.core.data.datasource.MediationDataSource
    @m
    public String getName() {
        return (String)this.publicStorage.get("mediation.name.value");
    }

    @Override  // com.unity3d.ads.core.data.datasource.MediationDataSource
    @m
    public String getVersion() {
        return (String)this.publicStorage.get("mediation.version.value");
    }
}

