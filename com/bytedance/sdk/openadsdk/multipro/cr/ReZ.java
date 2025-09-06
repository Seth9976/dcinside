package com.bytedance.sdk.openadsdk.multipro.cr;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.PjT;
import java.util.Map;

public class ReZ implements PjT {
    private Context PjT;

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public int PjT(@NonNull Uri uri0, @Nullable ContentValues contentValues0, @Nullable String s, @Nullable String[] arr_s) {
        if(contentValues0 == null) {
            return 0;
        }
        this.PjT(uri0, contentValues0);
        return 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public int PjT(@NonNull Uri uri0, @Nullable String s, @Nullable String[] arr_s) {
        String[] arr_s1 = uri0.getPath().split("/");
        if(arr_s1[2].equals("clean")) {
            Zh.Zh(this.Zh(), uri0.getQueryParameter("sp_file_name"));
            return 0;
        }
        String s1 = arr_s1[3];
        if(Zh.PjT(this.Zh(), uri0.getQueryParameter("sp_file_name"), s1)) {
            Zh.Zh(this.Zh(), uri0.getQueryParameter("sp_file_name"), s1);
        }
        return 0;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public Cursor PjT(@NonNull Uri uri0, @Nullable String[] arr_s, @Nullable String s, @Nullable String[] arr_s1, @Nullable String s1) {
        if(uri0.getPath().split("/")[2].equals("get_all")) {
            Map map0 = Zh.ReZ(this.Zh(), uri0.getQueryParameter("sp_file_name"));
            if(map0 != null) {
                Cursor cursor0 = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
                for(Object object0: map0.keySet()) {
                    Object[] arr_object = new Object[3];
                    arr_object[0] = (String)object0;
                    Object object1 = map0.get(((String)object0));
                    arr_object[2] = object1;
                    if(object1 instanceof Boolean) {
                        arr_object[1] = "boolean";
                    }
                    else if(object1 instanceof String) {
                        arr_object[1] = "string";
                    }
                    else if(object1 instanceof Integer) {
                        arr_object[1] = "int";
                    }
                    else if(object1 instanceof Long) {
                        arr_object[1] = "long";
                    }
                    else if(object1 instanceof Float) {
                        arr_object[1] = "float";
                    }
                    ((MatrixCursor)cursor0).addRow(arr_object);
                }
                return cursor0;
            }
        }
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public Uri PjT(@NonNull Uri uri0, @Nullable ContentValues contentValues0) {
        if(contentValues0 == null) {
            return null;
        }
        String s = uri0.getPath().split("/")[3];
        Object object0 = contentValues0.get("value");
        if(object0 != null) {
            Zh.PjT(this.Zh(), uri0.getQueryParameter("sp_file_name"), s, object0);
        }
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    @NonNull
    public String PjT() {
        return "t_sp";
    }

    @Override  // com.bytedance.sdk.openadsdk.multipro.PjT
    public String PjT(@NonNull Uri uri0) {
        String[] arr_s = uri0.getPath().split("/");
        String s = arr_s[2];
        String s1 = arr_s[3];
        return s.equals("contain") ? String.valueOf(Zh.PjT(ub.PjT(), uri0.getQueryParameter("sp_file_name"), s1)) : Zh.PjT(this.Zh(), uri0.getQueryParameter("sp_file_name"), s1, s);
    }

    private Context Zh() {
        return this.PjT == null ? ub.PjT() : this.PjT;
    }
}

