package com.example.mychatbot;

import android.app.Activity;
import android.os.AsyncTask;

import ai.api.AIDataService;
import ai.api.AIServiceContext;
import ai.api.AIServiceException;
import ai.api.model.AIRequest;
import ai.api.model.AIResponse;

public class RequestTask extends AsyncTask<AIRequest,Void, AIResponse> {
    /*
        This is a helper class to handle to AI Agent request.
     */

    Activity activity;
    private AIDataService aiDataService;
    private AIServiceContext customAIServiceContext;

    RequestTask(Activity activity, AIDataService aiDataService, AIServiceContext customAIServiceContext){
        this.activity = activity;
        this.aiDataService = aiDataService;
        this.customAIServiceContext = customAIServiceContext;
    }

    @Override
    protected AIResponse doInBackground(AIRequest... aiRequests) {
        final AIRequest request = aiRequests[0];
        try {
            return aiDataService.request(request, customAIServiceContext);
        } catch (AIServiceException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    protected void onPostExecute(AIResponse aiResponse) {
        super.onPostExecute(aiResponse);
        ((MainActivity)activity).callback(aiResponse);
    }
}
