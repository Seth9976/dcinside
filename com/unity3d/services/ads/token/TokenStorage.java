package com.unity3d.services.ads.token;

import kotlin.S0;
import org.json.JSONArray;
import org.json.JSONException;
import y4.l;
import y4.m;

public interface TokenStorage {
    void appendTokens(@l JSONArray arg1) throws JSONException;

    void createTokens(@l JSONArray arg1) throws JSONException;

    void deleteTokens();

    @l
    S0 getNativeGeneratedToken();

    @m
    String getToken();

    void setInitToken(@m String arg1);
}

