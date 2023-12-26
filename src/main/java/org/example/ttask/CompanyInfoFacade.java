package org.example.ttask;

import org.json.JSONObject;
import org.json.JSONArray;
import java.io.IOException;

public class CompanyInfoFacade {

    public Company getCompanyProfile(String domain) {
        try {
            JSONObject jsonObject = BrandfetchReader.fetchCompanyData(domain);
            return parseCompanyInfo(jsonObject);
        } catch (IOException e) {
            System.err.println("Error fetching data: " + e.getMessage());
            return null;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private Company parseCompanyInfo(JSONObject jsonObject) {
        String name = jsonObject.optString("name");
        String description = jsonObject.optString("description");
        String logoUrl = extractFirstLogoUrl(jsonObject);

        return new Company(name, description, logoUrl);
    }

    private String extractFirstLogoUrl(JSONObject jsonObject) {
        JSONArray logosArray = jsonObject.optJSONArray("logos");
        if (logosArray != null && !logosArray.isEmpty()) {
            JSONObject firstLogoObject = logosArray.optJSONObject(0);
            JSONArray formatsArray = firstLogoObject.optJSONArray("formats");
            if (formatsArray != null && !formatsArray.isEmpty()) {
                JSONObject firstFormatObject = formatsArray.optJSONObject(0);
                return firstFormatObject.optString("src");
            }
        }
        return null;
    }
}
