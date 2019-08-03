package edu.cibertec.myapplication.presentation.Login;

public interface ILoginContract {
    interface IView{
        void showError(String errorMsg);
        void showProgressBar();
        void hideProgressBar();
        void goToRegistrar();

    }

    interface IPresenter{
        void attachView(IView view);
        void detachView();
        boolean isViewAttached();

    }

}
