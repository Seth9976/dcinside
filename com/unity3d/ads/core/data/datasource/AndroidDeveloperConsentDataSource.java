package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import gatewayprotocol.v1.DeveloperConsentOptionKt.Dsl;
import gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent;
import gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentChoice;
import gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption.Builder;
import gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentOption;
import gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import org.json.JSONObject;
import y4.l;

@s0({"SMAP\nAndroidDeveloperConsentDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDeveloperConsentDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidDeveloperConsentDataSource\n+ 2 DeveloperConsentKt.kt\ngatewayprotocol/v1/DeveloperConsentKtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 5 DeveloperConsentOptionKt.kt\ngatewayprotocol/v1/DeveloperConsentOptionKtKt\n*L\n1#1,89:1\n10#2:90\n1#3:91\n1#3:93\n1#3:96\n32#4:92\n33#4:94\n10#5:95\n*S KotlinDebug\n*F\n+ 1 AndroidDeveloperConsentDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidDeveloperConsentDataSource\n*L\n29#1:90\n29#1:91\n53#1:96\n37#1:92\n37#1:94\n53#1:95\n*E\n"})
public final class AndroidDeveloperConsentDataSource implements DeveloperConsentDataSource {
    @l
    private final FlattenerRulesUseCase flattenerRulesUseCase;
    @l
    private final JsonStorage publicStorage;

    public AndroidDeveloperConsentDataSource(@l FlattenerRulesUseCase flattenerRulesUseCase0, @l JsonStorage jsonStorage0) {
        L.p(flattenerRulesUseCase0, "flattenerRulesUseCase");
        L.p(jsonStorage0, "publicStorage");
        super();
        this.flattenerRulesUseCase = flattenerRulesUseCase0;
        this.publicStorage = jsonStorage0;
    }

    private final DeveloperConsentOption createDeveloperConsentOption(String s, boolean z) {
        Builder developerConsentOuterClass$DeveloperConsentOption$Builder0 = DeveloperConsentOption.newBuilder();
        L.o(developerConsentOuterClass$DeveloperConsentOption$Builder0, "newBuilder()");
        Dsl developerConsentOptionKt$Dsl0 = Dsl.Companion._create(developerConsentOuterClass$DeveloperConsentOption$Builder0);
        developerConsentOptionKt$Dsl0.setType(this.getDeveloperConsentType(s));
        if(developerConsentOptionKt$Dsl0.getType() == DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM) {
            developerConsentOptionKt$Dsl0.setCustomType(s);
        }
        developerConsentOptionKt$Dsl0.setValue(this.getDeveloperConsentChoice(Boolean.valueOf(z)));
        return developerConsentOptionKt$Dsl0._build();
    }

    private final List developerConsentList() {
        DeveloperConsentOption developerConsentOuterClass$DeveloperConsentOption0;
        List list0 = new ArrayList();
        JSONObject jSONObject0 = this.fetchData();
        Iterator iterator0 = jSONObject0.keys();
        L.o(iterator0, "data.keys()");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            Object object1 = jSONObject0.get(s);
            if(object1 instanceof Boolean) {
                L.o(s, "key");
                L.o(object1, "storedValue");
                developerConsentOuterClass$DeveloperConsentOption0 = this.createDeveloperConsentOption(s, ((Boolean)object1).booleanValue());
            }
            else {
                if(object1 instanceof String) {
                    L.o(object1, "storedValue");
                    if(v.O1(((String)object1), "true", true) || v.O1(((String)object1), "false", true)) {
                        L.o(s, "key");
                        developerConsentOuterClass$DeveloperConsentOption0 = this.createDeveloperConsentOption(s, Boolean.parseBoolean(((String)object1)));
                        goto label_20;
                    }
                }
                developerConsentOuterClass$DeveloperConsentOption0 = null;
            }
        label_20:
            if(developerConsentOuterClass$DeveloperConsentOption0 != null) {
                list0.add(developerConsentOuterClass$DeveloperConsentOption0);
            }
        }
        return list0;
    }

    private final JSONObject fetchData() {
        if(this.publicStorage.getData() != null) {
            JSONObject jSONObject0 = new JsonFlattener(this.publicStorage.getData()).flattenJson(".", this.flattenerRulesUseCase.invoke());
            L.o(jSONObject0, "flattener.flattenJson(\".… flattenerRulesUseCase())");
            return jSONObject0;
        }
        return new JSONObject();
    }

    @Override  // com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource
    @l
    public DeveloperConsent getDeveloperConsent() {
        gatewayprotocol.v1.DeveloperConsentOuterClass.DeveloperConsent.Builder developerConsentOuterClass$DeveloperConsent$Builder0 = DeveloperConsent.newBuilder();
        L.o(developerConsentOuterClass$DeveloperConsent$Builder0, "newBuilder()");
        gatewayprotocol.v1.DeveloperConsentKt.Dsl developerConsentKt$Dsl0 = gatewayprotocol.v1.DeveloperConsentKt.Dsl.Companion._create(developerConsentOuterClass$DeveloperConsent$Builder0);
        developerConsentKt$Dsl0.addAllOptions(developerConsentKt$Dsl0.getOptions(), this.developerConsentList());
        return developerConsentKt$Dsl0._build();
    }

    private final DeveloperConsentChoice getDeveloperConsentChoice(Boolean boolean0) {
        if(L.g(boolean0, Boolean.TRUE)) {
            return DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_TRUE;
        }
        return L.g(boolean0, Boolean.FALSE) ? DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_FALSE : DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
    }

    private final DeveloperConsentType getDeveloperConsentType(String s) {
        if(s != null) {
            switch(s) {
                case "gdpr.consent": {
                    return DeveloperConsentType.DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                }
                case "pipl.consent": {
                    return DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                }
                case "privacy.consent": {
                    return DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                }
                case "privacy.useroveragelimit": {
                    return DeveloperConsentType.DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                }
                case "user.nonBehavioral": {
                    return DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                case "user.nonbehavioral": {
                    return DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                }
                default: {
                    return DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM;
                }
            }
        }
        return DeveloperConsentType.DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
    }
}

