package vip.shop.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import vip.shop.model.CateroryModel;
import vip.shop.repository.CategoryRepository;

public class HomeViewModel extends ViewModel {
    private CategoryRepository categoryRepository;

    public HomeViewModel() {
        categoryRepository = new CategoryRepository();
    }

    public MutableLiveData<CateroryModel> categoryModelMutableLiveData(){
        return categoryRepository.getCategory();
    }
}
