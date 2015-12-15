package com.myatminsoe.mmunitsconverter.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

import com.myatminsoe.mmunitsconverter.R;
import com.myatminsoe.mmunitsconverter.adapter.SpinnerAdapter;
import com.myatminsoe.mmunitsconverter.model.Weight;

public class WeightFragment extends Fragment {

    String[] units = {"ဂရမ်", "ကီလိုဂရမ်", "အောင်စ", "ပေါင်", "ရွေးလေး", "ရွေးကြီး", "ကျပ်သား", "ပိဿာ"};

    Spinner spinnerInput, spinnerOutput;
    EditText etIn, etOut;
    Weight myWeight = new Weight();
    View v;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_length, container, false);
        init();

        etIn.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    convert(Double.parseDouble(s.toString()), spinnerInput.getSelectedItemPosition(), spinnerOutput.getSelectedItemPosition());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        spinnerInput.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (etIn.getText().length() > 0) {
                    convert(Double.parseDouble(etIn.getText().toString()), position, spinnerOutput.getSelectedItemPosition());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerOutput.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (etIn.getText().length() > 0) {
                    convert(Double.parseDouble(etIn.getText().toString()), spinnerInput.getSelectedItemPosition(), position);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return v;
    }

    private void convert(double value, int pos1, int pos2) {
        switch (pos1) {
            case 0:
                myWeight.setG(value);
                break;
            case 1:
                myWeight.setKg(value);
                break;
            case 2:
                myWeight.setOz(value);
                break;
            case 3:
                myWeight.setLb(value);
                break;
            case 4:
                myWeight.setYwaylay(value);
                break;
            case 5:
                myWeight.setYwaygyi(value);
                break;
            case 6:
                myWeight.setKyattha(value);
                break;
            case 7:
                myWeight.setPeittha(value);
                break;
            default:
                break;
        }

        switch (pos2) {
            case 0:
                etOut.setText(myWeight.getG());
                break;
            case 1:
                etOut.setText(myWeight.getKg());
                break;
            case 2:
                etOut.setText(myWeight.getOz());
                break;
            case 3:
                etOut.setText(myWeight.getLb());
                break;
            case 4:
                etOut.setText(myWeight.getYwaylay());
                break;
            case 5:
                etOut.setText(myWeight.getYwaygyi());
                break;
            case 6:
                etOut.setText(myWeight.getKyattha());
                break;
            case 7:
                etOut.setText(myWeight.getPeittha());
                break;
            default:
                break;
        }
    }

    private void init() {
        spinnerInput = (Spinner) v.findViewById(R.id.spinner1);
        spinnerOutput = (Spinner) v.findViewById(R.id.spinner2);
        etIn = (EditText) v.findViewById(R.id.et1);
        etOut = (EditText) v.findViewById(R.id.et2);
        SpinnerAdapter adapter = new SpinnerAdapter(getContext(), 0, units);
        spinnerInput.setAdapter(adapter);
        spinnerOutput.setAdapter(adapter);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
