package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.misc.IJsonStorageReader;
import kotlin.jvm.internal.L;
import y4.l;

public class NonBehavioralFlagReader {
    @l
    private final IJsonStorageReader jsonStorageReader;

    public NonBehavioralFlagReader(@l IJsonStorageReader iJsonStorageReader0) {
        L.p(iJsonStorageReader0, "jsonStorageReader");
        super();
        this.jsonStorageReader = iJsonStorageReader0;
    }

    @l
    public NonBehavioralFlag getUserNonBehavioralFlag() {
        Object object0 = this.jsonStorageReader.get("user.nonbehavioral.value");
        if(object0 == null) {
            object0 = this.jsonStorageReader.get("user.nonBehavioral.value");
        }
        return NonBehavioralFlag.Companion.fromString(String.valueOf(object0));
    }
}

