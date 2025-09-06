package com.apm.insight.k;

import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Map;

public final class i {
    private final String a;
    private HttpURLConnection b;
    private String c;
    private boolean d;
    private f e;
    private k f;

    public i(String s, String s1, boolean z) throws IOException {
        this.c = s1;
        this.d = z;
        String s2 = "AAA" + System.currentTimeMillis() + "AAA";
        this.a = s2;
        HttpURLConnection httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(s).openConnection())));
        this.b = httpURLConnection0;
        httpURLConnection0.setUseCaches(false);
        this.b.setDoOutput(true);
        this.b.setDoInput(true);
        this.b.setRequestMethod("POST");
        CustomRequestHeader customRequestHeader0 = MonitorCrash.mCustomRequestHeader;
        if(customRequestHeader0 != null) {
            customRequestHeader0.addRequestHeader(this.b);
        }
        this.b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + s2);
        if(z) {
            this.b.setRequestProperty("Content-Encoding", "gzip");
            this.f = new k(this.b.getOutputStream());
            return;
        }
        this.e = new f(this.b.getOutputStream());
    }

    public final String a() throws IOException {
        ArrayList arrayList0 = new ArrayList();
        byte[] arr_b = ("\r\n--" + this.a + "--\r\n").getBytes();
        if(this.d) {
            this.f.write(arr_b);
            this.f.b();
            this.f.a();
        }
        else {
            this.e.write(arr_b);
            this.e.flush();
            this.e.a();
        }
        int v = this.b.getResponseCode();
        if(v != 200) {
            throw new IOException("Server returned non-OK status: " + v);
        }
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(this.b.getInputStream()));
        String s;
        while((s = bufferedReader0.readLine()) != null) {
            arrayList0.add(s);
        }
        bufferedReader0.close();
        this.b.disconnect();
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: arrayList0) {
            stringBuilder0.append(((String)object0));
        }
        return stringBuilder0.toString();
    }

    public final void a(String s, File file0, Map map0) throws IOException {
        String s1 = file0.getName();
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("--");
        stringBuilder0.append(this.a);
        stringBuilder0.append("\r\nContent-Disposition: form-data; name=\"");
        stringBuilder0.append(s);
        stringBuilder0.append("\"; filename=\"");
        stringBuilder0.append(s1);
        stringBuilder0.append("\"");
        for(Object object0: map0.entrySet()) {
            stringBuilder0.append("; ");
            stringBuilder0.append(((String)((Map.Entry)object0).getKey()));
            stringBuilder0.append("=\"");
            stringBuilder0.append(((String)((Map.Entry)object0).getValue()));
            stringBuilder0.append("\"");
        }
        stringBuilder0.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if(this.d) {
            this.f.write(stringBuilder0.toString().getBytes());
        }
        else {
            this.e.write(stringBuilder0.toString().getBytes());
        }
        FileInputStream fileInputStream0 = new FileInputStream(file0);
        byte[] arr_b = new byte[0x2000];
        int v;
        while((v = fileInputStream0.read(arr_b)) != -1) {
            if(this.d) {
                this.f.write(arr_b, 0, v);
            }
            else {
                this.e.write(arr_b, 0, v);
            }
        }
        fileInputStream0.close();
        if(this.d) {
            this.f.write("\r\n".getBytes());
            return;
        }
        this.e.write("\r\n".getBytes());
        this.e.flush();
    }

    public final void a(String s, String s1) {
        this.b(s, s1);
    }

    public final void a(String s, File[] arr_file) throws IOException {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("--");
        stringBuilder0.append(this.a);
        stringBuilder0.append("\r\nContent-Disposition: form-data; name=\"");
        stringBuilder0.append(s);
        stringBuilder0.append("\"; filename=\"");
        stringBuilder0.append(s);
        stringBuilder0.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if(this.d) {
            this.f.write(stringBuilder0.toString().getBytes());
        }
        else {
            this.e.write(stringBuilder0.toString().getBytes());
        }
        if(this.d) {
            com.apm.insight.l.f.a(this.f, arr_file);
        }
        else {
            com.apm.insight.l.f.a(this.e, arr_file);
        }
        if(this.d) {
            this.f.write("\r\n".getBytes());
            return;
        }
        this.e.write("\r\n".getBytes());
        this.e.flush();
    }

    public final void b(String s, String s1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("--");
        stringBuilder0.append(this.a);
        stringBuilder0.append("\r\nContent-Disposition: form-data; name=\"");
        stringBuilder0.append(s);
        stringBuilder0.append("\"\r\nContent-Type: text/plain; charset=");
        stringBuilder0.append(this.c);
        stringBuilder0.append("\r\n\r\n");
        try {
            if(this.d) {
                this.f.write(stringBuilder0.toString().getBytes());
            }
            else {
                this.e.write(stringBuilder0.toString().getBytes());
            }
        }
        catch(IOException unused_ex) {
        }
        byte[] arr_b = s1.getBytes();
        try {
            if(this.d) {
                this.f.write(arr_b);
                this.f.write("\r\n".getBytes());
                return;
            }
            this.e.write(arr_b);
            this.e.write("\r\n".getBytes());
        }
        catch(IOException unused_ex) {
        }
    }
}

