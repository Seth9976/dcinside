package com.dcinside.app.auth;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class c extends AbstractAccountAuthenticator {
    private Context a;

    public c(Context context0) {
        super(context0);
        this.a = context0;
    }

    @Override  // android.accounts.AbstractAccountAuthenticator
    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse0, String s, String s1, String[] arr_s, Bundle bundle0) throws NetworkErrorException {
        Intent intent0 = new Intent(this.a, AuthenticatorActivity.class);
        intent0.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse0);
        Bundle bundle1 = new Bundle();
        bundle1.putParcelable("intent", intent0);
        return bundle1;
    }

    @Override  // android.accounts.AbstractAccountAuthenticator
    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse0, Account account0, Bundle bundle0) throws NetworkErrorException {
        return null;
    }

    @Override  // android.accounts.AbstractAccountAuthenticator
    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse0, String s) {
        return null;
    }

    @Override  // android.accounts.AbstractAccountAuthenticator
    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse0, Account account0, String s, Bundle bundle0) throws NetworkErrorException {
        return null;
    }

    @Override  // android.accounts.AbstractAccountAuthenticator
    public String getAuthTokenLabel(String s) {
        return null;
    }

    @Override  // android.accounts.AbstractAccountAuthenticator
    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse0, Account account0, String[] arr_s) throws NetworkErrorException {
        return null;
    }

    @Override  // android.accounts.AbstractAccountAuthenticator
    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse0, Account account0, String s, Bundle bundle0) throws NetworkErrorException {
        return null;
    }
}

