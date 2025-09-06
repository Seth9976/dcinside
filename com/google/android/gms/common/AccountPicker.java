package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

public final class AccountPicker {
    public static class AccountChooserOptions {
        public static class Builder {
            @Nullable
            private Account zza;
            @Nullable
            private ArrayList zzb;
            @Nullable
            private ArrayList zzc;
            private boolean zzd;
            @Nullable
            private String zze;
            @Nullable
            private Bundle zzf;

            public Builder() {
                this.zzd = false;
            }

            @NonNull
            public AccountChooserOptions build() {
                Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
                Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
                AccountChooserOptions accountPicker$AccountChooserOptions0 = new AccountChooserOptions();
                accountPicker$AccountChooserOptions0.zzd = this.zzc;
                accountPicker$AccountChooserOptions0.zzc = this.zzb;
                accountPicker$AccountChooserOptions0.zze = this.zzd;
                AccountChooserOptions.zzm(accountPicker$AccountChooserOptions0, null);
                AccountChooserOptions.zzp(accountPicker$AccountChooserOptions0, null);
                accountPicker$AccountChooserOptions0.zzg = this.zzf;
                accountPicker$AccountChooserOptions0.zza = this.zza;
                AccountChooserOptions.zzt(accountPicker$AccountChooserOptions0, false);
                AccountChooserOptions.zzu(accountPicker$AccountChooserOptions0, false);
                AccountChooserOptions.zzr(accountPicker$AccountChooserOptions0, null);
                AccountChooserOptions.zzv(accountPicker$AccountChooserOptions0, 0);
                accountPicker$AccountChooserOptions0.zzf = this.zze;
                AccountChooserOptions.zzx(accountPicker$AccountChooserOptions0, false);
                AccountChooserOptions.zzn(accountPicker$AccountChooserOptions0, false);
                AccountChooserOptions.zzo(accountPicker$AccountChooserOptions0, false);
                return accountPicker$AccountChooserOptions0;
            }

            @NonNull
            public Builder setAllowableAccounts(@Nullable List list0) {
                this.zzb = list0 == null ? null : new ArrayList(list0);
                return this;
            }

            @NonNull
            public Builder setAllowableAccountsTypes(@Nullable List list0) {
                this.zzc = list0 == null ? null : new ArrayList(list0);
                return this;
            }

            @NonNull
            public Builder setAlwaysShowAccountPicker(boolean z) {
                this.zzd = z;
                return this;
            }

            @NonNull
            public Builder setOptionsForAddingAccount(@Nullable Bundle bundle0) {
                this.zzf = bundle0;
                return this;
            }

            @NonNull
            public Builder setSelectedAccount(@Nullable Account account0) {
                this.zza = account0;
                return this;
            }

            @NonNull
            public Builder setTitleOverrideText(@Nullable String s) {
                this.zze = s;
                return this;
            }
        }

        @Nullable
        private Account zza;
        private boolean zzb;
        @Nullable
        private ArrayList zzc;
        @Nullable
        private ArrayList zzd;
        private boolean zze;
        @Nullable
        private String zzf;
        @Nullable
        private Bundle zzg;
        private boolean zzh;
        private int zzi;
        @Nullable
        private String zzj;
        private boolean zzk;
        @Nullable
        private zza zzl;
        @Nullable
        private String zzm;
        private boolean zzn;
        private boolean zzo;

        static boolean zzA(AccountChooserOptions accountPicker$AccountChooserOptions0) [...] // Inlined contents

        static boolean zzB(AccountChooserOptions accountPicker$AccountChooserOptions0) [...] // Inlined contents

        static boolean zzC(AccountChooserOptions accountPicker$AccountChooserOptions0) [...] // Inlined contents

        static boolean zzD(AccountChooserOptions accountPicker$AccountChooserOptions0) [...] // Inlined contents

        static int zza(AccountChooserOptions accountPicker$AccountChooserOptions0) [...] // Inlined contents

        static zza zzd(AccountChooserOptions accountPicker$AccountChooserOptions0) [...] // Inlined contents

        static String zze(AccountChooserOptions accountPicker$AccountChooserOptions0) [...] // Inlined contents

        static String zzf(AccountChooserOptions accountPicker$AccountChooserOptions0) [...] // Inlined contents

