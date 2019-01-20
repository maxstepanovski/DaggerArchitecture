package maksimstepanov.com.somefeature;

import android.support.annotation.NonNull;
import android.util.Log;

import maksimstepanov.com.network.NetworkManager;

public class SomeFeatureInteractor {
    private String jobDescription;
    private NetworkManager manager;

    public SomeFeatureInteractor(@NonNull NetworkManager manager) {
        this.jobDescription = "I'm calling Network manager!";
        this.manager = manager;
    }

    public void doSomeJob() {
        Log.d("TAG", jobDescription);
        Log.d("TAG", manager.getName());
    }
}
