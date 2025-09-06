package com.bytedance.adsdk.Zh;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.Zh.JQp.tT;
import com.bytedance.adsdk.Zh.ReZ.JQp;
import com.bytedance.adsdk.Zh.ReZ.ReZ;
import com.bytedance.adsdk.Zh.cz.cz;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Au {
    private static final Map PjT;
    private static final byte[] ReZ;
    private static final Set Zh;

    static {
        Au.PjT = new HashMap();
        Au.Zh = new HashSet();
        Au.ReZ = new byte[]{80, 75, 3, 4};
    }

    private static DWo PjT(XX xX0, String s) {
        for(Object object0: xX0.xE().values()) {
            DWo dWo0 = (DWo)object0;
            if(dWo0.SM().equals(s)) {
                return dWo0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public static xf PjT(Context context0, ZipInputStream zipInputStream0, String s) {
        try {
            return Au.Zh(context0, zipInputStream0, s);
        }
        finally {
            cz.PjT(zipInputStream0);
        }
    }

    public static xf PjT(JsonReader jsonReader0, String s) {
        return Au.PjT(jsonReader0, s, true);
    }

    private static xf PjT(JsonReader jsonReader0, String s, boolean z) {
        xf xf1;
        xf xf0;
        try {
            try {
                XX xX0 = tT.PjT(jsonReader0);
                JQp.PjT().PjT(s, xX0);
                xf0 = new xf(xX0);
                goto label_13;
            }
            catch(Exception exception0) {
            }
            xf1 = new xf(exception0);
            if(z) {
                goto label_7;
            }
            return xf1;
        }
        catch(Throwable throwable0) {
            goto label_10;
        }
    label_7:
        Au.PjT(jsonReader0);
        return xf1;
    label_10:
        if(z) {
            Au.PjT(jsonReader0);
        }
        throw throwable0;
    label_13:
        if(z) {
            Au.PjT(jsonReader0);
        }
        return xf0;
    }

    private static xf PjT(InputStream inputStream0, String s, boolean z) {
        xf xf0;
        try {
            xf0 = Au.PjT(new JsonReader(new InputStreamReader(inputStream0)), s);
        }
        catch(Throwable throwable0) {
            if(z) {
                cz.PjT(inputStream0);
            }
            throw throwable0;
        }
        if(z) {
            cz.PjT(inputStream0);
        }
        return xf0;
    }

    public static xs PjT(Context context0, int v) {
        return Au.PjT(context0, v, Au.ReZ(context0, v));
    }

    public static xs PjT(Context context0, int v, String s) {
        return Au.PjT(s, new Callable() {
            public xf PjT() throws Exception {
                Context context0 = (Context)new WeakReference(context0).get();
                if(context0 == null) {
                    context0 = context0.getApplicationContext();
                }
                return Au.Zh(context0, v, s);
            }

            @Override
            public Object call() throws Exception {
                return this.PjT();
            }
        });
    }

    public static xs PjT(Context context0, String s) {
        return Au.PjT(context0, s, "url_" + s);
    }

    public static xs PjT(Context context0, String s, String s1) {
        return Au.PjT(s1, new Callable() {
            public xf PjT() throws Exception {
                xf xf0 = com.bytedance.adsdk.Zh.JQp.PjT(context0).PjT(context0, s, s1);
                if(s1 != null && xf0.PjT() != null) {
                    JQp.PjT().PjT(s1, ((XX)xf0.PjT()));
                }
                return xf0;
            }

            @Override
            public Object call() throws Exception {
                return this.PjT();
            }
        });
    }

    public static xs PjT(InputStream inputStream0, String s) {
        return Au.PjT(s, new Callable() {
            public xf PjT() throws Exception {
                return Au.Zh(inputStream0, s);
            }

            @Override
            public Object call() throws Exception {
                return this.PjT();
            }
        });
    }

    private static xs PjT(String s, Callable callable0) {
        XX xX0 = s == null ? null : JQp.PjT().PjT(s);
        if(xX0 != null) {
            return new xs(new Callable() {
                public xf PjT() throws Exception {
                    return new xf(xX0);
                }

                @Override
                public Object call() throws Exception {
                    return this.PjT();
                }
            });
        }
        if(s != null) {
            Map map0 = Au.PjT;
            if(map0.containsKey(s)) {
                return (xs)map0.get(s);
            }
        }
        xs xs0 = new xs(callable0);
        if(s != null) {
            AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
            xs0.PjT(new qj() {
                public void PjT(XX xX0) {
                    Au.PjT.remove(s);
                    atomicBoolean0.set(true);
                    if(Au.PjT.size() == 0) {
                        Au.Zh(true);
                    }
                }

                @Override  // com.bytedance.adsdk.Zh.qj
                public void PjT(Object object0) {
                    this.PjT(((XX)object0));
                }
            });
            xs0.ReZ(new qj() {
                @Override  // com.bytedance.adsdk.Zh.qj
                public void PjT(Object object0) {
                    this.PjT(((Throwable)object0));
                }

                public void PjT(Throwable throwable0) {
                    Au.PjT.remove(s);
                    atomicBoolean0.set(true);
                    if(Au.PjT.size() == 0) {
                        Au.Zh(true);
                    }
                }
            });
            if(!atomicBoolean0.get()) {
                Au.PjT.put(s, xs0);
                if(Au.PjT.size() == 1) {
                    Au.Zh(false);
                }
            }
        }
        return xs0;
    }

    public static void PjT(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Exception unused_ex) {
                return;
            }
            throw runtimeException0;
        }
    }

    private static boolean PjT(Context context0) {
        return (context0.getResources().getConfiguration().uiMode & 0x30) == 0x20;
    }

    public static xf ReZ(Context context0, String s) {
        return Au.ReZ(context0, s, "asset_" + s);
    }

    public static xf ReZ(Context context0, String s, String s1) {
        try {
            return s.endsWith(".zip") || s.endsWith(".lottie") ? Au.PjT(context0, new ZipInputStream(context0.getAssets().open(s)), s1) : Au.Zh(context0.getAssets().open(s), s1);
        }
        catch(IOException iOException0) {
            return new xf(iOException0);
        }
    }

    // 去混淆评级： 低(20)
    private static String ReZ(Context context0, int v) {
        return "rawRes" + (Au.PjT(context0) ? "_night_" : "_day_") + v;
    }

    public static xf Zh(Context context0, int v) {
        return Au.Zh(context0, v, Au.ReZ(context0, v));
    }

    public static xf Zh(Context context0, int v, String s) {
        try {
            return Au.Zh(context0.getResources().openRawResource(v), Au.ReZ(context0, v));
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            return new xf(resources$NotFoundException0);
        }
    }

    private static xf Zh(Context context0, ZipInputStream zipInputStream0, String s) {
        byte[] arr_b1;
        FileOutputStream fileOutputStream0;
        File file0;
        String s3;
        String s1;
        XX xX0;
        ZipEntry zipEntry0;
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        try {
            zipEntry0 = zipInputStream0.getNextEntry();
            xX0 = null;
            while(true) {
            label_4:
                if(zipEntry0 == null) {
                    goto label_60;
                }
                s1 = zipEntry0.getName();
                if(!s1.contains("__MACOSX")) {
                    if(!zipEntry0.getName().equalsIgnoreCase("manifest.json")) {
                        if(!zipEntry0.getName().endsWith(".json")) {
                            if(s1.endsWith(".png") || (s1.endsWith(".webp") || s1.endsWith(".jpg") || s1.endsWith(".jpeg"))) {
                            }
                            else if(!s1.endsWith(".ttf") && !s1.endsWith(".otf")) {
                                zipInputStream0.closeEntry();
                                zipEntry0 = zipInputStream0.getNextEntry();
                                continue;
                            }
                            else if(s1.contains("../")) {
                                zipInputStream0.closeEntry();
                                zipEntry0 = zipInputStream0.getNextEntry();
                                continue;
                            }
                            else {
                                String[] arr_s = s1.split("/");
                                String s2 = arr_s[arr_s.length - 1];
                                s3 = s2.split("\\.")[0];
                                file0 = new File(context0.getCacheDir(), s2);
                                new FileOutputStream(file0);
                                break;
                            }
                            goto label_44;
                        }
                        xX0 = (XX)Au.PjT(new JsonReader(new InputStreamReader(zipInputStream0)), null, false).PjT();
                        zipEntry0 = zipInputStream0.getNextEntry();
                        continue;
                    }
                    goto label_53;
                }
                goto label_55;
            }
        }
        catch(IOException iOException0) {
            return new xf(iOException0);
        }
        try {
            fileOutputStream0 = new FileOutputStream(file0);
        }
        catch(Throwable unused_ex) {
            goto label_39;
        }
        try {
            byte[] arr_b = new byte[0x1000];
            int v;
            while((v = zipInputStream0.read(arr_b)) != -1) {
                fileOutputStream0.write(arr_b, 0, v);
            }
            fileOutputStream0.flush();
            goto label_38;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            try {
                fileOutputStream0.close();
                throw throwable1;
            }
            catch(Throwable throwable2) {
                try {
                    throwable0.addSuppressed(throwable2);
                    throw throwable1;
                label_38:
                    fileOutputStream0.close();
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        try {
        label_39:
            Typeface typeface0 = Typeface.createFromFile(file0);
            if(!file0.delete()) {
                file0.getAbsolutePath();
            }
            hashMap1.put(s3, typeface0);
            zipEntry0 = zipInputStream0.getNextEntry();
            goto label_4;
        label_44:
            if(s1.contains("../")) {
                zipInputStream0.closeEntry();
            }
            else {
                String[] arr_s1 = s1.split("/");
                hashMap0.put(arr_s1[arr_s1.length - 1], BitmapFactory.decodeStream(zipInputStream0));
            }
            zipEntry0 = zipInputStream0.getNextEntry();
            goto label_4;
        label_53:
            zipInputStream0.closeEntry();
            zipEntry0 = zipInputStream0.getNextEntry();
            goto label_4;
        label_55:
            zipInputStream0.closeEntry();
            zipEntry0 = zipInputStream0.getNextEntry();
            goto label_4;
        }
        catch(IOException iOException0) {
            return new xf(iOException0);
        }
    label_60:
        if(xX0 == null) {
            return new xf(new IllegalArgumentException("Unable to parse composition"));
        }
        for(Object object0: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            DWo dWo0 = Au.PjT(xX0, ((String)map$Entry0.getKey()));
            if(dWo0 != null) {
                dWo0.PjT(cz.PjT(((Bitmap)map$Entry0.getValue()), dWo0.PjT(), dWo0.Zh()));
            }
        }
        for(Object object1: hashMap1.entrySet()) {
            Map.Entry map$Entry1 = (Map.Entry)object1;
            boolean z = false;
            for(Object object2: xX0.qla().values()) {
                ReZ reZ0 = (ReZ)object2;
                if(reZ0.PjT().equals(map$Entry1.getKey())) {
                    reZ0.PjT(((Typeface)map$Entry1.getValue()));
                    z = true;
                }
            }
            if(!z) {
                String s4 = (String)map$Entry1.getKey();
            }
        }
        if(hashMap0.isEmpty()) {
            for(Object object3: xX0.xE().entrySet()) {
                DWo dWo1 = (DWo)((Map.Entry)object3).getValue();
                if(dWo1 == null) {
                    return null;
                }
                String s5 = dWo1.SM();
                BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                bitmapFactory$Options0.inScaled = true;
                bitmapFactory$Options0.inDensity = 0xA0;
                if(s5.startsWith("data:") && s5.indexOf("base64,") > 0) {
                    try {
                        arr_b1 = Base64.decode(s5.substring(s5.indexOf(44) + 1), 0);
                    }
                    catch(IllegalArgumentException unused_ex) {
                        return null;
                    }
                    dWo1.PjT(BitmapFactory.decodeByteArray(arr_b1, 0, arr_b1.length, bitmapFactory$Options0));
                }
            }
        }
        for(Object object4: xX0.xE().entrySet()) {
            Map.Entry map$Entry2 = (Map.Entry)object4;
            if(((DWo)map$Entry2.getValue()).qj() == null) {
                return new xf(new IllegalStateException("There is no image for " + ((DWo)map$Entry2.getValue()).SM()));
            }
            if(false) {
                break;
            }
        }
        if(s != null) {
            JQp.PjT().PjT(s, xX0);
        }
        return new xf(xX0);
    }

    public static xf Zh(InputStream inputStream0, String s) {
        return Au.PjT(inputStream0, s, true);
    }

    public static xs Zh(Context context0, String s) {
        return Au.Zh(context0, s, "asset_" + s);
    }

    public static xs Zh(Context context0, String s, String s1) {
        return Au.PjT(s1, new Callable() {
            public xf PjT() throws Exception {
                return Au.ReZ(context0.getApplicationContext(), s, s1);
            }

            @Override
            public Object call() throws Exception {
                return this.PjT();
            }
        });
    }

    private static void Zh(boolean z) {
        ArrayList arrayList0 = new ArrayList(Au.Zh);
        for(int v = 0; v < arrayList0.size(); ++v) {
            arrayList0.get(v);
        }
    }
}

