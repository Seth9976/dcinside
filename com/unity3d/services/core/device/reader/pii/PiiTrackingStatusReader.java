package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.misc.IJsonStorageReader;

public class PiiTrackingStatusReader {
    private final IJsonStorageReader _jsonStorageReader;
    private final NonBehavioralFlagReader _nonBehavioralFlagReader;

    public PiiTrackingStatusReader(IJsonStorageReader iJsonStorageReader0) {
        this._jsonStorageReader = iJsonStorageReader0;
        this._nonBehavioralFlagReader = new NonBehavioralFlagReader(iJsonStorageReader0);
    }

    private PiiPrivacyMode getPrivacyMode(String s) {
        IJsonStorageReader iJsonStorageReader0 = this._jsonStorageReader;
        if(iJsonStorageReader0 != null) {
            Object object0 = iJsonStorageReader0.get(s);
            return object0 instanceof String ? PiiPrivacyMode.getPiiPrivacyMode(((String)object0)) : PiiPrivacyMode.getPiiPrivacyMode(null);
        }
        return PiiPrivacyMode.getPiiPrivacyMode(null);
    }

    public PiiPrivacyMode getPrivacyMode() {
        PiiPrivacyMode piiPrivacyMode0 = this.getUserPrivacyMode();
        PiiPrivacyMode piiPrivacyMode1 = PiiPrivacyMode.NULL;
        if(piiPrivacyMode0 == piiPrivacyMode1 && this.getSpmPrivacyMode() == piiPrivacyMode1) {
            return piiPrivacyMode1;
        }
        PiiPrivacyMode piiPrivacyMode2 = this.getUserPrivacyMode();
        PiiPrivacyMode piiPrivacyMode3 = PiiPrivacyMode.APP;
        if(piiPrivacyMode2 != piiPrivacyMode3 && this.getSpmPrivacyMode() != piiPrivacyMode3) {
            PiiPrivacyMode piiPrivacyMode4 = this.getUserPrivacyMode();
            piiPrivacyMode3 = PiiPrivacyMode.MIXED;
            if(piiPrivacyMode4 != piiPrivacyMode3 && this.getSpmPrivacyMode() != piiPrivacyMode3) {
                return this.getUserPrivacyMode() == PiiPrivacyMode.NONE || this.getSpmPrivacyMode() == PiiPrivacyMode.NONE ? PiiPrivacyMode.NONE : PiiPrivacyMode.UNDEFINED;
            }
        }
        return piiPrivacyMode3;
    }

    private PiiPrivacyMode getSpmPrivacyMode() {
        return this.getPrivacyMode("privacy.spm.value");
    }

    public boolean getUserNonBehavioralFlag() {
        return this._nonBehavioralFlagReader.getUserNonBehavioralFlag() == NonBehavioralFlag.TRUE;
    }

    private PiiPrivacyMode getUserPrivacyMode() {
        return this.getPrivacyMode("privacy.mode.value");
    }
}

