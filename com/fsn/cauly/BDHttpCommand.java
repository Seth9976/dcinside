package com.fsn.cauly;

import com.fsn.cauly.blackdragoncore.utils.g.b;
import com.fsn.cauly.blackdragoncore.utils.g;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

class BDHttpCommand extends BDThreadCommand {
    protected String j;
    protected String k;
    protected String l;
    protected boolean m;
    protected String n;
    protected boolean o;

    protected void a(File file0) {
    }

    protected void b() {
    }

    @Override  // com.fsn.cauly.BDThreadCommand
    public void execute() {
        Logger.writeLog(LogLevel.Debug, "HTTP Request : " + this.l);
        super.execute();
    }

    public String getFilename() {
        return this.j;
    }

    public String getResponseText() {
        if((this.n == null || this.n.length() == 0) && this.c == 0) {
            String s = this.j;
            if(s != null) {
                this.n = BDFileUtil.getFileString(s);
            }
        }
        return this.n;
    }

    @Override  // com.fsn.cauly.BDThreadCommand
    public void handleCommand() {
        File file0;
        ByteArrayOutputStream byteArrayOutputStream1;
        BufferedOutputStream bufferedOutputStream0;
        InputStream inputStream0;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection1;
        HttpURLConnection httpURLConnection0;
        g.a(b.d, "HTTP Request : " + this.l);
        if(this.m && BDFileUtil.fileExists(this.j)) {
            this.o = true;
            Logger.writeLog(LogLevel.Debug, "Cache hit");
            return;
        }
        try {
            httpURLConnection0 = null;
            httpURLConnection1 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(this.l).openConnection())));
        }
        catch(Exception exception0) {
            httpURLConnection2 = null;
            inputStream0 = null;
            goto label_64;
        }
        try {
            httpURLConnection1.setConnectTimeout(10000);
            httpURLConnection1.setUseCaches(false);
            int v = httpURLConnection1.getResponseCode();
            Logger.writeLog(LogLevel.Debug, "Http Response : " + v);
            if(v == 200) {
                String s = this.j;
                if(s == null) {
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    bufferedOutputStream0 = new BufferedOutputStream(byteArrayOutputStream0);
                    byteArrayOutputStream1 = byteArrayOutputStream0;
                    file0 = null;
                }
                else {
                    BDFileUtil.makeDirectory(BDFileUtil.extractFilePath(s));
                    file0 = new File(this.k);
                    bufferedOutputStream0 = new BufferedOutputStream(new FileOutputStream(file0));
                    byteArrayOutputStream1 = null;
                }
                goto label_28;
            }
            else {
                this.c = httpURLConnection1.getResponseCode();
                inputStream0 = null;
            }
            goto label_69;
        }
        catch(Exception exception0) {
            goto label_61;
        }
        try {
        label_28:
            inputStream0 = httpURLConnection1.getInputStream();
        }
        catch(Exception exception0) {
            inputStream0 = null;
            httpURLConnection0 = bufferedOutputStream0;
            httpURLConnection2 = httpURLConnection0;
            httpURLConnection0 = httpURLConnection1;
            goto label_64;
        }
        try {
            byte[] arr_b = new byte[0x400];
            while(true) {
                int v1 = inputStream0.read(arr_b);
                if(v1 <= 0 || this.g) {
                    break;
                }
                bufferedOutputStream0.write(arr_b, 0, v1);
            }
            bufferedOutputStream0.close();
            goto label_44;
        label_41:
            exception0 = exception1;
            httpURLConnection0 = bufferedOutputStream0;
            httpURLConnection2 = httpURLConnection0;
            httpURLConnection0 = httpURLConnection1;
            goto label_64;
        }
        catch(Exception exception1) {
            goto label_41;
        }
        try {
        label_44:
            if(this.j == null) {
                this.n = byteArrayOutputStream1.toString("UTF-8");
            }
            else if(this.c == 0) {
                File file1 = new File(this.j);
                file1.delete();
                if(!file0.renameTo(file1)) {
                    this.c = -2;
                }
            }
            goto label_69;
        }
        catch(Exception exception0) {
        }
        httpURLConnection2 = httpURLConnection0;
        httpURLConnection0 = httpURLConnection1;
        goto label_64;
        try {
            this.c = httpURLConnection1.getResponseCode();
            inputStream0 = null;
            goto label_69;
        }
        catch(Exception exception0) {
        label_61:
            inputStream0 = null;
            httpURLConnection0 = httpURLConnection1;
            httpURLConnection2 = null;
        }
    label_64:
        exception0.printStackTrace();
        if(this.c == 0) {
            this.c = -1;
        }
        httpURLConnection1 = httpURLConnection0;
        httpURLConnection0 = httpURLConnection2;
    label_69:
        if(httpURLConnection1 != null) {
            try {
                httpURLConnection1.disconnect();
            }
            catch(Exception exception2) {
                exception2.printStackTrace();
            }
        }
        if(inputStream0 != null) {
            try {
                inputStream0.close();
            }
            catch(Exception exception3) {
                exception3.printStackTrace();
            }
        }
        if(httpURLConnection0 != null) {
            try {
                ((OutputStream)httpURLConnection0).close();
            }
            catch(Exception exception4) {
                exception4.printStackTrace();
            }
        }
    }

    public boolean isCacheHit() {
        return this.o;
    }

    public void setFilename(String s) {
        this.j = s;
        if(s != null) {
            this.k = s + "__";
            return;
        }
        this.k = null;
    }

    public void setReuseCachedFile(boolean z) {
        this.m = z;
    }

    public void setUrl(String s) {
        this.l = s;
    }
}

