/*
 * Copyright 2007 Yusuke Yamamoto
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ko.twitter.vplay.core.AppEngine;


//import javax.annotation.Generated;
import com.ko.twitter.vplay.core.RateLimitStatus;
import com.ko.twitter.vplay.core.Status;
import com.ko.twitter.vplay.core.TwitterException;
import com.ko.twitter.vplay.core.URLEntity;
import com.ko.twitter.vplay.core.User;
import com.ko.twitter.vplay.core.conf.Configuration;
import com.ko.twitter.vplay.core.internal.http.HttpResponse;
import com.ko.twitter.vplay.core.internal.json.ObjectFactory;
import com.ko.twitter.vplay.core.internal.json.UserJSONImpl;

import java.util.Date;

///**
// * A data class representing Basic user information element
// *
// * @author Yusuke Yamamoto - yusuke at mac.com
// */
//@Generated(
//        value = "generate-lazy-objects.sh",
//        comments = "This is Tool Generated Code. DO NOT EDIT",
//        date = "2011-07-13"
//)
public class LazyUser implements User {
    private final HttpResponse res;
    private Configuration conf;
    private User target = null;

    public LazyUser(HttpResponse res, ObjectFactory factory) {
        this.res = res;
        this.conf = conf;
    }

    private User getTarget() {
        if (target == null) {
            try {
                target = new UserJSONImpl(res, conf);
            } catch (TwitterException e) {
                throw new TwitterRuntimeException(e);
            }
        }
        return target;
    }

    /**
     * Returns the id of the user
     *
     * @return the id of the user
     */
    public long getId() {
        return getTarget().getId();
    }


    /**
     * Returns the name of the user
     *
     * @return the name of the user
     */
    public String getName() {
        return getTarget().getName();
    }

    @Override
    public String getEmail() {
        return null;
    }


    /**
     * Returns the screen name of the user
     *
     * @return the screen name of the user
     */
    public String getScreenName() {
        return getTarget().getScreenName();
    }


    /**
     * Returns the location of the user
     *
     * @return the location of the user
     */
    public String getLocation() {
        return getTarget().getLocation();
    }


    /**
     * Returns the description of the user
     *
     * @return the description of the user
     */
    public String getDescription() {
        return getTarget().getDescription();
    }

    /**
     * Returns URL entities for user description.
     *
     * @return URL entities for user description
     * @since Twitter4J 3.0.3
     */
    @Override
    public URLEntity[] getDescriptionURLEntities() {
        return getTarget().getDescriptionURLEntities();
    }

    /**
     * Returns URL entity for user's URL.
     *
     * @return URL entity for user's URL.
     * @since Twitter4J 3.0.3
     */
    @Override
    public URLEntity getURLEntity() {
        return getTarget().getURLEntity();
    }

    /**
     * Tests if the user is enabling contributors
     *
     * @return if the user is enabling contributors
     * @since Twitter4J 2.1.2
     */
    public boolean isContributorsEnabled() {
        return getTarget().isContributorsEnabled();
    }


    /**
     * Returns the profile image url of the user
     *
     * @return the profile image url of the user
     */
    public String getProfileImageURL() {
        return getTarget().getProfileImageURL();
    }

    @Override
    public String getBiggerProfileImageURL() {
        return getTarget().getBiggerProfileImageURL();
    }

    @Override
    public String getMiniProfileImageURL() {
        return getTarget().getMiniProfileImageURL();
    }

    @Override
    public String getOriginalProfileImageURL() {
        return getTarget().getOriginalProfileImageURL();
    }

    /**
     * Returns the profile image url of the user, served over SSL
     *
     * @return the profile image url of the user, served over SSL
     */
    public String getProfileImageURLHttps() {
        return getTarget().getProfileImageURLHttps();
    }

    @Override
    public String getBiggerProfileImageURLHttps() {
        return getTarget().getBiggerProfileImageURLHttps();
    }

    @Override
    public String getMiniProfileImageURLHttps() {
        return getTarget().getMiniProfileImageURLHttps();
    }

    @Override
    public String getOriginalProfileImageURLHttps() {
        return getTarget().getOriginalProfileImageURLHttps();
    }

    @Override
    public boolean isDefaultProfileImage() {
        return getTarget().isDefaultProfileImage();
    }

    /**
     * Returns the url of the user
     *
     * @return the url of the user
     */
    public String getURL() {
        return getTarget().getURL();
    }

    /**
     * Test if the user status is protected
     *
     * @return true if the user status is protected
     */
    public boolean isProtected() {
        return getTarget().isProtected();
    }


    /**
     * Returns the number of followers
     *
     * @return the number of followers
     * @since Twitter4J 1.0.4
     */
    public int getFollowersCount() {
        return getTarget().getFollowersCount();
    }


