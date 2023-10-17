package com.example.geekchat.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.geekchat.databinding.FragmentHomeBinding;
import com.example.geekchat.models.ChatModel;
import com.example.geekchat.models.MessageAdapter;
import com.example.geekchat.repository.Message;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private MessageAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        binding.send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChatModel model = new ChatModel();
                Message message = new Message(model.getLoggedUser().name, "", binding.editTextText.getText().toString(), System.currentTimeMillis());
                new ChatModel().getMessages().add(message);
                adapter.notifyDataSetChanged();
            }
        });

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        binding.messages.setLayoutManager(layoutManager);

        adapter = new MessageAdapter();
        binding.messages.setAdapter(adapter);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}