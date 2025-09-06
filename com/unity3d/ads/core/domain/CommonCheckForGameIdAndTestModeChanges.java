package com.unity3d.ads.core.domain;

import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.request.metrics.Metric;
import java.util.Map;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.r0;
import y4.l;

public final class CommonCheckForGameIdAndTestModeChanges implements CheckForGameIdAndTestModeChanges {
    @l
    private final GetGameId getGameId;
    @l
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCheckForGameIdAndTestModeChanges(@l GetGameId getGameId0, @l SendDiagnosticEvent sendDiagnosticEvent0) {
        L.p(getGameId0, "getGameId");
        L.p(sendDiagnosticEvent0, "sendDiagnosticEvent");
        super();
        this.getGameId = getGameId0;
        this.sendDiagnosticEvent = sendDiagnosticEvent0;
    }

    @Override  // com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges
    public void invoke(boolean z) {
        String s = this.getGameId.invoke();
        if(s == null) {
            s = "null";
        }
        Map map0 = Y.W(new V[]{r0.a("previous_game_id", "null"), r0.a("game_id", s)});
        if(!L.g("null", "null")) {
            if(L.g(s, "null")) {
                this.sendDiagnostic("native_initialize_game_id_same", map0, z);
            }
            else {
                this.sendDiagnostic("native_initialize_game_id_changed", map0, z);
            }
            this.sendDiagnostic("native_initialize_test_mode_same", Y.W(new V[]{r0.a("previous_test_mode", "false"), r0.a("test_mode", "false")}), z);
        }
    }

    private final void sendDiagnostic(String s, Map map0, boolean z) {
        if(z) {
            InitializeEventsMetricSender.getInstance().sendMetric(new Metric(s, map0, null, 4, null));
            return;
        }
        DefaultImpls.invoke$default(this.sendDiagnosticEvent, s, null, map0, null, null, 26, null);
    }
}

