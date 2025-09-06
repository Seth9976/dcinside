package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.L;
import org.json.JSONObject;
import y4.l;
import y4.m;

public final class AndroidLegacyUserConsentDataSource implements LegacyUserConsentDataSource {
    @l
    private final FlattenerRulesUseCase flattenerRulesUseCase;
    @l
    private final JsonStorage privateStorage;

    public AndroidLegacyUserConsentDataSource(@l FlattenerRulesUseCase flattenerRulesUseCase0, @l JsonStorage jsonStorage0) {
        L.p(flattenerRulesUseCase0, "flattenerRulesUseCase");
        L.p(jsonStorage0, "privateStorage");
        super();
        this.flattenerRulesUseCase = flattenerRulesUseCase0;
        this.privateStorage = jsonStorage0;
    }

    @Override  // com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource
    @m
    public String getPrivacyData() {
        JSONObject jSONObject0 = this.privateStorage.getData();
        if(jSONObject0 != null) {
            JSONObject jSONObject1 = new JsonFlattener(jSONObject0).flattenJson(".", this.flattenerRulesUseCase.invoke());
            return jSONObject1 == null ? null : jSONObject1.toString();
        }
        return null;
    }
}

