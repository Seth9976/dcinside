package com.unity3d.services.ads.webplayer;

import java.util.HashMap;

public class WebPlayerViewCache {
    private HashMap _webPlayerMap;
    private static WebPlayerViewCache instance;

    public WebPlayerViewCache() {
        this._webPlayerMap = new HashMap();
    }

    public void addWebPlayer(String s, WebPlayerView webPlayerView0) {
        synchronized(this) {
            this._webPlayerMap.put(s, webPlayerView0);
        }
    }

    public static WebPlayerViewCache getInstance() {
        if(WebPlayerViewCache.instance == null) {
            WebPlayerViewCache.instance = new WebPlayerViewCache();
        }
        return WebPlayerViewCache.instance;
    }

    public WebPlayerView getWebPlayer(String s) {
        synchronized(this) {
            return this._webPlayerMap.containsKey(s) ? ((WebPlayerView)this._webPlayerMap.get(s)) : null;
        }
    }

    public void removeWebPlayer(String s) {
        synchronized(this) {
            if(this._webPlayerMap.containsKey(s)) {
                this._webPlayerMap.remove(s);
            }
        }
    }
}

