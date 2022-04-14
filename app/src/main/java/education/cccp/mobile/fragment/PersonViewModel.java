package education.cccp.mobile.fragment;

import static education.cccp.mobile.fragment.controller.PersonDao.getAll;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import education.cccp.mobile.fragment.model.PersonEntity;

@SuppressWarnings({"unused", "ConstantConditions"})
public class PersonViewModel extends ViewModel {
    private MutableLiveData<List<PersonEntity>> mPersons;

    public MutableLiveData<List<PersonEntity>> getmPersons() {
        if (mPersons == null) {
            mPersons = new MutableLiveData<>();
            mPersons.setValue(getAll());
        }
        return mPersons;
    }

    public void addPerson(PersonEntity person){
        mPersons.getValue().add(person);
        mPersons.setValue(mPersons.getValue());
    }
}