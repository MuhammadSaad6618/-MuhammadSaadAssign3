package muhammad.saad.n01366618.a3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.telecom.TelecomManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
//Name: Muhammad Saad
//Student#: N01366618
//Course: CENG258
//Section: RNA
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecuitiyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecuitiyFragment extends Fragment {
    TextView textView;
    View view;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SecuitiyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SecuitiyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SecuitiyFragment newInstance(String param1, String param2) {
        SecuitiyFragment fragment = new SecuitiyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getParentFragmentManager().setFragmentResultListener("requestkey", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle bundle) {
                String result = bundle.getString("key");
                textView = view.findViewById(R.id.muhammadtv5);
                textView.setText(result);

            }
        });


        view =  inflater.inflate(R.layout.fragment_secuitiy, container, false);

        return view;
    }


}