package com.unity3d.services.ads.adunit;

public class AdUnitMotionEvent {
    private int _action;
    private int _deviceId;
    private long _eventTime;
    private boolean _isObscured;
    private float _pressure;
    private float _size;
    private int _source;
    private int _toolType;
    private float _x;
    private float _y;

    public AdUnitMotionEvent(int v, boolean z, int v1, int v2, int v3, float f, float f1, long v4, float f2, float f3) {
        this._action = v;
        this._isObscured = z;
        this._toolType = v1;
        this._source = v2;
        this._deviceId = v3;
        this._x = f;
        this._y = f1;
        this._eventTime = v4;
        this._pressure = f2;
        this._size = f3;
    }

    public int getAction() {
        return this._action;
    }

    public int getDeviceId() {
        return this._deviceId;
    }

    public long getEventTime() {
        return this._eventTime;
    }

    public float getPressure() {
        return this._pressure;
    }

    public float getSize() {
        return this._size;
    }

    public int getSource() {
        return this._source;
    }

    public int getToolType() {
        return this._toolType;
    }

    public float getX() {
        return this._x;
    }

    public float getY() {
        return this._y;
    }

    public boolean isObscured() {
        return this._isObscured;
    }
}

