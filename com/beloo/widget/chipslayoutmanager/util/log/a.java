package com.beloo.widget.chipslayoutmanager.util.log;

import android.util.Log;

class a implements f {
    @Override  // com.beloo.widget.chipslayoutmanager.util.log.f
    public int a(String s, String s1) {
        return Log.e(s, s1);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.util.log.f
    public int b(String s, String s1) {
        return Log.d(s, s1);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.util.log.f
    public int c(String s, String s1) {
        return Log.i(s, s1);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.util.log.f
    public int d(String s, String s1) {
        return Log.v(s, s1);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.util.log.f
    public int w(String s, String s1) {
        return Log.w(s, s1);
    }
}

