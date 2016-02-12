package com.example.cattinder.data;

import com.example.cattinder.api.CatService;
import com.example.cattinder.data.CatServiceResponse.Cat;

import java.util.List;
public class CatAdapter{

    private CatService mCatService;

    public CatAdapter(CatService catService) {
        mCatService = catService;
    }

    public List<Cat> getCats(int startIndex) {
        CatServiceResponse response = mCatService.getCats(startIndex);
        return response.getCats();
    }

}
