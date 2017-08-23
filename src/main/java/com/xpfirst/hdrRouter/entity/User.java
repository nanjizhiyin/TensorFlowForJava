/**
 * Copyright (C) 2013 北京学信科技有限公司
 *
 * @className:com.xuexin.evaluation.entity.User
 * @version:v1.0.0 
 * @author:李大鹏
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2013-6-14     李大鹏                       v1.0.0        create
 *
 */
package com.xpfirst.hdrRouter.entity;

import java.io.Serializable;
import java.util.Date;


public class User implements Serializable {
    private static final long serialVersionUID = 5888284076042144693L;
    private String username;
    private String plainPassword;
    private String encryptedPassword;
    private String name;
    private String realName;
    private String sno;
    private String email;
    private String modificationDate;
    private String mobile;
    private int bindingMobile;
    private int bindingEmail;
    private String avatar;
    private String artwork;
    private int gender;
    private Date birthday;
    private String signature;
    private String country;
    private String province;
    private String city;
    private String district;
    private String platform;
    private String device;
    private String appleToken;
    private boolean isEffective;
    private String creationDate;


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the plainPassword
     */
    public String getPlainPassword() {
        return plainPassword;
    }

    /**
     * @param plainPassword the plainPassword to set
     */
    public void setPlainPassword(String plainPassword) {
        this.plainPassword = plainPassword;
    }

    /**
     * @return the encryptedPassword
     */
    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    /**
     * @param encryptedPassword the encryptedPassword to set
     */
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the modificationDate
     */
    public String getModificationDate() {
        return modificationDate;
    }

    /**
     * @param modificationDate the modificationDate to set
     */
    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the bindingMobile
     */
    public int getBindingMobile() {
        return bindingMobile;
    }

    /**
     * @param bindingMobile the bindingMobile to set
     */
    public void setBindingMobile(int bindingMobile) {
        this.bindingMobile = bindingMobile;
    }

    /**
     * @return the bindingEmail
     */
    public int getBindingEmail() {
        return bindingEmail;
    }

    /**
     * @param bindingEmail the bindingEmail to set
     */
    public void setBindingEmail(int bindingEmail) {
        this.bindingEmail = bindingEmail;
    }

    /**
     * @return the avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar the avatar to set
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getArtwork() {
        return artwork;
    }

    public void setArtwork(String artwork) {
        this.artwork = artwork;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    /**
     * @return the signature
     */
    public String getSignature() {
        return signature;
    }

    /**
     * @param signature the signature to set
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return the platform
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * @param platform the platform to set
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * @return the isEffective
     */
    public boolean getIsEffective() {
        return isEffective;
    }

    /**
     * @param isEffective the isEffective to set
     */
    public void setIsEffective(boolean isEffective) {
        this.isEffective = isEffective;
    }

    /**
     * @return the creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getAppleToken() {
        return appleToken;
    }

    public void setAppleToken(String appleToken) {
        this.appleToken = appleToken;
    }

}
