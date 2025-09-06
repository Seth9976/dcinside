package com.bytedance.sdk.openadsdk.core.qj.ReZ;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.qj.PjT.PjT;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ReZ {
    @NonNull
    private final List PjT;
    @NonNull
    private final Map Zh;

    public ReZ(@NonNull List list0) {
        this.PjT = list0;
        HashMap hashMap0 = new HashMap();
        this.Zh = hashMap0;
        hashMap0.put(Zh.ReZ, "44032012");
    }

    @NonNull
    public ReZ PjT(@Nullable long v) {
        if(v >= 0L) {
            String s = this.Zh(v);
            if(!TextUtils.isEmpty(s)) {
                this.Zh.put(Zh.Zh, s);
            }
        }
        return this;
    }

    @NonNull
    public ReZ PjT(@Nullable PjT pjT0) {
        if(pjT0 != null) {
            String s = pjT0.PjT();
            this.Zh.put(Zh.PjT, s);
        }
        return this;
    }

    @NonNull
    public ReZ PjT(@Nullable String s) {
        if(!TextUtils.isEmpty(s)) {
            try {
                s = URLEncoder.encode(s, "UTF-8");
            }
            catch(Throwable unused_ex) {
            }
            this.Zh.put(Zh.cr, s);
        }
        return this;
    }

    @NonNull
    public List PjT() {
        List list0 = new ArrayList();
        for(Object object0: this.PjT) {
            String s = (String)object0;
            if(!TextUtils.isEmpty(s)) {
                Zh[] arr_zh = Zh.values();
                for(int v = 0; v < arr_zh.length; ++v) {
                    Zh zh0 = arr_zh[v];
                    String s1 = (String)this.Zh.get(zh0);
                    if(s1 == null) {
                        s1 = "";
                    }
                    s = s.replaceAll("\\[" + zh0.name() + "\\]", s1);
                }
                list0.add(s);
            }
        }
        return list0;
    }

    @NonNull
    private String Zh() [...] // 潜在的解密器

    @NonNull
    private String Zh(long v) {
        Locale locale0 = Locale.getDefault();
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        return String.format(locale0, "%02d:%02d:%02d.%03d", timeUnit0.toHours(v), ((long)(timeUnit0.toMinutes(v) % TimeUnit.HOURS.toMinutes(1L))), ((long)(timeUnit0.toSeconds(v) % TimeUnit.MINUTES.toSeconds(1L))), ((long)(v % 1000L)));
    }
}

