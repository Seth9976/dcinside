package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class ResourceCursorAdapter extends CursorAdapter {
    private int l;
    private int m;
    private LayoutInflater n;

    @Deprecated
    public ResourceCursorAdapter(Context context0, int v, Cursor cursor0) {
        super(context0, cursor0);
        this.m = v;
        this.l = v;
        this.n = (LayoutInflater)context0.getSystemService("layout_inflater");
    }

    public ResourceCursorAdapter(Context context0, int v, Cursor cursor0, int v1) {
        super(context0, cursor0, v1);
        this.m = v;
        this.l = v;
        this.n = (LayoutInflater)context0.getSystemService("layout_inflater");
    }

    @Deprecated
    public ResourceCursorAdapter(Context context0, int v, Cursor cursor0, boolean z) {
        super(context0, cursor0, z);
        this.m = v;
        this.l = v;
        this.n = (LayoutInflater)context0.getSystemService("layout_inflater");
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public View i(Context context0, Cursor cursor0, ViewGroup viewGroup0) {
        return this.n.inflate(this.m, viewGroup0, false);
    }

    @Override  // androidx.cursoradapter.widget.CursorAdapter
    public View j(Context context0, Cursor cursor0, ViewGroup viewGroup0) {
        return this.n.inflate(this.l, viewGroup0, false);
    }

    public void n(int v) {
        this.m = v;
    }

    public void o(int v) {
        this.l = v;
    }
}

