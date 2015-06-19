package html.usage;

import java.io.IOException;
import java.util.Random;
import java.lang.Object;

import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;




public class HttpClientTutorial {

	public static void main(String... args) throws ClientProtocolException,
			IOException, ParseException, JSONException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(
				"http://www.google.com.ua");
				//"http://maps.googleapis.com/maps/api/elevation/json?locations=39.7391536,-104.9847034&sensor=true");
		CloseableHttpResponse response1 = httpclient.execute(httpGet);

		JSONObject obj = new JSONObject(EntityUtils.toString(response1
				.getEntity()));
		System.out.println(obj.getString("status"));
		//System.out.println(obj.getString(""))

	}
}