        static void zzm(AccountChooserOptions accountPicker$AccountChooserOptions0, zza zza0) {
            accountPicker$AccountChooserOptions0.zzl = null;
        }

        static void zzn(AccountChooserOptions accountPicker$AccountChooserOptions0, boolean z) {
            accountPicker$AccountChooserOptions0.zzn = false;
        }

        static void zzo(AccountChooserOptions accountPicker$AccountChooserOptions0, boolean z) {
            accountPicker$AccountChooserOptions0.zzo = false;
        }

        static void zzp(AccountChooserOptions accountPicker$AccountChooserOptions0, String s) {
            accountPicker$AccountChooserOptions0.zzj = null;
        }

        static void zzr(AccountChooserOptions accountPicker$AccountChooserOptions0, String s) {
            accountPicker$AccountChooserOptions0.zzm = null;
        }

        static void zzt(AccountChooserOptions accountPicker$AccountChooserOptions0, boolean z) {
            accountPicker$AccountChooserOptions0.zzb = false;
        }

        static void zzu(AccountChooserOptions accountPicker$AccountChooserOptions0, boolean z) {
            accountPicker$AccountChooserOptions0.zzh = false;
        }

        static void zzv(AccountChooserOptions accountPicker$AccountChooserOptions0, int v) {
            accountPicker$AccountChooserOptions0.zzi = 0;
        }

        static void zzx(AccountChooserOptions accountPicker$AccountChooserOptions0, boolean z) {
            accountPicker$AccountChooserOptions0.zzk = false;
        }

        static boolean zzz(AccountChooserOptions accountPicker$AccountChooserOptions0) [...] // Inlined contents
    }

    @NonNull
    @Deprecated
    public static Intent newChooseAccountIntent(@Nullable Account account0, @Nullable ArrayList arrayList0, @Nullable String[] arr_s, boolean z, @Nullable String s, @Nullable String s1, @Nullable String[] arr_s1, @Nullable Bundle bundle0) {
        Intent intent0 = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        intent0.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent0.setPackage("com.google.android.gms");
        intent0.putExtra("allowableAccounts", arrayList0);
        intent0.putExtra("allowableAccountTypes", arr_s);
        intent0.putExtra("addAccountOptions", bundle0);
        intent0.putExtra("selectedAccount", account0);
        intent0.putExtra("alwaysPromptForAccount", z);
        intent0.putExtra("descriptionTextOverride", s);
        intent0.putExtra("authTokenType", s1);
        intent0.putExtra("addAccountRequiredFeatures", arr_s1);
        intent0.putExtra("setGmsCoreAccount", false);
        intent0.putExtra("overrideTheme", 0);
        intent0.putExtra("overrideCustomTheme", 0);
        intent0.putExtra("hostedDomainFilter", null);
        return intent0;
    }

    @NonNull
    public static Intent newChooseAccountIntent(@NonNull AccountChooserOptions accountPicker$AccountChooserOptions0) {
        Intent intent0 = new Intent();
        Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
        Preconditions.checkArgument(true, "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        intent0.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent0.setPackage("com.google.android.gms");
        intent0.putExtra("allowableAccounts", accountPicker$AccountChooserOptions0.zzc);
        if(accountPicker$AccountChooserOptions0.zzd != null) {
            intent0.putExtra("allowableAccountTypes", ((String[])accountPicker$AccountChooserOptions0.zzd.toArray(new String[0])));
        }
        intent0.putExtra("addAccountOptions", accountPicker$AccountChooserOptions0.zzg);
        intent0.putExtra("selectedAccount", accountPicker$AccountChooserOptions0.zza);
        intent0.putExtra("selectedAccountIsNotClickable", false);
        intent0.putExtra("alwaysPromptForAccount", accountPicker$AccountChooserOptions0.zze);
        intent0.putExtra("descriptionTextOverride", accountPicker$AccountChooserOptions0.zzf);
        intent0.putExtra("setGmsCoreAccount", false);
        intent0.putExtra("realClientPackage", null);
        intent0.putExtra("overrideTheme", 0);
        intent0.putExtra("overrideCustomTheme", 0);
        intent0.putExtra("hostedDomainFilter", null);
        Bundle bundle0 = new Bundle();
        if(!bundle0.isEmpty()) {
            intent0.putExtra("first_party_options_bundle", bundle0);
        }
        return intent0;
    }
}

