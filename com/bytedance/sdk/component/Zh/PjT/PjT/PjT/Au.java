package com.bytedance.sdk.component.Zh.PjT.PjT.PjT;

import com.bytedance.sdk.component.Zh.PjT.SM;
import com.bytedance.sdk.component.Zh.PjT.xE;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class Au extends xE {
    HttpURLConnection PjT;
    InputStream Zh;

    Au(HttpURLConnection httpURLConnection0) throws IOException {
        this.PjT = httpURLConnection0;
        this.Zh = new cz(httpURLConnection0.getInputStream(), httpURLConnection0);
    }

    Au(HttpURLConnection httpURLConnection0, InputStream inputStream0) {
        this.PjT = httpURLConnection0;
        this.Zh = new cz(inputStream0, httpURLConnection0);
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.xE
    public SM JQp() {
        return this.PjT.getContentType() == null ? null : SM.PjT(this.PjT.getContentType());
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.xE
    public long PjT() {
        try {
            return (long)this.PjT.getContentLength();
        }
        catch(Exception unused_ex) {
            return 0L;
        }
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.xE
    public InputStream ReZ() {
        return this.Zh;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.xE
    public String Zh() {
        try {
            BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(this.Zh));
            StringBuffer stringBuffer0 = new StringBuffer();
            String s;
            while((s = bufferedReader0.readLine()) != null) {
                stringBuffer0.append(s + "\n");
            }
            this.close();
            return stringBuffer0.toString();
        }
        catch(Exception unused_ex) {
            return "";
        }
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.xE
    public void close() {
        try {
            this.Zh.close();
            this.PjT.disconnect();
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.xE
    public byte[] cr() {
        try {
            byte[] arr_b = new byte[0x400];
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            int v;
            while((v = this.Zh.read(arr_b)) != -1) {
                byteArrayOutputStream0.write(arr_b, 0, v);
            }
            return byteArrayOutputStream0.toByteArray();
        }
        catch(Exception unused_ex) {
            return new byte[0];
        }
    }
}

