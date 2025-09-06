package com.unity3d.services.ads.webplayer;

import java.util.HashMap;
import org.json.JSONObject;

public class WebPlayerSettingsCache {
    private HashMap _webPlayerEventSettings;
    private HashMap _webPlayerSettings;
    private HashMap _webSettings;
    private static WebPlayerSettingsCache instance;

    public WebPlayerSettingsCache() {
        this._webSettings = new HashMap();
        this._webPlayerSettings = new HashMap();
        this._webPlayerEventSettings = new HashMap();
    }

    public void addWebPlayerEventSettings(String s, JSONObject jSONObject0) {
        synchronized(this) {
            this._webPlayerEventSettings.put(s, jSONObject0);
        }
    }

    public void addWebPlayerSettings(String s, JSONObject jSONObject0) {
        synchronized(this) {
            this._webPlayerSettings.put(s, jSONObject0);
        }
    }

    public void addWebSettings(String s, JSONObject jSONObject0) {
        synchronized(this) {
            this._webSettings.put(s, jSONObject0);
        }
    }

    public static WebPlayerSettingsCache getInstance() {
        if(WebPlayerSettingsCache.instance == null) {
            WebPlayerSettingsCache.instance = new WebPlayerSettingsCache();
        }
        return WebPlayerSettingsCache.instance;
    }

    public JSONObject getWebPlayerEventSettings(String s) {
        synchronized(this) {
            return this._webPlayerEventSettings.containsKey(s) ? ((JSONObject)this._webPlayerEventSettings.get(s)) : new JSONObject();
        }
    }

    public JSONObject getWebPlayerSettings(String s) {
        synchronized(this) {
            return this._webPlayerSettings.containsKey(s) ? ((JSONObject)this._webPlayerSettings.get(s)) : new JSONObject();
        }
    }

    public JSONObject getWebSettings(String s) {
        synchronized(this) {
            return this._webSettings.containsKey(s) ? ((JSONObject)this._webSettings.get(s)) : new JSONObject();
        }
    }

    public void removeWebPlayerEventSettings(String s) {
        synchronized(this) {
            if(this._webPlayerEventSettings.containsKey(s)) {
                this._webPlayerEventSettings.remove(s);
            }
        }
    }

    public void removeWebPlayerSettings(String s) {
        synchronized(this) {
            if(this._webPlayerSettings.containsKey(s)) {
                this._webPlayerSettings.remove(s);
            }
        }
    }

    public void removeWebSettings(String s) {
        synchronized(this) {
            if(this._webSettings.containsKey(s)) {
                this._webSettings.remove(s);
            }
        }
    }
}

