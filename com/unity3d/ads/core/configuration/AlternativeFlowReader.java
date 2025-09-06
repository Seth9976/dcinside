package com.unity3d.ads.core.configuration;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.configuration.ConfigurationReader;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.W;
import org.json.JSONObject;
import y4.l;

@s0({"SMAP\nAlternativeFlowReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlternativeFlowReader.kt\ncom/unity3d/ads/core/configuration/AlternativeFlowReader\n+ 2 MetadataReader.kt\ncom/unity3d/ads/core/configuration/MetadataReader\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n7#2,7:39\n1#3:46\n*S KotlinDebug\n*F\n+ 1 AlternativeFlowReader.kt\ncom/unity3d/ads/core/configuration/AlternativeFlowReader\n*L\n21#1:39,7\n*E\n"})
public final class AlternativeFlowReader {
    @l
    private final ConfigurationReader configurationReader;
    @l
    private final E isAlternativeFlowEnabled;
    @l
    private final E isAlternativeFlowRead;
    @l
    private final MediationTraitsMetadataReader mediationMetadataReader;
    @l
    private final SessionRepository sessionRepository;

    public AlternativeFlowReader(@l ConfigurationReader configurationReader0, @l SessionRepository sessionRepository0, @l MediationTraitsMetadataReader mediationTraitsMetadataReader0) {
        L.p(configurationReader0, "configurationReader");
        L.p(sessionRepository0, "sessionRepository");
        L.p(mediationTraitsMetadataReader0, "mediationMetadataReader");
        super();
        this.configurationReader = configurationReader0;
        this.sessionRepository = sessionRepository0;
        this.mediationMetadataReader = mediationTraitsMetadataReader0;
        this.isAlternativeFlowRead = W.a(Boolean.FALSE);
        this.isAlternativeFlowEnabled = W.a(Boolean.FALSE);
    }

    public final boolean invoke() {
        if(((Boolean)this.isAlternativeFlowRead.getValue()).booleanValue()) {
            return ((Boolean)this.isAlternativeFlowEnabled.getValue()).booleanValue();
        }
        Object object0 = this.mediationMetadataReader.getJsonStorage().get(this.mediationMetadataReader.getKey());
        JSONObject jSONObject0 = null;
        if(object0 == null) {
            object0 = null;
        }
        else {
            L.o(object0, "get(key)");
            if(!(object0 instanceof JSONObject)) {
                object0 = null;
            }
            if(object0 == null) {
                object0 = null;
            }
        }
        if(((JSONObject)object0) != null) {
            if(((JSONObject)object0).has("boldSdkEnabled")) {
                jSONObject0 = (JSONObject)object0;
            }
            if(jSONObject0 != null) {
                Boolean boolean0 = Boolean.valueOf(jSONObject0.optBoolean("boldSdkEnabled"));
                this.isAlternativeFlowEnabled.setValue(boolean0);
                this.isAlternativeFlowRead.setValue(Boolean.TRUE);
            }
        }
        if(!((Boolean)this.isAlternativeFlowRead.getValue()).booleanValue()) {
            boolean z = this.configurationReader.getCurrentConfiguration().getExperiments().isBoldSdkNextSessionEnabled() || this.sessionRepository.getNativeConfiguration().getFeatureFlags().getBoldSdkNextSessionEnabled();
            this.isAlternativeFlowEnabled.setValue(Boolean.valueOf(z));
            this.isAlternativeFlowRead.setValue(Boolean.TRUE);
        }
        return ((Boolean)this.isAlternativeFlowEnabled.getValue()).booleanValue();
    }
}

