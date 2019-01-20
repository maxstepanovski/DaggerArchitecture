package maksimstepanov.com.daggerarchitecture.router;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import maksimstepanov.com.core.router.Router;
import maksimstepanov.com.main.presentation.view.MainActivity;

/**
 * Router implementation
 */
public class RouterImpl implements Router {

    @Override
    public void startMainScreen(AppCompatActivity activity) {
        Intent intent = new Intent(activity, MainActivity.class);
        activity.startActivity(intent);
    }
}
