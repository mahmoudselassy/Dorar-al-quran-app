package com.store.myapplication4;

import android.app.Activity;
import android.app.DownloadManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.IBinder;
import android.widget.Toast;

public class DownloadService extends Service {
    String[] RQ={"https://drive.google.com/uc?export=download&id=1TW2FXVXdhIcbMbN5tNFrurP996A4Mke1",
            "https://drive.google.com/uc?export=download&id=1eytFajGQTjgKYPsfvtRZGrq6ogmZIReJ",
            "https://drive.google.com/uc?export=download&id=1M_5poVmCp5VlqLVMiyq8Het732-cLF6b",
            "https://drive.google.com/uc?export=download&id=1bCaI_si_E4m9GRfyeCtwy-TNcRaIqs2a",
            "https://drive.google.com/uc?export=download&id=1uROpktG7wExATz09U7FeR3Yk4UcVNZFy",
            "https://drive.google.com/uc?export=download&id=1KBqZ1HfrBDlZfgnLO-xu5Sszn8tZnGoS",
            "https://drive.google.com/uc?export=download&id=1Wg1cBo_jBetx6h2TZHVE5vVOISw07liU",
            "https://drive.google.com/uc?export=download&id=1l9P74G_N_aViEumGUG9JirCSdfOoBGr6",
            "https://drive.google.com/uc?export=download&id=1slO_alQmKKyGzrCZtdxS2woQlWSbIbTt",
            "https://drive.google.com/uc?export=download&id=1lXJasQDSB6ofmdP-tVWRbQ3aOLKqriZW",
            "https://drive.google.com/uc?export=download&id=1EAVxfcHDDAnZXO8A9HPQ-Ja7IbsaOO6E",
            "https://drive.google.com/uc?export=download&id=1I2hG9j9xepQj3J-BCLMiYLS60mUh1ucq",
            "https://drive.google.com/uc?export=download&id=1be1fvCRXr69sAqcPqlP6gOPEnOalR5zX",
            "https://drive.google.com/uc?export=download&id=1qCUod2LiQ3FNh_XGEIry6Mjq4V9hbwN9",
            "https://drive.google.com/uc?export=download&id=18msTLawH7ALbtR6zqSYyhosykMxIoefW"};

    String[] TQ={"https://drive.google.com/uc?export=download&id=1JOdVge9Fv3u3Zjq4l1ru_kgs_uKpKAFl",
        "https://drive.google.com/uc?export=download&id=1x6G-R5bqlhOtleagsKwlS2ugIQAL80-e",
        "https://drive.google.com/uc?export=download&id=1THM2FYfB3qc1AWccEgqqBvD9z0dqmJH5",
        "https://drive.google.com/uc?export=download&id=1VYSmWlX8-_7QanyCTOkT0eeNHjx3FJVM",
        "https://drive.google.com/uc?export=download&id=1Fin_SdfjeXCMe5i3k7f0XWvOl7ZQaWl8",
        "https://drive.google.com/uc?export=download&id=1vBH2Y6ScOe_H4-pYPTOTm7BuIqnaxv-l",
        "https://drive.google.com/uc?export=download&id=1iZb4qbXdYj4QdHlDJ_og9t9Ui0FRwCNF",
        "https://drive.google.com/uc?export=download&id=1DmsI48cenq2zUMreLaSMtybW09F1KHCY",
        "https://drive.google.com/uc?export=download&id=1jaPnpIolGgtOnrv6sCHtp3aS0S6EkuF_",
        "https://drive.google.com/uc?export=download&id=1-uXffIpak_565jlYhOjFnL4Vn5X5qybX",
        "https://drive.google.com/uc?export=download&id=1wy1lRd-1IWTcXOfaEegYh7jb6ZNip9XW"};
    public DownloadService() {

    }
    @Override
    public void onCreate() {
        super.onCreate();

    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        int order=intent.getIntExtra("order",0);
        String type=intent.getStringExtra("type");
        if(type.equals("RQ")) {
            DownloadManager downloadmanager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(RQ[order]));
            request.setTitle("رقائق القران" + order);
            request.setDescription("Downloading File please wait.....");
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_MUSIC, "رقائق القران" + order + ".mp3");
            downloadmanager.enqueue(request);
            Toast.makeText(DownloadService.this, "Downloading Started.", Toast.LENGTH_SHORT).show();
        }
        if(type.equals("TQ")) {
            DownloadManager downloadmanager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(TQ[order]));
            request.setTitle("الطريق الى القران" + order);
            request.setDescription("Downloading File please wait.....");
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_MUSIC, "الطريق الى القران" + order + ".mp3");
            downloadmanager.enqueue(request);
            Toast.makeText(DownloadService.this, "Downloading Started.", Toast.LENGTH_SHORT).show();
        }

        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}