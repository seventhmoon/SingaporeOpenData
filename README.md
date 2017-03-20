# SingaporeOpenData

[![Build Status](https://travis-ci.org/seventhmoon/SingaporeOpenData.svg?branch=master)](https://travis-ci.org/seventhmoon/SingaporeOpenData)
[![](https://jitpack.io/v/seventhmoon/SingaporeOpenData.svg)](https://jitpack.io/#seventhmoon/SingaporeOpenData)


## Quick Start

    private void loadData(){
        GovDataApiService govDataApiService = ApiServices.getGovDataApiService();
        govDataApiService.getPm25Readings("YOUR_API_KEY_HERE").enqueue(new Callback<Pm25Response>() {
            @Override
            public void onResponse(Call<Pm25Response> call, Response<Pm25Response> response) {
                Log.d(TAG, response.toString());
                Pm25Response r = response.body(); //Data are here.
            }

            @Override
            public void onFailure(Call<Pm25Response> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
    }
