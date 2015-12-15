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
import com.myatminsoe.mmunitsconverter.model.Length;

public class LengthFragment extends Fragment {

    String[] units = {"လက်မ", "ပေ", "ကိုက်", "မိုင်", "စင်တီမီတာ", "မီတာ", "ကီလိုမီတာ", "ဆံခြည်", "နှမ်း", "မုယော", "လက်သစ်", "မိုက်", "ထွာ", "တောင်", "လံ", "တာ", "ဥသဘ", "ကောသ", "ဂါဝုတ်", "ယူဇနာ"};

    Spinner spinnerInput, spinnerOutput;
    EditText etIn, etOut;
    Length myLength = new Length();
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
                myLength.setIn(value);
                break;
            case 1:
                myLength.setFt(value);
                break;
            case 2:
                myLength.setYard(value);
                break;
            case 3:
                myLength.setMile(value);
                break;
            case 4:
                myLength.setCm(value);
                break;
            case 5:
                myLength.setM(value);
                break;
            case 6:
                myLength.setKm(value);
                break;
            case 7:
                myLength.setSanchi(value);
                break;
            case 8:
                myLength.setHnan(value);
                break;
            case 9:
                myLength.setMayaw(value);
                break;
            case 10:
                myLength.setLetthit(value);
                break;
            case 11:
                myLength.setMaik(value);
                break;
            case 12:
                myLength.setHtwa(value);
                break;
            case 13:
                myLength.setTaung(value);
                break;
            case 14:
                myLength.setLan(value);
                break;
            case 15:
                myLength.setTa(value);
                break;
            case 16:
                myLength.setOuthaba(value);
                break;
            case 17:
                myLength.setKawtha(value);
                break;
            case 18:
                myLength.setGawout(value);
                break;
            case 19:
                myLength.setYuzana(value);
                break;
            default:
                break;
        }

        switch (pos2) {
            case 0:
                etOut.setText(myLength.getIn());
                break;
            case 1:
                etOut.setText(myLength.getFt());
                break;
            case 2:
                etOut.setText(myLength.getYard());
                break;
            case 3:
                etOut.setText(myLength.getMile());
                break;
            case 4:
                etOut.setText(myLength.getCm());
                break;
            case 5:
                etOut.setText(myLength.getM());
                break;
            case 6:
                etOut.setText(myLength.getKm());
                break;
            case 7:
                etOut.setText(myLength.getSanchi());
                break;
            case 8:
                etOut.setText(myLength.getHnan());
                break;
            case 9:
                etOut.setText(myLength.getMayaw());
                break;
            case 10:
                etOut.setText(myLength.getLetthit());
                break;
            case 11:
                etOut.setText(myLength.getMaik());
                break;
            case 12:
                etOut.setText(myLength.getHtwa());
                break;
            case 13:
                etOut.setText(myLength.getTaung());
                break;
            case 14:
                etOut.setText(myLength.getLan());
                break;
            case 15:
                etOut.setText(myLength.getTa());
                break;
            case 16:
                etOut.setText(myLength.getOuthaba());
                break;
            case 17:
                etOut.setText(myLength.getKawtha());
                break;
            case 18:
                etOut.setText(myLength.getGawout());
                break;
            case 19:
                etOut.setText(myLength.getYuzana());
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
