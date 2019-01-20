package maksimstepanov.com.auth;

import maksimstepanov.com.core.presentation.presenter.BasePresenter;

public class AuthActivityPresenter extends BasePresenter {
    private String name;

    public AuthActivityPresenter() {
        this.name = "I'm Auth screen presenter!";
    }

    public String getName() {
        return name;
    }
}
