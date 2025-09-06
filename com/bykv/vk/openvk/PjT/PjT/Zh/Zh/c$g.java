package com.bykv.vk.openvk.PjT.PjT.Zh.Zh;

import com.bytedance.sdk.component.Zh.PjT.cz;
import com.bytedance.sdk.component.Zh.PjT.qla;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class c.g extends c.c {
    private qla c;

    public c.g(qla qla0, c.b c$b0) {
        this.c = qla0;
        this.a = new ArrayList();
        if(qla0 != null) {
            cz cz0 = qla0.XX();
            if(cz0 != null) {
                for(int v = 0; v < cz0.PjT(); ++v) {
                    this.a.add(new c(cz0.PjT(v), cz0.Zh(v)));
                }
            }
        }
        this.b = c$b0;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c$c
    public String a() {
        return this.c == null || this.c.Au() == null ? "http/1.1" : this.c.Au().toString();
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c$c
    public int b() {
        return this.c.ReZ();
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c$c
    public String e(String s, String s1) {
        return this.c(s) == null ? s1 : this.c(s).b;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c$c
    public List f() {
        return this.a;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c$c
    public boolean h() {
        return this.c.ReZ() >= 200 && this.c.ReZ() < 300;
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c$c
    public InputStream i() {
        return this.c.cz().ReZ();
    }

    @Override  // com.bykv.vk.openvk.PjT.PjT.Zh.Zh.c$c
    public String j() {
        return this.d(this.c.ReZ());
    }
}

