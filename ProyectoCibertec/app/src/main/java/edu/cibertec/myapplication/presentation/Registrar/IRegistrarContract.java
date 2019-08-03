package edu.cibertec.myapplication.presentation.Registrar;

public interface IRegistrarContract {
    interface IView{
        void showError(String errorMsg);
        void showProgressBar();
        void hideProgressBar();
        void goToLogin();
        void goToUsuario();

    }

    interface IPresenter{
        void attachView(IView view);
        void detachView();
        boolean isViewAttached();

    }
}
