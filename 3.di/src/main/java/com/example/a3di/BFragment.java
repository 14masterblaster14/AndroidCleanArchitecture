package com.example.a3di;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;


/**
 * A simple {@link Fragment} subclass.
 */
public class BFragment extends Fragment implements View.OnClickListener {


    //Dagger Use
    @Inject
    SharedPreferences mPreferences;

    //   private SharedPreferences mPreferences;
    private TextView mTextStored;
    private Button mBtnRefresh;


    public BFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Dagger Use

        ((MyApplication) getActivity().getApplication()).getStorageComponent().inject(this);


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        mTextStored = view.findViewById(R.id.text_stored);
        mBtnRefresh = view.findViewById(R.id.btn_refresh);
        mBtnRefresh.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        loadStoredDataIntoTextView();
    }

    private void loadStoredDataIntoTextView() {

        String storedText = mPreferences.getString(Constant.PREF_INPUT, "Nothing found yet");
        mTextStored.setText(storedText);
    }

}
