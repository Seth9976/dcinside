package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

public class xE {
    private boolean JQp;
    private String PjT;
    private int ReZ;
    private int Zh;
    private double cr;
    private String cz;

    public boolean JQp() {
        return !TextUtils.isEmpty(this.PjT) && this.Zh > 0 && this.ReZ > 0;
    }

    public String PjT() {
        return this.PjT;
    }

    public void PjT(int v) {
        this.Zh = v;
    }

    public void PjT(String s) {
        this.PjT = s;
    }

    public void PjT(boolean z) {
        this.JQp = z;
    }

    public int ReZ() {
        return this.ReZ;
    }

    public String XX() {
        return this.cz;
    }

    public int Zh() {
        return this.Zh;
    }

    public void Zh(int v) {
        this.ReZ = v;
    }

    public void Zh(String s) {
        this.cz = s;
    }

    public double cr() {
        return this.cr;
    }

    public boolean cz() {
        return this.JQp;
    }
}

