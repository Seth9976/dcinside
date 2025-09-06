package com.unity3d.services.store;

import org.json.JSONObject;
import y4.m;

public interface JsonSerializable {
    @m
    JSONObject toJson();
}

