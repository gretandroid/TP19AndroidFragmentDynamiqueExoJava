package education.cccp.mobile.fragment;

import static education.cccp.mobile.fragment.R.id.dobEditText;
import static education.cccp.mobile.fragment.R.id.firstNameEditText;
import static education.cccp.mobile.fragment.R.id.lastNameEditText;
import static education.cccp.mobile.fragment.R.layout.fragment_edit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import education.cccp.mobile.fragment.model.PersonEntity;


public class EditFragment extends Fragment {

    private EditText firstNameText;
    private EditText lastNameText;
    private EditText dobText;


    public EditFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(fragment_edit,
                container,
                false);
        firstNameText = view.findViewById(firstNameEditText);
        lastNameText = view.findViewById(lastNameEditText);
        dobText = view.findViewById(dobEditText);
        return view;
    }

    public void received(PersonEntity person) {
        firstNameText.setText(person.getFirstName());
        lastNameText.setText(person.getLastName());
        dobText.setText(person.getDob().toString());
    }
}