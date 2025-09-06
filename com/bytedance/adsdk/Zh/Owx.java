package com.bytedance.adsdk.Zh;

import java.util.Map;

public class Owx {
    private final Map PjT;
    private boolean Zh;

    public String PjT(String s) [...] // Inlined contents

    public String PjT(String s, String s1) {
        return s1;
    }

    public final String Zh(String s, String s1) {
        if(this.Zh && this.PjT.containsKey(s1)) {
            return (String)this.PjT.get(s1);
        }
        String s2 = this.PjT(s, s1);
        if(this.Zh) {
            this.PjT.put(s1, s2);
        }
        return s2;
    }
}

