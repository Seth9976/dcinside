package com.bytedance.sdk.component.XX.Zh;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.XX.Zh;
import com.bytedance.sdk.component.Zh.PjT.cz;
import com.bytedance.sdk.component.Zh.PjT.qj;
import com.bytedance.sdk.component.Zh.PjT.qla;
import com.bytedance.sdk.component.Zh.PjT.xs;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import jeb.synthetic.FIN;

public class PjT extends ReZ {
    private volatile boolean DWo;
    public File PjT;
    public File Zh;

    public PjT(qj qj0) {
        super(qj0);
    }

    private void JQp() {
        try {
            this.PjT.delete();
        }
        catch(Throwable unused_ex) {
        }
        try {
            this.Zh.delete();
        }
        catch(Throwable unused_ex) {
        }
    }

    private static boolean JQp(Map map0) {
        if(TextUtils.equals(((CharSequence)map0.get("Accept-Ranges")), "bytes")) {
            return true;
        }
        if(TextUtils.equals(((CharSequence)map0.get("accept-ranges")), "bytes")) {
            return true;
        }
        String s = (String)map0.get("Content-Range");
        if(TextUtils.isEmpty(s)) {
            s = (String)map0.get("content-range");
        }
        return s != null && s.startsWith("bytes");
    }

    public Zh PjT() {
        int v9;
        InputStream inputStream1;
        InputStream inputStream0;
        long v5;
        RandomAccessFile randomAccessFile0;
        File file0 = this.PjT;
        if(file0 != null && this.Zh != null) {
            if(file0.exists() && this.PjT.length() != 0L) {
                long v = System.currentTimeMillis();
                Zh zh0 = new Zh(true, 200, "Success", null, null, v, v);
                zh0.PjT(this.PjT);
                return zh0;
            }
            long v1 = this.Zh.length();
            if(v1 < 0L) {
                v1 = 0L;
            }
            com.bytedance.sdk.component.Zh.PjT.xs.PjT xs$PjT0 = new com.bytedance.sdk.component.Zh.PjT.xs.PjT();
            xs$PjT0.PjT(this.ReZ());
            this.Zh("Range", "bytes=" + v1 + "-");
            if(TextUtils.isEmpty(this.Au)) {
                Log.e("DownloadExecutor", "execute: Url is Empty");
                return null;
            }
            try {
                xs$PjT0.Zh(this.Au);
            }
            catch(IllegalArgumentException unused_ex) {
                Log.e("DownloadExecutor", "execute: Url is not a valid HTTP or HTTPS URL");
                return null;
            }
            this.PjT(xs$PjT0);
            xs xs0 = xs$PjT0.PjT().Zh();
            try {
                com.bytedance.sdk.component.Zh.PjT.Zh zh1 = this.ReZ.PjT(xs0);
                if(zh1 == null) {
                    return null;
                }
                qla qla0 = zh1.Zh();
                if(qla0 == null || !qla0.cr()) {
                    return null;
                }
                HashMap hashMap0 = new HashMap();
                cz cz0 = qla0.XX();
                if(cz0 != null) {
                    for(int v2 = 0; v2 < cz0.PjT(); ++v2) {
                        hashMap0.put(cz0.PjT(v2), cz0.Zh(v2));
                    }
                }
                Zh zh2 = new Zh(qla0.cr(), qla0.ReZ(), qla0.JQp(), hashMap0, null, qla0.Zh(), qla0.PjT());
                long v3 = qla0.cz().PjT();
                if(v3 <= 0L) {
                    v3 = PjT.cz(hashMap0);
                }
                long v4 = this.Zh.length();
                boolean z = PjT.JQp(hashMap0);
                if(z) {
                    v3 += v4;
                    String s = (String)hashMap0.get("Content-Range");
                    if(!TextUtils.isEmpty(s) && TextUtils.indexOf(s, "bytes " + v4 + "-" + (v3 - 1L)) == -1) {
                        this.JQp();
                        return null;
                    }
                }
                if(v3 > 0L && this.Zh.exists() && this.Zh.length() == v3) {
                    if(this.Zh.renameTo(this.PjT)) {
                        zh2.PjT(this.PjT);
                        return zh2;
                    }
                    return null;
                }
                try {
                    randomAccessFile0 = null;
                    randomAccessFile0 = new RandomAccessFile(this.Zh, "rw");
                    if(z) {
                        randomAccessFile0.seek(v1);
                        v5 = v1;
                    }
                    else {
                        randomAccessFile0.setLength(0L);
                        goto label_60;
                    }
                    goto label_61;
                }
                catch(Throwable unused_ex) {
                }
            label_60:
                v5 = 0L;
                try {
                label_61:
                    inputStream0 = qla0.cz().ReZ();
                }
                catch(Throwable unused_ex) {
                    inputStream1 = null;
                    goto label_97;
                }
                try {
                    if(PjT.XX(hashMap0) && !(inputStream0 instanceof GZIPInputStream)) {
                        inputStream0 = new GZIPInputStream(inputStream0);
                    }
                    byte[] arr_b = new byte[0x4000];
                    int v6 = 0;
                    long v7 = 0L;
                    do {
                        int v8 = inputStream0.read(arr_b, v6, 0x4000 - v6);
                        if(v8 == -1) {
                            goto label_81;
                        }
                        v6 += v8;
                        v7 += (long)v8;
                        if(v7 % 0x4000L == 0L || v7 == v3 - v1) {
                            randomAccessFile0.seek(v5);
                            randomAccessFile0.write(arr_b, 0, v6);
                            v5 += (long)v6;
                            v6 = 0;
                        }
                    }
                    while(!this.DWo);
                    goto label_96;
                label_81:
                    randomAccessFile0.seek(v5);
                    randomAccessFile0.write(arr_b, 0, v6);
                    if(!z || v1 == 0L) {
                        v3 = this.Zh.length();
                    }
                    if(v3 > 0L && this.Zh.exists() && this.Zh.length() == v3) {
                        if(this.Zh.renameTo(this.PjT)) {
                            zh2.PjT(this.PjT);
                            try {
                                inputStream0.close();
                            }
                            catch(Throwable unused_ex) {
                            }
                            try {
                                randomAccessFile0.close();
                            }
                            catch(Throwable unused_ex) {
                            }
                            return zh2;
                        }
                        try {
                            inputStream0.close();
                        }
                        catch(Throwable unused_ex) {
                        }
                        try {
                            randomAccessFile0.close();
                        }
                        catch(Throwable unused_ex) {
                        }
                        return null;
                    }
                    this.Zh.length();
                    goto label_109;
                }
                catch(Throwable unused_ex) {
                }
            label_96:
                inputStream1 = inputStream0;
            label_97:
                v9 = FIN.finallyOpen$NT();
                if(!z) {
                    this.JQp();
                }
            }
            catch(IOException unused_ex) {
                this.JQp();
                return null;
            }
            FIN.finallyCodeBegin$NT(v9);
            if(inputStream1 != null) {
                try {
                    inputStream1.close();
                }
                catch(Throwable unused_ex) {
                }
            }
            try {
                randomAccessFile0.close();
                FIN.finallyCodeEnd$NT(v9);
            }
            catch(Throwable unused_ex) {
            }
            return null;
            try {
            label_109:
                inputStream0.close();
            }
            catch(Throwable unused_ex) {
            }
            try {
                randomAccessFile0.close();
            }
            catch(Throwable unused_ex) {
            }
            return null;
        }
        return null;
    }

