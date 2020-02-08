package org.ohmstheresistance.mastermindmvp.activities.instructions;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import org.ohmstheresistance.mastermindmvp.R;
import org.ohmstheresistance.mastermindmvp.activities.mastermindgame.MastermindGameActivity;
import org.ohmstheresistance.mastermindmvp.databinding.MastermindInstructionsBinding;

public class MastermindInstructions extends DialogFragment implements MastermindInstructionsContract.MastermindInstructionsView {

    private MastermindInstructionsPresenter mastermindInstructionsPresenter;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new Dialog(getActivity(), R.style.WideDialog);
    }

    public MastermindInstructions(){}

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        mastermindInstructionsPresenter = new MastermindInstructionsPresenter(this);
        MastermindInstructionsBinding mastermindInstructionsBinding = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout. mastermind_instructions, null, false);
        mastermindInstructionsBinding.setInstructionsPresenter(mastermindInstructionsPresenter);

        return mastermindInstructionsBinding.getRoot().getRootView();
    }

    @Override
    public void playNow() {
        getDialog().dismiss();
        Intent navigationIntent = new Intent(getActivity(), MastermindGameActivity.class);
        getActivity().startActivity(navigationIntent);
        getActivity().overridePendingTransition(0, 0);
    }

    @Override
    public void dismissDialog() {
        getDialog().dismiss();
    }
}

