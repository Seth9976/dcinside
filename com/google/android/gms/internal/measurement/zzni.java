package com.google.android.gms.internal.measurement;

public final class zzni implements zznj {
    private static final zzhj zza;
    private static final zzhj zzaa;
    private static final zzhj zzab;
    private static final zzhj zzac;
    private static final zzhj zzad;
    private static final zzhj zzae;
    private static final zzhj zzaf;
    private static final zzhj zzag;
    private static final zzhj zzah;
    private static final zzhj zzai;
    private static final zzhj zzaj;
    private static final zzhj zzak;
    private static final zzhj zzal;
    private static final zzhj zzam;
    private static final zzhj zzan;
    private static final zzhj zzao;
    private static final zzhj zzap;
    private static final zzhj zzaq;
    private static final zzhj zzar;
    private static final zzhj zzas;
    private static final zzhj zzat;
    private static final zzhj zzau;
    private static final zzhj zzav;
    private static final zzhj zzaw;
    private static final zzhj zzax;
    private static final zzhj zzay;
    private static final zzhj zzaz;
    private static final zzhj zzb;
    private static final zzhj zzba;
    private static final zzhj zzbb;
    private static final zzhj zzbc;
    private static final zzhj zzbd;
    private static final zzhj zzbe;
    private static final zzhj zzc;
    private static final zzhj zzd;
    private static final zzhj zze;
    private static final zzhj zzf;
    private static final zzhj zzg;
    private static final zzhj zzh;
    private static final zzhj zzi;
    private static final zzhj zzj;
    private static final zzhj zzk;
    private static final zzhj zzl;
    private static final zzhj zzm;
    private static final zzhj zzn;
    private static final zzhj zzo;
    private static final zzhj zzp;
    private static final zzhj zzq;
    private static final zzhj zzr;
    private static final zzhj zzs;
    private static final zzhj zzt;
    private static final zzhj zzu;
    private static final zzhj zzv;
    private static final zzhj zzw;
    private static final zzhj zzx;
    private static final zzhj zzy;
    private static final zzhj zzz;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzni.zza = zzhr0.zza("measurement.ad_id_cache_time", 10000L);
        zzni.zzb = zzhr0.zza("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        zzni.zzc = zzhr0.zza("measurement.config.bundle_for_all_apps_on_backgrounded", true);
        zzni.zzd = zzhr0.zza("measurement.max_bundles_per_iteration", 100L);
        zzni.zze = zzhr0.zza("measurement.config.cache_time", 86400000L);
        zzhr0.zza("measurement.log_tag", "FA");
        zzni.zzf = zzhr0.zza("measurement.config.url_authority", "app-measurement.com");
        zzni.zzg = zzhr0.zza("measurement.config.url_scheme", "https");
        zzni.zzh = zzhr0.zza("measurement.upload.debug_upload_interval", 1000L);
        zzni.zzi = zzhr0.zza("measurement.session.engagement_interval", 3600000L);
        zzni.zzj = zzhr0.zza("measurement.rb.attribution.event_params", "value|currency");
        zzhr0.zza("measurement.id.rb.attribution.app_allowlist", 0L);
        zzni.zzk = zzhr0.zza("measurement.upload.google_signal_max_queue_time", 605000L);
        zzni.zzl = zzhr0.zza("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d");
        zzni.zzm = zzhr0.zza("measurement.lifetimevalue.max_currency_tracked", 4L);
        zzni.zzn = zzhr0.zza("measurement.dma_consent.max_daily_dcu_realtime_events", 1L);
        zzni.zzo = zzhr0.zza("measurement.upload.max_event_parameter_value_length", 500L);
        zzni.zzp = zzhr0.zza("measurement.store.max_stored_events_per_app", 100000L);
        zzni.zzq = zzhr0.zza("measurement.experiment.max_ids", 50L);
        zzni.zzr = zzhr0.zza("measurement.audience.filter_result_max_count", 200L);
        zzni.zzs = zzhr0.zza("measurement.upload.max_item_scoped_custom_parameters", 27L);
        zzni.zzt = zzhr0.zza("measurement.rb.max_trigger_registrations_per_day", 0L);
        zzni.zzu = zzhr0.zza("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0L);
        zzni.zzv = zzhr0.zza("measurement.rb.attribution.client.min_ad_services_version", 7L);
        zzni.zzw = zzhr0.zza("measurement.alarm_manager.minimum_interval", 60000L);
        zzni.zzx = zzhr0.zza("measurement.upload.minimum_delay", 500L);
        zzni.zzy = zzhr0.zza("measurement.monitoring.sample_period_millis", 86400000L);
        zzni.zzz = zzhr0.zza("measurement.config.notify_trigger_uris_on_backgrounded", true);
        zzni.zzaa = zzhr0.zza("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword");
        zzni.zzab = zzhr0.zza("measurement.upload.realtime_upload_interval", 10000L);
        zzni.zzac = zzhr0.zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        zzhr0.zza("measurement.config.cache_time.service", 3600000L);
        zzni.zzad = zzhr0.zza("measurement.service_client.idle_disconnect_millis", 5000L);
        zzhr0.zza("measurement.log_tag.service", "FA-SVC");
        zzni.zzae = zzhr0.zza("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda,com.thetrainline,com.simo.androidtest,de.aboutyou.mobile.app,com.hometogo,de.casamundo.casamundomobile,it.casevacanz,eu.coolblue.shop,com.stihl.app,com.indeed.android.jobsearch,com.homeretailgroup.argos.android,com.dylvian.mango.activities.pre,se.nansen.coop.qa");
        zzni.zzaf = zzhr0.zza("measurement.upload.stale_data_deletion_interval", 86400000L);
        zzni.zzag = zzhr0.zza("measurement.rb.attribution.uri_authority", "google-analytics.com");
        zzni.zzah = zzhr0.zza("measurement.rb.attribution.max_queue_time", 1209600000L);
        zzni.zzai = zzhr0.zza("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        zzni.zzaj = zzhr0.zza("measurement.rb.attribution.query_parameters_to_remove", "");
        zzni.zzak = zzhr0.zza("measurement.rb.attribution.uri_scheme", "https");
        zzni.zzal = zzhr0.zza("measurement.sdk.attribution.cache.ttl", 604800000L);
        zzni.zzam = zzhr0.zza("measurement.redaction.app_instance_id.ttl", 7200000L);
        zzni.zzan = zzhr0.zza("measurement.upload.backoff_period", 43200000L);
        zzni.zzao = zzhr0.zza("measurement.upload.initial_upload_delay_time", 15000L);
        zzni.zzap = zzhr0.zza("measurement.upload.interval", 3600000L);
        zzni.zzaq = zzhr0.zza("measurement.upload.max_bundle_size", 0x10000L);
        zzni.zzar = zzhr0.zza("measurement.upload.max_bundles", 100L);
        zzni.zzas = zzhr0.zza("measurement.upload.max_conversions_per_day", 500L);
        zzni.zzat = zzhr0.zza("measurement.upload.max_error_events_per_day", 1000L);
        zzni.zzau = zzhr0.zza("measurement.upload.max_events_per_bundle", 1000L);
        zzni.zzav = zzhr0.zza("measurement.upload.max_events_per_day", 100000L);
        zzni.zzaw = zzhr0.zza("measurement.upload.max_public_events_per_day", 50000L);
        zzni.zzax = zzhr0.zza("measurement.upload.max_queue_time", 518400000L);
        zzni.zzay = zzhr0.zza("measurement.upload.max_realtime_events_per_day", 10L);
        zzni.zzaz = zzhr0.zza("measurement.upload.max_batch_size", 0x10000L);
        zzni.zzba = zzhr0.zza("measurement.upload.retry_count", 6L);
        zzni.zzbb = zzhr0.zza("measurement.upload.retry_time", 1800000L);
        zzni.zzbc = zzhr0.zza("measurement.upload.url", "https://app-measurement.com/a");
        zzni.zzbd = zzhr0.zza("measurement.upload.window_interval", 3600000L);
        zzni.zzbe = zzhr0.zza("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot");
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zza() {
        return (long)(((Long)zzni.zza.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzaa() {
        return (long)(((Long)zzni.zzam.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzab() {
        return (long)(((Long)zzni.zzan.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzac() {
        return (long)(((Long)zzni.zzao.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzad() {
        return (long)(((Long)zzni.zzap.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzae() {
        return (long)(((Long)zzni.zzaq.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzaf() {
        return (long)(((Long)zzni.zzar.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzag() {
        return (long)(((Long)zzni.zzas.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzah() {
        return (long)(((Long)zzni.zzat.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzai() {
        return (long)(((Long)zzni.zzau.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzaj() {
        return (long)(((Long)zzni.zzav.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzak() {
        return (long)(((Long)zzni.zzaw.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzal() {
        return (long)(((Long)zzni.zzax.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzam() {
        return (long)(((Long)zzni.zzay.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzan() {
        return (long)(((Long)zzni.zzaz.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzao() {
        return (long)(((Long)zzni.zzba.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzap() {
        return (long)(((Long)zzni.zzbb.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzaq() {
        return (long)(((Long)zzni.zzbd.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final String zzar() {
        return (String)zzni.zzf.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final String zzas() {
        return (String)zzni.zzg.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final String zzat() {
        return (String)zzni.zzj.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final String zzau() {
        return (String)zzni.zzl.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final String zzav() {
        return (String)zzni.zzaa.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final String zzaw() {
        return (String)zzni.zzae.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final String zzax() {
        return (String)zzni.zzag.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final String zzay() {
        return (String)zzni.zzai.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final String zzaz() {
        return (String)zzni.zzaj.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzb() {
        return (long)(((Long)zzni.zzb.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final String zzba() {
        return (String)zzni.zzak.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final String zzbb() {
        return (String)zzni.zzbc.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final String zzbc() {
        return (String)zzni.zzbe.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final boolean zzbd() {
        return ((Boolean)zzni.zzc.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final boolean zzbe() {
        return ((Boolean)zzni.zzz.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzc() {
        return (long)(((Long)zzni.zzd.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzd() {
        return (long)(((Long)zzni.zze.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zze() {
        return (long)(((Long)zzni.zzh.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzf() {
        return (long)(((Long)zzni.zzi.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzg() {
        return (long)(((Long)zzni.zzk.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzh() {
        return (long)(((Long)zzni.zzm.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzi() {
        return (long)(((Long)zzni.zzn.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzj() {
        return (long)(((Long)zzni.zzo.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzk() {
        return (long)(((Long)zzni.zzp.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzl() {
        return (long)(((Long)zzni.zzq.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzm() {
        return (long)(((Long)zzni.zzr.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzn() {
        return (long)(((Long)zzni.zzs.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzo() {
        return (long)(((Long)zzni.zzt.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzp() {
        return (long)(((Long)zzni.zzu.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzq() {
        return (long)(((Long)zzni.zzv.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzr() {
        return (long)(((Long)zzni.zzw.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzs() {
        return (long)(((Long)zzni.zzx.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzt() {
        return (long)(((Long)zzni.zzy.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzu() {
        return (long)(((Long)zzni.zzab.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzv() {
        return (long)(((Long)zzni.zzac.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzw() {
        return (long)(((Long)zzni.zzad.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzx() {
        return (long)(((Long)zzni.zzaf.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzy() {
        return (long)(((Long)zzni.zzah.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zznj
    public final long zzz() {
        return (long)(((Long)zzni.zzal.zza()));
    }
}

