package com.m2.android.springandroid;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.m2.android.springandroid.model.Oturum;
import com.m2.android.springandroid.model.OturumIki;


import com.m2.android.springandroid.model.OturumResponse;

public class MainActivity extends Activity {

	private static final String JSON_URL = "http://192.168.1.111/Project_Of_Clinic_JSon_Application/Tbl_Doctors_JSon_Servlet";
	private static final String JSON_URL_TWO = "http://192.168.1.111/Project_Of_Clinic_JSon_Application/Tbl_Appointments_JSon_Servlet";

	Button metinButton;
	TextView metinText; 
	
	Button metinButtonIki;
	 
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        metinButton = (Button) findViewById(R.id.doctorGetirBtn);
        
        metinButtonIki =(Button) findViewById(R.id.randevuGetirBtn);
        metinText = (TextView) findViewById(R.id.metinler);
        
       
        
    } 
	
	@SuppressWarnings("unchecked")
	public void getObject(View v){
		
	    Button clickedButton = (Button) v;

	 
	    switch (clickedButton.getId())
		 {
		   case R.id.doctorGetirBtn:
	    
	    
		InputStream src = getStreamContent(JSON_URL);
    	Gson gson = new Gson();
    	Reader reader = new InputStreamReader(src);
    	
    	Oturum[] oList = (Oturum[]) gson.fromJson(reader, Oturum[].class);
    	 
    	String str = "";
    	if(oList!=null)
    	for (Oturum oturum:oList)
    	{
    		str += "ID : " + oturum.getId() + "\n";
    		str += "Dr Name : " + oturum.getDr_Name() + "\n";
    		str += "Dr Surname : " + oturum.getDr_Surname() + "\n";
    		str += "Branch : " + oturum.getBranch() + "\n";
    	 
    		str += "\n\n---------------\n\n";
		}
    	metinText.setText(str);
    	
    	break;
    	 
		   
	   case R.id.randevuGetirBtn:
			   
		 InputStream srciki = getStreamContent(JSON_URL_TWO);
		 Gson gsoniki = new Gson();
		 Reader readeriki = new InputStreamReader(srciki);  
		     
    	OturumIki[] oListIki = (OturumIki[]) gsoniki.fromJson(readeriki, OturumIki[].class);
    	
    	String striki = "";
    	if(oListIki!=null)
    	for (OturumIki oturumiki:oListIki)
    	{
    		striki += "ID : " + oturumiki.getRow_Id() + "\n";
    		striki += "Doctor Name : " + oturumiki.getDoctor_Name() + "\n";
    		striki += "Doctor Surname : " + oturumiki.getDoctor_Surname() + "\n";
    		striki += "Patient Name : " + oturumiki.getPatient_Name() + "\n";
    		striki += "Patient Surname : " + oturumiki.getPatient_Surname() + "\n";
    		striki += "Appointment Date : " + oturumiki.getAppointment_Date() + "\n";
    		striki += "Appointmet Time : " + oturumiki.getAppointment_Time() + "\n";
    		striki += "Branch : " + oturumiki.getBranch() + "\n";

    		striki += "\n\n---------------\n\n";
		}
    	metinText.setText(striki); 
    	 
    	 break;
		   }
    	
	}
	 
	public InputStream getStreamContent(String url){
		
		DefaultHttpClient client = new DefaultHttpClient();
		HttpGet getRequest = new HttpGet(url);
		
		try{
			HttpResponse getResponse = client.execute(getRequest);
			final int status = getResponse.getStatusLine().getStatusCode();
			
			if(status != HttpStatus.SC_OK)
			{
				Log.w(getClass().getSimpleName(), "URL den veri alýnamadý : "+status+" - Url: "+url);
				return null;
			}		
			HttpEntity getResponseEntity = getResponse.getEntity();
			return getResponseEntity.getContent();
		} catch(IOException e) {
			getRequest.abort();
			Log.w(getClass().getSimpleName(), "URL den veri alýnamadý - Url: "+url);
		}
		return null;
	}
}