    /**
     * Returns the current status of the user<br>
     * This can be null if the instance if from Status.getUser().
     *
     * @return current status of the user
     * @since Twitter4J 2.1.1
     */
    public Status getStatus() {
        return getTarget().getStatus();
    }

    @Override
    public String getProfileBackgroundColor() {
        return getTarget().getProfileBackgroundColor();
    }

    @Override
    public String getProfileTextColor() {
        return getTarget().getProfileTextColor();
    }

    @Override
    public String getProfileLinkColor() {
        return getTarget().getProfileLinkColor();
    }

    @Override
    public String getProfileSidebarFillColor() {
        return getTarget().getProfileSidebarFillColor();
    }

    @Override
    public String getProfileSidebarBorderColor() {
        return getTarget().getProfileSidebarBorderColor();
    }

    @Override
    public boolean isProfileUseBackgroundImage() {
        return getTarget().isProfileUseBackgroundImage();
    }

    @Override
    public boolean isDefaultProfile() {
        return getTarget().isDefaultProfile();
    }

    @Override
    public boolean isShowAllInlineMedia() {
        return getTarget().isShowAllInlineMedia();
    }

    @Override
    public int getFriendsCount() {
        return getTarget().getFriendsCount();
    }

    @Override
    public Date getCreatedAt() {
        return getTarget().getCreatedAt();
    }

    @Override
    public int getFavouritesCount() {
        return getTarget().getFavouritesCount();
    }

    @Override
    public int getUtcOffset() {
        return getTarget().getUtcOffset();
    }

    @Override
    public String getTimeZone() {
        return getTarget().getTimeZone();
    }

    @Override
    public String getProfileBackgroundImageURL() {
        return getTarget().getProfileBackgroundImageURL();
    }


    @Override
    public String getProfileBackgroundImageUrlHttps() {
        return getTarget().getProfileBackgroundImageUrlHttps();
    }

    @Override
    public String getProfileBannerURL() {
        return getTarget().getProfileBannerURL();
    }

    @Override
    public String getProfileBannerRetinaURL() {
        return getTarget().getProfileBannerRetinaURL();
    }

    @Override
    public String getProfileBannerIPadURL() {
        return getTarget().getProfileBannerIPadURL();
    }

    @Override
    public String getProfileBannerIPadRetinaURL() {
        return getTarget().getProfileBannerIPadRetinaURL();
    }

    @Override
    public String getProfileBannerMobileURL() {
        return getTarget().getProfileBannerMobileURL();
    }

    @Override
    public String getProfileBannerMobileRetinaURL() {
        return getTarget().getProfileBannerMobileRetinaURL();
    }

    public boolean isProfileBackgroundTiled() {
        return getTarget().isProfileBackgroundTiled();
    }


    /**
     * Returns the preferred language of the user
     *
     * @return the preferred language of the user
     * @since Twitter4J 2.1.2
     */
    public String getLang() {
        return getTarget().getLang();
    }


    public int getStatusesCount() {
        return getTarget().getStatusesCount();
    }


    /**
     * @return the user is enabling geo location
     * @since Twitter4J 2.0.10
     */
    public boolean isGeoEnabled() {
        return getTarget().isGeoEnabled();
    }


    /**
     * @return returns true if the user is a verified celebrity
     * @since Twitter4J 2.0.10
     */
    public boolean isVerified() {
        return getTarget().isVerified();
    }


    /**
     * @return returns true if the user is a translator
     * @since Twitter4J 2.1.9
     */
    public boolean isTranslator() {
        return getTarget().isTranslator();
    }


    /**
     * Returns the number of public lists the user is listed on, or -1
     * if the count is unavailable.
     *
     * @return the number of public lists the user is listed on.
     * @since Twitter4J 2.1.4
     */
    public int getListedCount() {
        return getTarget().getListedCount();
    }


    /**
     * Returns true if the authenticating user has requested to follow this user,
     * otherwise false.
     *
     * @return true if the authenticating user has requested to follow this user.
     * @since Twitter4J 2.1.4
     */
    public boolean isFollowRequestSent() {
        return getTarget().isFollowRequestSent();
    }

    public String[] getWithheldInCountries() {
        return getTarget().getWithheldInCountries();
    }

    public RateLimitStatus getRateLimitStatus() {
        return getTarget().getRateLimitStatus();
    }

    public int getAccessLevel() {
        return getTarget().getAccessLevel();
    }

    public int compareTo(User target) {
        return getTarget().compareTo(target);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        return getTarget().equals(o);
    }

    @Override
    public int hashCode() {
        return getTarget().hashCode();
    }

    @Override
    public String toString() {
        return "LazyUser{" +
                "target=" + getTarget() +
                "}";
    }
}
