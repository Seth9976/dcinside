package com.bytedance.adsdk.Zh.cr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import jeb.synthetic.TWR;

public class PjT implements cr {
    private final HttpURLConnection PjT;

    public PjT(HttpURLConnection httpURLConnection0) {
        this.PjT = httpURLConnection0;
    }

    private String PjT(HttpURLConnection httpURLConnection0) throws IOException {
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(httpURLConnection0.getErrorStream()));
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            String s;
            while((s = bufferedReader0.readLine()) != null) {
                stringBuilder0.append(s);
                stringBuilder0.append('\n');
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(bufferedReader0, throwable0);
            throw throwable0;
        }
        try {
            bufferedReader0.close();
        }
        catch(Exception unused_ex) {
        }
        return stringBuilder0.toString();
    }

    @Override  // com.bytedance.adsdk.Zh.cr.cr
    public boolean PjT() {
        try {
            if(this.PjT.getResponseCode() / 100 == 2) {
                return true;
            }
        }
        catch(IOException unused_ex) {
        }
        return false;
    }

    @Override  // com.bytedance.adsdk.Zh.cr.cr
    public String ReZ() {
        return this.PjT.getContentType();
    }

    @Override  // com.bytedance.adsdk.Zh.cr.cr
    public InputStream Zh() throws IOException {
        return this.PjT.getInputStream();
    }

    @Override
    public void close() {
        this.PjT.disconnect();
    }

    @Override  // com.bytedance.adsdk.Zh.cr.cr
    public String cr() {
        try {
            return this.PjT() ? null : "Unable to fetch " + this.PjT.getURL() + ". Failed with " + this.PjT.getResponseCode() + "\n" + this.PjT(this.PjT);
        }
        catch(IOException iOException0) {
            return iOException0.getMessage();
        }
    }
}

