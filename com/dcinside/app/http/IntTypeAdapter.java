package com.dcinside.app.http;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import com.google.gson.stream.c;
import com.google.gson.stream.d;
import com.google.gson.t;
import java.io.IOException;

public class IntTypeAdapter extends TypeAdapter {
    @Override  // com.google.gson.TypeAdapter
    public Object e(a a0) throws IOException {
        return this.j(a0);
    }

    @Override  // com.google.gson.TypeAdapter
    public void i(d d0, Object object0) throws IOException {
        this.k(d0, ((Integer)object0));
    }

    public Integer j(a a0) throws IOException {
        if(a0.f0() == c.i) {
            a0.T();
            return 0;
        }
        try {
            String s = a0.d0();
            return "".equals(s) ? 0 : Integer.parseInt(s);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new t(numberFormatException0);
        }
        catch(IllegalStateException unused_ex) {
            return a0.v() ? 1 : 0;
        }
    }

    public void k(d d0, Integer integer0) throws IOException {
        d0.x0(integer0);
    }
}

