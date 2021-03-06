package com.alphawallet.app.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.alphawallet.app.repository.CurrencyRepositoryType;
import com.alphawallet.app.repository.LocaleRepositoryType;
import com.alphawallet.app.service.AssetDefinitionService;

public class AdvancedSettingsViewModelFactory implements ViewModelProvider.Factory {
    private final LocaleRepositoryType localeRepository;
    private final CurrencyRepositoryType currencyRepository;
    private final AssetDefinitionService assetDefinitionService;

    public AdvancedSettingsViewModelFactory(
            LocaleRepositoryType localeRepository,
            CurrencyRepositoryType currencyRepository,
            AssetDefinitionService assetDefinitionService) {
        this.localeRepository = localeRepository;
        this.currencyRepository = currencyRepository;
        this.assetDefinitionService = assetDefinitionService;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new AdvancedSettingsViewModel(
                localeRepository,
                currencyRepository,
                assetDefinitionService
        );
    }
}
