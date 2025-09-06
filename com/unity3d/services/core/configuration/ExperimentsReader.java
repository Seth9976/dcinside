package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import jeb.synthetic.FIN;
import org.json.JSONException;
import org.json.JSONObject;

public class ExperimentsReader {
    private IExperiments _localExperiments;
    private IExperiments _remoteExperiments;

    public IExperiments getCurrentlyActiveExperiments() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        IExperiments iExperiments0 = this._remoteExperiments;
        if(iExperiments0 == null && this._localExperiments == null) {
            IExperiments iExperiments1 = new Experiments();
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
            return iExperiments1;
        }
        if(iExperiments0 == null) {
            FIN.finallyExec$NT(v);
            return this._localExperiments;
        }
        if(this._localExperiments == null) {
            this._localExperiments = new Experiments();
        }
        JSONObject jSONObject0 = this._localExperiments.getNextSessionExperiments();
        JSONObject jSONObject1 = this._remoteExperiments.getCurrentSessionExperiments();
        try {
            IExperiments iExperiments2 = new Experiments(Utilities.mergeJsonObjects(jSONObject0, jSONObject1));
            FIN.finallyExec$NT(v);
            return iExperiments2;
        }
        catch(JSONException unused_ex) {
            DeviceLog.error("Couldn\'t get active experiments, reverting to default experiments");
            IExperiments iExperiments3 = new Experiments();
            FIN.finallyExec$NT(v);
            return iExperiments3;
        }
    }

    public void updateLocalExperiments(IExperiments iExperiments0) {
        synchronized(this) {
            this._localExperiments = iExperiments0;
        }
    }

    public void updateRemoteExperiments(IExperiments iExperiments0) {
        synchronized(this) {
            this._remoteExperiments = iExperiments0;
        }
    }
}

