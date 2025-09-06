package com.unity3d.ads.core.domain.privacy;

import com.unity3d.services.core.misc.JsonFlattenerRules;
import kotlin.collections.u;
import y4.l;

public final class DeveloperConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override  // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    @l
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(u.S(new String[]{"privacy", "gdpr", "pipl", "user"}), u.k("value"), u.S(new String[]{"ts"}));
    }
}

