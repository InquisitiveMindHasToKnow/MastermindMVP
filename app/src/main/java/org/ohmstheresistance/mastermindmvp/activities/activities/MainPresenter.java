package org.ohmstheresistance.mastermindmvp.activities.activities;

import org.ohmstheresistance.mastermindmvp.activities.contract.MainContract;

public class MainPresenter implements MainContract.MastermindPresenter {

    private MainContract.MastermindView view;

    MainPresenter(MainContract.MastermindView mastermindView){
        view = mastermindView;

    }
}
