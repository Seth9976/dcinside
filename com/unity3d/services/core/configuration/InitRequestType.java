package com.unity3d.services.core.configuration;

public enum InitRequestType {
    PRIVACY("privacy"),
    TOKEN("token_srr");

    private String _callType;

    private static InitRequestType[] $values() [...] // Inlined contents

    private InitRequestType(String s1) {
        this._callType = s1;
    }

    public String getCallType() {
        return this._callType;
    }
}

