package S;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import y4.m;

public abstract class a implements b {
    @Override  // S.b
    @m
    public View a(@m ViewGroup viewGroup0, int v) {
        if(viewGroup0 == null) {
            return null;
        }
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(v, viewGroup0, false);
        return view0 instanceof View ? view0 : null;
    }
}

