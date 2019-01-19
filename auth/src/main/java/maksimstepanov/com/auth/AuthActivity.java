package maksimstepanov.com.auth;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import maksimstepanov.com.core.di.AppComponent;

/**
 * Starting activity (authentication)
 */
public class AuthActivity extends AppCompatActivity {
    @Inject
    AuthActivityPresenter presenter;

    @Inject
    Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auth_activity);
        DaggerAuthScreenComponent
                .builder()
                .authScreenModule(new AuthScreenModule())
                .appComponent(AppComponent.get())
                .build()
                .inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", presenter.getName());
    }
}
