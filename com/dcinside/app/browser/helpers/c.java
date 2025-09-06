package com.dcinside.app.browser.helpers;

import android.content.Context;
import android.graphics.Typeface;
import androidx.collection.SimpleArrayMap;

public class c {
    private static final SimpleArrayMap a;

    static {
        c.a = new SimpleArrayMap();
    }

    public static Typeface a(Context context0, String s) {
        SimpleArrayMap simpleArrayMap0 = c.a;
        synchronized(simpleArrayMap0) {
            if(!simpleArrayMap0.containsKey(s)) {
                try {
                    Typeface typeface0 = Typeface.createFromAsset(context0.getAssets(), String.format("fonts/%s", s));
                    simpleArrayMap0.put(s, typeface0);
                    return typeface0;
                }
                catch(RuntimeException unused_ex) {
                    return null;
                }
            }
        }
        return (Typeface)simpleArrayMap0.get(s);
    }
}

