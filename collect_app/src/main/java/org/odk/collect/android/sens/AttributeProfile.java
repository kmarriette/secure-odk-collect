package org.odk.collect.android.sens;

import java.util.HashMap;


public class AttributeProfile {
    String questionText;
    //HashMap<String,String> profile;
    String masking;
    String password;
    String encryption;
    String level;
    String accessControl;
    String hashing;
    String deidentification;
    String storageArea;
    String anonymise;

    public AttributeProfile(String questionText, HashMap<String,String> profile){
        this.questionText=questionText;
        //this.profile=profile;
        if(profile!=null){
            this.masking=profile.get(SensLogic.MASKING);
            this.accessControl=profile.get(SensLogic.ACCESSCONTROL);
            this.anonymise=profile.get(SensLogic.ANONYMISE);
            this.deidentification=profile.get(SensLogic.DEIDENTIFICATION);
            this.storageArea=profile.get(SensLogic.STORAGE_AREA);
            this.hashing=profile.get(SensLogic.HASHING);
            this.level=profile.get(SensLogic.LEVEL);
            this.encryption=profile.get(SensLogic.ENCRYPTION);
            this.password=profile.get(SensLogic.PASSWORD);
        }


    }

    public String getStorageArea() {
        return storageArea;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getPassword() {
        return password;
    }

    public String getLevel() {
        return level;
    }

    public String getHashing() {
        return hashing;
    }

    public String getEncryption() {
        return encryption;
    }

    public String getMasking() {
        return masking;
    }

    public String getAccessControl() {
        return accessControl;
    }

    public String getAnonymise() {
        return anonymise;
    }

    public String getDeidentification() {
        return deidentification;
    }
}
