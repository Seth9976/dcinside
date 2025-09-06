package com.unity3d.services.core.device.reader.pii;

import java.util.Locale;

public enum PiiPrivacyMode {
    APP,
    NONE,
    MIXED,
    UNDEFINED,
    NULL;

    private static PiiPrivacyMode[] $values() [...] // Inlined contents

    public static PiiPrivacyMode getPiiPrivacyMode(String s) {
        PiiPrivacyMode piiPrivacyMode0;
        if(s == null) {
            return PiiPrivacyMode.NULL;
        }
        try {
            piiPrivacyMode0 = PiiPrivacyMode.UNDEFINED;
            return PiiPrivacyMode.valueOf(s.toUpperCase(Locale.ROOT));
        }
        catch(IllegalArgumentException unused_ex) {
            return piiPrivacyMode0;
        }
    }
}

