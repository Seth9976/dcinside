package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.jvm.internal.L;
import y4.l;

public final class ScarTimeHackFixer {
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public ScarTimeHackFixer(@l SendDiagnosticEvent sendDiagnosticEvent0) {
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        super();
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
    }

    @l
    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final int invoke(int v) {
        if(v < 1000) {
            DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_scar_video_length_in_sec", null, null, null, null, 30, null);
            return v * 1000;
        }
        return v;
    }
}

