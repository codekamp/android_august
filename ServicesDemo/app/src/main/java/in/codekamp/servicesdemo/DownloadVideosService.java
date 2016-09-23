package in.codekamp.servicesdemo;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by cerebro on 22/09/16.
 */
public class DownloadVideosService extends IntentService {

    public DownloadVideosService() {
        super("hello");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
