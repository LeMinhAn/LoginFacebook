package mobiistar.mobiistarhome;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by Le Minh An on 7/30/2016.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
    }
}
