package com.unity3d.services.core.configuration;

public enum PrivacyConfigStatus {
    UNKNOWN,
    ALLOWED,
    DENIED;

    private static PrivacyConfigStatus[] $values() [...] // Inlined contents

    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}

