package com.unity3d.services.core.configuration;

import org.json.JSONObject;

public class ExperimentObject {
    private static final String APPLIED_KEY = "applied";
    private static final String VALUE_KEY = "value";
    private final JSONObject _experimentData;

    public ExperimentObject(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        this._experimentData = jSONObject0;
    }

    public ExperimentAppliedRule getAppliedRule() {
        ExperimentAppliedRule experimentAppliedRule0 = ExperimentAppliedRule.NEXT;
        String s = this._experimentData.optString("applied");
        if(!s.isEmpty()) {
            try {
                return ExperimentAppliedRule.valueOf(s.toUpperCase());
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
        return experimentAppliedRule0;
    }

    public boolean getBooleanValue() {
        return this._experimentData.optBoolean("value");
    }

    public String getStringValue() {
        return this._experimentData.optString("value");
    }
}

