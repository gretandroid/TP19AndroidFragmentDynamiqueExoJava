package education.cccp.mobile.fragment;

import static education.cccp.mobile.fragment.R.layout.list_fragment;
import static education.cccp.mobile.fragment.controller.PersonDao.getAll;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import education.cccp.mobile.fragment.model.PersonEntity;

public class ListFragment extends Fragment {

    interface PersonTransfert {
        void transfert(PersonEntity person);
    }


    private PersonViewModel mViewModel;
    private PersonAdapter adapter;
    private PersonTransfert transfert = null;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(PersonViewModel.class);

        View view = inflater.inflate(list_fragment,
                container,
                false);

        adapter = new PersonAdapter(getAll());
        RecyclerView recyclerView = view.findViewById(R.id.personListView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(getContext())
        );
        //noinspection ConstantConditions
        mViewModel.getmPersons().observe(
                (LifecycleOwner) getContext(), new Observer<List<PersonEntity>>() {
                    @Override
                    public void onChanged(List<PersonEntity> list) {
//                    view.findViewById(firstNameEditText);
//                    view.findViewById(lastNameEditText);
//                    view.findViewById(dobEditText);
                        transfert.transfert(list.get(0));
                    }
                }
        );
        return view;
    }


}