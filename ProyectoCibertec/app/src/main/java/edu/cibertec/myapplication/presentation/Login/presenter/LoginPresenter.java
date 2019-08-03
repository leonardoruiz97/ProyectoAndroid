package edu.cibertec.myapplication.presentation.Login.presenter;

import edu.cibertec.myapplication.presentation.Login.ILoginContract;

public class LoginPresenter implements ILoginContract.IPresenter {
    ILoginContract.IView view;


    @Override
    public void attachView(ILoginContract.IView view) {
        this.view=view;
    }

    @Override
    public void detachView() {
view = null;
    }

    @Override
    public boolean isViewAttached() {
        return view !=null;
    }
}
