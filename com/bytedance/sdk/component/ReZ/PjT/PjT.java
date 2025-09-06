package com.bytedance.sdk.component.ReZ.PjT;

import android.os.SystemClock;

public class PjT {
    long Au;
    long JQp;
    long PjT;
    long ReZ;
    long XX;
    long Zh;
    long cr;
    long cz;

    public PjT() {
        this.PjT = SystemClock.elapsedRealtime();
    }

    public long Au() {
        return this.cr;
    }

    public long DWo() {
        return this.XX;
    }

    public void JQp() {
        this.cz = SystemClock.elapsedRealtime();
    }

    public void PjT() {
        this.ReZ = SystemClock.elapsedRealtime();
    }

    public void ReZ() {
        this.JQp = SystemClock.elapsedRealtime();
    }

    public long SM() {
        return this.JQp;
    }

    public long XX() {
        return this.ReZ;
    }

    public void Zh() {
        this.cr = SystemClock.elapsedRealtime();
    }

    public long cr() {
        return this.PjT;
    }

    public long cz() {
        return this.cz;
    }

    public long fDm() {
        return this.Zh;
    }

    public void qj() {
        this.XX = SystemClock.elapsedRealtime();
    }

    public void qla() {
        this.Zh = SystemClock.elapsedRealtime();
    }

    @Override
    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.PjT + ", asyncCallExecTs=" + this.Zh + ", requestStartExecTs=" + this.ReZ + ", requestConnectStartTs=" + this.cr + ", requestConnectFinishTs=" + this.JQp + ", reqCallServerStartTs=" + this.XX + ", reqCallServerFinishTs=" + this.Au + '}';
    }

    public long xf() {
        return this.Au;
    }

    public void xs() {
        this.Au = SystemClock.elapsedRealtime();
    }
}

