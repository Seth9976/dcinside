package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;

class NavItemSelectedListener implements AdapterView.OnItemSelectedListener {
    private final OnNavigationListener a;

    public NavItemSelectedListener(OnNavigationListener actionBar$OnNavigationListener0) {
        this.a = actionBar$OnNavigationListener0;
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView0, View view0, int v, long v1) {
        OnNavigationListener actionBar$OnNavigationListener0 = this.a;
        if(actionBar$OnNavigationListener0 != null) {
            actionBar$OnNavigationListener0.a(v, v1);
        }
    }

    @Override  // android.widget.AdapterView$OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView0) {
    }
}

