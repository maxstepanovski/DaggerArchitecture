package maksimstepanov.com.auth;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;

import maksimstepanov.com.auth.di.AuthScreenSubComponent;
import maksimstepanov.com.core.di.ScreenSubComponentProvider;
import maksimstepanov.com.core.presentation.view.BaseActivity;
import maksimstepanov.com.core.router.Router;

/**
 * Starting activity (authentication)
 */
public class AuthActivity extends BaseActivity {
    private Button authButton;
    private AuthScreenSubComponent subComponent;
    @Inject
    AuthActivityPresenter presenter;
    @Inject
    Router router;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auth_activity);
        ScreenSubComponentProvider provider = (ScreenSubComponentProvider) getApplication();
        subComponent = (AuthScreenSubComponent) provider.getAuthScreenSubComponent();
        subComponent.inject(this);

        authButton = findViewById(R.id.auth_button);
        authButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                router.startMainScreen(AuthActivity.this);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", presenter.getName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        subComponent = null;
    }
}
