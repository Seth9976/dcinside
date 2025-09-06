package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReZ implements Cursor {
    Map PjT;
    int ReZ;
    String[] Zh;

    public ReZ(Map map0) {
        this.ReZ = 0;
        if(map0 != null && map0.keySet() != null) {
            try {
                this.PjT = map0;
                this.Zh = (String[])map0.keySet().toArray(new String[map0.keySet().size()]);
            }
            catch(Exception unused_ex) {
            }
            return;
        }
        this.PjT = new HashMap();
    }

    @Override  // android.database.Cursor
    public void close() {
    }

    @Override  // android.database.Cursor
    public void copyStringToBuffer(int v, CharArrayBuffer charArrayBuffer0) {
    }

    @Override  // android.database.Cursor
    public void deactivate() {
    }

    @Override  // android.database.Cursor
    public byte[] getBlob(int v) {
        return new byte[0];
    }

    @Override  // android.database.Cursor
    public int getColumnCount() {
        return this.Zh == null ? 0 : this.Zh.length;
    }

    @Override  // android.database.Cursor
    public int getColumnIndex(String s) {
        if(this.Zh != null && this.Zh.length != 0) {
            for(int v = 0; true; ++v) {
                String[] arr_s = this.Zh;
                if(v >= arr_s.length) {
                    break;
                }
                if(s.equals(arr_s[v])) {
                    return v;
                }
            }
            return 0;
        }
        return -1;
    }

    @Override  // android.database.Cursor
    public int getColumnIndexOrThrow(String s) throws IllegalArgumentException {
        return 0;
    }

    @Override  // android.database.Cursor
    public String getColumnName(int v) {
        if(v >= 0) {
            return v >= this.Zh.length ? "" : this.Zh[v];
        }
        return "";
    }

    @Override  // android.database.Cursor
    public String[] getColumnNames() {
        return this.Zh;
    }

    @Override  // android.database.Cursor
    public int getCount() {
        try {
            return this.Zh == null || this.Zh.length == 0 ? 0 : ((List)this.PjT.get(this.Zh[0])).size();
        }
        catch(Exception unused_ex) {
        }
        return 0;
    }

    @Override  // android.database.Cursor
    public double getDouble(int v) {
        try {
            return Double.parseDouble(this.getString(v));
        }
        catch(Exception unused_ex) {
            return 0.0;
        }
    }

    @Override  // android.database.Cursor
    public Bundle getExtras() {
        return null;
    }

    @Override  // android.database.Cursor
    public float getFloat(int v) {
        try {
            return Float.parseFloat(this.getString(v));
        }
        catch(Exception unused_ex) {
            return 0.0f;
        }
    }

    @Override  // android.database.Cursor
    public int getInt(int v) {
        try {
            return Integer.parseInt(this.getString(v));
        }
        catch(Exception unused_ex) {
            return 0;
        }
    }

    @Override  // android.database.Cursor
    public long getLong(int v) {
        try {
            return Long.parseLong(this.getString(v));
        }
        catch(Exception unused_ex) {
            return 0L;
        }
    }

    @Override  // android.database.Cursor
    public Uri getNotificationUri() {
        return null;
    }

    @Override  // android.database.Cursor
    public int getPosition() {
        return this.ReZ;
    }

    @Override  // android.database.Cursor
    public short getShort(int v) {
        try {
            return Short.parseShort(this.getString(v));
        }
        catch(Exception unused_ex) {
            return 0;
        }
    }

    @Override  // android.database.Cursor
    public String getString(int v) {
        return v < 0 || v >= this.getColumnCount() ? "" : ((String)((List)this.PjT.get(this.Zh[v])).get(this.getPosition()));
    }

    @Override  // android.database.Cursor
    public int getType(int v) {
        return 0;
    }

    @Override  // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override  // android.database.Cursor
    public boolean isAfterLast() {
        return false;
    }

    @Override  // android.database.Cursor
    public boolean isBeforeFirst() {
        return false;
    }

    @Override  // android.database.Cursor
    public boolean isClosed() {
        return false;
    }

    @Override  // android.database.Cursor
    public boolean isFirst() {
        return this.ReZ == 0;
    }

    @Override  // android.database.Cursor
    public boolean isLast() {
        return this.ReZ == this.getCount() - 1;
    }

    @Override  // android.database.Cursor
    public boolean isNull(int v) {
        return this.getString(v) == null;
    }

    @Override  // android.database.Cursor
    public boolean move(int v) {
        if(this.ReZ + v >= this.getCount()) {
            return false;
        }
        this.ReZ += v;
        return true;
    }

    @Override  // android.database.Cursor
    public boolean moveToFirst() {
        if(this.getCount() <= 0) {
            return false;
        }
        this.ReZ = 0;
        return true;
    }

    @Override  // android.database.Cursor
    public boolean moveToLast() {
        if(this.getCount() <= 0) {
            return false;
        }
        this.ReZ = ((List)this.PjT.get(this.Zh[0])).size() - 1;
        return true;
    }

    @Override  // android.database.Cursor
    public boolean moveToNext() {
        if(this.ReZ + 1 >= this.getCount()) {
            return false;
        }
        ++this.ReZ;
        return true;
    }

    @Override  // android.database.Cursor
    public boolean moveToPosition(int v) {
        if(v >= this.getCount()) {
            return false;
        }
        this.ReZ = v;
        return true;
    }

    @Override  // android.database.Cursor
    public boolean moveToPrevious() {
        int v = this.ReZ;
        if(v - 1 < 0) {
            return false;
        }
        this.ReZ = v - 1;
        return true;
    }

    @Override  // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver0) {
    }

    @Override  // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver0) {
    }

    @Override  // android.database.Cursor
    public boolean requery() {
        return false;
    }

    @Override  // android.database.Cursor
    public Bundle respond(Bundle bundle0) {
        return null;
    }

    @Override  // android.database.Cursor
    public void setExtras(Bundle bundle0) {
    }

    @Override  // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver0, Uri uri0) {
    }

    @Override  // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver0) {
    }

    @Override  // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver0) {
    }
}

