package education.cccp.mobile.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
        implements ListFragment.PersonTransfert {

    private ListFragment listFragment;
    private EditFragment editFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listFragment = new ListFragment();
        editFragment = new EditFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frame, listFragment)
                .commit();
    }

    @Override
    public void transfertId(int personId) {
        Bundle bundle = new Bundle();
        bundle.putInt("personId", personId);
        editFragment.setArguments(bundle);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame, editFragment)
                .addToBackStack(null)
                .commit();
    }
}