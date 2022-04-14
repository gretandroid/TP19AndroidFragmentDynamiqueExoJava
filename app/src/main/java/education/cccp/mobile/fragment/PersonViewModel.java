package education.cccp.mobile.fragment;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import education.cccp.mobile.fragment.model.PersonEntity;

@SuppressWarnings({"unused", "ConstantConditions"})
public class PersonViewModel extends ViewModel {
    private MutableLiveData<List<PersonEntity>> mPersons;

    public MutableLiveData<List<PersonEntity>> getmPersons() {
        if (mPersons == null) {
            mPersons = new MutableLiveData<>();
            mPersons.setValue(new ArrayList<>());
        }
        return mPersons;
    }

    public void addPerson(PersonEntity person){
        mPersons.getValue().add(person);
        mPersons.setValue(mPersons.getValue());
    }
}