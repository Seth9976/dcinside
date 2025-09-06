package com.unity3d.scar.adapter.common;

public class n implements j {
    protected String _description;
    protected Object[] _errorArguments;
    private Enum _errorCategory;

    public n(Enum enum0, String s, Object[] arr_object) {
        this._errorCategory = enum0;
        this._description = s;
        this._errorArguments = arr_object;
    }

    @Override  // com.unity3d.scar.adapter.common.j
    public int getCode() {
        return -1;
    }

    @Override  // com.unity3d.scar.adapter.common.j
    public String getDescription() {
        return this._description;
    }

    @Override  // com.unity3d.scar.adapter.common.j
    public String getDomain() {
        return null;
    }

    public Object[] getErrorArguments() {
        return this._errorArguments;
    }

    public Enum getErrorCategory() {
        return this._errorCategory;
    }
}

