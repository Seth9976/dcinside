package com.unity3d.services.ads.api;

import com.unity3d.services.ads.token.TokenError;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import org.json.JSONArray;
import org.json.JSONException;

public class Token {
    private static final TokenStorage tokenStorage;

    static {
        Token.tokenStorage = (TokenStorage)Utilities.getService(TokenStorage.class);
    }

    @WebViewExposed
    public static void appendTokens(JSONArray jSONArray0, WebViewCallback webViewCallback0) {
        try {
            Token.tokenStorage.appendTokens(jSONArray0);
        }
        catch(JSONException jSONException0) {
            webViewCallback0.error(TokenError.JSON_EXCEPTION, new Object[]{jSONException0.getMessage()});
            return;
        }
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void createTokens(JSONArray jSONArray0, WebViewCallback webViewCallback0) {
        try {
            Token.tokenStorage.createTokens(jSONArray0);
        }
        catch(JSONException jSONException0) {
            webViewCallback0.error(TokenError.JSON_EXCEPTION, new Object[]{jSONException0.getMessage()});
            return;
        }
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void deleteTokens(WebViewCallback webViewCallback0) {
        Token.tokenStorage.deleteTokens();
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void getNativeGeneratedToken(WebViewCallback webViewCallback0) {
        Token.tokenStorage.getNativeGeneratedToken();
        webViewCallback0.invoke(new Object[0]);
    }
}

