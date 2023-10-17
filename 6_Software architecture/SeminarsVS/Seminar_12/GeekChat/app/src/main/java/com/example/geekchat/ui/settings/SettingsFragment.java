package com.example.geekchat.ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.geekchat.databinding.FragmentSettingsBinding;

public class SettingsFragment extends Fragment {

    private FragmentSettingsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentSettingsBinding.inflate(inflater, container, false);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.editTextText3.getText().toString().isEmpty()) {
                    Toast.makeText(SettingsFragment.this.getContext(), "Неверный формат IP", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    Integer.parseInt(binding.editTextText4.getText().toString());
                    Toast.makeText(SettingsFragment.this.getContext(), "Настройки успешно сохранены", Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(SettingsFragment.this.getContext(), "Неверный формат порта", Toast.LENGTH_SHORT).show();
                }

            }
        });

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}