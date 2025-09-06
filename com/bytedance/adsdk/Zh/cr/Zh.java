package com.bytedance.adsdk.Zh.cr;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Zh implements cz {
    @Override  // com.bytedance.adsdk.Zh.cr.cz
    public cr PjT(String s) throws IOException {
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(s).openConnection())));
        httpURLConnection0.setRequestMethod("GET");
        httpURLConnection0.connect();
        return new PjT(httpURLConnection0);
    }
}

