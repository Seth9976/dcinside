package com.bytedance.sdk.component.JQp.Zh;

import android.util.Log;
import com.bytedance.sdk.component.JQp.JQp;
import com.bytedance.sdk.component.JQp.cr;
import com.bytedance.sdk.component.JQp.cz;
import com.bytedance.sdk.component.utils.DWo;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PjT implements cr {
    private Map PjT(HttpURLConnection httpURLConnection0) {
        Map map0 = new HashMap();
        Map map1 = httpURLConnection0.getHeaderFields();
        for(Object object0: map1.keySet()) {
            String s = (String)object0;
            List list0 = (List)map1.get(s);
            if(list0 != null && list0.size() > 0) {
                map0.put(s, list0.get(0));
            }
        }
        return map0;
    }

    @Override  // com.bytedance.sdk.component.JQp.cr
    public cz PjT(JQp jQp0) {
        return this.Zh(jQp0);
    }

    public ReZ Zh(JQp jQp0) {
        String s;
        byte[] arr_b1;
        ByteArrayOutputStream byteArrayOutputStream0;
        byte[] arr_b;
        InputStream inputStream0;
        HttpURLConnection httpURLConnection0;
        int v;
        Closeable closeable0 = null;
        try {
            v = 0;
            httpURLConnection0 = (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(new URL(jQp0.PjT()).openConnection())));
            httpURLConnection0.setRequestMethod("GET");
            httpURLConnection0.setConnectTimeout(5000);
            httpURLConnection0.setReadTimeout(5000);
            httpURLConnection0.connect();
            inputStream0 = null;
            inputStream0 = httpURLConnection0.getInputStream();
        }
        catch(MalformedURLException malformedURLException0) {
            inputStream0 = null;
            arr_b = null;
            byteArrayOutputStream0 = null;
            goto label_52;
        }
        catch(IOException iOException0) {
            arr_b = null;
            goto label_55;
        }
        catch(Throwable throwable0) {
            byteArrayOutputStream0 = null;
            goto label_60;
        }
        try {
            arr_b1 = new byte[0x400];
            byteArrayOutputStream0 = null;
            byteArrayOutputStream0 = new ByteArrayOutputStream();
            goto label_31;
        }
        catch(MalformedURLException malformedURLException0) {
        }
        catch(IOException iOException0) {
            arr_b = null;
            goto label_55;
        }
        catch(Throwable throwable0) {
            closeable0 = inputStream0;
            goto label_60;
        }
        arr_b = null;
        byteArrayOutputStream0 = null;
        goto label_52;
        try {
            try {
                while(true) {
                label_31:
                    int v1 = inputStream0.read(arr_b1);
                    if(v1 == -1) {
                        break;
                    }
                    byteArrayOutputStream0.write(arr_b1, 0, v1);
                }
                v = 200;
                arr_b = byteArrayOutputStream0.toByteArray();
            }
            catch(MalformedURLException malformedURLException0) {
                goto label_51;
            }
            catch(IOException iOException0) {
                arr_b = null;
                goto label_55;
            }
            try {
                if(jQp0.Zh()) {
                    closeable0 = this.PjT(httpURLConnection0);
                }
                goto label_63;
            }
            catch(MalformedURLException malformedURLException0) {
                goto label_52;
            }
            catch(IOException iOException0) {
                goto label_55;
            }
            try {
                closeable0 = inputStream0;
                goto label_60;
            label_51:
                arr_b = null;
            }
            catch(MalformedURLException malformedURLException0) {
                goto label_51;
            }
            catch(IOException iOException0) {
                arr_b = null;
                goto label_55;
            }
        label_52:
            Log.w("InternalHttpClient", "MalformedURLException:" + malformedURLException0.getMessage());
            s = malformedURLException0.getMessage();
            goto label_57;
        label_55:
            Log.w("InternalHttpClient", "IOException:" + iOException0.getMessage());
            s = iOException0.getMessage();
        }
        catch(Throwable throwable0) {
            closeable0 = inputStream0;
            goto label_60;
        }
    label_57:
        DWo.PjT(inputStream0);
        DWo.PjT(byteArrayOutputStream0);
        return new ReZ(v, arr_b, s, null);
    label_60:
        DWo.PjT(closeable0);
        DWo.PjT(byteArrayOutputStream0);
        throw throwable0;
    label_63:
        DWo.PjT(inputStream0);
        DWo.PjT(byteArrayOutputStream0);
        return new ReZ(200, arr_b, "success", ((Map)closeable0));
    }
}

