package education.cccp.mobile.fragment;

import static education.cccp.mobile.fragment.R.layout.list_fragment;
import static education.cccp.mobile.fragment.controller.PersonDao.getAll;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import education.cccp.mobile.fragment.model.PersonEntity;

public class ListFragment extends Fragment
        implements PersonAdapter.OnItemEvent {

    private Activity activity;
    private PersonTransfert transfert = null;
    private PersonViewModel mViewModel;
    private PersonAdapter adapter;


    @Override
    public void onRetrievePersonId(int id) {
        Log.d(this.getClass().getSimpleName(),
                "onRetrievePersonId : " + id);
        transfert.transfertId(id);
    }

    public interface PersonTransfert {
        void transfertId(int personId);
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(PersonViewModel.class);

        View view = inflater.inflate(list_fragment,
                container,
                false);
        mViewModel.getmPersons().observe(getActivity(), personList -> {
                    adapter = new PersonAdapter(personList, this);
                    RecyclerView recyclerView = view.findViewById(R.id.personListView);
                    recyclerView.setAdapter(adapter);
                    recyclerView.setLayoutManager(
                            new LinearLayoutManager(getContext())
                    );
                }
        );
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (Activity) context;
        if (activity instanceof PersonTransfert) {
            transfert = (PersonTransfert) activity;
        }
    }
}