    public void PjT(com.bytedance.sdk.component.XX.PjT.PjT pjT0) {
        long v = 0L;
        File file0 = this.PjT;
        if(file0 != null && this.Zh != null) {
            if(file0.exists() && this.PjT.length() != 0L && pjT0 != null) {
                long v1 = System.currentTimeMillis();
                Zh zh0 = new Zh(true, 200, "Success", null, null, v1, v1);
                zh0.PjT(this.PjT);
                pjT0.PjT(this, zh0);
                return;
            }
            long v2 = this.Zh.length();
            if(v2 >= 0L) {
                v = v2;
            }
            com.bytedance.sdk.component.Zh.PjT.xs.PjT xs$PjT0 = new com.bytedance.sdk.component.Zh.PjT.xs.PjT();
            xs$PjT0.PjT(this.ReZ());
            this.Zh("Range", "bytes=" + v + "-");
            if(TextUtils.isEmpty(this.Au)) {
                pjT0.PjT(this, new IOException("Url is Empty"));
                return;
            }
            try {
                xs$PjT0.Zh(this.Au);
                if(!TextUtils.isEmpty(this.JQp)) {
                    xs$PjT0.PjT(this.JQp);
                }
                int v3 = this.cz;
                if(v3 > 0) {
                    xs$PjT0.PjT(v3);
                }
            }
            catch(IllegalArgumentException unused_ex) {
                pjT0.PjT(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
                return;
            }
            this.PjT(xs$PjT0);
            xs xs0 = xs$PjT0.PjT().Zh();
            com.bytedance.sdk.component.Zh.PjT.Zh zh1 = this.ReZ.PjT(xs0);
            if(zh1 == null) {
                pjT0.PjT(this, new IOException("new call error"));
                return;
            }
            zh1.PjT(new com.bytedance.sdk.component.Zh.PjT.ReZ() {
                final PjT ReZ;

                @Override  // com.bytedance.sdk.component.Zh.PjT.ReZ
                public void PjT(com.bytedance.sdk.component.Zh.PjT.Zh zh0, qla qla0) throws IOException {
                    long v2;
                    RandomAccessFile randomAccessFile0;
                    InputStream inputStream0;
                    if(pjT0 != null) {
                        HashMap hashMap0 = new HashMap();
                        if(qla0 != null) {
                            cz cz0 = qla0.XX();
                            if(cz0 != null) {
                                for(int v = 0; v < cz0.PjT(); ++v) {
                                    hashMap0.put(cz0.PjT(v), cz0.Zh(v));
                                }
                            }
                            Zh zh1 = new Zh(qla0.cr(), qla0.ReZ(), qla0.JQp(), hashMap0, null, qla0.Zh(), qla0.PjT());
                            if(qla0.cr()) {
                                long v1 = qla0.cz().PjT();
                                if(v1 <= 0L) {
                                    v1 = PjT.cz(hashMap0);
                                }
                                boolean z = PjT.JQp(hashMap0);
                                if(z) {
                                    v1 += v;
                                    String s = (String)hashMap0.get("Content-Range");
                                    if(!TextUtils.isEmpty(s)) {
                                        String s1 = "bytes " + v + "-" + (v1 - 1L);
                                        if(TextUtils.indexOf(s, s1) == -1) {
                                            PjT.this.JQp();
                                            IOException iOException0 = new IOException("The Content-Range Header is invalid Assume[" + s1 + "] vs Real[" + s + "], please remove the temporary file [" + PjT.this.Zh + "].");
                                            pjT0.PjT(PjT.this, iOException0);
                                            return;
                                        }
                                    }
                                }
                                if(v1 > 0L && PjT.this.Zh.exists() && PjT.this.Zh.length() == v1) {
                                    if(PjT.this.Zh.renameTo(PjT.this.PjT)) {
                                        zh1.PjT(PjT.this.PjT);
                                        pjT0.PjT(PjT.this, zh1);
                                        return;
                                    }
                                    IOException iOException1 = new IOException("Rename fail");
                                    pjT0.PjT(PjT.this, iOException1);
                                    return;
                                }
                                try {
                                    inputStream0 = null;
                                    randomAccessFile0 = null;
                                    randomAccessFile0 = new RandomAccessFile(PjT.this.Zh, "rw");
                                    if(z) {
                                        randomAccessFile0.seek(v);
                                        v2 = v;
                                    }
                                    else {
                                        randomAccessFile0.setLength(0L);
                                        goto label_42;
                                    }
                                    goto label_43;
                                }
                                catch(Throwable unused_ex) {
                                }
                            label_42:
                                v2 = 0L;
                                try {
                                label_43:
                                    inputStream0 = qla0.cz().ReZ();
                                    if(PjT.XX(hashMap0) && !(inputStream0 instanceof GZIPInputStream)) {
                                        inputStream0 = new GZIPInputStream(inputStream0);
                                    }
                                    byte[] arr_b = new byte[0x4000];
                                    long v3 = 0L;
                                    int v4 = 0;
                                    int v5;
                                    while((v5 = inputStream0.read(arr_b, v4, 0x4000 - v4)) != -1) {
                                        v4 += v5;
                                        v3 += (long)v5;
                                        if(v3 % 0x4000L == 0L || v3 == v1 - v) {
                                            randomAccessFile0.seek(v2);
                                            randomAccessFile0.write(arr_b, 0, v4);
                                            v2 += (long)v4;
                                            v4 = 0;
                                        }
                                        if(PjT.this.DWo) {
                                            throw new IOException("net is cancel");
                                        }
                                    }
                                    if(v4 != 0) {
                                        randomAccessFile0.seek(v2);
                                        randomAccessFile0.write(arr_b, 0, v4);
                                    }
                                    if(!z) {
                                        v1 = PjT.this.Zh.length();
                                    }
                                    if(v1 <= 0L || !PjT.this.Zh.exists() || PjT.this.Zh.length() != v1) {
                                        pjT0.PjT(PjT.this, new IOException(" tempFile.length() == fileSize is" + (PjT.this.Zh.length() == v1)));
                                    }
                                    else if(PjT.this.Zh.renameTo(PjT.this.PjT)) {
                                        zh1.PjT(PjT.this.PjT);
                                        pjT0.PjT(PjT.this, zh1);
                                    }
                                    else {
                                        IOException iOException2 = new IOException("Rename fail");
                                        pjT0.PjT(PjT.this, iOException2);
                                    }
                                    goto label_88;
                                }
                                catch(Throwable throwable0) {
                                }
                                int v6 = FIN.finallyOpen$NT();
                                IOException iOException3 = new IOException(throwable0.getMessage());
                                pjT0.PjT(PjT.this, iOException3);
                                if(!z) {
                                    PjT.this.JQp();
                                }
                                FIN.finallyCodeBegin$NT(v6);
                                if(inputStream0 != null) {
                                    try {
                                        inputStream0.close();
                                    }
                                    catch(Throwable unused_ex) {
                                    }
                                }
                                try {
                                    randomAccessFile0.close();
                                    FIN.finallyCodeEnd$NT(v6);
                                }
                                catch(Throwable unused_ex) {
                                }
                                return;
                                try {
                                label_88:
                                    inputStream0.close();
                                }
                                catch(Throwable unused_ex) {
                                }
                                try {
                                    randomAccessFile0.close();
                                }
                                catch(Throwable unused_ex) {
                                }
                                return;
                            }
                            pjT0.PjT(PjT.this, zh1);
                        }
                    }
                }

                @Override  // com.bytedance.sdk.component.Zh.PjT.ReZ
                public void PjT(com.bytedance.sdk.component.Zh.PjT.Zh zh0, IOException iOException0) {
                    com.bytedance.sdk.component.XX.PjT.PjT pjT0 = pjT0;
                    if(pjT0 != null) {
                        pjT0.PjT(PjT.this, iOException0);
                    }
                    PjT.this.JQp();
                }
            });
            return;
        }
        if(pjT0 != null) {
            pjT0.PjT(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
        }
    }

    public void PjT(String s, String s1) {
        File file0 = new File(s);
        if(file0.isFile()) {
            file0.delete();
        }
        if(!file0.exists()) {
            file0.mkdirs();
        }
        this.PjT = new File(s, s1);
        this.Zh = new File(s, s1 + ".temp");
    }

    private static boolean XX(Map map0) {
        return TextUtils.equals(((CharSequence)map0.get("Content-Encoding")), "gzip");
    }

    @Override  // com.bytedance.sdk.component.XX.Zh.ReZ
    public void Zh() {
        this.DWo = true;
        super.Zh();
    }

    private static long cz(Map map0) {
        String s;
        if(map0.containsKey("content-length")) {
            s = (String)map0.get("content-length");
        }
        else {
            s = map0.containsKey("Content-Length") ? ((String)map0.get("Content-Length")) : null;
        }
        if(TextUtils.isEmpty(s)) {
            return 0L;
        }
        if(s != null) {
            try {
                return (long)Long.valueOf(s);
            }
            catch(Throwable unused_ex) {
            }
        }
        return 0L;
    }
}

