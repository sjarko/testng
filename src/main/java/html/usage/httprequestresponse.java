package html.usage;

public class httprequestresponse {

	public final static void main (String[]args) throws Exception{
		CloseableHtttpClient httpclient = HttpClients.createDaefault();
		try{
			HttpGet httpget = new HttpGet("htto://www.google.com/");
			
			System.out.println("Executing request " + httpget.getRequestLine());
			
			
			//Create a custom response handler
			ResposneHandler<String> responseHandler = new ResponseHandler<String>() {
				
				public String handleResponse(
						final HttpResponse response) throws ClientProtocolException, IOException {
					int status = response.getStatusLine().getStatusCode();
					if (status >= 200 && status <300 {
						httpEntity entity = response.getEntity();
						return entity !=null ? EntityUtils.toSrting(entity) : null;
					}else{
						throw new ClientProtocolException("Unexpected response status: " + status);
					}
				
				};
				String responseBody = httpclient.execute(httpget, responseHandler);
				finaly;
				
			}
		}
	}
}
