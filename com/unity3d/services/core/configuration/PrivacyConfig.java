package com.unity3d.services.core.configuration;

import org.json.JSONObject;

public class PrivacyConfig {
    private PrivacyConfigStatus _privacyConfigStatus;
    private boolean _shouldSendNonBehavioral;

    public PrivacyConfig() {
        this(PrivacyConfigStatus.UNKNOWN);
    }

    public PrivacyConfig(PrivacyConfigStatus privacyConfigStatus0) {
        this._privacyConfigStatus = privacyConfigStatus0;
        this._shouldSendNonBehavioral = false;
    }

    public PrivacyConfig(JSONObject jSONObject0) {
        this.parsePrivacyResponse(jSONObject0);
    }

    public boolean allowedToSendPii() {
        return this._privacyConfigStatus.equals(PrivacyConfigStatus.ALLOWED);
    }

    public PrivacyConfigStatus getPrivacyStatus() {
        return this._privacyConfigStatus;
    }

    private void parsePrivacyResponse(JSONObject jSONObject0) {
        this._privacyConfigStatus = jSONObject0.optBoolean("pas", false) ? PrivacyConfigStatus.ALLOWED : PrivacyConfigStatus.DENIED;
        this._shouldSendNonBehavioral = jSONObject0.optBoolean("snb", false);
    }

    public boolean shouldSendNonBehavioral() {
        return this._shouldSendNonBehavioral;
    }
}

