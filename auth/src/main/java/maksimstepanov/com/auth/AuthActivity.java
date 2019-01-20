package maksimstepanov.com.auth;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import javax.inject.Inject;

import maksimstepanov.com.auth.di.AuthScreenSubComponent;
import maksimstepanov.com.core.di.ScreenSubComponentProvider;
import maksimstepanov.com.core.presentation.view.BaseActivity;

/**
 * Starting activity (authentication)
 */
public class AuthActivity extends BaseActivity {
    @Inject
    AuthActivityPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScreenSubComponentProvider provider = (ScreenSubComponentProvider) getApplication();
        AuthScreenSubComponent component = (AuthScreenSubComponent) provider.getAuthScreenSubComponent();
        component.inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", presenter.getName());
    }
}
