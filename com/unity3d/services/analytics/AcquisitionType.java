package com.unity3d.services.analytics;

public enum AcquisitionType {
    SOFT,
    PREMIUM;

    private static AcquisitionType[] $values() [...] // Inlined contents

    @Override
    public String toString() {
        switch(this) {
            case 1: {
                return "soft";
            }
            case 2: {
                return "premium";
            }
            default: {
                return "";
            }
        }
    }
}

