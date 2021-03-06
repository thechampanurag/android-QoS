/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2016, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 * For questions related to commercial use licensing, please contact sales@telestax.com.
 *
 */

package org.restcomm.app.utillib.Reporters.WebReporter;


public class DeviceUpdateRequest  {
//	private static final String TAG = DeviceUpdateRequest.class.getSimpleName();
//	private static final String END_POINT = "/api/devices";
//
//	private static final String KEY_SHARE_WITH_CARRIER= "share";
//
//	protected JSONObject mBody;
//    protected String mHost;
//
//    public DeviceUpdateRequest(String host) {
//    	super(host + END_POINT);
//		mHost = host;
//		mBody = new JSONObject();
//	}
//
//    /**
//     * Construct used to deserialize the object
//     * @param jsonObject the object's information
//     * @throws JSONException if there is problem reading information from the json object
//     */
//    public DeviceUpdateRequest(JSONObject jsonObject) throws JSONException{
//    	super(jsonObject.getString("host") + END_POINT);
//    	deserialize(jsonObject);
//    	buildRequest();
//    }
//
//	/**
//	 * @return JSON string representing the body of the request
//	 */
//	public String toJSON() {
//		return mBody.toString();
//	}
//
//	/**
//     * Prepares the relevant headers for the http request
//     */
//    protected void buildRequest() {
//        setHeader("Content-Type", "application/json; charset=utf-8");
//        EntityTemplate entityTemplate = new EntityTemplate(
//                new ContentProducer(){
//                    public void writeTo(OutputStream outstream) throws IOException {
//                        Writer writer = new OutputStreamWriter(outstream, "UTF-8");
//                        writer.write(toJSON());
//                        writer.flush();
//                    }
//                }
//        );
//        setEntity(entityTemplate);
//    }
//
//	public void renderSimChangeRequest(String apiKey, GSMDevice device) throws JSONException {
//		mBody.put(WebReporter.JSON_API_KEY, apiKey);
//
//		mBody.put(GSMDevice.KEY_IMSI, device.getIMSI());
//		mBody.put(GSMDevice.KEY_PHONE_NUMBER, device.getPhoneNumber());
//
//		buildRequest();
//	}
//
//	public void renderShareSettingChangeRequest(String apiKey, boolean shareWithCarrier) throws JSONException {
//		mBody.put(WebReporter.JSON_API_KEY, apiKey);
//
//		mBody.put(KEY_SHARE_WITH_CARRIER, shareWithCarrier);
//
//		buildRequest();
//	}
//
//	@Override
//	public JSONObject serialize() throws JSONException {
//		JSONObject json = new JSONObject();
//		json.put("type", TAG);
//		json.put("host", mHost);
//		json.put("body", toJSON());
//		return json;
//	}
//
//	@Override
//	public void deserialize(JSONObject jsonObject) throws JSONException {
//		mHost = jsonObject.getString("host");
//    	mBody = jsonObject.getJSONObject("body");
//	}

}
