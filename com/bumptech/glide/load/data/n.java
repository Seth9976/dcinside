package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class n extends l {
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 4;
    private static final int i = 5;
    private static final UriMatcher j;

    static {
        UriMatcher uriMatcher0 = new UriMatcher(-1);
        n.j = uriMatcher0;
        uriMatcher0.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher0.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher0.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher0.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher0.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher0.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public n(ContentResolver contentResolver0, Uri uri0) {
        super(contentResolver0, uri0);
    }

    @Override  // com.bumptech.glide.load.data.d
    @NonNull
    public Class a() {
        return InputStream.class;
    }

    @Override  // com.bumptech.glide.load.data.l
    protected void e(Object object0) throws IOException {
        this.g(((InputStream)object0));
    }

    @Override  // com.bumptech.glide.load.data.l
    protected Object f(Uri uri0, ContentResolver contentResolver0) throws FileNotFoundException {
        return this.h(uri0, contentResolver0);
    }

    protected void g(InputStream inputStream0) throws IOException {
        inputStream0.close();
    }

    protected InputStream h(Uri uri0, ContentResolver contentResolver0) throws FileNotFoundException {
        InputStream inputStream0 = this.i(uri0, contentResolver0);
        if(inputStream0 == null) {
            throw new FileNotFoundException("InputStream is null for " + uri0);
        }
        return inputStream0;
    }

    private InputStream i(Uri uri0, ContentResolver contentResolver0) throws FileNotFoundException {
        switch(n.j.match(uri0)) {
            case 3: {
                return this.j(contentResolver0, uri0);
            }
            case 1: 
            case 5: {
                Uri uri1 = ContactsContract.Contacts.lookupContact(contentResolver0, uri0);
                if(uri1 == null) {
                    throw new FileNotFoundException("Contact cannot be found");
                }
                return this.j(contentResolver0, uri1);
            }
            default: {
                return contentResolver0.openInputStream(uri0);
            }
        }
    }

    private InputStream j(ContentResolver contentResolver0, Uri uri0) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver0, uri0, true);
    }
}

